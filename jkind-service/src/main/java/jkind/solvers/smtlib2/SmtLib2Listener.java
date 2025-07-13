// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-service/src/main/java/jkind/solvers/smtlib2/SmtLib2.g4 by ANTLR 4.13.2
package jkind.solvers.smtlib2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmtLib2Parser}.
 */
public interface SmtLib2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(SmtLib2Parser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(SmtLib2Parser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(SmtLib2Parser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(SmtLib2Parser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SmtLib2Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SmtLib2Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SmtLib2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SmtLib2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbolBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterSymbolBody(SmtLib2Parser.SymbolBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbolBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitSymbolBody(SmtLib2Parser.SymbolBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterConsBody(SmtLib2Parser.ConsBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitConsBody(SmtLib2Parser.ConsBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterLetBody(SmtLib2Parser.LetBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitLetBody(SmtLib2Parser.LetBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(SmtLib2Parser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(SmtLib2Parser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#fn}.
	 * @param ctx the parse tree
	 */
	void enterFn(SmtLib2Parser.FnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#fn}.
	 * @param ctx the parse tree
	 */
	void exitFn(SmtLib2Parser.FnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SmtLib2Parser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SmtLib2Parser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SmtLib2Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SmtLib2Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmtLib2Parser#qid}.
	 * @param ctx the parse tree
	 */
	void enterQid(SmtLib2Parser.QidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmtLib2Parser#qid}.
	 * @param ctx the parse tree
	 */
	void exitQid(SmtLib2Parser.QidContext ctx);
}