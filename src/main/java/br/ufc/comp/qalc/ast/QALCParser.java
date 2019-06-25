// Generated from /UrukHai/repos/qalc/src/main/java/br/ufc/comp/qalc/antlr4/QALC.g4 by ANTLR 4.7.2
package br.ufc.comp.qalc.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QALCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, RETURN=4, BREAK=5, INT=6, DOUBLE=7, FLOAT=8, CHAR=9, 
		ELSE=10, IF=11, FOR=12, WHILE=13, SWITCH=14, TRUE=15, FALSE=16, NULL=17, 
		LKEY=18, RKEY=19, SEMI=20, LPAREN=21, RPAREN=22, EQUAL=23, NEQ=24, LEQ=25, 
		LQ=26, GEQ=27, GT=28, NOT=29, AND=30, OR=31, INC=32, DEC=33, ATRIB=34, 
		CARET=35, ADD=36, SUB=37, MOD=38, MUL=39, DIV=40, COMMA=41, VARID=42, 
		RESID=43, FUNCID=44, NUML=45, STRL=46, COM=47, WHITE=48;
	public static final int
		RULE_parse = 0, RULE_function = 1, RULE_block = 2, RULE_stat = 3, RULE_assigment = 4, 
		RULE_if_stat = 5, RULE_condition_block = 6, RULE_stat_block = 7, RULE_while_stat = 8, 
		RULE_for_stat = 9, RULE_vatrib = 10, RULE_type = 11, RULE_expr = 12, RULE_atom = 13, 
		RULE_fcall = 14, RULE_fpars = 15, RULE_rpars = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "function", "block", "stat", "assigment", "if_stat", "condition_block", 
			"stat_block", "while_stat", "for_stat", "vatrib", "type", "expr", "atom", 
			"fcall", "fpars", "rpars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'case'", "':'", "'bool'", "'return'", "'break'", "'int'", "'double'", 
			"'float'", "'char'", "'else'", "'if'", "'for'", "'while'", "'switch'", 
			"'true'", "'false'", "'null'", "'{'", "'}'", "';'", "'('", "')'", "'=='", 
			"'!='", "'<='", "'<'", "'>='", "'>'", "'!'", "'&&'", "'||'", "'++'", 
			"'--'", "'='", "'^'", "'+'", "'-'", "'%'", "'*'", "'/'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "RETURN", "BREAK", "INT", "DOUBLE", "FLOAT", 
			"CHAR", "ELSE", "IF", "FOR", "WHILE", "SWITCH", "TRUE", "FALSE", "NULL", 
			"LKEY", "RKEY", "SEMI", "LPAREN", "RPAREN", "EQUAL", "NEQ", "LEQ", "LQ", 
			"GEQ", "GT", "NOT", "AND", "OR", "INC", "DEC", "ATRIB", "CARET", "ADD", 
			"SUB", "MOD", "MUL", "DIV", "COMMA", "VARID", "RESID", "FUNCID", "NUML", 
			"STRL", "COM", "WHITE"
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
	public String getGrammarFileName() { return "QALC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QALCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QALCParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCID) {
				{
				{
				setState(34);
				function();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(QALCParser.FUNCID, 0); }
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public FparsContext fpars() {
			return getRuleContext(FparsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public TerminalNode LKEY() { return getToken(QALCParser.LKEY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RKEY() { return getToken(QALCParser.RKEY, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FUNCID);
			setState(43);
			match(LPAREN);
			setState(44);
			fpars();
			setState(45);
			match(RPAREN);
			setState(46);
			match(LKEY);
			setState(47);
			block();
			setState(48);
			match(RKEY);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << RETURN) | (1L << BREAK) | (1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LKEY) | (1L << LPAREN) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << VARID) | (1L << RESID) | (1L << FUNCID) | (1L << NUML) | (1L << STRL))) != 0)) {
				{
				{
				setState(50);
				stat();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatContext extends ParserRuleContext {
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public VatribContext vatrib() {
			return getRuleContext(VatribContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QALCParser.SEMI, 0); }
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(QALCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(QALCParser.BREAK, 0); }
		public TerminalNode SWITCH() { return getToken(QALCParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public TerminalNode LKEY() { return getToken(QALCParser.LKEY, 0); }
		public TerminalNode RKEY() { return getToken(QALCParser.RKEY, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case INT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				assigment();
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case NOT:
			case ADD:
			case SUB:
			case VARID:
			case RESID:
			case FUNCID:
			case NUML:
			case STRL:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				vatrib();
				setState(58);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				for_stat();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(RETURN);
				setState(64);
				expr(0);
				setState(65);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(BREAK);
				setState(68);
				match(SEMI);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				match(SWITCH);
				setState(70);
				match(LPAREN);
				setState(71);
				expr(0);
				setState(72);
				match(RPAREN);
				setState(73);
				match(LKEY);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(74);
					match(T__0);
					setState(75);
					atom();
					setState(76);
					match(T__1);
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << RETURN) | (1L << BREAK) | (1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LKEY) | (1L << LPAREN) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << VARID) | (1L << RESID) | (1L << FUNCID) | (1L << NUML) | (1L << STRL))) != 0)) {
						{
						{
						setState(77);
						stat();
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(RKEY);
				}
				break;
			case LKEY:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				match(LKEY);
				setState(91);
				block();
				setState(92);
				match(RKEY);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARID() { return getToken(QALCParser.VARID, 0); }
		public TerminalNode SEMI() { return getToken(QALCParser.SEMI, 0); }
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(VARID);
			setState(98);
			match(SEMI);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(QALCParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(QALCParser.IF, i);
		}
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(QALCParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(QALCParser.ELSE, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			match(LPAREN);
			setState(102);
			expr(0);
			setState(103);
			match(RPAREN);
			setState(104);
			stat_block();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(ELSE);
					setState(106);
					match(IF);
					setState(107);
					condition_block();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(113);
				match(ELSE);
				setState(114);
				stat_block();
				}
				break;
			}
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expr(0);
			setState(118);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode LKEY() { return getToken(QALCParser.LKEY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RKEY() { return getToken(QALCParser.RKEY, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat_block);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(LKEY);
				setState(121);
				block();
				setState(122);
				match(RKEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(QALCParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(WHILE);
			setState(129);
			match(LPAREN);
			setState(130);
			expr(0);
			setState(131);
			match(RPAREN);
			setState(132);
			stat_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(QALCParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(QALCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(QALCParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FOR);
			setState(135);
			match(LPAREN);
			setState(136);
			expr(0);
			setState(137);
			match(SEMI);
			setState(138);
			expr(0);
			setState(139);
			match(SEMI);
			setState(140);
			expr(0);
			setState(141);
			match(RPAREN);
			setState(142);
			stat_block();
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

	public static class VatribContext extends ParserRuleContext {
		public TerminalNode VARID() { return getToken(QALCParser.VARID, 0); }
		public TerminalNode ATRIB() { return getToken(QALCParser.ATRIB, 0); }
		public VatribContext vatrib() {
			return getRuleContext(VatribContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VatribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vatrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterVatrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitVatrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitVatrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VatribContext vatrib() throws RecognitionException {
		VatribContext _localctx = new VatribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vatrib);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(VARID);
				setState(145);
				match(ATRIB);
				setState(146);
				vatrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expr(0);
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QALCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(QALCParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(QALCParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(QALCParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(QALCParser.ADD, 0); }
		public PlusExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomLiteralContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterAtomLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitAtomLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitAtomLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CARET() { return getToken(QALCParser.CARET, 0); }
		public PowerExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(QALCParser.MOD, 0); }
		public ModExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExprContext {
		public TerminalNode NOT() { return getToken(QALCParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(QALCParser.DIV, 0); }
		public DivExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(QALCParser.OR, 0); }
		public OrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderingExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LQ() { return getToken(QALCParser.LQ, 0); }
		public TerminalNode LEQ() { return getToken(QALCParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(QALCParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(QALCParser.GEQ, 0); }
		public OrderingExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterOrderingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitOrderingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitOrderingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(QALCParser.AND, 0); }
		public AndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExprContext {
		public TerminalNode SUB() { return getToken(QALCParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(QALCParser.SUB, 0); }
		public MinusExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultUseContext extends ExprContext {
		public TerminalNode RESID() { return getToken(QALCParser.RESID, 0); }
		public ResultUseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterResultUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitResultUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitResultUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPlusExpressionContext extends ExprContext {
		public TerminalNode ADD() { return getToken(QALCParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryPlusExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public FcallContext fcall() {
			return getRuleContext(FcallContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VartAtributionContext extends ExprContext {
		public TerminalNode VARID() { return getToken(QALCParser.VARID, 0); }
		public VartAtributionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterVartAtribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitVartAtribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitVartAtribution(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(QALCParser.EQUAL, 0); }
		public TerminalNode NEQ() { return getToken(QALCParser.NEQ, 0); }
		public EqualityExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberLiteralContext extends ExprContext {
		public TerminalNode NUML() { return getToken(QALCParser.NUML, 0); }
		public NumberLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableUseContext extends ExprContext {
		public TerminalNode VARID() { return getToken(QALCParser.VARID, 0); }
		public VariableUseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterVariableUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitVariableUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitVariableUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(QALCParser.MUL, 0); }
		public TimesExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterTimesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitTimesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitTimesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(NUML);
				}
				break;
			case 2:
				{
				_localctx = new VariableUseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(VARID);
				}
				break;
			case 3:
				{
				_localctx = new VartAtributionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(VARID);
				}
				break;
			case 4:
				{
				_localctx = new ResultUseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(RESID);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				fcall();
				}
				break;
			case 6:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(LPAREN);
				setState(159);
				expr(0);
				setState(160);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(NOT);
				setState(163);
				expr(14);
				}
				break;
			case 8:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(ADD);
				setState(165);
				expr(12);
				}
				break;
			case 9:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(SUB);
				setState(167);
				expr(11);
				}
				break;
			case 10:
				{
				_localctx = new AtomLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(172);
						match(CARET);
						setState(173);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ModExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(175);
						match(MOD);
						setState(176);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new TimesExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(178);
						match(MUL);
						setState(179);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new DivExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
						match(DIV);
						setState(182);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new PlusExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
						match(ADD);
						setState(185);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new MinusExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						match(SUB);
						setState(188);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new OrderingExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEQ) | (1L << LQ) | (1L << GEQ) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new EqualityExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196);
						match(AND);
						setState(197);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(199);
						match(OR);
						setState(200);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(QALCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(QALCParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroliteralContext extends AtomContext {
		public TerminalNode NUML() { return getToken(QALCParser.NUML, 0); }
		public NumeroliteralContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterNumeroliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitNumeroliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitNumeroliteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRL() { return getToken(QALCParser.STRL, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NULL() { return getToken(QALCParser.NULL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NUML:
				_localctx = new NumeroliteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(NUML);
				}
				break;
			case STRL:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(STRL);
				}
				break;
			case NULL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(NULL);
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

	public static class FcallContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(QALCParser.FUNCID, 0); }
		public TerminalNode LPAREN() { return getToken(QALCParser.LPAREN, 0); }
		public RparsContext rpars() {
			return getRuleContext(RparsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QALCParser.RPAREN, 0); }
		public FcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitFcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitFcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FcallContext fcall() throws RecognitionException {
		FcallContext _localctx = new FcallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(FUNCID);
			setState(213);
			match(LPAREN);
			setState(214);
			rpars();
			setState(215);
			match(RPAREN);
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

	public static class FparsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> VARID() { return getTokens(QALCParser.VARID); }
		public TerminalNode VARID(int i) {
			return getToken(QALCParser.VARID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QALCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QALCParser.COMMA, i);
		}
		public FparsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterFpars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitFpars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitFpars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparsContext fpars() throws RecognitionException {
		FparsContext _localctx = new FparsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fpars);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case INT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				type();
				setState(218);
				match(VARID);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219);
					match(COMMA);
					setState(220);
					type();
					setState(221);
					match(VARID);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RparsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QALCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QALCParser.COMMA, i);
		}
		public RparsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).enterRpars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QALCListener ) ((QALCListener)listener).exitRpars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QALCVisitor ) return ((QALCVisitor<? extends T>)visitor).visitRpars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparsContext rpars() throws RecognitionException {
		RparsContext _localctx = new RparsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rpars);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case NOT:
			case ADD:
			case SUB:
			case VARID:
			case RESID:
			case FUNCID:
			case NUML:
			case STRL:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				expr(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					expr(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\7\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5"+
		"\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3\7\3\7\5"+
		"\7v\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ac\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00cc\n\16\f\16\16\16\u00cf\13\16\3\17\3\17\3\17\3\17\5\17\u00d5"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2"+
		"\n\21\f\21\16\21\u00e5\13\21\3\21\5\21\u00e8\n\21\3\22\3\22\3\22\7\22"+
		"\u00ed\n\22\f\22\16\22\u00f0\13\22\3\22\5\22\u00f3\n\22\3\22\2\3\32\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2\5\5\b\13\3\2\33\36"+
		"\3\2\31\32\3\2\21\22\2\u010e\2\'\3\2\2\2\4,\3\2\2\2\6\67\3\2\2\2\b`\3"+
		"\2\2\2\nb\3\2\2\2\ff\3\2\2\2\16w\3\2\2\2\20\u0080\3\2\2\2\22\u0082\3\2"+
		"\2\2\24\u0088\3\2\2\2\26\u0096\3\2\2\2\30\u0098\3\2\2\2\32\u00ab\3\2\2"+
		"\2\34\u00d4\3\2\2\2\36\u00d6\3\2\2\2 \u00e7\3\2\2\2\"\u00f2\3\2\2\2$&"+
		"\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2"+
		"\2*+\7\2\2\3+\3\3\2\2\2,-\7.\2\2-.\7\27\2\2./\5 \21\2/\60\7\30\2\2\60"+
		"\61\7\24\2\2\61\62\5\6\4\2\62\63\7\25\2\2\63\5\3\2\2\2\64\66\5\b\5\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2"+
		"\2:a\5\n\6\2;<\5\26\f\2<=\7\26\2\2=a\3\2\2\2>a\5\f\7\2?a\5\22\n\2@a\5"+
		"\24\13\2AB\7\6\2\2BC\5\32\16\2CD\7\26\2\2Da\3\2\2\2EF\7\7\2\2Fa\7\26\2"+
		"\2GH\7\20\2\2HI\7\27\2\2IJ\5\32\16\2JK\7\30\2\2KW\7\24\2\2LM\7\3\2\2M"+
		"N\5\34\17\2NR\7\4\2\2OQ\5\b\5\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2UL\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2"+
		"\2YW\3\2\2\2Z[\7\25\2\2[a\3\2\2\2\\]\7\24\2\2]^\5\6\4\2^_\7\25\2\2_a\3"+
		"\2\2\2`:\3\2\2\2`;\3\2\2\2`>\3\2\2\2`?\3\2\2\2`@\3\2\2\2`A\3\2\2\2`E\3"+
		"\2\2\2`G\3\2\2\2`\\\3\2\2\2a\t\3\2\2\2bc\5\30\r\2cd\7,\2\2de\7\26\2\2"+
		"e\13\3\2\2\2fg\7\r\2\2gh\7\27\2\2hi\5\32\16\2ij\7\30\2\2jp\5\20\t\2kl"+
		"\7\f\2\2lm\7\r\2\2mo\5\16\b\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"qu\3\2\2\2rp\3\2\2\2st\7\f\2\2tv\5\20\t\2us\3\2\2\2uv\3\2\2\2v\r\3\2\2"+
		"\2wx\5\32\16\2xy\5\20\t\2y\17\3\2\2\2z{\7\24\2\2{|\5\6\4\2|}\7\25\2\2"+
		"}\u0081\3\2\2\2~\u0081\5\b\5\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082\u0083\7\17\2\2\u0083"+
		"\u0084\7\27\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\30\2\2\u0086\u0087"+
		"\5\20\t\2\u0087\23\3\2\2\2\u0088\u0089\7\16\2\2\u0089\u008a\7\27\2\2\u008a"+
		"\u008b\5\32\16\2\u008b\u008c\7\26\2\2\u008c\u008d\5\32\16\2\u008d\u008e"+
		"\7\26\2\2\u008e\u008f\5\32\16\2\u008f\u0090\7\30\2\2\u0090\u0091\5\20"+
		"\t\2\u0091\25\3\2\2\2\u0092\u0093\7,\2\2\u0093\u0094\7$\2\2\u0094\u0097"+
		"\5\26\f\2\u0095\u0097\5\32\16\2\u0096\u0092\3\2\2\2\u0096\u0095\3\2\2"+
		"\2\u0097\27\3\2\2\2\u0098\u0099\t\2\2\2\u0099\31\3\2\2\2\u009a\u009b\b"+
		"\16\1\2\u009b\u00ac\7/\2\2\u009c\u00ac\7,\2\2\u009d\u00ac\7,\2\2\u009e"+
		"\u00ac\7-\2\2\u009f\u00ac\5\36\20\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5"+
		"\32\16\2\u00a2\u00a3\7\30\2\2\u00a3\u00ac\3\2\2\2\u00a4\u00a5\7\37\2\2"+
		"\u00a5\u00ac\5\32\16\20\u00a6\u00a7\7&\2\2\u00a7\u00ac\5\32\16\16\u00a8"+
		"\u00a9\7\'\2\2\u00a9\u00ac\5\32\16\r\u00aa\u00ac\5\34\17\2\u00ab\u009a"+
		"\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u009e\3\2\2\2\u00ab"+
		"\u009f\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a6\3\2"+
		"\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00cd\3\2\2\2\u00ad"+
		"\u00ae\f\17\2\2\u00ae\u00af\7%\2\2\u00af\u00cc\5\32\16\17\u00b0\u00b1"+
		"\f\f\2\2\u00b1\u00b2\7(\2\2\u00b2\u00cc\5\32\16\r\u00b3\u00b4\f\13\2\2"+
		"\u00b4\u00b5\7)\2\2\u00b5\u00cc\5\32\16\f\u00b6\u00b7\f\n\2\2\u00b7\u00b8"+
		"\7*\2\2\u00b8\u00cc\5\32\16\13\u00b9\u00ba\f\t\2\2\u00ba\u00bb\7&\2\2"+
		"\u00bb\u00cc\5\32\16\n\u00bc\u00bd\f\b\2\2\u00bd\u00be\7\'\2\2\u00be\u00cc"+
		"\5\32\16\t\u00bf\u00c0\f\7\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00cc\5\32\16"+
		"\b\u00c2\u00c3\f\6\2\2\u00c3\u00c4\t\4\2\2\u00c4\u00cc\5\32\16\7\u00c5"+
		"\u00c6\f\5\2\2\u00c6\u00c7\7 \2\2\u00c7\u00cc\5\32\16\6\u00c8\u00c9\f"+
		"\4\2\2\u00c9\u00ca\7!\2\2\u00ca\u00cc\5\32\16\5\u00cb\u00ad\3\2\2\2\u00cb"+
		"\u00b0\3\2\2\2\u00cb\u00b3\3\2\2\2\u00cb\u00b6\3\2\2\2\u00cb\u00b9\3\2"+
		"\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\33\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d5"+
		"\t\5\2\2\u00d1\u00d5\7/\2\2\u00d2\u00d5\7\60\2\2\u00d3\u00d5\7\23\2\2"+
		"\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\35\3\2\2\2\u00d6\u00d7\7.\2\2\u00d7\u00d8\7\27\2\2\u00d8"+
		"\u00d9\5\"\22\2\u00d9\u00da\7\30\2\2\u00da\37\3\2\2\2\u00db\u00dc\5\30"+
		"\r\2\u00dc\u00e3\7,\2\2\u00dd\u00de\7+\2\2\u00de\u00df\5\30\r\2\u00df"+
		"\u00e0\7,\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8!\3\2\2\2\u00e9\u00ee\5\32\16\2\u00ea\u00eb\7+\2\2\u00eb\u00ed"+
		"\5\32\16\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3#\3\2\2\2\23\'\67"+
		"RW`pu\u0080\u0096\u00ab\u00cb\u00cd\u00d4\u00e3\u00e7\u00ee\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}