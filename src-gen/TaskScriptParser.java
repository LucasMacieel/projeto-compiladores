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
public class TaskScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, STRING=13, DATA_HORA=14, OPCOES_PRIORIDADE=15, 
		OPCOES_REPETICAO=16, ESPACOS=17;
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
			null, "'tarefa'", "'{'", "'descricao'", "':'", "','", "'vencimento'", 
			"'prioridade'", "'}'", "'lembrete'", "'mensagem'", "'tempo'", "'repetir'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "DATA_HORA", "OPCOES_PRIORIDADE", "OPCOES_REPETICAO", 
			"ESPACOS"
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

	public TaskScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TaskScriptParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskScriptListener ) ((TaskScriptListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskScriptListener ) ((TaskScriptListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskScriptVisitor ) return ((TaskScriptVisitor<? extends T>)visitor).visitStart(this);
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
	public static class TarefaContext extends ComContext {
		public Token nomeTarefa;
		public Token descricao;
		public Token dataVencimento;
		public Token opcaoPrioridade;
		public List<TerminalNode> STRING() { return getTokens(TaskScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TaskScriptParser.STRING, i);
		}
		public TerminalNode DATA_HORA() { return getToken(TaskScriptParser.DATA_HORA, 0); }
		public TerminalNode OPCOES_PRIORIDADE() { return getToken(TaskScriptParser.OPCOES_PRIORIDADE, 0); }
		public TarefaContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskScriptListener ) ((TaskScriptListener)listener).enterTarefa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskScriptListener ) ((TaskScriptListener)listener).exitTarefa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskScriptVisitor ) return ((TaskScriptVisitor<? extends T>)visitor).visitTarefa(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LembreteContext extends ComContext {
		public Token nomeLembrete;
		public Token mensagem;
		public Token dataRepeticao;
		public Token opcaoRepeticao;
		public List<TerminalNode> STRING() { return getTokens(TaskScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TaskScriptParser.STRING, i);
		}
		public TerminalNode DATA_HORA() { return getToken(TaskScriptParser.DATA_HORA, 0); }
		public TerminalNode OPCOES_REPETICAO() { return getToken(TaskScriptParser.OPCOES_REPETICAO, 0); }
		public LembreteContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskScriptListener ) ((TaskScriptListener)listener).enterLembrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskScriptListener ) ((TaskScriptListener)listener).exitLembrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskScriptVisitor ) return ((TaskScriptVisitor<? extends T>)visitor).visitLembrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new TarefaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(T__0);
				setState(8);
				((TarefaContext)_localctx).nomeTarefa = match(STRING);
				setState(9);
				match(T__1);
				setState(10);
				match(T__2);
				setState(11);
				match(T__3);
				setState(12);
				((TarefaContext)_localctx).descricao = match(STRING);
				setState(13);
				match(T__4);
				setState(14);
				match(T__5);
				setState(15);
				match(T__3);
				setState(16);
				((TarefaContext)_localctx).dataVencimento = match(DATA_HORA);
				setState(17);
				match(T__4);
				setState(18);
				match(T__6);
				setState(19);
				match(T__3);
				setState(20);
				((TarefaContext)_localctx).opcaoPrioridade = match(OPCOES_PRIORIDADE);
				setState(21);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new LembreteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(T__8);
				setState(23);
				((LembreteContext)_localctx).nomeLembrete = match(STRING);
				setState(24);
				match(T__1);
				setState(25);
				match(T__9);
				setState(26);
				match(T__3);
				setState(27);
				((LembreteContext)_localctx).mensagem = match(STRING);
				setState(28);
				match(T__4);
				setState(29);
				match(T__10);
				setState(30);
				match(T__3);
				setState(31);
				((LembreteContext)_localctx).dataRepeticao = match(DATA_HORA);
				setState(32);
				match(T__4);
				setState(33);
				match(T__11);
				setState(34);
				match(T__3);
				setState(35);
				((LembreteContext)_localctx).opcaoRepeticao = match(OPCOES_REPETICAO);
				setState(36);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u0011(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000&\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005"+
		"\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0005\u0001\u0000\u0000\b\t\u0005\r\u0000\u0000\t\n\u0005\u0002\u0000"+
		"\u0000\n\u000b\u0005\u0003\u0000\u0000\u000b\f\u0005\u0004\u0000\u0000"+
		"\f\r\u0005\r\u0000\u0000\r\u000e\u0005\u0005\u0000\u0000\u000e\u000f\u0005"+
		"\u0006\u0000\u0000\u000f\u0010\u0005\u0004\u0000\u0000\u0010\u0011\u0005"+
		"\u000e\u0000\u0000\u0011\u0012\u0005\u0005\u0000\u0000\u0012\u0013\u0005"+
		"\u0007\u0000\u0000\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0015\u0005"+
		"\u000f\u0000\u0000\u0015&\u0005\b\u0000\u0000\u0016\u0017\u0005\t\u0000"+
		"\u0000\u0017\u0018\u0005\r\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000"+
		"\u0019\u001a\u0005\n\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b"+
		"\u001c\u0005\r\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d\u001e"+
		"\u0005\u000b\u0000\u0000\u001e\u001f\u0005\u0004\u0000\u0000\u001f \u0005"+
		"\u000e\u0000\u0000 !\u0005\u0005\u0000\u0000!\"\u0005\f\u0000\u0000\""+
		"#\u0005\u0004\u0000\u0000#$\u0005\u0010\u0000\u0000$&\u0005\b\u0000\u0000"+
		"%\u0007\u0001\u0000\u0000\u0000%\u0016\u0001\u0000\u0000\u0000&\u0003"+
		"\u0001\u0000\u0000\u0000\u0001%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}