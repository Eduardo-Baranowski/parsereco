// Generated from Eco.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EcoParser}.
 */
public interface EcoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EcoParser#abertura}.
	 * @param ctx the parse tree
	 */
	void enterAbertura(EcoParser.AberturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EcoParser#abertura}.
	 * @param ctx the parse tree
	 */
	void exitAbertura(EcoParser.AberturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EcoParser#lance}.
	 * @param ctx the parse tree
	 */
	void enterLance(EcoParser.LanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EcoParser#lance}.
	 * @param ctx the parse tree
	 */
	void exitLance(EcoParser.LanceContext ctx);
}