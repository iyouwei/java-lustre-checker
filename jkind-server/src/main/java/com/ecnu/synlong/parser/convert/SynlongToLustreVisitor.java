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
                sb.append(" = ").append(visit(typeDecl.type_def()));
            }
            sb.append(";\n");
        }
        return sb.toString();
    }

    @Override
    public String visitType_def(SynlongParser.Type_defContext ctx) {
        if (ctx.type_expr() != null) {
            return visit(ctx.type_expr());
        }
        if (ctx.getChildCount() > 0 && ctx.getChild(0).getText().equals("enum")) {
            List<String> ids = new ArrayList<>();
            for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.ID()) {
                ids.add(id.getText());
            }
            return "enum {" + String.join(", ", ids) + "}";
        }
        return ctx.getText();
    }

    @Override
    public String visitType_expr(SynlongParser.Type_exprContext ctx) {
        String text = ctx.getText();
        if ("bool".equals(text)) return "bool";
        if ("int".equals(text)) return "int";
        if ("real".equals(text)) return "real";
        if (ctx.typevar() != null) return ctx.typevar().getText();
        if (ctx.field_decl() != null && !ctx.field_decl().isEmpty()) {
            // 结构体
            List<String> fields = new ArrayList<>();
            for (SynlongParser.Field_declContext f : ctx.field_decl()) {
                fields.add(f.ID().getText() + ": " + visit(f.type_expr()));
            }
            return "struct {" + String.join("; ", fields) + "}";
        }
        if (ctx.type_expr() != null && ctx.const_expr() != null) {
            // 数组
            return visit(ctx.type_expr()) + "[" + visit(ctx.const_expr()) + "]";
        }
        return text;
    }

    @Override
    public String visitConst_block(SynlongParser.Const_blockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.Const_declContext constDecl : ctx.const_decl()) {
            sb.append("const ").append(constDecl.ID().getText());
            if (constDecl.type_expr() != null) {
                sb.append(" : ").append(visit(constDecl.type_expr()));
            }
            if (constDecl.const_expr() != null) {
                sb.append(" = ").append(visit(constDecl.const_expr()));
            }
            sb.append(";\n");
        }
        return sb.toString();
    }

    @Override
    public String visitUser_op_decl(SynlongParser.User_op_declContext ctx) {
        String kind = ctx.op_kind().getText();
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
    public String visitVar_decls(SynlongParser.Var_declsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.var_id().size(); i++) {
            sb.append(ctx.var_id(i).getText());
            if (i < ctx.var_id().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" : ").append(visit(ctx.type_expr()));
        // when/last等可扩展
        return sb.toString();
    }

    @Override
    public String visitOp_body(SynlongParser.Op_bodyContext ctx) {
        if (ctx.getText().equals(";")) {
            return ";";
        }
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
    public String visitEquation(SynlongParser.EquationContext ctx) {
        if (ctx.lhs() != null && ctx.expr() != null) {
            return visit(ctx.lhs()) + " = " + visit(ctx.expr());
        }
        if (ctx.state_machine() != null && ctx.return_statement() != null) {
            return visit(ctx.state_machine()) + "\n" + visit(ctx.return_statement());
        }
        return "-- equation (to be implemented)";
    }

    @Override
    public String visitLhs(SynlongParser.LhsContext ctx) {
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
    public String visitConst_expr(SynlongParser.Const_exprContext ctx) {
        // 递归处理常量表达式
        if (ctx.ID() != null) return ctx.ID().getText();
        if (ctx.atom() != null) return visit(ctx.atom());
        if (ctx.unary_arith_op() != null) return ctx.unary_arith_op().getText() + visit(ctx.const_expr(0));
        if (ctx.bin_arith_op() != null) return visit(ctx.const_expr(0)) + " " + ctx.bin_arith_op().getText() + " " + visit(ctx.const_expr(1));
        if (ctx.bin_bool_op() != null) return visit(ctx.const_expr(0)) + " " + ctx.bin_bool_op().getText() + " " + visit(ctx.const_expr(1));
        if (ctx.bin_relation_op() != null) return visit(ctx.const_expr(0)) + " " + ctx.bin_relation_op().getText() + " " + visit(ctx.const_expr(1));
        if (ctx.const_list() != null) {
            List<String> items = new ArrayList<>();
            for (SynlongParser.Const_exprContext ce : ctx.const_list().const_expr()) {
                items.add(visit(ce));
            }
            return "[" + String.join(", ", items) + "]";
        }
        if (ctx.const_label_expr() != null && !ctx.const_label_expr().isEmpty()) {
            List<String> items = new ArrayList<>();
            for (SynlongParser.Const_label_exprContext cle : ctx.const_label_expr()) {
                items.add(cle.ID().getText() + ": " + visit(cle.const_expr()));
            }
            return "{" + String.join(", ", items) + "}";
        }
        return ctx.getText();
    }

    @Override
    public String visitExpr(SynlongParser.ExprContext ctx) {
        // 递归处理表达式
        if (ctx.simple_expr() != null) return visit(ctx.simple_expr());
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("last") && ctx.getChild(1).getText().equals("'")) {
            return "pre(" + ctx.ID().getText() + ")";
        }
        if (ctx.tempo_expr() != null) return visit(ctx.tempo_expr());
        if (ctx.bool_expr() != null) return visit(ctx.bool_expr());
        if (ctx.array_expr() != null) return visit(ctx.array_expr());
        if (ctx.struct_expr() != null) return visit(ctx.struct_expr());
        if (ctx.mixed_constructor() != null) return visit(ctx.mixed_constructor());
        if (ctx.switch_expr() != null) return visit(ctx.switch_expr());
        if (ctx.apply_expr() != null) return visit(ctx.apply_expr());
        return ctx.getText();
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
            SynlongParser.Data_defContext dataDef;
        }
        List<StateInfo> states = new ArrayList<>();
        for (SynlongParser.State_declContext stateDecl : ctx.state_decl()) {
            StateInfo info = new StateInfo();
            info.name = stateDecl.ID().getText();
            stateNames.add(info.name);
            info.isInitial = stateDecl.getText().contains("initial");
            info.isFinal = stateDecl.getText().contains("final");
            if (info.isInitial) initialState = info.name;
            if (info.isFinal) finalStates.add(info.name);
            // unless
            if (stateDecl.getText().contains("unless")) {
                int unlessIdx = -1;
                for (int i = 0; i < stateDecl.getChildCount(); i++) {
                    if ("unless".equals(stateDecl.getChild(i).getText())) {
                        unlessIdx = i;
                        break;
                    }
                }
                if (unlessIdx != -1) {
                    // 取所有transition
                    for (int i = unlessIdx + 1; i < stateDecl.getChildCount(); i++) {
                        if (stateDecl.getChild(i) instanceof SynlongParser.TransitionContext) {
                            info.unlessTransitions.add((SynlongParser.TransitionContext) stateDecl.getChild(i));
                        }
                    }
                }
            }
            // until
            if (stateDecl.getText().contains("until")) {
                int untilIdx = -1;
                for (int i = 0; i < stateDecl.getChildCount(); i++) {
                    if ("until".equals(stateDecl.getChild(i).getText())) {
                        untilIdx = i;
                        break;
                    }
                }
                if (untilIdx != -1) {
                    for (int i = untilIdx + 1; i < stateDecl.getChildCount(); i++) {
                        if (stateDecl.getChild(i) instanceof SynlongParser.TransitionContext) {
                            info.untilTransitions.add((SynlongParser.TransitionContext) stateDecl.getChild(i));
                        }
                    }
                }
            }
            // data_def
            info.dataDef = stateDecl.data_def();
            states.add(info);
        }
        if (initialState == null && !stateNames.isEmpty()) {
            initialState = stateNames.get(0);
        }

        // 2. 生成Lustre类型和变量
        StringBuilder sb = new StringBuilder();
        sb.append("type State = enum {").append(String.join(", ", stateNames)).append("};\n");
        sb.append("var state : State;\n");

        // 3. 生成状态转移方程
        sb.append("state = if (pre(state) = null) then ").append(initialState).append("\n");
        for (StateInfo state : states) {
            // unless优先
            for (SynlongParser.TransitionContext trans : state.unlessTransitions) {
                String cond = visit(trans.expr());
                String target = trans.ID().getText();
                sb.append("else if (pre(state) = ").append(state.name)
                  .append(" and ").append(cond).append(") then ").append(target).append("\n");
            }
        }
        for (StateInfo state : states) {
            // until其次
            for (SynlongParser.TransitionContext trans : state.untilTransitions) {
                String cond = visit(trans.expr());
                String target = trans.ID().getText();
                sb.append("else if (pre(state) = ").append(state.name)
                  .append(" and ").append(cond).append(") then ").append(target).append("\n");
            }
        }
        sb.append("else pre(state);\n");

        // 4. 生成每个状态的数据定义
        for (StateInfo state : states) {
            sb.append("-- state ").append(state.name).append(" data_def: ");
            if (state.dataDef != null) {
                sb.append(state.dataDef.getText());
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
