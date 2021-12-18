// Generated from ccal.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, CONST=2, RETURN=3, INTEGER=4, BOOLEAN=5, VOID=6, MAIN=7, IF=8, 
		ELSE=9, TRUE=10, FALSE=11, WHILE=12, SK=13, COMMA=14, UNDERSCORE=15, SEMI=16, 
		COLON=17, EQ=18, OPENCUR=19, CLOSEDCUR=20, OPENBRA=21, CLOSEDBRA=22, ADD=23, 
		SUB=24, TIL=25, OR=26, AND=27, EQUIV=28, NOTEQ=29, LT=30, LTEQ=31, GT=32, 
		GTEQ=33, NUMBER=34, ID=35, WS=36, COMMENT=37, LINE_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Letter", 
			"VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", "IF", 
			"ELSE", "TRUE", "FALSE", "WHILE", "SK", "COMMA", "UNDERSCORE", "SEMI", 
			"COLON", "EQ", "OPENCUR", "CLOSEDCUR", "OPENBRA", "CLOSEDBRA", "ADD", 
			"SUB", "TIL", "OR", "AND", "EQUIV", "NOTEQ", "LT", "LTEQ", "GT", "GTEQ", 
			"NUMBER", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "','", "'_'", "';'", "':'", "'='", "'{'", "'}'", "'('", "')'", 
			"'+'", "'-'", "'~'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", 
			"IF", "ELSE", "TRUE", "FALSE", "WHILE", "SK", "COMMA", "UNDERSCORE", 
			"SEMI", "COLON", "EQ", "OPENCUR", "CLOSEDCUR", "OPENBRA", "CLOSEDBRA", 
			"ADD", "SUB", "TIL", "OR", "AND", "EQUIV", "NOTEQ", "LT", "LTEQ", "GT", 
			"GTEQ", "NUMBER", "ID", "WS", "COMMENT", "LINE_COMMENT"
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


	public ccalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ccal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00bb"+
		"\n\34\r\34\16\34\u00bc\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\3>\3>\5>\u0138\n>\3>\7>\u013b"+
		"\n>\f>\16>\u013e\13>\5>\u0140\n>\3?\3?\3?\3?\7?\u0146\n?\f?\16?\u0149"+
		"\13?\3@\3@\3@\3@\3A\3A\3A\3A\3A\7A\u0154\nA\fA\16A\u0157\13A\3A\3A\3A"+
		"\3A\3A\3B\3B\3B\3B\7B\u0162\nB\fB\16B\u0165\13B\3B\3B\3B\3B\4\u0155\u0163"+
		"\2C\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\3;\4=\5?\6A\7C\bE\tG"+
		"\nI\13K\fM\rO\16Q\17S\20U\21W\22Y\23[\24]\25_\26a\27c\30e\31g\32i\33k"+
		"\34m\35o\36q\37s u!w\"y#{$}%\177&\u0081\'\u0083(\3\2 \4\2CCcc\4\2DDdd"+
		"\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2M"+
		"Mmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\4\2"+
		"//\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u0157\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2"+
		"\5\u0087\3\2\2\2\7\u0089\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f"+
		"\3\2\2\2\17\u0091\3\2\2\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3"+
		"\2\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f\3\2"+
		"\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61"+
		"\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00be"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c8\3\2\2\2?\u00cf\3\2\2\2A\u00d7\3\2\2\2C"+
		"\u00df\3\2\2\2E\u00e4\3\2\2\2G\u00e9\3\2\2\2I\u00ec\3\2\2\2K\u00f1\3\2"+
		"\2\2M\u00f6\3\2\2\2O\u00fc\3\2\2\2Q\u0102\3\2\2\2S\u0107\3\2\2\2U\u0109"+
		"\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2[\u010f\3\2\2\2]\u0111\3\2\2\2_"+
		"\u0113\3\2\2\2a\u0115\3\2\2\2c\u0117\3\2\2\2e\u0119\3\2\2\2g\u011b\3\2"+
		"\2\2i\u011d\3\2\2\2k\u011f\3\2\2\2m\u0122\3\2\2\2o\u0125\3\2\2\2q\u0128"+
		"\3\2\2\2s\u012b\3\2\2\2u\u012d\3\2\2\2w\u0130\3\2\2\2y\u0132\3\2\2\2{"+
		"\u013f\3\2\2\2}\u0141\3\2\2\2\177\u014a\3\2\2\2\u0081\u014e\3\2\2\2\u0083"+
		"\u015d\3\2\2\2\u0085\u0086\t\2\2\2\u0086\4\3\2\2\2\u0087\u0088\t\3\2\2"+
		"\u0088\6\3\2\2\2\u0089\u008a\t\4\2\2\u008a\b\3\2\2\2\u008b\u008c\t\5\2"+
		"\2\u008c\n\3\2\2\2\u008d\u008e\t\6\2\2\u008e\f\3\2\2\2\u008f\u0090\t\7"+
		"\2\2\u0090\16\3\2\2\2\u0091\u0092\t\b\2\2\u0092\20\3\2\2\2\u0093\u0094"+
		"\t\t\2\2\u0094\22\3\2\2\2\u0095\u0096\t\n\2\2\u0096\24\3\2\2\2\u0097\u0098"+
		"\t\13\2\2\u0098\26\3\2\2\2\u0099\u009a\t\f\2\2\u009a\30\3\2\2\2\u009b"+
		"\u009c\t\r\2\2\u009c\32\3\2\2\2\u009d\u009e\t\16\2\2\u009e\34\3\2\2\2"+
		"\u009f\u00a0\t\17\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\t\20\2\2\u00a2 \3\2"+
		"\2\2\u00a3\u00a4\t\21\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\t\22\2\2\u00a6$"+
		"\3\2\2\2\u00a7\u00a8\t\23\2\2\u00a8&\3\2\2\2\u00a9\u00aa\t\24\2\2\u00aa"+
		"(\3\2\2\2\u00ab\u00ac\t\25\2\2\u00ac*\3\2\2\2\u00ad\u00ae\t\26\2\2\u00ae"+
		",\3\2\2\2\u00af\u00b0\t\27\2\2\u00b0.\3\2\2\2\u00b1\u00b2\t\30\2\2\u00b2"+
		"\60\3\2\2\2\u00b3\u00b4\t\31\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\t\32\2\2"+
		"\u00b6\64\3\2\2\2\u00b7\u00b8\t\33\2\2\u00b8\66\3\2\2\2\u00b9\u00bb\t"+
		"\34\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd8\3\2\2\2\u00be\u00bf\5-\27\2\u00bf\u00c0\5\3\2\2"+
		"\u00c0\u00c1\5%\23\2\u00c1:\3\2\2\2\u00c2\u00c3\5\7\4\2\u00c3\u00c4\5"+
		"\37\20\2\u00c4\u00c5\5\35\17\2\u00c5\u00c6\5\'\24\2\u00c6\u00c7\5)\25"+
		"\2\u00c7<\3\2\2\2\u00c8\u00c9\5%\23\2\u00c9\u00ca\5\13\6\2\u00ca\u00cb"+
		"\5)\25\2\u00cb\u00cc\5+\26\2\u00cc\u00cd\5%\23\2\u00cd\u00ce\5\35\17\2"+
		"\u00ce>\3\2\2\2\u00cf\u00d0\5\23\n\2\u00d0\u00d1\5\35\17\2\u00d1\u00d2"+
		"\5)\25\2\u00d2\u00d3\5\13\6\2\u00d3\u00d4\5\17\b\2\u00d4\u00d5\5\13\6"+
		"\2\u00d5\u00d6\5%\23\2\u00d6@\3\2\2\2\u00d7\u00d8\5\5\3\2\u00d8\u00d9"+
		"\5\37\20\2\u00d9\u00da\5\37\20\2\u00da\u00db\5\31\r\2\u00db\u00dc\5\13"+
		"\6\2\u00dc\u00dd\5\3\2\2\u00dd\u00de\5\35\17\2\u00deB\3\2\2\2\u00df\u00e0"+
		"\5-\27\2\u00e0\u00e1\5\37\20\2\u00e1\u00e2\5\23\n\2\u00e2\u00e3\5\t\5"+
		"\2\u00e3D\3\2\2\2\u00e4\u00e5\5\33\16\2\u00e5\u00e6\5\3\2\2\u00e6\u00e7"+
		"\5\23\n\2\u00e7\u00e8\5\35\17\2\u00e8F\3\2\2\2\u00e9\u00ea\5\23\n\2\u00ea"+
		"\u00eb\5\r\7\2\u00ebH\3\2\2\2\u00ec\u00ed\5\13\6\2\u00ed\u00ee\5\31\r"+
		"\2\u00ee\u00ef\5\'\24\2\u00ef\u00f0\5\13\6\2\u00f0J\3\2\2\2\u00f1\u00f2"+
		"\5)\25\2\u00f2\u00f3\5%\23\2\u00f3\u00f4\5+\26\2\u00f4\u00f5\5\13\6\2"+
		"\u00f5L\3\2\2\2\u00f6\u00f7\5\r\7\2\u00f7\u00f8\5\3\2\2\u00f8\u00f9\5"+
		"\31\r\2\u00f9\u00fa\5\'\24\2\u00fa\u00fb\5\13\6\2\u00fbN\3\2\2\2\u00fc"+
		"\u00fd\5/\30\2\u00fd\u00fe\5\21\t\2\u00fe\u00ff\5\23\n\2\u00ff\u0100\5"+
		"\31\r\2\u0100\u0101\5\13\6\2\u0101P\3\2\2\2\u0102\u0103\5\'\24\2\u0103"+
		"\u0104\5\27\f\2\u0104\u0105\5\23\n\2\u0105\u0106\5!\21\2\u0106R\3\2\2"+
		"\2\u0107\u0108\7.\2\2\u0108T\3\2\2\2\u0109\u010a\7a\2\2\u010aV\3\2\2\2"+
		"\u010b\u010c\7=\2\2\u010cX\3\2\2\2\u010d\u010e\7<\2\2\u010eZ\3\2\2\2\u010f"+
		"\u0110\7?\2\2\u0110\\\3\2\2\2\u0111\u0112\7}\2\2\u0112^\3\2\2\2\u0113"+
		"\u0114\7\177\2\2\u0114`\3\2\2\2\u0115\u0116\7*\2\2\u0116b\3\2\2\2\u0117"+
		"\u0118\7+\2\2\u0118d\3\2\2\2\u0119\u011a\7-\2\2\u011af\3\2\2\2\u011b\u011c"+
		"\7/\2\2\u011ch\3\2\2\2\u011d\u011e\7\u0080\2\2\u011ej\3\2\2\2\u011f\u0120"+
		"\7~\2\2\u0120\u0121\7~\2\2\u0121l\3\2\2\2\u0122\u0123\7(\2\2\u0123\u0124"+
		"\7(\2\2\u0124n\3\2\2\2\u0125\u0126\7?\2\2\u0126\u0127\7?\2\2\u0127p\3"+
		"\2\2\2\u0128\u0129\7#\2\2\u0129\u012a\7?\2\2\u012ar\3\2\2\2\u012b\u012c"+
		"\7>\2\2\u012ct\3\2\2\2\u012d\u012e\7>\2\2\u012e\u012f\7?\2\2\u012fv\3"+
		"\2\2\2\u0130\u0131\7@\2\2\u0131x\3\2\2\2\u0132\u0133\7@\2\2\u0133\u0134"+
		"\7?\2\2\u0134z\3\2\2\2\u0135\u0140\7\62\2\2\u0136\u0138\t\35\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013c\3\2\2\2\u0139\u013b\t\36\2\2\u013a\u0139\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0135\3\2\2\2\u013f\u0137\3\2"+
		"\2\2\u0140|\3\2\2\2\u0141\u0147\5\67\34\2\u0142\u0146\5\67\34\2\u0143"+
		"\u0146\5{>\2\u0144\u0146\5U+\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148~\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\t\37\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\b@\2\2\u014d\u0080\3\2\2\2\u014e\u014f\7\61"+
		"\2\2\u014f\u0150\7,\2\2\u0150\u0155\3\2\2\2\u0151\u0154\5\u0081A\2\u0152"+
		"\u0154\13\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7,\2\2\u0159\u015a\7\61\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\bA\2\2\u015c\u0082\3\2\2\2\u015d\u015e\7\61\2\2\u015e"+
		"\u015f\7\61\2\2\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3"+
		"\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\f\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\bB\2\2\u0169\u0084\3\2\2\2\f\2\u00bc\u0137\u013c\u013f"+
		"\u0145\u0147\u0153\u0155\u0163\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}