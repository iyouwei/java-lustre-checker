package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.model.*;
import com.ecnu.synlong.parser.synlong.gen.SynlongBaseVisitor;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Lustre到自动机的动态转换器
 * 基于SynlongToLustreVisitor的转换逻辑，生成自动机模型
 */
public class LustreToAutomatonConverter extends SynlongBaseVisitor<String> {
    private final SynlongToLustreContext context;
    private final AutomatonModel automatonModel;
    private final Map<String, Integer> stateIdMap; // 状态名到ID的映射
    private int nextStateId = 1;
    private int nextTransitionId = 1;
    
    // 当前正在处理的自动机
    private Automaton currentAutomaton;
    private final List<Location> currentLocations;
    private final List<Transition> currentTransitions;
    
    public LustreToAutomatonConverter(SynlongToLustreContext context) {
        this.context = context;
        this.automatonModel = new AutomatonModel();
        this.stateIdMap = new HashMap<>();
        this.currentLocations = new ArrayList<>();
        this.currentTransitions = new ArrayList<>();
        
        // 初始化自动机列表
        this.automatonModel.setAutomatons(new ArrayList<>());
    }
    
    /**
     * 将转换结果序列化为JSON字符串
     */
    public String toJsonString() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(automatonModel);
    }
    
    @Override
    public String visitProgram(SynlongParser.ProgramContext ctx) {
        // 第一阶段：收集所有状态机信息（复用原有逻辑）
        collectStateMachineInfo(ctx);
        
        // 第二阶段：生成自动机模型
        generateAutomatonModel(ctx);
        
        return ""; // 不需要返回Lustre代码
    }
    
    /**
     * 收集状态机信息（复用SynlongToLustreVisitor的逻辑）
     */
    private void collectStateMachineInfo(SynlongParser.ProgramContext ctx) {
        for (SynlongParser.DeclsContext decl : ctx.decls()) {
            if (decl instanceof SynlongParser.UserOpDeclarationContext) {
                SynlongParser.UserOpDeclarationContext userOpDecl = (SynlongParser.UserOpDeclarationContext) decl;
                collectStateMachineFromUserOp(userOpDecl.user_op_decl());
            }
        }
    }
    
    /**
     * 从用户操作声明中收集状态机信息
     */
    private void collectStateMachineFromUserOp(SynlongParser.User_op_declContext ctx) {
        if (ctx instanceof SynlongParser.UserOpDeclContext) {
            SynlongParser.UserOpDeclContext userOpCtx = (SynlongParser.UserOpDeclContext) ctx;
            
            // 收集全局变量（输入、输出、局部变量）
            collectGlobalVariables(userOpCtx);
            
            if (userOpCtx.op_body() instanceof SynlongParser.FullOpBodyContext) {
                SynlongParser.FullOpBodyContext fullBody = (SynlongParser.FullOpBodyContext) userOpCtx.op_body();
                if (fullBody.let_block() != null) {
                    collectStateMachineFromLetBlock(fullBody.let_block());
                }
            }
        }
    }
    
    /**
     * 从let块中收集状态机信息
     */
    private void collectStateMachineFromLetBlock(SynlongParser.Let_blockContext ctx) {
        for (ParseTree child : ctx.children) {
            if (child instanceof SynlongParser.StateMachineReturnContext) {
                SynlongParser.StateMachineReturnContext eq = (SynlongParser.StateMachineReturnContext) child;
                collectStateMachineInfo(eq.state_machine());
            }
        }
    }
    
    /**
     * 收集全局变量（输入、输出、局部变量）
     */
    private void collectGlobalVariables(SynlongParser.UserOpDeclContext userOpCtx) {
        // 收集输入参数
        if (userOpCtx.params() != null) {
            collectParamsAsGlobalVars(userOpCtx.params());
        }
        
        // 收集输出参数
        if (userOpCtx.returns_clause() != null && userOpCtx.returns_clause().params() != null) {
            collectParamsAsGlobalVars(userOpCtx.returns_clause().params());
        }
        
        // 收集节点级局部变量
        if (userOpCtx.op_body() instanceof SynlongParser.FullOpBodyContext) {
            SynlongParser.FullOpBodyContext fullBody = (SynlongParser.FullOpBodyContext) userOpCtx.op_body();
            if (fullBody.local_block() != null) {
                collectLocalBlockAsGlobalVars(fullBody.local_block());
            }
        }
    }
    
    /**
     * 收集参数作为全局变量
     */
    private void collectParamsAsGlobalVars(SynlongParser.ParamsContext params) {
        for (SynlongParser.Var_declsContext varDecls : params.var_decls()) {
            for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                String varName = varId.getText();
                context.addGlobalVariable(varName);
            }
        }
    }
    
    /**
     * 收集局部块作为全局变量
     */
    private void collectLocalBlockAsGlobalVars(SynlongParser.Local_blockContext localBlock) {
        for (SynlongParser.Var_declsContext varDecls : localBlock.var_decls()) {
            for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                String varName = varId.getText();
                context.addGlobalVariable(varName);
            }
        }
    }
    
    /**
     * 收集状态机信息
     */
    private void collectStateMachineInfo(SynlongParser.State_machineContext ctx) {
        for (SynlongParser.State_declContext stateDecl : ctx.state_decl()) {
            String stateName = stateDecl.ID().getText();
            context.addStateToEnum(stateName);
            
            // 检查是否为初始状态或最终状态
            boolean isInitial = stateDecl.getText().contains("initial");
            boolean isFinal = stateDecl.getText().contains("final");
            
            if (isInitial) {
                context.setInitialState(stateName);
            }
            if (isFinal) {
                context.addFinalState(stateName);
            }
            
            // 收集状态体中的局部变量和内容
            if (stateDecl.state_body() != null) {
                collectStateBodyVars(stateName, stateDecl.state_body());
                collectStateBodyContent(stateName, stateDecl.state_body());
            }
            
            // 收集转换信息
            collectStateTransitions(stateName, stateDecl);
        }
    }
    
    /**
     * 收集状态体中的局部变量
     */
    private void collectStateBodyVars(String stateName, SynlongParser.State_bodyContext stateBody) {
        if (stateBody instanceof SynlongParser.StateBodyWithLocalContext) {
            SynlongParser.StateBodyWithLocalContext localCtx = (SynlongParser.StateBodyWithLocalContext) stateBody;
            for (SynlongParser.Var_declsContext varDecls : localCtx.local_block().var_decls()) {
                String varType = visit(varDecls.type_expr());
                for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                    String varName = varId.getText();
                    context.addStateLocalVar(stateName, varName);
                    context.addStateVarType(stateName, varName, varType);
                }
            }
        } else if (stateBody instanceof SynlongParser.StateBodyLocalOnlyContext) {
            SynlongParser.StateBodyLocalOnlyContext localCtx = (SynlongParser.StateBodyLocalOnlyContext) stateBody;
            for (SynlongParser.Var_declsContext varDecls : localCtx.local_block().var_decls()) {
                String varType = visit(varDecls.type_expr());
                for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                    String varName = varId.getText();
                    context.addStateLocalVar(stateName, varName);
                    context.addStateVarType(stateName, varName, varType);
                }
            }
        }
    }
    
    /**
     * 收集状态体内容
     */
    private void collectStateBodyContent(String stateName, SynlongParser.State_bodyContext stateBody) {
        StringBuilder bodyContent = new StringBuilder();
        
        if (stateBody instanceof SynlongParser.StateBodyWithLocalContext) {
            SynlongParser.StateBodyWithLocalContext localCtx = (SynlongParser.StateBodyWithLocalContext) stateBody;
            bodyContent.append(visit(localCtx.local_block()));
            // 收集let块中的赋值语句
            collectAssignmentsFromLetBlock(stateName, localCtx.let_block());
            bodyContent.append(visit(localCtx.let_block()));
        } else if (stateBody instanceof SynlongParser.StateBodyLocalOnlyContext) {
            SynlongParser.StateBodyLocalOnlyContext localCtx = (SynlongParser.StateBodyLocalOnlyContext) stateBody;
            bodyContent.append(visit(localCtx.local_block()));
        } else if (stateBody instanceof SynlongParser.StateBodyLetOnlyContext) {
            SynlongParser.StateBodyLetOnlyContext letCtx = (SynlongParser.StateBodyLetOnlyContext) stateBody;
            // 收集let块中的赋值语句
            collectAssignmentsFromLetBlock(stateName, letCtx.let_block());
            bodyContent.append(visit(letCtx.let_block()));
        } else if (stateBody instanceof SynlongParser.StateBodySingleEqContext) {
            SynlongParser.StateBodySingleEqContext eqCtx = (SynlongParser.StateBodySingleEqContext) stateBody;
            // 收集单个赋值语句
            collectAssignmentFromEquation(stateName, eqCtx.equation());
            bodyContent.append(visit(eqCtx.equation()));
        }
        
        context.setStateBody(stateName, bodyContent.toString());
    }
    
    /**
     * 从let块中收集赋值语句
     */
    private void collectAssignmentsFromLetBlock(String stateName, SynlongParser.Let_blockContext letBlock) {
        if (letBlock == null) return;
        
        for (ParseTree child : letBlock.children) {
            if (child instanceof SynlongParser.EquationContext) {
                collectAssignmentFromEquation(stateName, (SynlongParser.EquationContext) child);
            }
        }
    }
    
    /**
     * 从方程中收集赋值语句
     */
    private void collectAssignmentFromEquation(String stateName, SynlongParser.EquationContext equation) {
        if (equation instanceof SynlongParser.AssignmentContext) {
            SynlongParser.AssignmentContext assignment = (SynlongParser.AssignmentContext) equation;
            String lhs = visit(assignment.lhs());
            String rhs = visit(assignment.expr());
            if (lhs != null && rhs != null && !lhs.trim().isEmpty()) {
                context.addStateAssignment(stateName, lhs + " = " + rhs);
            }
        }
    }
    
    /**
     * 收集状态转换信息
     */
    private void collectStateTransitions(String stateName, SynlongParser.State_declContext stateDecl) {
        // 收集unless转换
        for (int i = 0; i < stateDecl.getChildCount(); i++) {
            if ("unless".equals(stateDecl.getChild(i).getText())) {
                for (int j = i + 1; j < stateDecl.getChildCount(); j++) {
                    if (stateDecl.getChild(j) instanceof SynlongParser.TransitionContext) {
                        SynlongParser.TransitionContext trans = (SynlongParser.TransitionContext) stateDecl.getChild(j);
                        String transition = "unless: " + visit(trans) + " -> " + trans.ID().getText();
                        context.addStateTransition(stateName, transition);
                    }
                }
            } else if ("until".equals(stateDecl.getChild(i).getText())) {
                for (int j = i + 1; j < stateDecl.getChildCount(); j++) {
                    if (stateDecl.getChild(j) instanceof SynlongParser.TransitionContext) {
                        SynlongParser.TransitionContext trans = (SynlongParser.TransitionContext) stateDecl.getChild(j);
                        String transition = "until: " + visit(trans) + " -> " + trans.ID().getText();
                        context.addStateTransition(stateName, transition);
                    }
                }
            }
        }
    }
    
    /**
     * 生成自动机模型
     */
    private void generateAutomatonModel(SynlongParser.ProgramContext ctx) {
        for (SynlongParser.DeclsContext decl : ctx.decls()) {
            if (decl instanceof SynlongParser.UserOpDeclarationContext) {
                SynlongParser.UserOpDeclarationContext userOpDecl = (SynlongParser.UserOpDeclarationContext) decl;
                generateAutomatonFromUserOp(userOpDecl.user_op_decl());
            }
        }
        
        // 生成系统声明
        generateSystemDeclaration();
    }
    
    /**
     * 从用户操作声明生成自动机
     */
    private void generateAutomatonFromUserOp(SynlongParser.User_op_declContext ctx) {
        if (ctx instanceof SynlongParser.UserOpDeclContext) {
            SynlongParser.UserOpDeclContext userOpCtx = (SynlongParser.UserOpDeclContext) ctx;
            
            // 创建新的自动机
            currentAutomaton = new Automaton();
            currentAutomaton.setName(userOpCtx.ID().getText());
            currentAutomaton.setParameters(generateParameters(userOpCtx.params()));
            currentAutomaton.setDeclaration(generateDeclaration());
            
            // 清空当前位置和转换列表
            currentLocations.clear();
            currentTransitions.clear();
            
            // 生成位置（状态）
            generateLocations();
            
            // 生成转换
            generateTransitions();
            
            // 设置初始状态
            setInitialState();
            
            // 添加到自动机列表
            currentAutomaton.setLocations(new ArrayList<>(currentLocations));
            currentAutomaton.setTransitions(new ArrayList<>(currentTransitions));
            automatonModel.getAutomatons().add(currentAutomaton);
        }
    }
    
    /**
     * 生成参数列表
     */
    private String generateParameters(SynlongParser.ParamsContext params) {
        if (params == null || params.var_decls().isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < params.var_decls().size(); i++) {
            SynlongParser.Var_declsContext varDecls = params.var_decls().get(i);
            String type = visit(varDecls.type_expr());
            
            for (int j = 0; j < varDecls.var_id().size(); j++) {
                sb.append(varDecls.var_id().get(j).getText());
                if (j < varDecls.var_id().size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ").append(type);
            if (i < params.var_decls().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    
    /**
     * 生成声明部分
     */
    private String generateDeclaration() {
        StringBuilder sb = new StringBuilder();
        
        // 生成变量声明
        Set<String> globalVars = new HashSet<>();
        for (String var : context.getAllStates()) {
            globalVars.add(var);
        }
        
        // 添加其他全局变量
        for (String var : context.getGlobalVars()) {
            globalVars.add(var);
        }
        
        if (!globalVars.isEmpty()) {
            sb.append("var ");
            sb.append(String.join(", ", globalVars));
            sb.append("\\n\\n");
        }
        
        // 生成函数声明（基于状态机中的函数调用）
        Set<String> functions = extractFunctionsFromTransitions();
        for (String func : functions) {
            sb.append("func ").append(func).append("(){\\n}\\n\\n");
        }
        
        return sb.toString();
    }
    
    /**
     * 从转换中提取函数调用
     */
    private Set<String> extractFunctionsFromTransitions() {
        Set<String> functions = new HashSet<>();
        for (String stateName : context.getAllStates()) {
            List<String> assignments = context.getStateAssignments(stateName);
            for (String assignment : assignments) {
                if (assignment.contains("()")) {
                    // 提取函数调用
                    String[] parts = assignment.split("\\(");
                    if (parts.length > 0) {
                        String funcName = parts[0].trim();
                        if (!funcName.isEmpty() && !funcName.contains("=")) {
                            functions.add(funcName);
                        }
                    }
                }
            }
        }
        return functions;
    }
    
    /**
     * 生成位置（状态）
     */
    private void generateLocations() {
        for (String stateName : context.getAllStates()) {
            Location location = new Location();
            location.setId(getOrCreateStateId(stateName));
            location.setName(stateName);
            location.setInvariant(""); // 暂时为空
            
            currentLocations.add(location);
        }
    }
    
    /**
     * 获取或创建状态ID
     */
    private Integer getOrCreateStateId(String stateName) {
        if (!stateIdMap.containsKey(stateName)) {
            stateIdMap.put(stateName, nextStateId++);
        }
        return stateIdMap.get(stateName);
    }
    
    /**
     * 生成转换
     */
    private void generateTransitions() {
        for (String stateName : context.getAllStates()) {
            List<String> transitions = context.getStateTransitions(stateName);
            for (String transition : transitions) {
                Transition trans = parseTransition(stateName, transition);
                if (trans != null) {
                    currentTransitions.add(trans);
                }
            }
            
            // 生成状态内的赋值转换
            generateInternalTransitions(stateName);
        }
    }
    
    /**
     * 解析转换字符串
     */
    private Transition parseTransition(String sourceStateName, String transitionStr) {
        // 解析转换字符串 "unless/until: condition -> target"
        String[] parts = transitionStr.split(" -> ");
        if (parts.length != 2) return null;
        
        String[] prefixParts = parts[0].split(": ");
        if (prefixParts.length != 2) return null;
        
        String type = prefixParts[0]; // unless 或 until
        String condition = prefixParts[1];
        String targetStateName = parts[1];
        
        Transition transition = new Transition();
        transition.setId(nextTransitionId++);
        transition.setSourceId(getOrCreateStateId(sourceStateName));
        transition.setTargetId(getOrCreateStateId(targetStateName));
        transition.setGuard(condition);
        transition.setUpdate(""); // 暂时为空
        
        return transition;
    }
    
    /**
     * 生成状态内的赋值转换
     */
    private void generateInternalTransitions(String stateName) {
        List<String> assignments = context.getStateAssignments(stateName);
        for (String assignment : assignments) {
            if (assignment.contains("()")) {
                // 函数调用转换为内部转换
                Transition transition = new Transition();
                transition.setId(nextTransitionId++);
                transition.setSourceId(getOrCreateStateId(stateName));
                transition.setTargetId(getOrCreateStateId(stateName)); // 自循环
                transition.setGuard(""); // 无条件
                transition.setUpdate(assignment.trim());
                
                currentTransitions.add(transition);
            }
        }
    }
    
    /**
     * 设置初始状态
     */
    private void setInitialState() {
        String initialState = context.getInitialState();
        if (initialState != null && stateIdMap.containsKey(initialState)) {
            currentAutomaton.setInit(stateIdMap.get(initialState));
        } else if (!stateIdMap.isEmpty()) {
            // 如果没有明确的初始状态，使用第一个状态
            currentAutomaton.setInit(stateIdMap.values().iterator().next());
        }
    }
    
    /**
     * 生成系统声明
     */
    private void generateSystemDeclaration() {
        if (!automatonModel.getAutomatons().isEmpty()) {
            Automaton automaton = automatonModel.getAutomatons().get(0);
            automatonModel.setSystemDeclaration("// 在这里填写模型的声明.\\n" + 
                automaton.getName().toLowerCase() + " := " + automaton.getName() + "()");
        }
    }
    
    // 以下方法复用SynlongToLustreVisitor的逻辑
    
    @Override
    public String visitBoolType(SynlongParser.BoolTypeContext ctx) {
        return "bool";
    }
    
    @Override
    public String visitIntType(SynlongParser.IntTypeContext ctx) {
        return "int";
    }
    
    @Override
    public String visitRealType(SynlongParser.RealTypeContext ctx) {
        return "real";
    }
    
    @Override
    public String visitVarType(SynlongParser.VarTypeContext ctx) {
        return ctx.typevar().ID().getText();
    }
    
    @Override
    public String visitStructType(SynlongParser.StructTypeContext ctx) {
        List<String> fields = new ArrayList<>();
        for (SynlongParser.Field_declContext f : ctx.field_decl()) {
            String fieldType = visit(f.type_expr());
            fields.add(f.ID().getText() + ": " + fieldType);
        }
        return "struct {" + String.join("; ", fields) + "}";
    }
    
    @Override
    public String visitArrayType(SynlongParser.ArrayTypeContext ctx) {
        String typeExpr = visit(ctx.type_expr());
        String sizeExpr = ctx.INTEGER().getText();
        return typeExpr + "[" + sizeExpr + "]";
    }
    
    @Override
    public String visitLocal_block(SynlongParser.Local_blockContext ctx) {
        StringBuilder sb = new StringBuilder("var\n");
        for (int i = 0; i < ctx.var_decls().size(); i++) {
            sb.append("\t").append(visit(ctx.var_decls(i))).append(";\n");
        }
        return sb.toString();
    }
    
    @Override
    public String visitVar_decls(SynlongParser.Var_declsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.var_id().size(); i++) {
            sb.append(ctx.var_id(i).getText());
            if (i < ctx.var_id().size() - 1) {
                sb.append(", ");
            }
        }
        String typeExpr = visit(ctx.type_expr());
        sb.append(" : ").append(typeExpr);
        return sb.toString();
    }
    
    @Override
    public String visitLet_block(SynlongParser.Let_blockContext ctx) {
        StringBuilder sb = new StringBuilder("let\n");
        for (ParseTree child : ctx.children) {
            String childString = visit(child);
            if (childString != null && !childString.trim().isEmpty()) {
                sb.append("\t").append(childString).append(";\n");
            }
        }
        sb.append("tel\n");
        return sb.toString();
    }
    
    @Override
    public String visitAssignment(SynlongParser.AssignmentContext ctx) {
        return visit(ctx.lhs()) + " = " + visit(ctx.expr());
    }
    
    @Override
    public String visitLhsList(SynlongParser.LhsListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.lhs_id().size(); i++) {
            sb.append(ctx.lhs_id(i).getText());
            if (i < ctx.lhs_id().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    
    @Override
    public String visitEmptyLhs(SynlongParser.EmptyLhsContext ctx) {
        return "";
    }
    
    @Override
    public String visitTransition(SynlongParser.TransitionContext ctx) {
        String condition = visit(ctx.expr());
        // 提取条件表达式，去掉if关键字
        if (condition.startsWith("if ")) {
            condition = condition.substring(3);
        }
        // 去掉resume/restart部分，只保留条件
        if (condition.contains("resume") || condition.contains("restart")) {
            int resumeIndex = condition.indexOf("resume");
            int restartIndex = condition.indexOf("restart");
            int cutIndex = Math.max(resumeIndex, restartIndex);
            if (cutIndex > 0) {
                condition = condition.substring(0, cutIndex).trim();
            }
        }
        return condition;
    }
    
    @Override
    public String visitSimpleId(SynlongParser.SimpleIdContext ctx) {
        return ctx.ID().getText();
    }
    
    @Override
    public String visitSimpleAtom(SynlongParser.SimpleAtomContext ctx) {
        return visit(ctx.atom());
    }
    
    @Override
    public String visitTrue(SynlongParser.TrueContext ctx) {
        return "true";
    }
    
    @Override
    public String visitFalse(SynlongParser.FalseContext ctx) {
        return "false";
    }
    
    @Override
    public String visitInteger(SynlongParser.IntegerContext ctx) {
        return ctx.INTEGER().getText();
    }
    
    @Override
    public String visitFloat(SynlongParser.FloatContext ctx) {
        return ctx.FLOAT().getText();
    }
    
    @Override
    public String visitReal(SynlongParser.RealContext ctx) {
        return ctx.REAL().getText();
    }
    
    @Override
    public String visitUnaryOp(SynlongParser.UnaryOpContext ctx) {
        String op = visit(ctx.unary_arith_op());
        String expr = visit(ctx.simple_expr());
        if (op != null && expr != null) {
            return op + " " + expr;
        }
        return "";
    }
    
    @Override
    public String visitBinArithOp(SynlongParser.BinArithOpContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String op = visit(ctx.bin_arith_op());
        String right = visit(ctx.simple_expr(1));
        if (left != null && op != null && right != null) {
            return left + " " + op + " " + right;
        }
        return "";
    }
    
    @Override
    public String visitBinBoolOp(SynlongParser.BinBoolOpContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String op = visit(ctx.bin_bool_op());
        String right = visit(ctx.simple_expr(1));
        if (left != null && op != null && right != null) {
            return left + " " + op + " " + right;
        }
        return "";
    }
    
    @Override
    public String visitBinRelOp(SynlongParser.BinRelOpContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String op = visit(ctx.bin_relation_op());
        String right = visit(ctx.simple_expr(1));
        if (left != null && op != null && right != null) {
            return left + " " + op + " " + right;
        }
        return "";
    }
    
    @Override
    public String visitPlus(SynlongParser.PlusContext ctx) {
        return "+";
    }
    
    @Override
    public String visitMinus(SynlongParser.MinusContext ctx) {
        return "-";
    }
    
    @Override
    public String visitMul(SynlongParser.MulContext ctx) {
        return "*";
    }
    
    @Override
    public String visitDiv(SynlongParser.DivContext ctx) {
        return "/";
    }
    
    @Override
    public String visitEq(SynlongParser.EqContext ctx) {
        return "=";
    }
    
    @Override
    public String visitNe(SynlongParser.NeContext ctx) {
        return "<>";
    }
    
    @Override
    public String visitLt(SynlongParser.LtContext ctx) {
        return "<";
    }
    
    @Override
    public String visitGt(SynlongParser.GtContext ctx) {
        return ">";
    }
    
    @Override
    public String visitLe(SynlongParser.LeContext ctx) {
        return "<=";
    }
    
    @Override
    public String visitGe(SynlongParser.GeContext ctx) {
        return ">=";
    }
    
    @Override
    public String visitAnd(SynlongParser.AndContext ctx) {
        return "and";
    }
    
    @Override
    public String visitOr(SynlongParser.OrContext ctx) {
        return "or";
    }
    
    @Override
    public String visitNot(SynlongParser.NotContext ctx) {
        return "not";
    }
    
    @Override
    public String visitField_decl(SynlongParser.Field_declContext ctx) {
        String fieldName = ctx.ID().getText();
        String fieldType = visit(ctx.type_expr());
        return fieldName + ": " + fieldType;
    }
    
    @Override
    public String visitTypevar(SynlongParser.TypevarContext ctx) {
        return ctx.ID().getText();
    }
    
    @Override
    public String visitLhs_id(SynlongParser.Lhs_idContext ctx) {
        return ctx.ID().getText();
    }
}
