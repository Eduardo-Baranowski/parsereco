// Generated from Eco.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EcoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NUMC=4, COLUNA=5, PECA=6, WS=7;
	public static final int
		RULE_eco = 0, RULE_jogada = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"eco", "jogada"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'9'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NUMC", "COLUNA", "PECA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Eco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EcoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EcoContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EcoParser.EOF, 0); }
		public List<JogadaContext> jogada() {
			return getRuleContexts(JogadaContext.class);
		}
		public JogadaContext jogada(int i) {
			return getRuleContext(JogadaContext.class,i);
		}
		public EcoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).enterEco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).exitEco(this);
		}
	}

	public final EcoContext eco() throws RecognitionException {
		EcoContext _localctx = new EcoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				jogada();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMC))) != 0) );
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JogadaContext extends ParserRuleContext {
		public JogadaContext jogada() {
			return getRuleContext(JogadaContext.class,0);
		}
		public List<TerminalNode> COLUNA() { return getTokens(EcoParser.COLUNA); }
		public TerminalNode COLUNA(int i) {
			return getToken(EcoParser.COLUNA, i);
		}
		public List<TerminalNode> NUMC() { return getTokens(EcoParser.NUMC); }
		public TerminalNode NUMC(int i) {
			return getToken(EcoParser.NUMC, i);
		}
		public List<TerminalNode> PECA() { return getTokens(EcoParser.PECA); }
		public TerminalNode PECA(int i) {
			return getToken(EcoParser.PECA, i);
		}
		public JogadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jogada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).enterJogada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).exitJogada(this);
		}
	}

	public final JogadaContext jogada() throws RecognitionException {
		JogadaContext _localctx = new JogadaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jogada);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(11);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMC))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(14); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMC))) != 0) );
				setState(16);
				match(T__2);
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PECA) {
						{
						setState(17);
						match(PECA);
						}
					}

					setState(20);
					match(COLUNA);
					setState(21);
					match(NUMC);
					}
					}
					setState(24); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLUNA || _la==PECA );
				setState(26);
				jogada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(27);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMC))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(30); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMC))) != 0) );
				setState(32);
				match(T__2);
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PECA) {
						{
						setState(33);
						match(PECA);
						}
					}

					setState(36);
					match(COLUNA);
					setState(37);
					match(NUMC);
					}
					}
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLUNA || _la==PECA );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t/\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\3\3\6\3\17\n\3\r\3\16\3\20\3\3\3\3"+
		"\5\3\25\n\3\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\6\3\37\n\3\r\3\16\3"+
		" \3\3\3\3\5\3%\n\3\3\3\3\3\6\3)\n\3\r\3\16\3*\5\3-\n\3\3\3\2\2\4\2\4\2"+
		"\3\4\2\3\4\6\6\2\64\2\7\3\2\2\2\4,\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t"+
		"\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\7\2\2\3\f\3\3\2\2\2"+
		"\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21"+
		"\22\3\2\2\2\22\30\7\5\2\2\23\25\7\b\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25"+
		"\26\3\2\2\2\26\27\7\7\2\2\27\31\7\6\2\2\30\24\3\2\2\2\31\32\3\2\2\2\32"+
		"\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34-\5\4\3\2\35\37\t\2\2\2\36\35"+
		"\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"(\7\5\2\2#%\7\b"+
		"\2\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\7\2\2\')\7\6\2\2($\3\2\2\2)*\3"+
		"\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\16\3\2\2\2,\36\3\2\2\2-\5\3\2\2"+
		"\2\n\t\20\24\32 $*,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}