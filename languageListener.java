// Generated from language.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(languageParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(languageParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(languageParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(languageParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(languageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(languageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(languageParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(languageParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#decConst}.
	 * @param ctx the parse tree
	 */
	void enterDecConst(languageParser.DecConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#decConst}.
	 * @param ctx the parse tree
	 */
	void exitDecConst(languageParser.DecConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(languageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(languageParser.TypeContext ctx);
}