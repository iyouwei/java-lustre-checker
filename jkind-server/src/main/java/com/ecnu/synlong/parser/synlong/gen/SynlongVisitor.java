// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-server/src/main/java/com/ecnu/synlong/parser/synlong/Synlong.g4 by ANTLR 4.13.2
package com.ecnu.synlong.parser.synlong.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SynlongParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SynlongVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(SynlongParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#type_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_block(SynlongParser.Type_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(SynlongParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(SynlongParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_expr(SynlongParser.Type_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(SynlongParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_block(SynlongParser.Const_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(SynlongParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr(SynlongParser.Const_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_list(SynlongParser.Const_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_label_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_label_expr(SynlongParser.Const_label_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_op_decl(SynlongParser.User_op_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_kind(SynlongParser.Op_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SynlongParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#returns_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_clause(SynlongParser.Returns_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_body(SynlongParser.Op_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#local_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_block(SynlongParser.Local_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#var_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decls(SynlongParser.Var_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(SynlongParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#when_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_decl(SynlongParser.When_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClock_expr(SynlongParser.Clock_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#last_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_decl(SynlongParser.Last_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(SynlongParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(SynlongParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#lhs_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs_id(SynlongParser.Lhs_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(SynlongParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#returns_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_var(SynlongParser.Returns_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#state_machine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_machine(SynlongParser.State_machineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#state_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_decl(SynlongParser.State_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#data_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_def(SynlongParser.Data_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SynlongParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(SynlongParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo_expr(SynlongParser.Tempo_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(SynlongParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(SynlongParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#struct_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_expr(SynlongParser.Struct_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#label_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_expr(SynlongParser.Label_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#mixed_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_constructor(SynlongParser.Mixed_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_or_index(SynlongParser.Label_or_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SynlongParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_expr(SynlongParser.Switch_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(SynlongParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(SynlongParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply_expr(SynlongParser.Apply_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(SynlongParser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_unary_operator(SynlongParser.Prefix_unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_binary_operator(SynlongParser.Prefix_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterator(SynlongParser.IteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SynlongParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_arith_op(SynlongParser.Unary_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_arith_op(SynlongParser.Bin_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_relation_op(SynlongParser.Bin_relation_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_bool_op(SynlongParser.Bin_bool_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SynlongParser.AtomContext ctx);
}