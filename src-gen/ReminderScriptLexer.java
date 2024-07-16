// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReminderScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		DATA_HORA=10, OPCOES_REPETICAO=11, ESPACOS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "STRING", 
			"DATA_HORA", "DIA", "MES", "ANO", "HORA", "MINUTO", "OPCOES_REPETICAO", 
			"ESPACOS"
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


	public ReminderScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReminderScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\f\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bP\b\b\n\b\f"+
		"\bS\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\ng\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bm\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rz\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a6"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u0000\u0017\u0000\u0019\u0000\u001b"+
		"\u0000\u001d\u0000\u001f\u000b!\f\u0001\u0000\t\u0002\u0000\"\"\\\\\u0001"+
		"\u000019\u0001\u000012\u0001\u000009\u0001\u000001\u0001\u000002\u0001"+
		"\u000003\u0001\u000005\u0003\u0000\n\n\r\r  \u00af\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003,"+
		"\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00077\u0001\u0000"+
		"\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000"+
		"\rA\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011K\u0001"+
		"\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000"+
		"\u0000\u0017l\u0001\u0000\u0000\u0000\u0019n\u0001\u0000\u0000\u0000\u001b"+
		"y\u0001\u0000\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f\u00a5\u0001"+
		"\u0000\u0000\u0000!\u00a7\u0001\u0000\u0000\u0000#$\u0005l\u0000\u0000"+
		"$%\u0005e\u0000\u0000%&\u0005m\u0000\u0000&\'\u0005b\u0000\u0000\'(\u0005"+
		"r\u0000\u0000()\u0005e\u0000\u0000)*\u0005t\u0000\u0000*+\u0005e\u0000"+
		"\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005{\u0000\u0000-\u0004\u0001"+
		"\u0000\u0000\u0000./\u0005m\u0000\u0000/0\u0005e\u0000\u000001\u0005n"+
		"\u0000\u000012\u0005s\u0000\u000023\u0005a\u0000\u000034\u0005g\u0000"+
		"\u000045\u0005e\u0000\u000056\u0005m\u0000\u00006\u0006\u0001\u0000\u0000"+
		"\u000078\u0005:\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005,\u0000"+
		"\u0000:\n\u0001\u0000\u0000\u0000;<\u0005t\u0000\u0000<=\u0005e\u0000"+
		"\u0000=>\u0005m\u0000\u0000>?\u0005p\u0000\u0000?@\u0005o\u0000\u0000"+
		"@\f\u0001\u0000\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000"+
		"CD\u0005p\u0000\u0000DE\u0005e\u0000\u0000EF\u0005t\u0000\u0000FG\u0005"+
		"i\u0000\u0000GH\u0005r\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005"+
		"}\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KQ\u0005\"\u0000\u0000LM\u0005"+
		"\\\u0000\u0000MP\t\u0000\u0000\u0000NP\b\u0000\u0000\u0000OL\u0001\u0000"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0005\"\u0000\u0000U\u0012\u0001\u0000\u0000"+
		"\u0000VW\u0003\u0015\n\u0000WX\u0005/\u0000\u0000XY\u0003\u0017\u000b"+
		"\u0000YZ\u0005/\u0000\u0000Z[\u0003\u0019\f\u0000[\\\u0005 \u0000\u0000"+
		"\\]\u0003\u001b\r\u0000]^\u0005:\u0000\u0000^_\u0003\u001d\u000e\u0000"+
		"_\u0014\u0001\u0000\u0000\u0000`a\u00050\u0000\u0000ag\u0007\u0001\u0000"+
		"\u0000bc\u0007\u0002\u0000\u0000cg\u0007\u0003\u0000\u0000de\u00053\u0000"+
		"\u0000eg\u0007\u0004\u0000\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000g\u0016\u0001\u0000\u0000\u0000"+
		"hi\u00050\u0000\u0000im\u0007\u0001\u0000\u0000jk\u00051\u0000\u0000k"+
		"m\u0007\u0005\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000m\u0018\u0001\u0000\u0000\u0000no\u0007\u0003\u0000\u0000op\u0007"+
		"\u0003\u0000\u0000pq\u0007\u0003\u0000\u0000qr\u0007\u0003\u0000\u0000"+
		"r\u001a\u0001\u0000\u0000\u0000st\u00050\u0000\u0000tz\u0007\u0003\u0000"+
		"\u0000uv\u00051\u0000\u0000vz\u0007\u0003\u0000\u0000wx\u00052\u0000\u0000"+
		"xz\u0007\u0006\u0000\u0000ys\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0007"+
		"\u0007\u0000\u0000|}\u0007\u0003\u0000\u0000}\u001e\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005u\u0000\u0000\u007f\u0080\u0005n\u0000\u0000\u0080"+
		"\u0081\u0005i\u0000\u0000\u0081\u0082\u0005c\u0000\u0000\u0082\u00a6\u0005"+
		"o\u0000\u0000\u0083\u0084\u0005d\u0000\u0000\u0084\u0085\u0005i\u0000"+
		"\u0000\u0085\u0086\u0005a\u0000\u0000\u0086\u0087\u0005r\u0000\u0000\u0087"+
		"\u0088\u0005i\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005"+
		"m\u0000\u0000\u008a\u008b\u0005e\u0000\u0000\u008b\u008c\u0005n\u0000"+
		"\u0000\u008c\u008d\u0005t\u0000\u0000\u008d\u00a6\u0005e\u0000\u0000\u008e"+
		"\u008f\u0005s\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0091\u0005"+
		"m\u0000\u0000\u0091\u0092\u0005a\u0000\u0000\u0092\u0093\u0005n\u0000"+
		"\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0095\u0005l\u0000\u0000\u0095"+
		"\u0096\u0005m\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005"+
		"n\u0000\u0000\u0098\u0099\u0005t\u0000\u0000\u0099\u00a6\u0005e\u0000"+
		"\u0000\u009a\u009b\u0005m\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c"+
		"\u009d\u0005n\u0000\u0000\u009d\u009e\u0005s\u0000\u0000\u009e\u009f\u0005"+
		"a\u0000\u0000\u009f\u00a0\u0005l\u0000\u0000\u00a0\u00a1\u0005m\u0000"+
		"\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3"+
		"\u00a4\u0005t\u0000\u0000\u00a4\u00a6\u0005e\u0000\u0000\u00a5~\u0001"+
		"\u0000\u0000\u0000\u00a5\u0083\u0001\u0000\u0000\u0000\u00a5\u008e\u0001"+
		"\u0000\u0000\u0000\u00a5\u009a\u0001\u0000\u0000\u0000\u00a6 \u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0007\b\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0006\u0010\u0000\u0000\u00aa\"\u0001\u0000\u0000\u0000"+
		"\u0007\u0000OQfly\u00a5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}