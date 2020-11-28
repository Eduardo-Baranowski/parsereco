// Generated from Eco.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EcoParser}.
 */
public interface EcoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EcoParser#eco}.
	 * @param ctx the parse tree
	 */
	void enterEco(EcoParser.EcoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EcoParser#eco}.
	 * @param ctx the parse tree
	 */
	void exitEco(EcoParser.EcoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EcoParser#jogada}.
	 * @param ctx the parse tree
	 */
	void enterJogada(EcoParser.JogadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EcoParser#jogada}.
	 * @param ctx the parse tree
	 */
	void exitJogada(EcoParser.JogadaContext ctx);
}