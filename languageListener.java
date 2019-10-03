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
	 * Enter a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(languageParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(languageParser.ConstanteContext ctx);
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