// Generated from C:/Users/Dhawal Soni/IdeaProjects/ProgrammingLanguage\DJP.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DJPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Boolean=11, Identifier=12, Comment=13, Space=14, OR=15, AND=16, 
		GT=17, LT=18, GTE=19, LTE=20, EQUAL=21, NOTEQUALS=22, ADD=23, SUB=24, 
		MUL=25, DIV=26, MOD=27, COMMA=28, COLON=29, OPTIONAL=30, SEMICOLON=31, 
		OPENBRACE=32, CLOSEBRACE=33, OPENBRACKET=34, CLOSEBRACKET=35, OPENSQUARE=36, 
		CLOSESQUARE=37, ASSIGNMENT=38, Digit=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "Boolean", "Identifier", "Comment", "Space", "OR", "AND", "GT", 
		"LT", "GTE", "LTE", "EQUAL", "NOTEQUALS", "ADD", "SUB", "MUL", "DIV", 
		"MOD", "COMMA", "COLON", "OPTIONAL", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", 
		"OPENBRACKET", "CLOSEBRACKET", "OPENSQUARE", "CLOSESQUARE", "ASSIGNMENT", 
		"Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'println'", "'print'", "'if'", "'else if'", "'else'", "'while'", 
		"'func'", "'return'", "'Boolean'", "'Num'", null, null, null, null, "'||'", 
		"'&&'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "','", "':'", "'?'", "';'", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Boolean", 
		"Identifier", "Comment", "Space", "OR", "AND", "GT", "LT", "GTE", "LTE", 
		"EQUAL", "NOTEQUALS", "ADD", "SUB", "MUL", "DIV", "MOD", "COMMA", "COLON", 
		"OPTIONAL", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", "OPENBRACKET", "CLOSEBRACKET", 
		"OPENSQUARE", "CLOSESQUARE", "ASSIGNMENT", "Digit"
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


	public DJPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DJP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\r"+
		"\3\r\7\r\u009b\n\r\f\r\16\r\u009e\13\r\3\16\3\16\3\16\3\16\7\16\u00a4"+
		"\n\16\f\16\16\16\u00a7\13\16\3\16\3\16\3\16\3\16\7\16\u00ad\n\16\f\16"+
		"\16\16\u00b0\13\16\3\16\3\16\5\16\u00b4\n\16\3\16\3\16\3\17\6\17\u00b9"+
		"\n\17\r\17\16\17\u00ba\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\6"+
		"(\u00f6\n(\r(\16(\u00f7\3\u00ae\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\7\5\2C"+
		"\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\62;\u00ff\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5Y\3\2\2\2\7_"+
		"\3\2\2\2\tb\3\2\2\2\13j\3\2\2\2\ro\3\2\2\2\17u\3\2\2\2\21z\3\2\2\2\23"+
		"\u0081\3\2\2\2\25\u0089\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u00b3"+
		"\3\2\2\2\35\u00b8\3\2\2\2\37\u00be\3\2\2\2!\u00c1\3\2\2\2#\u00c4\3\2\2"+
		"\2%\u00c6\3\2\2\2\'\u00c8\3\2\2\2)\u00cb\3\2\2\2+\u00ce\3\2\2\2-\u00d1"+
		"\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2"+
		"\2\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e2\3\2\2\2?\u00e4"+
		"\3\2\2\2A\u00e6\3\2\2\2C\u00e8\3\2\2\2E\u00ea\3\2\2\2G\u00ec\3\2\2\2I"+
		"\u00ee\3\2\2\2K\u00f0\3\2\2\2M\u00f2\3\2\2\2O\u00f5\3\2\2\2QR\7r\2\2R"+
		"S\7t\2\2ST\7k\2\2TU\7p\2\2UV\7v\2\2VW\7n\2\2WX\7p\2\2X\4\3\2\2\2YZ\7r"+
		"\2\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\6\3\2\2\2_`\7k\2\2`a\7h\2"+
		"\2a\b\3\2\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2fg\7\"\2\2gh\7k\2\2h"+
		"i\7h\2\2i\n\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\f\3\2\2\2op\7"+
		"y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\16\3\2\2\2uv\7h\2\2vw\7w\2"+
		"\2wx\7p\2\2xy\7e\2\2y\20\3\2\2\2z{\7t\2\2{|\7g\2\2|}\7v\2\2}~\7w\2\2~"+
		"\177\7t\2\2\177\u0080\7p\2\2\u0080\22\3\2\2\2\u0081\u0082\7D\2\2\u0082"+
		"\u0083\7q\2\2\u0083\u0084\7q\2\2\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2"+
		"\u0086\u0087\7c\2\2\u0087\u0088\7p\2\2\u0088\24\3\2\2\2\u0089\u008a\7"+
		"P\2\2\u008a\u008b\7w\2\2\u008b\u008c\7o\2\2\u008c\26\3\2\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090\u0097\7g\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2"+
		"\u0095\u0097\7g\2\2\u0096\u008d\3\2\2\2\u0096\u0091\3\2\2\2\u0097\30\3"+
		"\2\2\2\u0098\u009c\t\2\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\32\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1"+
		"\u00a5\3\2\2\2\u00a2\u00a4\n\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b4\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ae\3\2"+
		"\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b4\7\61\2\2\u00b3\u009f\3\2\2\2\u00b3"+
		"\u00a8\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\16\2\2\u00b6\34\3\2\2"+
		"\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\17\2\2"+
		"\u00bd\36\3\2\2\2\u00be\u00bf\7~\2\2\u00bf\u00c0\7~\2\2\u00c0 \3\2\2\2"+
		"\u00c1\u00c2\7(\2\2\u00c2\u00c3\7(\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7@"+
		"\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7@\2"+
		"\2\u00c9\u00ca\7?\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\u00cd\7"+
		"?\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d0\7?\2\2\u00d0,\3\2"+
		"\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7?\2\2\u00d3.\3\2\2\2\u00d4\u00d5"+
		"\7-\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\62\3\2\2\2\u00d8\u00d9"+
		"\7,\2\2\u00d9\64\3\2\2\2\u00da\u00db\7\61\2\2\u00db\66\3\2\2\2\u00dc\u00dd"+
		"\7\'\2\2\u00dd8\3\2\2\2\u00de\u00df\7.\2\2\u00df:\3\2\2\2\u00e0\u00e1"+
		"\7<\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7A\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7"+
		"=\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7}\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7\177"+
		"\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7*\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7+\2"+
		"\2\u00edH\3\2\2\2\u00ee\u00ef\7]\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7_\2\2"+
		"\u00f1L\3\2\2\2\u00f2\u00f3\7?\2\2\u00f3N\3\2\2\2\u00f4\u00f6\t\6\2\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8P\3\2\2\2\n\2\u0096\u009c\u00a5\u00ae\u00b3\u00ba\u00f7"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}