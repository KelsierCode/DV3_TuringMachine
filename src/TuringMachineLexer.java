// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringMachineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DIRECTION=12, DIGIT=13, SYMBOL=14, BLANK=15, STARTINGSYMBOL=16, 
		MARKINGSYMBOL=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "DIRECTION", "DIGIT", "SYMBOL", "BLANK", "STARTINGSYMBOL", 
		"MARKINGSYMBOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'States:'", "'InputAlphabet:'", "'TapeAlphabet:'", "'InitialState:'", 
		"'AcceptStates:'", "'Transitions:'", "'Q'", "'('", "', '", "'-> '", "')'", 
		null, null, null, "'_'", "'$'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"DIRECTION", "DIGIT", "SYMBOL", "BLANK", "STARTINGSYMBOL", "MARKINGSYMBOL", 
		"WS"
	};
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


	public TuringMachineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TuringMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u0086\n\16\r\16\16"+
		"\16\u0087\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\6\5\2NNTT~~\3\2\62;\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\7>\3\2\2\2\tL\3\2\2"+
		"\2\13Z\3\2\2\2\rh\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23y\3\2\2\2\25|\3\2"+
		"\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0085\3\2\2\2\35\u0089\3\2\2"+
		"\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'(\7"+
		"U\2\2()\7v\2\2)*\7c\2\2*+\7v\2\2+,\7g\2\2,-\7u\2\2-.\7<\2\2.\4\3\2\2\2"+
		"/\60\7K\2\2\60\61\7p\2\2\61\62\7r\2\2\62\63\7w\2\2\63\64\7v\2\2\64\65"+
		"\7C\2\2\65\66\7n\2\2\66\67\7r\2\2\678\7j\2\289\7c\2\29:\7d\2\2:;\7g\2"+
		"\2;<\7v\2\2<=\7<\2\2=\6\3\2\2\2>?\7V\2\2?@\7c\2\2@A\7r\2\2AB\7g\2\2BC"+
		"\7C\2\2CD\7n\2\2DE\7r\2\2EF\7j\2\2FG\7c\2\2GH\7d\2\2HI\7g\2\2IJ\7v\2\2"+
		"JK\7<\2\2K\b\3\2\2\2LM\7K\2\2MN\7p\2\2NO\7k\2\2OP\7v\2\2PQ\7k\2\2QR\7"+
		"c\2\2RS\7n\2\2ST\7U\2\2TU\7v\2\2UV\7c\2\2VW\7v\2\2WX\7g\2\2XY\7<\2\2Y"+
		"\n\3\2\2\2Z[\7C\2\2[\\\7e\2\2\\]\7e\2\2]^\7g\2\2^_\7r\2\2_`\7v\2\2`a\7"+
		"U\2\2ab\7v\2\2bc\7c\2\2cd\7v\2\2de\7g\2\2ef\7u\2\2fg\7<\2\2g\f\3\2\2\2"+
		"hi\7V\2\2ij\7t\2\2jk\7c\2\2kl\7p\2\2lm\7u\2\2mn\7k\2\2no\7v\2\2op\7k\2"+
		"\2pq\7q\2\2qr\7p\2\2rs\7u\2\2st\7<\2\2t\16\3\2\2\2uv\7S\2\2v\20\3\2\2"+
		"\2wx\7*\2\2x\22\3\2\2\2yz\7.\2\2z{\7\"\2\2{\24\3\2\2\2|}\7/\2\2}~\7@\2"+
		"\2~\177\7\"\2\2\177\26\3\2\2\2\u0080\u0081\7+\2\2\u0081\30\3\2\2\2\u0082"+
		"\u0083\t\2\2\2\u0083\32\3\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\34"+
		"\3\2\2\2\u0089\u008a\t\4\2\2\u008a\36\3\2\2\2\u008b\u008c\7a\2\2\u008c"+
		" \3\2\2\2\u008d\u008e\7&\2\2\u008e\"\3\2\2\2\u008f\u0090\7%\2\2\u0090"+
		"$\3\2\2\2\u0091\u0092\t\5\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\23\2\2"+
		"\u0094&\3\2\2\2\4\2\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}