// Generated from /Users/alexoneill/Documents/year4/compiler_construction/assignment1/ccal.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, CONST=2, RETURN=3, INTEGER=4, BOOLEAN=5, VOID=6, MAIN=7, IF=8, 
		ELSE=9, TRUE=10, FALSE=11, WHILE=12, SK=13, COMMA=14, SEMI=15, COLON=16, 
		EQ=17, OPENCUR=18, CLOSEDCUR=19, OPENBRA=20, CLOSEDBRA=21, ADD=22, SUB=23, 
		TIL=24, OR=25, AND=26, EQUIV=27, NOTEQ=28, LT=29, LTEQ=30, GT=31, GTEQ=32, 
		ID=33, INTEGERS=34, WS=35, COMMENT=36, LINE_COMMENT=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "VAR", "CONST", 
			"RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", "IF", "ELSE", "TRUE", 
			"FALSE", "WHILE", "SK", "COMMA", "SEMI", "COLON", "EQ", "OPENCUR", "CLOSEDCUR", 
			"OPENBRA", "CLOSEDBRA", "ADD", "SUB", "TIL", "OR", "AND", "EQUIV", "NOTEQ", 
			"LT", "LTEQ", "GT", "GTEQ", "ID", "INTEGERS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "','", "';'", "':'", "'='", "'{'", "'}'", "'('", "')'", "'+'", 
			"'-'", "'~'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'^[a-ZA-Z][a-zA-Z0-9_]+'", null, "'[ \t\r\n]+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", 
			"IF", "ELSE", "TRUE", "FALSE", "WHILE", "SK", "COMMA", "SEMI", "COLON", 
			"EQ", "OPENCUR", "CLOSEDCUR", "OPENBRA", "CLOSEDBRA", "ADD", "SUB", "TIL", 
			"OR", "AND", "EQUIV", "NOTEQ", "LT", "LTEQ", "GT", "GTEQ", "ID", "INTEGERS", 
			"WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3;\3"+
		";\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u014f\n=\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\7?\u0160\n?\f?\16?\u0163\13?\3?"+
		"\3?\3?\3?\3?\3@\3@\3@\3@\7@\u016e\n@\f@\16@\u0171\13@\3@\3@\3@\3@\4\u0161"+
		"\u016f\2A\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\b"+
		"C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g"+
		"\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\3\2\34\4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u015f\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5"+
		"\u0083\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008b"+
		"\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3"+
		"\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2"+
		"\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b9"+
		"\3\2\2\2;\u00bf\3\2\2\2=\u00c6\3\2\2\2?\u00ce\3\2\2\2A\u00d6\3\2\2\2C"+
		"\u00db\3\2\2\2E\u00e0\3\2\2\2G\u00e3\3\2\2\2I\u00e8\3\2\2\2K\u00ed\3\2"+
		"\2\2M\u00f3\3\2\2\2O\u00f9\3\2\2\2Q\u00fc\3\2\2\2S\u00fe\3\2\2\2U\u0100"+
		"\3\2\2\2W\u0102\3\2\2\2Y\u0104\3\2\2\2[\u0106\3\2\2\2]\u0108\3\2\2\2_"+
		"\u010a\3\2\2\2a\u010c\3\2\2\2c\u010e\3\2\2\2e\u0110\3\2\2\2g\u0112\3\2"+
		"\2\2i\u0115\3\2\2\2k\u0118\3\2\2\2m\u011b\3\2\2\2o\u011e\3\2\2\2q\u0120"+
		"\3\2\2\2s\u0123\3\2\2\2u\u0125\3\2\2\2w\u0128\3\2\2\2y\u014e\3\2\2\2{"+
		"\u0150\3\2\2\2}\u015a\3\2\2\2\177\u0169\3\2\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\4\3\2\2\2\u0083\u0084\t\3\2\2\u0084\6\3\2\2\2\u0085\u0086\t\4\2\2\u0086"+
		"\b\3\2\2\2\u0087\u0088\t\5\2\2\u0088\n\3\2\2\2\u0089\u008a\t\6\2\2\u008a"+
		"\f\3\2\2\2\u008b\u008c\t\7\2\2\u008c\16\3\2\2\2\u008d\u008e\t\b\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\t\t\2\2\u0090\22\3\2\2\2\u0091\u0092\t\n\2\2\u0092"+
		"\24\3\2\2\2\u0093\u0094\t\13\2\2\u0094\26\3\2\2\2\u0095\u0096\t\f\2\2"+
		"\u0096\30\3\2\2\2\u0097\u0098\t\r\2\2\u0098\32\3\2\2\2\u0099\u009a\t\16"+
		"\2\2\u009a\34\3\2\2\2\u009b\u009c\t\17\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\t\20\2\2\u009e \3\2\2\2\u009f\u00a0\t\21\2\2\u00a0\"\3\2\2\2\u00a1\u00a2"+
		"\t\22\2\2\u00a2$\3\2\2\2\u00a3\u00a4\t\23\2\2\u00a4&\3\2\2\2\u00a5\u00a6"+
		"\t\24\2\2\u00a6(\3\2\2\2\u00a7\u00a8\t\25\2\2\u00a8*\3\2\2\2\u00a9\u00aa"+
		"\t\26\2\2\u00aa,\3\2\2\2\u00ab\u00ac\t\27\2\2\u00ac.\3\2\2\2\u00ad\u00ae"+
		"\t\30\2\2\u00ae\60\3\2\2\2\u00af\u00b0\t\31\2\2\u00b0\62\3\2\2\2\u00b1"+
		"\u00b2\t\32\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\t\33\2\2\u00b4\66\3\2\2\2"+
		"\u00b5\u00b6\5-\27\2\u00b6\u00b7\5\3\2\2\u00b7\u00b8\5%\23\2\u00b88\3"+
		"\2\2\2\u00b9\u00ba\5\7\4\2\u00ba\u00bb\5\37\20\2\u00bb\u00bc\5\35\17\2"+
		"\u00bc\u00bd\5\'\24\2\u00bd\u00be\5)\25\2\u00be:\3\2\2\2\u00bf\u00c0\5"+
		"%\23\2\u00c0\u00c1\5\13\6\2\u00c1\u00c2\5)\25\2\u00c2\u00c3\5+\26\2\u00c3"+
		"\u00c4\5%\23\2\u00c4\u00c5\5\35\17\2\u00c5<\3\2\2\2\u00c6\u00c7\5\23\n"+
		"\2\u00c7\u00c8\5\35\17\2\u00c8\u00c9\5)\25\2\u00c9\u00ca\5\13\6\2\u00ca"+
		"\u00cb\5\17\b\2\u00cb\u00cc\5\13\6\2\u00cc\u00cd\5%\23\2\u00cd>\3\2\2"+
		"\2\u00ce\u00cf\5\5\3\2\u00cf\u00d0\5\37\20\2\u00d0\u00d1\5\37\20\2\u00d1"+
		"\u00d2\5\31\r\2\u00d2\u00d3\5\13\6\2\u00d3\u00d4\5\3\2\2\u00d4\u00d5\5"+
		"\35\17\2\u00d5@\3\2\2\2\u00d6\u00d7\5-\27\2\u00d7\u00d8\5\37\20\2\u00d8"+
		"\u00d9\5\23\n\2\u00d9\u00da\5\t\5\2\u00daB\3\2\2\2\u00db\u00dc\5\33\16"+
		"\2\u00dc\u00dd\5\3\2\2\u00dd\u00de\5\23\n\2\u00de\u00df\5\35\17\2\u00df"+
		"D\3\2\2\2\u00e0\u00e1\5\23\n\2\u00e1\u00e2\5\r\7\2\u00e2F\3\2\2\2\u00e3"+
		"\u00e4\5\13\6\2\u00e4\u00e5\5\31\r\2\u00e5\u00e6\5\'\24\2\u00e6\u00e7"+
		"\5\13\6\2\u00e7H\3\2\2\2\u00e8\u00e9\5)\25\2\u00e9\u00ea\5%\23\2\u00ea"+
		"\u00eb\5+\26\2\u00eb\u00ec\5\13\6\2\u00ecJ\3\2\2\2\u00ed\u00ee\5\r\7\2"+
		"\u00ee\u00ef\5\3\2\2\u00ef\u00f0\5\31\r\2\u00f0\u00f1\5\'\24\2\u00f1\u00f2"+
		"\5\13\6\2\u00f2L\3\2\2\2\u00f3\u00f4\5/\30\2\u00f4\u00f5\5\21\t\2\u00f5"+
		"\u00f6\5\23\n\2\u00f6\u00f7\5\31\r\2\u00f7\u00f8\5\13\6\2\u00f8N\3\2\2"+
		"\2\u00f9\u00fa\5\'\24\2\u00fa\u00fb\5\27\f\2\u00fbP\3\2\2\2\u00fc\u00fd"+
		"\7.\2\2\u00fdR\3\2\2\2\u00fe\u00ff\7=\2\2\u00ffT\3\2\2\2\u0100\u0101\7"+
		"<\2\2\u0101V\3\2\2\2\u0102\u0103\7?\2\2\u0103X\3\2\2\2\u0104\u0105\7}"+
		"\2\2\u0105Z\3\2\2\2\u0106\u0107\7\177\2\2\u0107\\\3\2\2\2\u0108\u0109"+
		"\7*\2\2\u0109^\3\2\2\2\u010a\u010b\7+\2\2\u010b`\3\2\2\2\u010c\u010d\7"+
		"-\2\2\u010db\3\2\2\2\u010e\u010f\7/\2\2\u010fd\3\2\2\2\u0110\u0111\7\u0080"+
		"\2\2\u0111f\3\2\2\2\u0112\u0113\7~\2\2\u0113\u0114\7~\2\2\u0114h\3\2\2"+
		"\2\u0115\u0116\7(\2\2\u0116\u0117\7(\2\2\u0117j\3\2\2\2\u0118\u0119\7"+
		"?\2\2\u0119\u011a\7?\2\2\u011al\3\2\2\2\u011b\u011c\7#\2\2\u011c\u011d"+
		"\7?\2\2\u011dn\3\2\2\2\u011e\u011f\7>\2\2\u011fp\3\2\2\2\u0120\u0121\7"+
		">\2\2\u0121\u0122\7?\2\2\u0122r\3\2\2\2\u0123\u0124\7@\2\2\u0124t\3\2"+
		"\2\2\u0125\u0126\7@\2\2\u0126\u0127\7?\2\2\u0127v\3\2\2\2\u0128\u0129"+
		"\7`\2\2\u0129\u012a\7]\2\2\u012a\u012b\7c\2\2\u012b\u012c\7/\2\2\u012c"+
		"\u012d\7\\\2\2\u012d\u012e\7C\2\2\u012e\u012f\7/\2\2\u012f\u0130\7\\\2"+
		"\2\u0130\u0131\7_\2\2\u0131\u0132\7]\2\2\u0132\u0133\7c\2\2\u0133\u0134"+
		"\7/\2\2\u0134\u0135\7|\2\2\u0135\u0136\7C\2\2\u0136\u0137\7/\2\2\u0137"+
		"\u0138\7\\\2\2\u0138\u0139\7\62\2\2\u0139\u013a\7/\2\2\u013a\u013b\7;"+
		"\2\2\u013b\u013c\7a\2\2\u013c\u013d\7_\2\2\u013d\u013e\7-\2\2\u013ex\3"+
		"\2\2\2\u013f\u0140\7/\2\2\u0140\u0141\7A\2\2\u0141\u0142\7`\2\2\u0142"+
		"\u0143\7]\2\2\u0143\u0144\7\63\2\2\u0144\u0145\7/\2\2\u0145\u0146\7;\2"+
		"\2\u0146\u0147\7_\2\2\u0147\u0148\7]\2\2\u0148\u0149\7\62\2\2\u0149\u014a"+
		"\7/\2\2\u014a\u014b\7;\2\2\u014b\u014c\7_\2\2\u014c\u014f\7,\2\2\u014d"+
		"\u014f\7\62\2\2\u014e\u013f\3\2\2\2\u014e\u014d\3\2\2\2\u014fz\3\2\2\2"+
		"\u0150\u0151\7]\2\2\u0151\u0152\7\"\2\2\u0152\u0153\7\13\2\2\u0153\u0154"+
		"\7\17\2\2\u0154\u0155\7\f\2\2\u0155\u0156\7_\2\2\u0156\u0157\7-\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\b>\2\2\u0159|\3\2\2\2\u015a\u015b\7\61\2\2"+
		"\u015b\u015c\7,\2\2\u015c\u0161\3\2\2\2\u015d\u0160\5}?\2\u015e\u0160"+
		"\13\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7,\2\2\u0165\u0166\7\61\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b?\2\2\u0168~\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7\61\2\2"+
		"\u016b\u016f\3\2\2\2\u016c\u016e\13\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0173\7\f\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b@"+
		"\2\2\u0175\u0080\3\2\2\2\7\2\u014e\u015f\u0161\u016f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}