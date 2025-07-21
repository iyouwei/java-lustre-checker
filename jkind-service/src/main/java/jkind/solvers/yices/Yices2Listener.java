// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-service/src/main/java/jkind/solvers/yices2/Yices2.g4 by ANTLR 4.13.2
package jkind.solvers.yices;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Yices2Parser}.
 */
public interface Yices2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(Yices2Parser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(Yices2Parser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(Yices2Parser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(Yices2Parser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Yices2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Yices2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Yices2Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Yices2Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(Yices2Parser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(Yices2Parser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Yices2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Yices2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#functionValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValue(Yices2Parser.FunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#functionValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValue(Yices2Parser.FunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(Yices2Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(Yices2Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Yices2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Yices2Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positiveInteger}
	 * labeled alternative in {@link Yices2Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterPositiveInteger(Yices2Parser.PositiveIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positiveInteger}
	 * labeled alternative in {@link Yices2Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitPositiveInteger(Yices2Parser.PositiveIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeInteger}
	 * labeled alternative in {@link Yices2Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterNegativeInteger(Yices2Parser.NegativeIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeInteger}
	 * labeled alternative in {@link Yices2Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitNegativeInteger(Yices2Parser.NegativeIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Yices2Parser#quotient}.
	 * @param ctx the parse tree
	 */
	void enterQuotient(Yices2Parser.QuotientContext ctx);
	/**
	 * Exit a parse tree produced by {@link Yices2Parser#quotient}.
	 * @param ctx the parse tree
	 */
	void exitQuotient(Yices2Parser.QuotientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerNumeric}
	 * labeled alternative in {@link Yices2Parser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNumeric(Yices2Parser.IntegerNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerNumeric}
	 * labeled alternative in {@link Yices2Parser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNumeric(Yices2Parser.IntegerNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotientNumeric}
	 * labeled alternative in {@link Yices2Parser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterQuotientNumeric(Yices2Parser.QuotientNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotientNumeric}
	 * labeled alternative in {@link Yices2Parser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitQuotientNumeric(Yices2Parser.QuotientNumericContext ctx);
}