// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-server/src/main/java/com/ecnu/synlong/parser/synlong/Synlong.g4 by ANTLR 4.13.2
package com.ecnu.synlong.parser.synlong.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SynlongParser}.
 */
public interface SynlongListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(SynlongParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(SynlongParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#type_block}.
	 * @param ctx the parse tree
	 */
	void enterType_block(SynlongParser.Type_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#type_block}.
	 * @param ctx the parse tree
	 */
	void exitType_block(SynlongParser.Type_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(SynlongParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(SynlongParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(SynlongParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(SynlongParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterType_expr(SynlongParser.Type_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitType_expr(SynlongParser.Type_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(SynlongParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(SynlongParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 */
	void enterTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 */
	void exitTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_block}.
	 * @param ctx the parse tree
	 */
	void enterConst_block(SynlongParser.Const_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_block}.
	 * @param ctx the parse tree
	 */
	void exitConst_block(SynlongParser.Const_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(SynlongParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(SynlongParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr(SynlongParser.Const_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr(SynlongParser.Const_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_list}.
	 * @param ctx the parse tree
	 */
	void enterConst_list(SynlongParser.Const_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_list}.
	 * @param ctx the parse tree
	 */
	void exitConst_list(SynlongParser.Const_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_label_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_label_expr(SynlongParser.Const_label_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_label_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_label_expr(SynlongParser.Const_label_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 */
	void enterUser_op_decl(SynlongParser.User_op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 */
	void exitUser_op_decl(SynlongParser.User_op_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 */
	void enterOp_kind(SynlongParser.Op_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 */
	void exitOp_kind(SynlongParser.Op_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SynlongParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SynlongParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#returns_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturns_clause(SynlongParser.Returns_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#returns_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturns_clause(SynlongParser.Returns_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 */
	void enterOp_body(SynlongParser.Op_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 */
	void exitOp_body(SynlongParser.Op_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#local_block}.
	 * @param ctx the parse tree
	 */
	void enterLocal_block(SynlongParser.Local_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#local_block}.
	 * @param ctx the parse tree
	 */
	void exitLocal_block(SynlongParser.Local_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void enterVar_decls(SynlongParser.Var_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void exitVar_decls(SynlongParser.Var_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(SynlongParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(SynlongParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#when_decl}.
	 * @param ctx the parse tree
	 */
	void enterWhen_decl(SynlongParser.When_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#when_decl}.
	 * @param ctx the parse tree
	 */
	void exitWhen_decl(SynlongParser.When_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 */
	void enterClock_expr(SynlongParser.Clock_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 */
	void exitClock_expr(SynlongParser.Clock_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#last_decl}.
	 * @param ctx the parse tree
	 */
	void enterLast_decl(SynlongParser.Last_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#last_decl}.
	 * @param ctx the parse tree
	 */
	void exitLast_decl(SynlongParser.Last_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(SynlongParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(SynlongParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(SynlongParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(SynlongParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#lhs_id}.
	 * @param ctx the parse tree
	 */
	void enterLhs_id(SynlongParser.Lhs_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#lhs_id}.
	 * @param ctx the parse tree
	 */
	void exitLhs_id(SynlongParser.Lhs_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(SynlongParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(SynlongParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#returns_var}.
	 * @param ctx the parse tree
	 */
	void enterReturns_var(SynlongParser.Returns_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#returns_var}.
	 * @param ctx the parse tree
	 */
	void exitReturns_var(SynlongParser.Returns_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#state_machine}.
	 * @param ctx the parse tree
	 */
	void enterState_machine(SynlongParser.State_machineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#state_machine}.
	 * @param ctx the parse tree
	 */
	void exitState_machine(SynlongParser.State_machineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#state_decl}.
	 * @param ctx the parse tree
	 */
	void enterState_decl(SynlongParser.State_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#state_decl}.
	 * @param ctx the parse tree
	 */
	void exitState_decl(SynlongParser.State_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#data_def}.
	 * @param ctx the parse tree
	 */
	void enterData_def(SynlongParser.Data_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#data_def}.
	 * @param ctx the parse tree
	 */
	void exitData_def(SynlongParser.Data_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SynlongParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SynlongParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(SynlongParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(SynlongParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterTempo_expr(SynlongParser.Tempo_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitTempo_expr(SynlongParser.Tempo_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(SynlongParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(SynlongParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(SynlongParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(SynlongParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#struct_expr}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expr(SynlongParser.Struct_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#struct_expr}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expr(SynlongParser.Struct_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#label_expr}.
	 * @param ctx the parse tree
	 */
	void enterLabel_expr(SynlongParser.Label_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#label_expr}.
	 * @param ctx the parse tree
	 */
	void exitLabel_expr(SynlongParser.Label_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#mixed_constructor}.
	 * @param ctx the parse tree
	 */
	void enterMixed_constructor(SynlongParser.Mixed_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#mixed_constructor}.
	 * @param ctx the parse tree
	 */
	void exitMixed_constructor(SynlongParser.Mixed_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 */
	void enterLabel_or_index(SynlongParser.Label_or_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 */
	void exitLabel_or_index(SynlongParser.Label_or_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SynlongParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SynlongParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expr(SynlongParser.Switch_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expr(SynlongParser.Switch_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(SynlongParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(SynlongParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SynlongParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SynlongParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterApply_expr(SynlongParser.Apply_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitApply_expr(SynlongParser.Apply_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(SynlongParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(SynlongParser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_unary_operator(SynlongParser.Prefix_unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_unary_operator(SynlongParser.Prefix_unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_binary_operator(SynlongParser.Prefix_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_binary_operator(SynlongParser.Prefix_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterIterator(SynlongParser.IteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitIterator(SynlongParser.IteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SynlongParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SynlongParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_arith_op(SynlongParser.Unary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_arith_op(SynlongParser.Unary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_arith_op(SynlongParser.Bin_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_arith_op(SynlongParser.Bin_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_relation_op(SynlongParser.Bin_relation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_relation_op(SynlongParser.Bin_relation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_bool_op(SynlongParser.Bin_bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_bool_op(SynlongParser.Bin_bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SynlongParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SynlongParser.AtomContext ctx);
}