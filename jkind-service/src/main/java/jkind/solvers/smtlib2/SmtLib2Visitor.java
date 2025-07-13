// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-service/src/main/java/jkind/solvers/smtlib2/SmtLib2.g4 by ANTLR 4.13.2
package jkind.solvers.smtlib2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmtLib2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmtLib2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(SmtLib2Parser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(SmtLib2Parser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(SmtLib2Parser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SmtLib2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbolBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolBody(SmtLib2Parser.SymbolBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsBody(SmtLib2Parser.ConsBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letBody}
	 * labeled alternative in {@link SmtLib2Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBody(SmtLib2Parser.LetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(SmtLib2Parser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#fn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn(SmtLib2Parser.FnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SmtLib2Parser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SmtLib2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmtLib2Parser#qid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQid(SmtLib2Parser.QidContext ctx);
}