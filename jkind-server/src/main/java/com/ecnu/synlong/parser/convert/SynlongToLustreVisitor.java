package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongBaseVisitor;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;

import java.util.*;

public class SynlongToLustreVisitor extends SynlongBaseVisitor<String> {
    private final SynlongToLustreContext context;

    public SynlongToLustreVisitor(SynlongToLustreContext context) {
        this.context = context;
    }

    @Override
    public String visitProgram(SynlongParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.DeclsContext decl : ctx.decls()) {
            sb.append(visit(decl)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitType_block(SynlongParser.Type_blockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.Type_declContext typeDecl : ctx.type_decl()) {
            sb.append("type ").append(typeDecl.ID().getText());
            if (typeDecl.type_def() != null) {
                String typeDef = visit(typeDecl.type_def());
                // 处理analog、binary等类型，转换为struct
                typeDef = convertSynlongTypeToLustre(typeDef);
                sb.append(" = ").append(typeDef);
            }
            sb.append(";\n");
        }
        return sb.toString();
    }

    @Override
    public String visitTypeExprDef(SynlongParser.TypeExprDefContext ctx) {
        return visit(ctx.type_expr());
    }

    @Override
    public String visitEnumDef(SynlongParser.EnumDefContext ctx) {
        List<String> ids = new ArrayList<>();
        for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.ID()) {
            ids.add(id.getText());
        }
        return "enum {" + String.join(", ", ids) + "}";
    }

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
            // 处理字段类型中的analog、binary等类型
            fieldType = convertSynlongTypeToLustre(fieldType);
            fields.add(f.ID().getText() + ": " + fieldType);
        }
        return "struct {" + String.join("; ", fields) + "}";
    }

    @Override
    public String visitArrayType(SynlongParser.ArrayTypeContext ctx) {
        // 修复数组语法：从 type[size = value] 改为 type[size]
        String typeExpr = visit(ctx.type_expr());
        String sizeExpr = visit(ctx.const_expr());
        
        // 如果size表达式包含等号，只取等号前的部分
        if (sizeExpr.contains("=")) {
            sizeExpr = sizeExpr.substring(0, sizeExpr.indexOf("=")).trim();
        }
        
        return typeExpr + "[" + sizeExpr + "]";
    }

    @Override
    public String visitConst_block(SynlongParser.Const_blockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.Const_declContext constDecl : ctx.const_decl()) {
            // 保留注释
            String comment = extractComment(constDecl);
            if (comment != null && !comment.trim().isEmpty()) {
                sb.append(comment).append("\n");
            }
            
            sb.append("const ").append(constDecl.ID().getText());
            if (constDecl.type_expr() != null) {
                String typeExpr = visit(constDecl.type_expr());
                // 处理analog、binary等类型，转换为struct
                typeExpr = convertSynlongTypeToLustre(typeExpr);
                sb.append(" : ").append(typeExpr);
            }
            if (constDecl.const_expr() != null) {
                String constValue = visit(constDecl.const_expr());
                // 处理科学计数法，转换为实际数值
                constValue = convertScientificNotation(constValue);
                sb.append(" = ").append(constValue);
            }
            sb.append(";\n");
        }
        return sb.toString();
    }

    // 转换Synlong类型到Lustre类型
    private String convertSynlongTypeToLustre(String typeExpr) {
        if (typeExpr == null) return typeExpr;
        
        // 处理analog类型
        if (typeExpr.equals("analog")) {
            return "struct {value: real; status: bool}";
        }
        
        // 处理binary类型
        if (typeExpr.equals("binary")) {
            return "struct {value: bool; status: bool}";
        }
        
        // 处理数组类型，确保有初始值
        if (typeExpr.contains("^")) {
            // 将 type^size 转换为 type[size]
            return typeExpr.replace("^", "[");
        }
        
        return typeExpr;
    }

    // 转换科学计数法：将科学计数法转换为实际数值
    private String convertScientificNotation(String value) {
        if (value == null) return value;
        
        try {
            // 处理科学计数法，如 8.5E-37, 3.3E+38
            if (value.contains("E") || value.contains("e")) {
                // 将E转换为e，然后解析为double
                String normalizedValue = value.replace("E", "e");
                double doubleValue = Double.parseDouble(normalizedValue);
                
                // 对于极小的值，使用更精确的表示
                if (Math.abs(doubleValue) < 1e-10) {
                    return "0.0";
                }
                
                // 对于极大的值，使用更合理的表示
                if (Math.abs(doubleValue) > 1e10) {
                    if (doubleValue > 0) {
                        return "1e10"; // 使用一个合理的上限值
                    } else {
                        return "-1e10";
                    }
                }
                
                // 转换为字符串，避免科学计数法
                return String.format("%.10f", doubleValue).replaceAll("0*$", "").replaceAll("\\.$", "");
            }
        } catch (NumberFormatException e) {
            // 如果解析失败，返回原值
            return value;
        }
        
        return value;
    }

    // 提取注释信息
    private String extractComment(SynlongParser.Const_declContext ctx) {
        // 这里需要根据实际的AST结构来提取注释
        // 暂时返回空字符串，后续可以根据需要实现
        return "";
    }

    @Override
    public String visitUserOpDecl(SynlongParser.UserOpDeclContext ctx) {
        String kind = visit(ctx.op_kind());
        String name = ctx.ID().getText();
        String params = visit(ctx.params());
        String returns = visit(ctx.returns_clause());
        StringBuilder sb = new StringBuilder();
        sb.append(kind).append(" ").append(name)
          .append(params)
          .append(" ").append(returns);
        if (ctx.op_body() != null) {
            sb.append(" ").append(visit(ctx.op_body()));
        } else {
            sb.append(";");
        }
        return sb.toString();
    }

    @Override
    public String visitImportedOpDecl(SynlongParser.ImportedOpDeclContext ctx) {
        String kind = visit(ctx.op_kind());
        String name = ctx.ID().getText();
        String params = visit(ctx.params());
        String returns = visit(ctx.returns_clause());
        return kind + " " + name + params + " " + returns + ";";
    }

    @Override
    public String visitNodeKind(SynlongParser.NodeKindContext ctx) {
        return "node";
    }

    @Override
    public String visitFunctionKind(SynlongParser.FunctionKindContext ctx) {
        return "function";
    }

    @Override
    public String visitParams(SynlongParser.ParamsContext ctx) {
        if (ctx.var_decls().isEmpty()) {
            return "()";
        }
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ctx.var_decls().size(); i++) {
            sb.append(visit(ctx.var_decls(i)));
            if (i < ctx.var_decls().size() - 1) {
                sb.append("; ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitReturns_clause(SynlongParser.Returns_clauseContext ctx) {
        return "returns " + visit(ctx.params());
    }

    @Override
    public String visitFullOpBody(SynlongParser.FullOpBodyContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.local_block() != null) {
            sb.append(visit(ctx.local_block()));
        }
        sb.append("let\n");
        for (SynlongParser.EquationContext eq : ctx.equation()) {
            sb.append(visit(eq)).append(";\n");
        }
        sb.append("tel");
        if (ctx.getText().endsWith(";")) {
            sb.append(";");
        }
        return sb.toString();
    }

    @Override
    public String visitEmptyOpBody(SynlongParser.EmptyOpBodyContext ctx) {
        return ";";
    }

    @Override
    public String visitLocal_block(SynlongParser.Local_blockContext ctx) {
        StringBuilder sb = new StringBuilder("var ");
        for (int i = 0; i < ctx.var_decls().size(); i++) {
            sb.append(visit(ctx.var_decls(i)));
            if (i < ctx.var_decls().size() - 1) {
                sb.append("; ");
            }
        }
        sb.append(";\n");
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
        sb.append(" : ").append(visit(ctx.type_expr()));
        return sb.toString();
    }

    @Override
    public String visitAssignment(SynlongParser.AssignmentContext ctx) {
        return visit(ctx.lhs()) + " = " + visit(ctx.expr());
    }

    @Override
    public String visitStateMachineReturn(SynlongParser.StateMachineReturnContext ctx) {
        return visit(ctx.state_machine()) + "\n" + visit(ctx.return_statement());
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

    // 修复常量表达式转换
    @Override
    public String visitConstId(SynlongParser.ConstIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitConstAtom(SynlongParser.ConstAtomContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public String visitConstUnaryOp(SynlongParser.ConstUnaryOpContext ctx) {
        return ctx.unary_arith_op().getText() + visit(ctx.const_expr());
    }

    @Override
    public String visitConstBinArithOp(SynlongParser.ConstBinArithOpContext ctx) {
        return visit(ctx.const_expr(0)) + " " + visit(ctx.bin_arith_op()) + " " + visit(ctx.const_expr(1));
    }

    @Override
    public String visitConstBinRelOp(SynlongParser.ConstBinRelOpContext ctx) {
        return visit(ctx.const_expr(0)) + " " + visit(ctx.bin_relation_op()) + " " + visit(ctx.const_expr(1));
    }

    @Override
    public String visitConstBinBoolOp(SynlongParser.ConstBinBoolOpContext ctx) {
        return visit(ctx.const_expr(0)) + " " + visit(ctx.bin_bool_op()) + " " + visit(ctx.const_expr(1));
    }

    @Override
    public String visitConstStruct(SynlongParser.ConstStructContext ctx) {
        List<String> items = new ArrayList<>();
        for (SynlongParser.Const_label_exprContext cle : ctx.const_label_expr()) {
            items.add(cle.ID().getText() + ": " + visit(cle.const_expr()));
        }
        return "{" + String.join("; ", items) + "}";
    }

    @Override
    public String visitConstArray(SynlongParser.ConstArrayContext ctx) {
        List<String> items = new ArrayList<>();
        for (SynlongParser.Const_exprContext ce : ctx.const_list().const_expr()) {
            items.add(visit(ce));
        }
        return "[" + String.join(", ", items) + "]";
    }

    @Override
    public String visitSimpleExpr(SynlongParser.SimpleExprContext ctx) {
        return visit(ctx.simple_expr());
    }

    @Override
    public String visitLastExpr(SynlongParser.LastExprContext ctx) {
        // 将 last 'x 转换为 pre(x)
        return "pre(" + ctx.ID().getText() + ")";
    }

    @Override
    public String visitTempoExpr(SynlongParser.TempoExprContext ctx) {
        return visit(ctx.tempo_expr());
    }

    @Override
    public String visitBoolExpr(SynlongParser.BoolExprContext ctx) {
        return visit(ctx.bool_expr());
    }

    @Override
    public String visitArrayExpr(SynlongParser.ArrayExprContext ctx) {
        return visit(ctx.array_expr());
    }

    @Override
    public String visitStructExpr(SynlongParser.StructExprContext ctx) {
        return visit(ctx.struct_expr());
    }



    @Override
    public String visitSwitchExpr(SynlongParser.SwitchExprContext ctx) {
        return visit(ctx.switch_expr());
    }

    @Override
    public String visitApplyExpr(SynlongParser.ApplyExprContext ctx) {
        return visit(ctx.apply_expr());
    }

    @Override
    public String visitReturn_statement(SynlongParser.Return_statementContext ctx) {
        return "returns " + visit(ctx.returns_var());
    }

    @Override
    public String visitReturns_var(SynlongParser.Returns_varContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.ID().size(); i++) {
            sb.append(ctx.ID(i).getText());
            if (i < ctx.ID().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // ================== 状态机转换 ==================
    @Override
    public String visitState_machine(SynlongParser.State_machineContext ctx) {
        // 1. 收集所有状态
        List<String> stateNames = new ArrayList<>();
        String initialState = null;
        Set<String> finalStates = new HashSet<>();
        
        class StateInfo {
            String name;
            boolean isInitial;
            boolean isFinal;
            List<SynlongParser.TransitionContext> unlessTransitions = new ArrayList<>();
            List<SynlongParser.TransitionContext> untilTransitions = new ArrayList<>();
            SynlongParser.State_bodyContext stateBody;
        }
        
        List<StateInfo> states = new ArrayList<>();
        
        for (SynlongParser.State_declContext stateDecl : ctx.state_decl()) {
            StateInfo info = new StateInfo();
            info.name = stateDecl.ID().getText();
            stateNames.add(info.name);
            
            // 检查是否为初始状态或最终状态
            info.isInitial = stateDecl.getText().contains("initial");
            info.isFinal = stateDecl.getText().contains("final");
            
            if (info.isInitial) {
                initialState = info.name;
                context.setInitialState(info.name);
            }
            if (info.isFinal) {
                finalStates.add(info.name);
                context.addFinalState(info.name);
            }
            
            // 解析unless和until转换
            for (int i = 0; i < stateDecl.getChildCount(); i++) {
                if ("unless".equals(stateDecl.getChild(i).getText())) {
                    // 收集unless转换
                    for (int j = i + 1; j < stateDecl.getChildCount(); j++) {
                        if (stateDecl.getChild(j) instanceof SynlongParser.TransitionContext) {
                            info.unlessTransitions.add((SynlongParser.TransitionContext) stateDecl.getChild(j));
                        }
                    }
                } else if ("until".equals(stateDecl.getChild(i).getText())) {
                    // 收集until转换
                    for (int j = i + 1; j < stateDecl.getChildCount(); j++) {
                        if (stateDecl.getChild(j) instanceof SynlongParser.TransitionContext) {
                            info.untilTransitions.add((SynlongParser.TransitionContext) stateDecl.getChild(j));
                        }
                    }
                }
            }
            
            // 获取状态体
            info.stateBody = stateDecl.state_body();
            states.add(info);
        }
        
        if (initialState == null && !stateNames.isEmpty()) {
            initialState = stateNames.get(0);
            context.setInitialState(initialState);
        }

        // 2. 生成Lustre类型和变量
        StringBuilder sb = new StringBuilder();
        sb.append("type State = enum {").append(String.join(", ", stateNames)).append("};\n");
        sb.append("var state : State;\n");

        // 3. 生成状态转移方程 - 修复转换逻辑
        sb.append("state = if (pre(state) = null) then ").append(initialState).append("\n");
        
        // unless转换优先
        for (StateInfo state : states) {
            for (SynlongParser.TransitionContext trans : state.unlessTransitions) {
                String cond = visit(trans.expr());
                String target = trans.ID().getText();
                // 修复条件表达式，确保不为null
                if (cond != null && !cond.trim().isEmpty()) {
                    sb.append("else if (pre(state) = ").append(state.name)
                      .append(" and ").append(cond).append(") then ").append(target).append("\n");
                }
            }
        }
        
        // until转换其次
        for (StateInfo state : states) {
            for (SynlongParser.TransitionContext trans : state.untilTransitions) {
                String cond = visit(trans.expr());
                String target = trans.ID().getText();
                // 修复条件表达式，确保不为null
                if (cond != null && !cond.trim().isEmpty()) {
                    sb.append("else if (pre(state) = ").append(state.name)
                      .append(" and ").append(cond).append(") then ").append(target).append("\n");
                }
            }
        }
        
        sb.append("else pre(state);\n");

        // 4. 生成每个状态的数据定义
        for (StateInfo state : states) {
            sb.append("-- state ").append(state.name).append(" data_def: ");
            if (state.stateBody != null) {
                sb.append(visit(state.stateBody));
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }

    @Override
    public String visitTransition(SynlongParser.TransitionContext ctx) {
        return visit(ctx.expr()) + " -> " + ctx.ID().getText();
    }

    // 处理原子表达式 - 修复数值转换
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
    public String visitChar(SynlongParser.CharContext ctx) {
        return ctx.CHAR().getText();
    }

    @Override
    public String visitReal(SynlongParser.RealContext ctx) {
        return ctx.REAL().getText();
    }

    @Override
    public String visitUInteger(SynlongParser.UIntegerContext ctx) {
        return ctx.UINT().getText();
    }

    @Override
    public String visitUShort(SynlongParser.UShortContext ctx) {
        return ctx.USHORT().getText();
    }

    @Override
    public String visitShort(SynlongParser.ShortContext ctx) {
        return ctx.SHORT().getText();
    }

    // 处理操作符
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

    // 处理Synlong特有的语法
    @Override
    public String visitMixedConstructor(SynlongParser.MixedConstructorContext ctx) {
        // 处理 (make type)(value, status) 语法
        if (ctx.getText().contains("make")) {
            // 提取类型和值
            String text = ctx.getText();
            if (text.contains("(") && text.contains(")")) {
                int start = text.indexOf("(");
                int end = text.lastIndexOf(")");
                if (start != -1 && end != -1) {
                    String inner = text.substring(start + 1, end);
                    String[] parts = inner.split(",");
                    if (parts.length == 2) {
                        return "{" + parts[0].trim() + ", " + parts[1].trim() + "}";
                    }
                }
            }
        }
        return ctx.getText();
    }

    // 处理数组访问和更新
    @Override
    public String visitArrayAccess(SynlongParser.ArrayAccessContext ctx) {
        return visit(ctx.simple_expr()) + "[" + visit(ctx.const_expr()) + "]";
    }

    @Override
    public String visitStructAccess(SynlongParser.StructAccessContext ctx) {
        return visit(ctx.simple_expr()) + "." + ctx.ID().getText();
    }

    // 处理条件表达式
    @Override
    public String visitIfThenElse(SynlongParser.IfThenElseContext ctx) {
        return "if " + visit(ctx.simple_expr(0)) + " then " + visit(ctx.simple_expr(1)) + " else " + visit(ctx.simple_expr(2));
    }

    // 处理函数调用
    @Override
    public String visitSimpleApply(SynlongParser.SimpleApplyContext ctx) {
        StringBuilder sb = new StringBuilder();
        // SimpleApplyContext没有直接的ID方法，需要从prefix_operator获取
        if (ctx.prefix_operator() != null) {
            sb.append(visit(ctx.prefix_operator()));
        }
        sb.append("(");
        if (ctx.list() != null) {
            sb.append(visit(ctx.list()));
        }
        sb.append(")");
        return sb.toString();
    }
}
