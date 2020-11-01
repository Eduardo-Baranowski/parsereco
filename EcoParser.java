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
		T__0=1, T__1=2, NUMBER=3, ID=4, WS=5;
	public static final int
		RULE_abertura = 0, RULE_lance = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"abertura", "lance"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'b4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "ID", "WS"
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

	public static class AberturaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EcoParser.EOF, 0); }
		public List<LanceContext> lance() {
			return getRuleContexts(LanceContext.class);
		}
		public LanceContext lance(int i) {
			return getRuleContext(LanceContext.class,i);
		}
		public AberturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abertura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).enterAbertura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).exitAbertura(this);
		}
	}

	public final AberturaContext abertura() throws RecognitionException {
		AberturaContext _localctx = new AberturaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abertura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(4);
				lance();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
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

	public static class LanceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(EcoParser.NUMBER, 0); }
		public List<TerminalNode> ID() { return getTokens(EcoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EcoParser.ID, i);
		}
		public LanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).enterLance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EcoListener ) ((EcoListener)listener).exitLance(this);
		}
	}

	public final LanceContext lance() throws RecognitionException {
		LanceContext _localctx = new LanceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(NUMBER);
			setState(13);
			match(T__0);
			setState(14);
			match(T__1);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				match(ID);
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\27\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\23\n\3"+
		"\r\3\16\3\24\3\3\2\2\4\2\4\2\2\2\26\2\t\3\2\2\2\4\16\3\2\2\2\6\b\5\4\3"+
		"\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2\13\t\3"+
		"\2\2\2\f\r\7\2\2\3\r\3\3\2\2\2\16\17\7\5\2\2\17\20\7\3\2\2\20\22\7\4\2"+
		"\2\21\23\7\6\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2"+
		"\2\25\5\3\2\2\2\4\t\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}