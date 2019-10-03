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
		T__0=1, T__1=2, T__2=3, T__3=4, Variable=5, NEWLINE=6, WS=7, Integer=8, 
		Boolean=9, Array=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Variable", "NEWLINE", "WS", "Integer", 
			"Boolean", "Array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::='", "'n'", "'true'", "'false'", null, null, null, "'integer'", 
			"'boolean'", "'array of'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Variable", "NEWLINE", "WS", "Integer", 
			"Boolean", "Array"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\\\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\6\6*\n\6\r\6\16\6+\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\7\5\7\65\n\7"+
		"\3\7\3\7\6\79\n\7\r\7\16\7:\3\b\6\b>\n\b\r\b\16\b?\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\33\3\2\2\2\7"+
		"\35\3\2\2\2\t\"\3\2\2\2\13)\3\2\2\2\r8\3\2\2\2\17=\3\2\2\2\21C\3\2\2\2"+
		"\23K\3\2\2\2\25S\3\2\2\2\27\30\7<\2\2\30\31\7<\2\2\31\32\7?\2\2\32\4\3"+
		"\2\2\2\33\34\7p\2\2\34\6\3\2\2\2\35\36\7v\2\2\36\37\7t\2\2\37 \7w\2\2"+
		" !\7g\2\2!\b\3\2\2\2\"#\7h\2\2#$\7c\2\2$%\7n\2\2%&\7u\2\2&\'\7g\2\2\'"+
		"\n\3\2\2\2(*\t\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\60\3\2\2"+
		"\2-/\t\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\f\3\2"+
		"\2\2\62\60\3\2\2\2\63\65\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3"+
		"\2\2\2\669\7\f\2\2\679\7\17\2\28\64\3\2\2\28\67\3\2\2\29:\3\2\2\2:8\3"+
		"\2\2\2:;\3\2\2\2;\16\3\2\2\2<>\t\4\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?"+
		"@\3\2\2\2@A\3\2\2\2AB\b\b\2\2B\20\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F"+
		"G\7g\2\2GH\7i\2\2HI\7g\2\2IJ\7t\2\2J\22\3\2\2\2KL\7d\2\2LM\7q\2\2MN\7"+
		"q\2\2NO\7n\2\2OP\7g\2\2PQ\7c\2\2QR\7p\2\2R\24\3\2\2\2ST\7c\2\2TU\7t\2"+
		"\2UV\7t\2\2VW\7c\2\2WX\7{\2\2XY\7\"\2\2YZ\7q\2\2Z[\7h\2\2[\26\3\2\2\2"+
		"\t\2+\60\648:?\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}