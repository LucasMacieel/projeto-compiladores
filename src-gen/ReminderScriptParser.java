// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReminderScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		DATA_HORA=10, OPCOES_REPETICAO=11, ESPACOS=12;
	public static final int
		RULE_start = 0, RULE_com = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "com"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'lembrete'", "'{'", "'mensagem'", "':'", "','", "'tempo'", "'repetir'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "STRING", "DATA_HORA", 
			"OPCOES_REPETICAO", "ESPACOS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReminderScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReminderScriptParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReminderScriptListener ) ((ReminderScriptListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReminderScriptListener ) ((ReminderScriptListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReminderScriptVisitor ) return ((ReminderScriptVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			com();
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LembreteContext extends ComContext {
		public Token nomeLembrete;
		public Token mensagem;
		public Token dataRepeticao;
		public Token opcaoRepeticao;
		public List<TerminalNode> STRING() { return getTokens(ReminderScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReminderScriptParser.STRING, i);
		}
		public TerminalNode DATA_HORA() { return getToken(ReminderScriptParser.DATA_HORA, 0); }
		public TerminalNode OPCOES_REPETICAO() { return getToken(ReminderScriptParser.OPCOES_REPETICAO, 0); }
		public LembreteContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReminderScriptListener ) ((ReminderScriptListener)listener).enterLembrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReminderScriptListener ) ((ReminderScriptListener)listener).exitLembrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReminderScriptVisitor ) return ((ReminderScriptVisitor<? extends T>)visitor).visitLembrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		try {
			_localctx = new LembreteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(T__0);
			setState(8);
			((LembreteContext)_localctx).nomeLembrete = match(STRING);
			setState(9);
			match(T__1);
			setState(10);
			match(T__2);
			setState(11);
			match(T__3);
			setState(12);
			((LembreteContext)_localctx).mensagem = match(STRING);
			setState(13);
			match(T__4);
			setState(14);
			match(T__5);
			setState(15);
			match(T__3);
			setState(16);
			((LembreteContext)_localctx).dataRepeticao = match(DATA_HORA);
			setState(17);
			match(T__4);
			setState(18);
			match(T__6);
			setState(19);
			match(T__3);
			setState(20);
			((LembreteContext)_localctx).opcaoRepeticao = match(OPCOES_REPETICAO);
			setState(21);
			match(T__7);
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
		"\u0004\u0001\f\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0015\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004"+
		"\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006"+
		"\u0001\u0001\u0000\u0000\u0000\u0007\b\u0005\u0001\u0000\u0000\b\t\u0005"+
		"\t\u0000\u0000\t\n\u0005\u0002\u0000\u0000\n\u000b\u0005\u0003\u0000\u0000"+
		"\u000b\f\u0005\u0004\u0000\u0000\f\r\u0005\t\u0000\u0000\r\u000e\u0005"+
		"\u0005\u0000\u0000\u000e\u000f\u0005\u0006\u0000\u0000\u000f\u0010\u0005"+
		"\u0004\u0000\u0000\u0010\u0011\u0005\n\u0000\u0000\u0011\u0012\u0005\u0005"+
		"\u0000\u0000\u0012\u0013\u0005\u0007\u0000\u0000\u0013\u0014\u0005\u0004"+
		"\u0000\u0000\u0014\u0015\u0005\u000b\u0000\u0000\u0015\u0016\u0005\b\u0000"+
		"\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}