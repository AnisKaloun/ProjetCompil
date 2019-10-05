// Generated from language.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(languageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(languageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#definitionF}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionF(languageParser.DefinitionFContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#definitionF}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionF(languageParser.DefinitionFContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(languageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(languageParser.InstructionContext ctx);
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
	 * Enter a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(languageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(languageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(languageParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(languageParser.BoucleContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link languageParser#phi}.
	 * @param ctx the parse tree
	 */
	void enterPhi(languageParser.PhiContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#phi}.
	 * @param ctx the parse tree
	 */
	void exitPhi(languageParser.PhiContext ctx);
}