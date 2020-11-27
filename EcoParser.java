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
		T__0=1, N=2, T=3, L=4, WS=5;
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
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "N", "T", "L", "WS"
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
			while (_la==T__0 || _la==L) {
				{
				{
				setState(4);
				lance(0);
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
		public List<LanceContext> lance() {
			return getRuleContexts(LanceContext.class);
		}
		public LanceContext lance(int i) {
			return getRuleContext(LanceContext.class,i);
		}
		public List<TerminalNode> L() { return getTokens(EcoParser.L); }
		public TerminalNode L(int i) {
			return getToken(EcoParser.L, i);
		}
		public List<TerminalNode> N() { return getTokens(EcoParser.N); }
		public TerminalNode N(int i) {
			return getToken(EcoParser.N, i);
		}
		public List<TerminalNode> T() { return getTokens(EcoParser.T); }
		public TerminalNode T(int i) {
			return getToken(EcoParser.T, i);
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
		return lance(0);
	}

	private LanceContext lance(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LanceContext _localctx = new LanceContext(_ctx, _parentState);
		LanceContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lance, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L) {
					{
					{
					setState(13);
					match(L);
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(19);
				match(T__0);
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(20);
					match(N);
					}
					}
					setState(23); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==N );
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T) {
					{
					{
					setState(25);
					match(T);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(31);
				lance(3);
				}
				break;
			case 2:
				{
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L) {
					{
					{
					setState(32);
					match(L);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(T__0);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					match(N);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==N );
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T) {
					{
					{
					setState(44);
					match(T);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(50);
				lance(2);
				}
				break;
			case 3:
				{
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L) {
					{
					{
					setState(51);
					match(L);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(T__0);
				setState(59); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(58);
						match(N);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(61); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						match(T);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LanceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lance);
					setState(71);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					{
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==L) {
						{
						{
						setState(72);
						match(L);
						}
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(78);
					match(T__0);
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(79);
						match(N);
						}
						}
						setState(82); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==N );
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T) {
						{
						{
						setState(84);
						match(T);
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(90);
					lance(5);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lance_sempred((LanceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lance_sempred(LanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7c\4\2\t\2\4\3\t"+
		"\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\3\3\3\3\7\3\21\n\3\f\3\16\3"+
		"\24\13\3\3\3\3\3\6\3\30\n\3\r\3\16\3\31\3\3\7\3\35\n\3\f\3\16\3 \13\3"+
		"\3\3\3\3\7\3$\n\3\f\3\16\3\'\13\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\7\3\60"+
		"\n\3\f\3\16\3\63\13\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\6\3>\n"+
		"\3\r\3\16\3?\3\3\7\3C\n\3\f\3\16\3F\13\3\5\3H\n\3\3\3\3\3\7\3L\n\3\f\3"+
		"\16\3O\13\3\3\3\3\3\6\3S\n\3\r\3\16\3T\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3"+
		"\7\3^\n\3\f\3\16\3a\13\3\3\3\2\3\4\4\2\4\2\2\2p\2\t\3\2\2\2\4G\3\2\2\2"+
		"\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\f\3\2"+
		"\2\2\13\t\3\2\2\2\f\r\7\2\2\3\r\3\3\2\2\2\16\22\b\3\1\2\17\21\7\6\2\2"+
		"\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2"+
		"\24\22\3\2\2\2\25\27\7\3\2\2\26\30\7\4\2\2\27\26\3\2\2\2\30\31\3\2\2\2"+
		"\31\27\3\2\2\2\31\32\3\2\2\2\32\36\3\2\2\2\33\35\7\5\2\2\34\33\3\2\2\2"+
		"\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!H\5\4"+
		"\3\5\"$\7\6\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'"+
		"%\3\2\2\2(*\7\3\2\2)+\7\4\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-\61\3\2\2\2.\60\7\5\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64H\5\4\3\4\65\67\7\6\2\2\66\65\3\2\2"+
		"\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;=\7\3\2\2<>\7"+
		"\4\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2\2\2AC\7\5\2\2BA\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G\16\3\2\2\2G"+
		"%\3\2\2\2G8\3\2\2\2H_\3\2\2\2IM\f\6\2\2JL\7\6\2\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PR\7\3\2\2QS\7\4\2\2RQ\3\2\2\2"+
		"ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2\2\2VX\7\5\2\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\5\4\3\7]I\3\2\2\2^a\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`\5\3\2\2\2a_\3\2\2\2\21\t\22\31\36%,\618?DGMTY"+
		"_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}