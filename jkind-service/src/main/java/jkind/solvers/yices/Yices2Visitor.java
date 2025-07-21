// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-service/src/main/java/jkind/solvers/yices2/Yices2.g4 by ANTLR 4.13.2
package jkind.solvers.yices;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Yices2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Yices2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(Yices2Parser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(Yices2Parser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Yices2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Yices2Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(Yices2Parser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Yices2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#functionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValue(Yices2Parser.FunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Yices2Parser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Yices2Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positiveInteger}
	 * labeled alternative in {@link Yices2Parser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveInteger(Yices2Parser.PositiveIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeInteger}
	 * labeled alternative in {@link Yices2Parser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeInteger(Yices2Parser.NegativeIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Yices2Parser#quotient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotient(Yices2Parser.QuotientContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerNumeric}
	 * labeled alternative in {@link Yices2Parser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumeric(Yices2Parser.IntegerNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotientNumeric}
	 * labeled alternative in {@link Yices2Parser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotientNumeric(Yices2Parser.QuotientNumericContext ctx);
}