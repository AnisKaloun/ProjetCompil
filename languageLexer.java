// Generated from language.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, UOP=11, Arith=12, Logical=13, Compar=14, Variable=15, Number=16, 
		NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "UOP", "Arith", "Logical", "Compar", "Variable", "Number", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'['", "']'", "'var'", "':'", "'true'", "'false'", "'integer'", 
			"'boolean'", "'array of'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "UOP", 
			"Arith", "Logical", "Compar", "Variable", "Number", "NEWLINE", "WS"
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


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\5\f]\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5"+
		"\16f\n\16\3\17\3\17\3\17\3\17\5\17l\n\17\3\20\6\20o\n\20\r\20\16\20p\3"+
		"\20\7\20t\n\20\f\20\16\20w\13\20\3\21\6\21z\n\21\r\21\16\21{\3\22\5\22"+
		"\177\n\22\3\22\3\22\6\22\u0083\n\22\r\22\16\22\u0084\3\23\6\23\u0088\n"+
		"\23\r\23\16\23\u0089\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\5\2,-//\61"+
		"\61\4\2>?\u2266\u2266\4\2@@\u2267\u2267\4\2C\\c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t.\3\2\2"+
		"\2\13\62\3\2\2\2\r\64\3\2\2\2\179\3\2\2\2\21?\3\2\2\2\23G\3\2\2\2\25O"+
		"\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33e\3\2\2\2\35k\3\2\2\2\37n\3\2\2\2"+
		"!y\3\2\2\2#\u0082\3\2\2\2%\u0087\3\2\2\2\'(\7<\2\2()\7?\2\2)\4\3\2\2\2"+
		"*+\7]\2\2+\6\3\2\2\2,-\7_\2\2-\b\3\2\2\2./\7x\2\2/\60\7c\2\2\60\61\7t"+
		"\2\2\61\n\3\2\2\2\62\63\7<\2\2\63\f\3\2\2\2\64\65\7v\2\2\65\66\7t\2\2"+
		"\66\67\7w\2\2\678\7g\2\28\16\3\2\2\29:\7h\2\2:;\7c\2\2;<\7n\2\2<=\7u\2"+
		"\2=>\7g\2\2>\20\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2BC\7g\2\2CD\7i\2\2D"+
		"E\7g\2\2EF\7t\2\2F\22\3\2\2\2GH\7d\2\2HI\7q\2\2IJ\7q\2\2JK\7n\2\2KL\7"+
		"g\2\2LM\7c\2\2MN\7p\2\2N\24\3\2\2\2OP\7c\2\2PQ\7t\2\2QR\7t\2\2RS\7c\2"+
		"\2ST\7{\2\2TU\7\"\2\2UV\7q\2\2VW\7h\2\2W\26\3\2\2\2X]\7/\2\2YZ\7p\2\2"+
		"Z[\7q\2\2[]\7v\2\2\\X\3\2\2\2\\Y\3\2\2\2]\30\3\2\2\2^_\t\2\2\2_\32\3\2"+
		"\2\2`a\7c\2\2ab\7p\2\2bf\7f\2\2cd\7q\2\2df\7t\2\2e`\3\2\2\2ec\3\2\2\2"+
		"f\34\3\2\2\2gl\t\3\2\2hi\7#\2\2il\7?\2\2jl\t\4\2\2kg\3\2\2\2kh\3\2\2\2"+
		"kj\3\2\2\2l\36\3\2\2\2mo\t\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qu\3\2\2\2rt\t\6\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v \3\2\2"+
		"\2wu\3\2\2\2xz\t\6\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\"\3\2"+
		"\2\2}\177\7\17\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083"+
		"\7\f\2\2\u0081\u0083\7\17\2\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085$\3\2\2\2"+
		"\u0086\u0088\t\7\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\23\2\2"+
		"\u008c&\3\2\2\2\r\2\\ekpu{~\u0082\u0084\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}