// Generated from newVTL.g4 by ANTLR 4.6
package it.islandofcode.jvtllib.newparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newVTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ASSIGN=4, MEMBER=5, MUL=6, DIV=7, PLUS=8, MINUS=9, 
		CONCAT=10, EQ=11, NE=12, LE=13, LT=14, GE=15, GT=16, AND=17, OR=18, XOR=19, 
		NOT=20, ISNULL=21, ISNOTNULL=22, WHEN=23, THEN=24, IN=25, AS=26, ERRCODE=27, 
		LPAR=28, RPAR=29, LBRA=30, RBRA=31, LSQR=32, RSQR=33, COMMA=34, COLON=35, 
		SCOL=36, RESTRICT=37, GET=38, PUT=39, CHECK=40, VALID=41, NVALID=42, ALL=43, 
		CONDITION=44, MEASURES=45, JOIN=46, INNER=47, LEFT=48, ON=49, KEEP=50, 
		RENAME=51, FILTER=52, CALC=53, UNION=54, INTERSECT=55, SYMDIFF=56, SETDIFF=57, 
		NVL=58, IF=59, ELSEIF=60, ELSE=61, ROUND=62, CEIL=63, FLOOR=64, ABS=65, 
		EXP=66, LOGN=67, LOG=68, POW=69, SQRT=70, NROOT=71, MOD=72, TRUNC=73, 
		SUBSTR=74, ROLE=75, IDENTIFIER=76, MEASURE=77, ATTRIBUTE=78, DEFINE=79, 
		DEFVAR=80, DEFVALUEDOM=81, DEFDATSTRUCT=82, DEFDATASET=83, DATAPOINT=84, 
		RULESET=85, HIERARCHICAL=86, MAPPING=87, NULLTYPE=88, STRINGTYPE=89, INTTYPE=90, 
		FLOATTYPE=91, BOOLTYPE=92, DATETYPE=93, DATE_LITERAL=94, INTEGER_LITERAL=95, 
		STRING_LITERAL=96, BOOLEAN_LITERAL=97, FLOAT_LITERAL=98, REG_IDENTIFIER=99, 
		ESCAPED_IDENTIFIER=100, WS=101, COMMENT=102, LINE_COMMENT=103;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_assignment = 2, RULE_expr = 3, 
		RULE_checkfunction = 4, RULE_checkParamEnum = 5, RULE_checkParamOpt = 6, 
		RULE_define = 7, RULE_dpruleset = 8, RULE_singlerule = 9, RULE_errorCode = 10, 
		RULE_getFunction = 11, RULE_putFunction = 12, RULE_clausefun = 13, RULE_clausebody = 14, 
		RULE_clausebodyparam = 15, RULE_clausebodycalc = 16, RULE_joinblock = 17, 
		RULE_setfun = 18, RULE_condOperator = 19, RULE_debug = 20, RULE_varname = 21, 
		RULE_varmember = 22, RULE_scalartype = 23, RULE_nulltype = 24, RULE_booleantype = 25, 
		RULE_datetype = 26, RULE_integertype = 27, RULE_floattype = 28, RULE_stringtype = 29, 
		RULE_literal = 30, RULE_nullLiteral = 31, RULE_booleanLiteral = 32, RULE_dateLiteral = 33, 
		RULE_integerLiteral = 34, RULE_floatLiteral = 35, RULE_stringLiteral = 36, 
		RULE_componentRole = 37;
	public static final String[] ruleNames = {
		"parse", "statement", "assignment", "expr", "checkfunction", "checkParamEnum", 
		"checkParamOpt", "define", "dpruleset", "singlerule", "errorCode", "getFunction", 
		"putFunction", "clausefun", "clausebody", "clausebodyparam", "clausebodycalc", 
		"joinblock", "setfun", "condOperator", "debug", "varname", "varmember", 
		"scalartype", "nulltype", "booleantype", "datetype", "integertype", "floattype", 
		"stringtype", "literal", "nullLiteral", "booleanLiteral", "dateLiteral", 
		"integerLiteral", "floatLiteral", "stringLiteral", "componentRole"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'variable'", "'printvar'", "'nop'", "':='", "'.'", "'*'", "'/'", 
		"'+'", "'-'", "'||'", "'='", "'<>'", "'<='", "'<'", "'>='", "'>'", "'and'", 
		"'or'", "'xor'", "'not'", "'isnull'", "'is not null'", "'when'", "'then'", 
		"'in'", "'as'", "'errorcode'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"','", "':'", "';'", "'restrict'", "'get'", "'put'", "'check'", "'valid'", 
		"'not valid'", "'all'", "'condition'", "'measures'", "'join'", "'inner'", 
		"'left'", "'on'", "'keep'", "'rename'", "'filter'", "'calc'", "'union'", 
		"'intersect'", "'symdiff'", "'setdiff'", "'nvl'", "'if'", "'elseif'", 
		"'else'", "'round'", "'ceil'", "'floor'", "'abs'", "'exp'", "'ln'", "'log'", 
		"'power'", "'sqrt'", "'nroot'", "'mod'", "'trunc'", "'substr'", "'role'", 
		null, null, null, "'define'", "'defineVariable'", "'defineValueDomain'", 
		"'defineDataStructure'", "'defineDataSet'", "'datapoint'", "'ruleset'", 
		"'hierarchical'", "'mapping'", "'null'", "'string'", "'integer'", "'float'", 
		"'boolean'", "'date'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ASSIGN", "MEMBER", "MUL", "DIV", "PLUS", "MINUS", 
		"CONCAT", "EQ", "NE", "LE", "LT", "GE", "GT", "AND", "OR", "XOR", "NOT", 
		"ISNULL", "ISNOTNULL", "WHEN", "THEN", "IN", "AS", "ERRCODE", "LPAR", 
		"RPAR", "LBRA", "RBRA", "LSQR", "RSQR", "COMMA", "COLON", "SCOL", "RESTRICT", 
		"GET", "PUT", "CHECK", "VALID", "NVALID", "ALL", "CONDITION", "MEASURES", 
		"JOIN", "INNER", "LEFT", "ON", "KEEP", "RENAME", "FILTER", "CALC", "UNION", 
		"INTERSECT", "SYMDIFF", "SETDIFF", "NVL", "IF", "ELSEIF", "ELSE", "ROUND", 
		"CEIL", "FLOOR", "ABS", "EXP", "LOGN", "LOG", "POW", "SQRT", "NROOT", 
		"MOD", "TRUNC", "SUBSTR", "ROLE", "IDENTIFIER", "MEASURE", "ATTRIBUTE", 
		"DEFINE", "DEFVAR", "DEFVALUEDOM", "DEFDATSTRUCT", "DEFDATASET", "DATAPOINT", 
		"RULESET", "HIERARCHICAL", "MAPPING", "NULLTYPE", "STRINGTYPE", "INTTYPE", 
		"FLOATTYPE", "BOOLTYPE", "DATETYPE", "DATE_LITERAL", "INTEGER_LITERAL", 
		"STRING_LITERAL", "BOOLEAN_LITERAL", "FLOAT_LITERAL", "REG_IDENTIFIER", 
		"ESCAPED_IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "newVTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public newVTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(newVTLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitParse(this);
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
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__2 || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DEFINE - 79)) | (1L << (REG_IDENTIFIER - 79)) | (1L << (ESCAPED_IDENTIFIER - 79)))) != 0) );
			setState(81);
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

	public static class StatementContext extends ParserRuleContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DebugContext debug() {
			return getRuleContext(DebugContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				define();
				}
				break;
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				assignment();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				debug();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(newVTLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			varname();
			setState(89);
			match(ASSIGN);
			setState(90);
			expr(0);
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
	public static class UnaryexprContext extends ExprContext {
		public Token op;
		public ExprContext right;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(newVTLParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(newVTLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(newVTLParser.MINUS, 0); }
		public UnaryexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitUnaryexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConcatContext extends ExprContext {
		public ExprContext a;
		public ExprContext b;
		public TerminalNode CONCAT() { return getToken(newVTLParser.CONCAT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StringConcatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStringConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralexprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitLiteralexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckExprContext extends ExprContext {
		public CheckfunctionContext checkfunction() {
			return getRuleContext(CheckfunctionContext.class,0);
		}
		public CheckExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCheckExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFunSubstrContext extends ExprContext {
		public TerminalNode SUBSTR() { return getToken(newVTLParser.SUBSTR, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public StringFunSubstrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStringFunSubstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarexprContext extends ExprContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public VarexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitVarexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathexprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(newVTLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(newVTLParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(newVTLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(newVTLParser.DIV, 0); }
		public MathexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitMathexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNullCondexprContext extends ExprContext {
		public TerminalNode ISNULL() { return getToken(newVTLParser.ISNULL, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> NOT() { return getTokens(newVTLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(newVTLParser.NOT, i);
		}
		public IsNullCondexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitIsNullCondexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrecedenceexprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public PrecedenceexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitPrecedenceexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CeilFloorexprContext extends ExprContext {
		public Token op;
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode CEIL() { return getToken(newVTLParser.CEIL, 0); }
		public TerminalNode FLOOR() { return getToken(newVTLParser.FLOOR, 0); }
		public CeilFloorexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCeilFloorexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalexprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(newVTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(newVTLParser.OR, 0); }
		public LogicalexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitLogicalexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleparamMathfunContext extends ExprContext {
		public Token op;
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode TRUNC() { return getToken(newVTLParser.TRUNC, 0); }
		public TerminalNode POW() { return getToken(newVTLParser.POW, 0); }
		public TerminalNode NROOT() { return getToken(newVTLParser.NROOT, 0); }
		public TerminalNode MOD() { return getToken(newVTLParser.MOD, 0); }
		public DoubleparamMathfunContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDoubleparamMathfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MembershipexprContext extends ExprContext {
		public VarmemberContext varmember() {
			return getRuleContext(VarmemberContext.class,0);
		}
		public MembershipexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitMembershipexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundexprContext extends ExprContext {
		public TerminalNode ROUND() { return getToken(newVTLParser.ROUND, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public RoundexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitRoundexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleparamMathfunContext extends ExprContext {
		public Token op;
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode ABS() { return getToken(newVTLParser.ABS, 0); }
		public TerminalNode EXP() { return getToken(newVTLParser.EXP, 0); }
		public TerminalNode LOGN() { return getToken(newVTLParser.LOGN, 0); }
		public TerminalNode SQRT() { return getToken(newVTLParser.SQRT, 0); }
		public SingleparamMathfunContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSingleparamMathfun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClauseExprContext extends ExprContext {
		public ClausefunContext clausefun() {
			return getRuleContext(ClausefunContext.class,0);
		}
		public ClauseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClauseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutDataContext extends ExprContext {
		public PutFunctionContext putFunction() {
			return getRuleContext(PutFunctionContext.class,0);
		}
		public PutDataContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitPutData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InCondexprContext extends ExprContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode IN() { return getToken(newVTLParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode NOT() { return getToken(newVTLParser.NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public InCondexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitInCondexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetExprContext extends ExprContext {
		public SetfunContext setfun() {
			return getRuleContext(SetfunContext.class,0);
		}
		public SetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetDataContext extends ExprContext {
		public GetFunctionContext getFunction() {
			return getRuleContext(GetFunctionContext.class,0);
		}
		public GetDataContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitGetData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogexprContext extends ExprContext {
		public TerminalNode LOG() { return getToken(newVTLParser.LOG, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public LogexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitLogexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalCondContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(newVTLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(newVTLParser.NE, 0); }
		public TerminalNode LE() { return getToken(newVTLParser.LE, 0); }
		public TerminalNode LT() { return getToken(newVTLParser.LT, 0); }
		public TerminalNode GE() { return getToken(newVTLParser.GE, 0); }
		public TerminalNode GT() { return getToken(newVTLParser.GT, 0); }
		public RelationalCondContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitRelationalCond(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93);
				((UnaryexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
					((UnaryexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				((UnaryexprContext)_localctx).right = expr(22);
				}
				break;
			case 2:
				{
				_localctx = new PrecedenceexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(LPAR);
				setState(96);
				expr(0);
				setState(97);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new RoundexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(ROUND);
				setState(100);
				match(LPAR);
				setState(101);
				varname();
				setState(102);
				match(COMMA);
				setState(103);
				integerLiteral();
				setState(104);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new CeilFloorexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				((CeilFloorexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CEIL || _la==FLOOR) ) {
					((CeilFloorexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				match(LPAR);
				setState(108);
				varname();
				setState(109);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new SingleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				((SingleparamMathfunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ABS - 65)) | (1L << (EXP - 65)) | (1L << (LOGN - 65)) | (1L << (SQRT - 65)))) != 0)) ) {
					((SingleparamMathfunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112);
				match(LPAR);
				setState(113);
				varname();
				setState(114);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new DoubleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				((DoubleparamMathfunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (POW - 69)) | (1L << (NROOT - 69)) | (1L << (MOD - 69)) | (1L << (TRUNC - 69)))) != 0)) ) {
					((DoubleparamMathfunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				match(LPAR);
				setState(118);
				varname();
				setState(119);
				match(COMMA);
				setState(120);
				integerLiteral();
				setState(121);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new LogexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(LOG);
				setState(124);
				match(LPAR);
				setState(125);
				integerLiteral();
				setState(126);
				match(COMMA);
				setState(127);
				varname();
				setState(128);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new InCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				varname();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(131);
					match(NOT);
					}
				}

				setState(134);
				match(IN);
				setState(135);
				match(LPAR);
				setState(136);
				literal();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					literal();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new IsNullCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(146);
					match(NOT);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(ISNULL);
				setState(153);
				match(LPAR);
				setState(154);
				expr(0);
				setState(155);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new StringFunSubstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(SUBSTR);
				setState(158);
				match(LPAR);
				setState(159);
				expr(0);
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(160);
					match(COMMA);
					setState(161);
					integerLiteral();
					}
					break;
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(164);
					match(COMMA);
					setState(165);
					integerLiteral();
					}
				}

				setState(168);
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new CheckExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				checkfunction();
				}
				break;
			case 12:
				{
				_localctx = new ClauseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				clausefun();
				}
				break;
			case 13:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				setfun();
				}
				break;
			case 14:
				{
				_localctx = new GetDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				getFunction();
				}
				break;
			case 15:
				{
				_localctx = new PutDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				putFunction();
				}
				break;
			case 16:
				{
				_localctx = new MembershipexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				varmember();
				}
				break;
			case 17:
				{
				_localctx = new VarexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				varname();
				}
				break;
			case 18:
				{
				_localctx = new LiteralexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MathexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(181);
						((MathexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
							((MathexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new RelationalCondContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(184);
						((RelationalCondContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << LT) | (1L << GE) | (1L << GT))) != 0)) ) {
							((RelationalCondContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new LogicalexprContext(new ExprContext(_parentctx, _parentState));
						((LogicalexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(187);
						((LogicalexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicalexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						((LogicalexprContext)_localctx).right = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new StringConcatContext(new ExprContext(_parentctx, _parentState));
						((StringConcatContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190);
						match(CONCAT);
						setState(191);
						((StringConcatContext)_localctx).b = expr(11);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class CheckfunctionContext extends ParserRuleContext {
		public CheckfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkfunction; }
	 
		public CheckfunctionContext() { }
		public void copyFrom(CheckfunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckFunBaseContext extends CheckfunctionContext {
		public TerminalNode CHECK() { return getToken(newVTLParser.CHECK, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public CheckFunBaseContext(CheckfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCheckFunBase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckFunWithOptContext extends CheckfunctionContext {
		public TerminalNode CHECK() { return getToken(newVTLParser.CHECK, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public CheckParamEnumContext checkParamEnum() {
			return getRuleContext(CheckParamEnumContext.class,0);
		}
		public CheckParamOptContext checkParamOpt() {
			return getRuleContext(CheckParamOptContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public CheckFunWithOptContext(CheckfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCheckFunWithOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckfunctionContext checkfunction() throws RecognitionException {
		CheckfunctionContext _localctx = new CheckfunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_checkfunction);
		int _la;
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CheckFunBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(CHECK);
				setState(198);
				match(LPAR);
				setState(199);
				varname();
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					varname();
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(206);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new CheckFunWithOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(CHECK);
				setState(209);
				match(LPAR);
				setState(210);
				varname();
				setState(213); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(211);
						match(COMMA);
						setState(212);
						varname();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(215); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(217);
				checkParamEnum();
				setState(218);
				checkParamOpt();
				setState(219);
				match(RPAR);
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

	public static class CheckParamEnumContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public TerminalNode VALID() { return getToken(newVTLParser.VALID, 0); }
		public TerminalNode NVALID() { return getToken(newVTLParser.NVALID, 0); }
		public TerminalNode ALL() { return getToken(newVTLParser.ALL, 0); }
		public CheckParamEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkParamEnum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCheckParamEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckParamEnumContext checkParamEnum() throws RecognitionException {
		CheckParamEnumContext _localctx = new CheckParamEnumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_checkParamEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(223);
				match(COMMA);
				setState(224);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALID) | (1L << NVALID) | (1L << ALL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CheckParamOptContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public TerminalNode CONDITION() { return getToken(newVTLParser.CONDITION, 0); }
		public TerminalNode MEASURES() { return getToken(newVTLParser.MEASURES, 0); }
		public CheckParamOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkParamOpt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCheckParamOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckParamOptContext checkParamOpt() throws RecognitionException {
		CheckParamOptContext _localctx = new CheckParamOptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_checkParamOpt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(227);
				match(COMMA);
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==CONDITION || _la==MEASURES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class DefineContext extends ParserRuleContext {
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
	 
		public DefineContext() { }
		public void copyFrom(DefineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DatapointrulesetContext extends DefineContext {
		public DprulesetContext dpruleset() {
			return getRuleContext(DprulesetContext.class,0);
		}
		public DatapointrulesetContext(DefineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDatapointruleset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinevariableContext extends DefineContext {
		public TerminalNode DEFINE() { return getToken(newVTLParser.DEFINE, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public DefinevariableContext(DefineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDefinevariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DatapointrulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				dpruleset();
				}
				break;
			case 2:
				_localctx = new DefinevariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(DEFINE);
				setState(233);
				match(T__0);
				setState(234);
				varname();
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

	public static class DprulesetContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(newVTLParser.DEFINE, 0); }
		public TerminalNode DATAPOINT() { return getToken(newVTLParser.DATAPOINT, 0); }
		public TerminalNode RULESET() { return getToken(newVTLParser.RULESET, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode LBRA() { return getToken(newVTLParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(newVTLParser.RBRA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public List<SingleruleContext> singlerule() {
			return getRuleContexts(SingleruleContext.class);
		}
		public SingleruleContext singlerule(int i) {
			return getRuleContext(SingleruleContext.class,i);
		}
		public DprulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpruleset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDpruleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DprulesetContext dpruleset() throws RecognitionException {
		DprulesetContext _localctx = new DprulesetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dpruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(DEFINE);
			setState(238);
			match(DATAPOINT);
			setState(239);
			match(RULESET);
			setState(240);
			varname();
			setState(241);
			match(LPAR);
			setState(242);
			varname();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243);
				match(COMMA);
				setState(244);
				varname();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(RPAR);
			setState(251);
			match(LBRA);
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				singlerule();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(257);
			match(RBRA);
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

	public static class SingleruleContext extends ParserRuleContext {
		public SingleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlerule; }
	 
		public SingleruleContext() { }
		public void copyFrom(SingleruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleruleConsequenceOnlyContext extends SingleruleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(newVTLParser.COLON, 0); }
		public TerminalNode WHEN() { return getToken(newVTLParser.WHEN, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode THEN() { return getToken(newVTLParser.THEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ErrorCodeContext errorCode() {
			return getRuleContext(ErrorCodeContext.class,0);
		}
		public SingleruleConsequenceOnlyContext(SingleruleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSingleruleConsequenceOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleruleBothContext extends SingleruleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(newVTLParser.COLON, 0); }
		public TerminalNode WHEN() { return getToken(newVTLParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(newVTLParser.THEN, 0); }
		public ErrorCodeContext errorCode() {
			return getRuleContext(ErrorCodeContext.class,0);
		}
		public SingleruleBothContext(SingleruleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSingleruleBoth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleruleContext singlerule() throws RecognitionException {
		SingleruleContext _localctx = new SingleruleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singlerule);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SingleruleConsequenceOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				varname();
				setState(260);
				match(COLON);
				setState(261);
				match(WHEN);
				setState(262);
				booleanLiteral();
				setState(263);
				match(THEN);
				setState(264);
				expr(0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(265);
					errorCode();
					}
				}

				}
				break;
			case 2:
				_localctx = new SingleruleBothContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				varname();
				setState(269);
				match(COLON);
				setState(270);
				match(WHEN);
				setState(271);
				expr(0);
				setState(272);
				match(THEN);
				setState(273);
				expr(0);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(274);
					errorCode();
					}
				}

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

	public static class ErrorCodeContext extends ParserRuleContext {
		public TerminalNode ERRCODE() { return getToken(newVTLParser.ERRCODE, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public ErrorCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitErrorCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCodeContext errorCode() throws RecognitionException {
		ErrorCodeContext _localctx = new ErrorCodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_errorCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ERRCODE);
			setState(280);
			match(LPAR);
			setState(281);
			literal();
			setState(282);
			match(RPAR);
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

	public static class GetFunctionContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(newVTLParser.GET, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public GetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitGetFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFunctionContext getFunction() throws RecognitionException {
		GetFunctionContext _localctx = new GetFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_getFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(GET);
			setState(285);
			match(LPAR);
			setState(286);
			stringLiteral();
			setState(287);
			match(RPAR);
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

	public static class PutFunctionContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(newVTLParser.PUT, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public PutFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitPutFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutFunctionContext putFunction() throws RecognitionException {
		PutFunctionContext _localctx = new PutFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_putFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(PUT);
			setState(290);
			match(LPAR);
			setState(291);
			stringLiteral();
			setState(292);
			match(RPAR);
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

	public static class ClausefunContext extends ParserRuleContext {
		public ClausefunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausefun; }
	 
		public ClausefunContext() { }
		public void copyFrom(ClausefunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClausejoinContext extends ClausefunContext {
		public TerminalNode LSQR() { return getToken(newVTLParser.LSQR, 0); }
		public JoinblockContext joinblock() {
			return getRuleContext(JoinblockContext.class,0);
		}
		public TerminalNode RSQR() { return getToken(newVTLParser.RSQR, 0); }
		public TerminalNode LBRA() { return getToken(newVTLParser.LBRA, 0); }
		public List<ClausebodyContext> clausebody() {
			return getRuleContexts(ClausebodyContext.class);
		}
		public ClausebodyContext clausebody(int i) {
			return getRuleContext(ClausebodyContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(newVTLParser.RBRA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public ClausejoinContext(ClausefunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClausejoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClausebaseContext extends ClausefunContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode LSQR() { return getToken(newVTLParser.LSQR, 0); }
		public List<ClausebodyContext> clausebody() {
			return getRuleContexts(ClausebodyContext.class);
		}
		public ClausebodyContext clausebody(int i) {
			return getRuleContext(ClausebodyContext.class,i);
		}
		public TerminalNode RSQR() { return getToken(newVTLParser.RSQR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public ClausebaseContext(ClausefunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClausebase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausefunContext clausefun() throws RecognitionException {
		ClausefunContext _localctx = new ClausefunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_clausefun);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new ClausebaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				varname();
				setState(295);
				match(LSQR);
				setState(296);
				clausebody();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					clausebody();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(RSQR);
				}
				break;
			case LSQR:
				_localctx = new ClausejoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(LSQR);
				setState(307);
				joinblock();
				setState(308);
				match(RSQR);
				setState(309);
				match(LBRA);
				setState(310);
				clausebody();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					clausebody();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(RBRA);
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

	public static class ClausebodyContext extends ParserRuleContext {
		public ClausebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausebody; }
	 
		public ClausebodyContext() { }
		public void copyFrom(ClausebodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClauseKeepRenameContext extends ClausebodyContext {
		public Token op;
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<ClausebodyparamContext> clausebodyparam() {
			return getRuleContexts(ClausebodyparamContext.class);
		}
		public ClausebodyparamContext clausebodyparam(int i) {
			return getRuleContext(ClausebodyparamContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode KEEP() { return getToken(newVTLParser.KEEP, 0); }
		public TerminalNode RENAME() { return getToken(newVTLParser.RENAME, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public ClauseKeepRenameContext(ClausebodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClauseKeepRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClauseFilterContext extends ClausebodyContext {
		public TerminalNode FILTER() { return getToken(newVTLParser.FILTER, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public ClauseFilterContext(ClausebodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClauseFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClausecalcContext extends ClausebodyContext {
		public TerminalNode CALC() { return getToken(newVTLParser.CALC, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<ClausebodycalcContext> clausebodycalc() {
			return getRuleContexts(ClausebodycalcContext.class);
		}
		public ClausebodycalcContext clausebodycalc(int i) {
			return getRuleContext(ClausebodycalcContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public ClausecalcContext(ClausebodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClausecalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausebodyContext clausebody() throws RecognitionException {
		ClausebodyContext _localctx = new ClausebodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_clausebody);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEEP:
			case RENAME:
				_localctx = new ClauseKeepRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				((ClauseKeepRenameContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KEEP || _la==RENAME) ) {
					((ClauseKeepRenameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				match(LPAR);
				setState(324);
				clausebodyparam();
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					clausebodyparam();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(RPAR);
				}
				break;
			case FILTER:
				_localctx = new ClauseFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(FILTER);
				setState(335);
				match(LPAR);
				setState(336);
				expr(0);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					expr(0);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(RPAR);
				}
				break;
			case CALC:
				_localctx = new ClausecalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(CALC);
				setState(347);
				match(LPAR);
				setState(348);
				clausebodycalc();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(349);
					match(COMMA);
					setState(350);
					clausebodycalc();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(RPAR);
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

	public static class ClausebodyparamContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public VarmemberContext varmember() {
			return getRuleContext(VarmemberContext.class,0);
		}
		public TerminalNode AS() { return getToken(newVTLParser.AS, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(newVTLParser.ROLE, 0); }
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public ClausebodyparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausebodyparam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClausebodyparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausebodyparamContext clausebodyparam() throws RecognitionException {
		ClausebodyparamContext _localctx = new ClausebodyparamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clausebodyparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(360);
				varname();
				}
				break;
			case 2:
				{
				setState(361);
				varmember();
				}
				break;
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(364);
				match(AS);
				setState(365);
				stringLiteral();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(368);
				match(ROLE);
				setState(369);
				componentRole();
				}
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

	public static class ClausebodycalcContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(newVTLParser.AS, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(newVTLParser.ROLE, 0); }
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public ClausebodycalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausebodycalc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClausebodycalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausebodycalcContext clausebodycalc() throws RecognitionException {
		ClausebodycalcContext _localctx = new ClausebodycalcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clausebodycalc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			expr(0);
			setState(373);
			match(AS);
			setState(374);
			stringLiteral();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(375);
				match(ROLE);
				setState(376);
				componentRole();
				}
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

	public static class JoinblockContext extends ParserRuleContext {
		public JoinblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinblock; }
	 
		public JoinblockContext() { }
		public void copyFrom(JoinblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinblockLeftContext extends JoinblockContext {
		public TerminalNode LEFT() { return getToken(newVTLParser.LEFT, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(newVTLParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(newVTLParser.AS, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode ON() { return getToken(newVTLParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public JoinblockLeftContext(JoinblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitJoinblockLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinblockInnerContext extends JoinblockContext {
		public TerminalNode INNER() { return getToken(newVTLParser.INNER, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(newVTLParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(newVTLParser.AS, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode ON() { return getToken(newVTLParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public JoinblockInnerContext(JoinblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitJoinblockInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinblockContext joinblock() throws RecognitionException {
		JoinblockContext _localctx = new JoinblockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_joinblock);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				_localctx = new JoinblockInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(INNER);
				setState(380);
				varname();
				setState(381);
				match(AS);
				setState(382);
				stringLiteral();
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(383);
					match(COMMA);
					setState(384);
					varname();
					setState(385);
					match(AS);
					setState(386);
					stringLiteral();
					}
					}
					setState(390); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(392);
				match(ON);
				setState(393);
				expr(0);
				}
				break;
			case LEFT:
				_localctx = new JoinblockLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(LEFT);
				setState(396);
				varname();
				setState(397);
				match(AS);
				setState(398);
				stringLiteral();
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(399);
					match(COMMA);
					setState(400);
					varname();
					setState(401);
					match(AS);
					setState(402);
					stringLiteral();
					}
					}
					setState(406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(408);
				match(ON);
				setState(409);
				expr(0);
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

	public static class SetfunContext extends ParserRuleContext {
		public SetfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setfun; }
	 
		public SetfunContext() { }
		public void copyFrom(SetfunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetIntersectContext extends SetfunContext {
		public TerminalNode INTERSECT() { return getToken(newVTLParser.INTERSECT, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public SetIntersectContext(SetfunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSetIntersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSetSymDiffContext extends SetfunContext {
		public Token op;
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode SYMDIFF() { return getToken(newVTLParser.SYMDIFF, 0); }
		public TerminalNode SETDIFF() { return getToken(newVTLParser.SETDIFF, 0); }
		public SetSetSymDiffContext(SetfunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSetSetSymDiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetUnionContext extends SetfunContext {
		public TerminalNode UNION() { return getToken(newVTLParser.UNION, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public SetUnionContext(SetfunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSetUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetfunContext setfun() throws RecognitionException {
		SetfunContext _localctx = new SetfunContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setfun);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				_localctx = new SetUnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(UNION);
				setState(414);
				match(LPAR);
				setState(415);
				varname();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(416);
					match(COMMA);
					setState(417);
					varname();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(RPAR);
				}
				break;
			case INTERSECT:
				_localctx = new SetIntersectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(INTERSECT);
				setState(426);
				match(LPAR);
				setState(427);
				varname();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(428);
					match(COMMA);
					setState(429);
					varname();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				match(RPAR);
				}
				break;
			case SYMDIFF:
			case SETDIFF:
				_localctx = new SetSetSymDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				((SetSetSymDiffContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SYMDIFF || _la==SETDIFF) ) {
					((SetSetSymDiffContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(438);
				match(LPAR);
				setState(439);
				varname();
				setState(440);
				match(COMMA);
				setState(441);
				varname();
				setState(442);
				match(RPAR);
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

	public static class CondOperatorContext extends ParserRuleContext {
		public CondOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condOperator; }
	 
		public CondOperatorContext() { }
		public void copyFrom(CondOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NvlCondOpContext extends CondOperatorContext {
		public TerminalNode NVL() { return getToken(newVTLParser.NVL, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public NvlCondOpContext(CondOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitNvlCondOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseCondOpContext extends CondOperatorContext {
		public TerminalNode IF() { return getToken(newVTLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(newVTLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(newVTLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(newVTLParser.ELSE, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(newVTLParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(newVTLParser.ELSEIF, i);
		}
		public IfThenElseCondOpContext(CondOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitIfThenElseCondOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondOperatorContext condOperator() throws RecognitionException {
		CondOperatorContext _localctx = new CondOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condOperator);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NVL:
				_localctx = new NvlCondOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(NVL);
				setState(447);
				match(LPAR);
				setState(448);
				varname();
				setState(449);
				match(COMMA);
				setState(450);
				expr(0);
				setState(451);
				match(RPAR);
				}
				break;
			case IF:
				_localctx = new IfThenElseCondOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(IF);
				setState(454);
				expr(0);
				setState(455);
				match(THEN);
				setState(456);
				expr(0);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(457);
					match(ELSEIF);
					setState(458);
					expr(0);
					setState(459);
					match(THEN);
					setState(460);
					expr(0);
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				match(ELSE);
				setState(468);
				expr(0);
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

	public static class DebugContext extends ParserRuleContext {
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
	 
		public DebugContext() { }
		public void copyFrom(DebugContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DBGprintvarContext extends DebugContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public DBGprintvarContext(DebugContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDBGprintvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DBGnopContext extends DebugContext {
		public DBGnopContext(DebugContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDBGnop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_debug);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new DBGprintvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(T__1);
				setState(473);
				varname();
				}
				break;
			case T__2:
				_localctx = new DBGnopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(T__2);
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

	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode REG_IDENTIFIER() { return getToken(newVTLParser.REG_IDENTIFIER, 0); }
		public TerminalNode ESCAPED_IDENTIFIER() { return getToken(newVTLParser.ESCAPED_IDENTIFIER, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER) ) {
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

	public static class VarmemberContext extends ParserRuleContext {
		public VarnameContext left;
		public Token op;
		public VarnameContext right;
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode MEMBER() { return getToken(newVTLParser.MEMBER, 0); }
		public VarmemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varmember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitVarmember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarmemberContext varmember() throws RecognitionException {
		VarmemberContext _localctx = new VarmemberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			((VarmemberContext)_localctx).left = varname();
			setState(480);
			((VarmemberContext)_localctx).op = match(MEMBER);
			setState(481);
			((VarmemberContext)_localctx).right = varname();
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

	public static class ScalartypeContext extends ParserRuleContext {
		public NulltypeContext nulltype() {
			return getRuleContext(NulltypeContext.class,0);
		}
		public BooleantypeContext booleantype() {
			return getRuleContext(BooleantypeContext.class,0);
		}
		public DatetypeContext datetype() {
			return getRuleContext(DatetypeContext.class,0);
		}
		public IntegertypeContext integertype() {
			return getRuleContext(IntegertypeContext.class,0);
		}
		public FloattypeContext floattype() {
			return getRuleContext(FloattypeContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public ScalartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalartype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitScalartype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalartypeContext scalartype() throws RecognitionException {
		ScalartypeContext _localctx = new ScalartypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scalartype);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				nulltype();
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				booleantype();
				}
				break;
			case DATETYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				datetype();
				}
				break;
			case INTTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				integertype();
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				floattype();
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
				stringtype();
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

	public static class NulltypeContext extends ParserRuleContext {
		public TerminalNode NULLTYPE() { return getToken(newVTLParser.NULLTYPE, 0); }
		public NulltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nulltype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitNulltype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NulltypeContext nulltype() throws RecognitionException {
		NulltypeContext _localctx = new NulltypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nulltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(NULLTYPE);
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

	public static class BooleantypeContext extends ParserRuleContext {
		public TerminalNode BOOLTYPE() { return getToken(newVTLParser.BOOLTYPE, 0); }
		public BooleantypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleantype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitBooleantype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleantypeContext booleantype() throws RecognitionException {
		BooleantypeContext _localctx = new BooleantypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleantype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(BOOLTYPE);
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

	public static class DatetypeContext extends ParserRuleContext {
		public TerminalNode DATETYPE() { return getToken(newVTLParser.DATETYPE, 0); }
		public DatetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDatetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetypeContext datetype() throws RecognitionException {
		DatetypeContext _localctx = new DatetypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_datetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(DATETYPE);
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

	public static class IntegertypeContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(newVTLParser.INTTYPE, 0); }
		public IntegertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integertype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitIntegertype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegertypeContext integertype() throws RecognitionException {
		IntegertypeContext _localctx = new IntegertypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(INTTYPE);
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

	public static class FloattypeContext extends ParserRuleContext {
		public TerminalNode FLOATTYPE() { return getToken(newVTLParser.FLOATTYPE, 0); }
		public FloattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floattype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitFloattype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloattypeContext floattype() throws RecognitionException {
		FloattypeContext _localctx = new FloattypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_floattype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(FLOATTYPE);
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

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRINGTYPE() { return getToken(newVTLParser.STRINGTYPE, 0); }
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStringtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(STRINGTYPE);
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

	public static class LiteralContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				nullLiteral();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				booleanLiteral();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				dateLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(508);
				stringLiteral();
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

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULLTYPE() { return getToken(newVTLParser.NULLTYPE, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(NULLTYPE);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(newVTLParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(BOOLEAN_LITERAL);
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

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode DATE_LITERAL() { return getToken(newVTLParser.DATE_LITERAL, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(DATE_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(newVTLParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(INTEGER_LITERAL);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(newVTLParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(FLOAT_LITERAL);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(newVTLParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(STRING_LITERAL);
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

	public static class ComponentRoleContext extends ParserRuleContext {
		public Token role;
		public TerminalNode IDENTIFIER() { return getToken(newVTLParser.IDENTIFIER, 0); }
		public TerminalNode MEASURE() { return getToken(newVTLParser.MEASURE, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(newVTLParser.ATTRIBUTE, 0); }
		public ComponentRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitComponentRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentRoleContext componentRole() throws RecognitionException {
		ComponentRoleContext _localctx = new ComponentRoleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_componentRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((ComponentRoleContext)_localctx).role = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (IDENTIFIER - 76)) | (1L << (MEASURE - 76)) | (1L << (ATTRIBUTE - 76)))) != 0)) ) {
				((ComponentRoleContext)_localctx).role = (Token)_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3i\u0210\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\2"+
		"\3\2\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0087"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\5\3\5\3\5"+
		"\7\5\u0096\n\5\f\5\16\5\u0099\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00a5\n\5\3\5\3\5\5\5\u00a9\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00b5\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u00c3\n\5\f\5\16\5\u00c6\13\5\3\6\3\6\3\6\3\6\3\6\6\6\u00cd\n\6"+
		"\r\6\16\6\u00ce\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00d8\n\6\r\6\16\6\u00d9"+
		"\3\6\3\6\3\6\3\6\5\6\u00e0\n\6\3\7\3\7\5\7\u00e4\n\7\3\b\3\b\5\b\u00e8"+
		"\n\b\3\t\3\t\3\t\3\t\5\t\u00ee\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00f8\n\n\f\n\16\n\u00fb\13\n\3\n\3\n\3\n\6\n\u0100\n\n\r\n\16\n\u0101"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u010d\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0116\n\13\5\13\u0118\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u012e\n\17\f\17\16\17\u0131\13\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u013c\n\17\f\17\16\17\u013f\13\17\3\17\3"+
		"\17\5\17\u0143\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u014a\n\20\f\20\16\20"+
		"\u014d\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0156\n\20\f\20\16"+
		"\20\u0159\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0162\n\20\f\20"+
		"\16\20\u0165\13\20\3\20\3\20\5\20\u0169\n\20\3\21\3\21\5\21\u016d\n\21"+
		"\3\21\3\21\5\21\u0171\n\21\3\21\3\21\5\21\u0175\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u017c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\6\23\u0187\n\23\r\23\16\23\u0188\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\6\23\u0197\n\23\r\23\16\23\u0198\3\23\3\23\3\23"+
		"\5\23\u019e\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u01a5\n\24\f\24\16\24\u01a8"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01b1\n\24\f\24\16\24\u01b4"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01bf\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u01d1\n\25\f\25\16\25\u01d4\13\25\3\25\3\25\3\25\5\25\u01d9"+
		"\n\25\3\26\3\26\3\26\5\26\u01de\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01ec\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0200\n \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\3\b(\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\17\4\2\n\13\26\26\3"+
		"\2AB\4\2CEHH\4\2GGIK\3\2\b\13\3\2\r\22\3\2\23\24\3\2+-\3\2./\3\2\64\65"+
		"\3\2:;\3\2ef\3\2NP\u0231\2O\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b\u00b4\3\2"+
		"\2\2\n\u00df\3\2\2\2\f\u00e3\3\2\2\2\16\u00e7\3\2\2\2\20\u00ed\3\2\2\2"+
		"\22\u00ef\3\2\2\2\24\u0117\3\2\2\2\26\u0119\3\2\2\2\30\u011e\3\2\2\2\32"+
		"\u0123\3\2\2\2\34\u0142\3\2\2\2\36\u0168\3\2\2\2 \u016c\3\2\2\2\"\u0176"+
		"\3\2\2\2$\u019d\3\2\2\2&\u01be\3\2\2\2(\u01d8\3\2\2\2*\u01dd\3\2\2\2,"+
		"\u01df\3\2\2\2.\u01e1\3\2\2\2\60\u01eb\3\2\2\2\62\u01ed\3\2\2\2\64\u01ef"+
		"\3\2\2\2\66\u01f1\3\2\2\28\u01f3\3\2\2\2:\u01f5\3\2\2\2<\u01f7\3\2\2\2"+
		">\u01ff\3\2\2\2@\u0201\3\2\2\2B\u0203\3\2\2\2D\u0205\3\2\2\2F\u0207\3"+
		"\2\2\2H\u0209\3\2\2\2J\u020b\3\2\2\2L\u020d\3\2\2\2NP\5\4\3\2ON\3\2\2"+
		"\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\2\2\3T\3\3\2\2\2UY\5\20"+
		"\t\2VY\5\6\4\2WY\5*\26\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\5\3\2\2\2Z[\5"+
		",\27\2[\\\7\6\2\2\\]\5\b\5\2]\7\3\2\2\2^_\b\5\1\2_`\t\2\2\2`\u00b5\5\b"+
		"\5\30ab\7\36\2\2bc\5\b\5\2cd\7\37\2\2d\u00b5\3\2\2\2ef\7@\2\2fg\7\36\2"+
		"\2gh\5,\27\2hi\7$\2\2ij\5F$\2jk\7\37\2\2k\u00b5\3\2\2\2lm\t\3\2\2mn\7"+
		"\36\2\2no\5,\27\2op\7\37\2\2p\u00b5\3\2\2\2qr\t\4\2\2rs\7\36\2\2st\5,"+
		"\27\2tu\7\37\2\2u\u00b5\3\2\2\2vw\t\5\2\2wx\7\36\2\2xy\5,\27\2yz\7$\2"+
		"\2z{\5F$\2{|\7\37\2\2|\u00b5\3\2\2\2}~\7F\2\2~\177\7\36\2\2\177\u0080"+
		"\5F$\2\u0080\u0081\7$\2\2\u0081\u0082\5,\27\2\u0082\u0083\7\37\2\2\u0083"+
		"\u00b5\3\2\2\2\u0084\u0086\5,\27\2\u0085\u0087\7\26\2\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\33\2\2\u0089"+
		"\u008a\7\36\2\2\u008a\u008f\5> \2\u008b\u008c\7$\2\2\u008c\u008e\5> \2"+
		"\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\37\2\2"+
		"\u0093\u00b5\3\2\2\2\u0094\u0096\7\26\2\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7\27\2\2\u009b\u009c\7\36\2\2\u009c\u009d\5"+
		"\b\5\2\u009d\u009e\7\37\2\2\u009e\u00b5\3\2\2\2\u009f\u00a0\7L\2\2\u00a0"+
		"\u00a1\7\36\2\2\u00a1\u00a4\5\b\5\2\u00a2\u00a3\7$\2\2\u00a3\u00a5\5F"+
		"$\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a7\7$\2\2\u00a7\u00a9\5F$\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00b5\3\2\2\2\u00ac"+
		"\u00b5\5\n\6\2\u00ad\u00b5\5\34\17\2\u00ae\u00b5\5&\24\2\u00af\u00b5\5"+
		"\30\r\2\u00b0\u00b5\5\32\16\2\u00b1\u00b5\5.\30\2\u00b2\u00b5\5,\27\2"+
		"\u00b3\u00b5\5> \2\u00b4^\3\2\2\2\u00b4a\3\2\2\2\u00b4e\3\2\2\2\u00b4"+
		"l\3\2\2\2\u00b4q\3\2\2\2\u00b4v\3\2\2\2\u00b4}\3\2\2\2\u00b4\u0084\3\2"+
		"\2\2\u00b4\u0097\3\2\2\2\u00b4\u009f\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00c4\3\2\2\2\u00b6\u00b7\f\26\2\2\u00b7\u00b8\t\6\2\2\u00b8\u00c3\5"+
		"\b\5\27\u00b9\u00ba\f\20\2\2\u00ba\u00bb\t\7\2\2\u00bb\u00c3\5\b\5\21"+
		"\u00bc\u00bd\f\r\2\2\u00bd\u00be\t\b\2\2\u00be\u00c3\5\b\5\16\u00bf\u00c0"+
		"\f\f\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c3\5\b\5\r\u00c2\u00b6\3\2\2\2\u00c2"+
		"\u00b9\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\t\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\u00c9\7\36\2\2\u00c9\u00cc\5,\27\2\u00ca"+
		"\u00cb\7$\2\2\u00cb\u00cd\5,\27\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\7\37\2\2\u00d1\u00e0\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3\u00d4\7\36"+
		"\2\2\u00d4\u00d7\5,\27\2\u00d5\u00d6\7$\2\2\u00d6\u00d8\5,\27\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\f\7\2\u00dc\u00dd\5\16\b\2\u00dd"+
		"\u00de\7\37\2\2\u00de\u00e0\3\2\2\2\u00df\u00c7\3\2\2\2\u00df\u00d2\3"+
		"\2\2\2\u00e0\13\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2\u00e4\t\t\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\r\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6"+
		"\u00e8\t\n\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\17\3\2\2"+
		"\2\u00e9\u00ee\5\22\n\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00ee"+
		"\5,\27\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\21\3\2\2\2\u00ef"+
		"\u00f0\7Q\2\2\u00f0\u00f1\7V\2\2\u00f1\u00f2\7W\2\2\u00f2\u00f3\5,\27"+
		"\2\u00f3\u00f4\7\36\2\2\u00f4\u00f9\5,\27\2\u00f5\u00f6\7$\2\2\u00f6\u00f8"+
		"\5,\27\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\37"+
		"\2\2\u00fd\u00ff\7 \2\2\u00fe\u0100\5\24\13\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0104\7!\2\2\u0104\23\3\2\2\2\u0105\u0106\5,\27\2\u0106\u0107"+
		"\7%\2\2\u0107\u0108\7\31\2\2\u0108\u0109\5B\"\2\u0109\u010a\7\32\2\2\u010a"+
		"\u010c\5\b\5\2\u010b\u010d\5\26\f\2\u010c\u010b\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\u0118\3\2\2\2\u010e\u010f\5,\27\2\u010f\u0110\7%\2\2\u0110"+
		"\u0111\7\31\2\2\u0111\u0112\5\b\5\2\u0112\u0113\7\32\2\2\u0113\u0115\5"+
		"\b\5\2\u0114\u0116\5\26\f\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0105\3\2\2\2\u0117\u010e\3\2\2\2\u0118\25\3\2\2"+
		"\2\u0119\u011a\7\35\2\2\u011a\u011b\7\36\2\2\u011b\u011c\5> \2\u011c\u011d"+
		"\7\37\2\2\u011d\27\3\2\2\2\u011e\u011f\7(\2\2\u011f\u0120\7\36\2\2\u0120"+
		"\u0121\5J&\2\u0121\u0122\7\37\2\2\u0122\31\3\2\2\2\u0123\u0124\7)\2\2"+
		"\u0124\u0125\7\36\2\2\u0125\u0126\5J&\2\u0126\u0127\7\37\2\2\u0127\33"+
		"\3\2\2\2\u0128\u0129\5,\27\2\u0129\u012a\7\"\2\2\u012a\u012f\5\36\20\2"+
		"\u012b\u012c\7$\2\2\u012c\u012e\5\36\20\2\u012d\u012b\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7#\2\2\u0133\u0143\3\2\2\2\u0134\u0135\7\""+
		"\2\2\u0135\u0136\5$\23\2\u0136\u0137\7#\2\2\u0137\u0138\7 \2\2\u0138\u013d"+
		"\5\36\20\2\u0139\u013a\7$\2\2\u013a\u013c\5\36\20\2\u013b\u0139\3\2\2"+
		"\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7!\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0128\3\2\2\2\u0142\u0134\3\2\2\2\u0143\35\3\2\2\2\u0144\u0145\t\13\2"+
		"\2\u0145\u0146\7\36\2\2\u0146\u014b\5 \21\2\u0147\u0148\7$\2\2\u0148\u014a"+
		"\5 \21\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\37"+
		"\2\2\u014f\u0169\3\2\2\2\u0150\u0151\7\66\2\2\u0151\u0152\7\36\2\2\u0152"+
		"\u0157\5\b\5\2\u0153\u0154\7$\2\2\u0154\u0156\5\b\5\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\37\2\2\u015b\u0169\3"+
		"\2\2\2\u015c\u015d\7\67\2\2\u015d\u015e\7\36\2\2\u015e\u0163\5\"\22\2"+
		"\u015f\u0160\7$\2\2\u0160\u0162\5\"\22\2\u0161\u015f\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7\37\2\2\u0167\u0169\3\2\2\2\u0168\u0144\3"+
		"\2\2\2\u0168\u0150\3\2\2\2\u0168\u015c\3\2\2\2\u0169\37\3\2\2\2\u016a"+
		"\u016d\5,\27\2\u016b\u016d\5.\30\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2"+
		"\2\2\u016d\u0170\3\2\2\2\u016e\u016f\7\34\2\2\u016f\u0171\5J&\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0173\7M"+
		"\2\2\u0173\u0175\5L\'\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"!\3\2\2\2\u0176\u0177\5\b\5\2\u0177\u0178\7\34\2\2\u0178\u017b\5J&\2\u0179"+
		"\u017a\7M\2\2\u017a\u017c\5L\'\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2"+
		"\2\u017c#\3\2\2\2\u017d\u017e\7\61\2\2\u017e\u017f\5,\27\2\u017f\u0180"+
		"\7\34\2\2\u0180\u0186\5J&\2\u0181\u0182\7$\2\2\u0182\u0183\5,\27\2\u0183"+
		"\u0184\7\34\2\2\u0184\u0185\5J&\2\u0185\u0187\3\2\2\2\u0186\u0181\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\7\63\2\2\u018b\u018c\5\b\5\2\u018c\u019e\3"+
		"\2\2\2\u018d\u018e\7\62\2\2\u018e\u018f\5,\27\2\u018f\u0190\7\34\2\2\u0190"+
		"\u0196\5J&\2\u0191\u0192\7$\2\2\u0192\u0193\5,\27\2\u0193\u0194\7\34\2"+
		"\2\u0194\u0195\5J&\2\u0195\u0197\3\2\2\2\u0196\u0191\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\7\63\2\2\u019b\u019c\5\b\5\2\u019c\u019e\3\2\2\2\u019d\u017d\3"+
		"\2\2\2\u019d\u018d\3\2\2\2\u019e%\3\2\2\2\u019f\u01a0\78\2\2\u01a0\u01a1"+
		"\7\36\2\2\u01a1\u01a6\5,\27\2\u01a2\u01a3\7$\2\2\u01a3\u01a5\5,\27\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\37\2\2\u01aa"+
		"\u01bf\3\2\2\2\u01ab\u01ac\79\2\2\u01ac\u01ad\7\36\2\2\u01ad\u01b2\5,"+
		"\27\2\u01ae\u01af\7$\2\2\u01af\u01b1\5,\27\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\37\2\2\u01b6\u01bf\3\2\2\2\u01b7"+
		"\u01b8\t\f\2\2\u01b8\u01b9\7\36\2\2\u01b9\u01ba\5,\27\2\u01ba\u01bb\7"+
		"$\2\2\u01bb\u01bc\5,\27\2\u01bc\u01bd\7\37\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u019f\3\2\2\2\u01be\u01ab\3\2\2\2\u01be\u01b7\3\2\2\2\u01bf\'\3\2\2\2"+
		"\u01c0\u01c1\7<\2\2\u01c1\u01c2\7\36\2\2\u01c2\u01c3\5,\27\2\u01c3\u01c4"+
		"\7$\2\2\u01c4\u01c5\5\b\5\2\u01c5\u01c6\7\37\2\2\u01c6\u01d9\3\2\2\2\u01c7"+
		"\u01c8\7=\2\2\u01c8\u01c9\5\b\5\2\u01c9\u01ca\7\32\2\2\u01ca\u01d2\5\b"+
		"\5\2\u01cb\u01cc\7>\2\2\u01cc\u01cd\5\b\5\2\u01cd\u01ce\7\32\2\2\u01ce"+
		"\u01cf\5\b\5\2\u01cf\u01d1\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d1\u01d4\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\u01d6\7?\2\2\u01d6\u01d7\5\b\5\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01c0\3\2\2\2\u01d8\u01c7\3\2\2\2\u01d9)\3\2\2\2\u01da\u01db"+
		"\7\4\2\2\u01db\u01de\5,\27\2\u01dc\u01de\7\5\2\2\u01dd\u01da\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de+\3\2\2\2\u01df\u01e0\t\r\2\2\u01e0-\3\2\2\2\u01e1"+
		"\u01e2\5,\27\2\u01e2\u01e3\7\7\2\2\u01e3\u01e4\5,\27\2\u01e4/\3\2\2\2"+
		"\u01e5\u01ec\5\62\32\2\u01e6\u01ec\5\64\33\2\u01e7\u01ec\5\66\34\2\u01e8"+
		"\u01ec\58\35\2\u01e9\u01ec\5:\36\2\u01ea\u01ec\5<\37\2\u01eb\u01e5\3\2"+
		"\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\61\3\2\2\2\u01ed\u01ee\7Z\2\2"+
		"\u01ee\63\3\2\2\2\u01ef\u01f0\7^\2\2\u01f0\65\3\2\2\2\u01f1\u01f2\7_\2"+
		"\2\u01f2\67\3\2\2\2\u01f3\u01f4\7\\\2\2\u01f49\3\2\2\2\u01f5\u01f6\7]"+
		"\2\2\u01f6;\3\2\2\2\u01f7\u01f8\7[\2\2\u01f8=\3\2\2\2\u01f9\u0200\5@!"+
		"\2\u01fa\u0200\5B\"\2\u01fb\u0200\5D#\2\u01fc\u0200\5F$\2\u01fd\u0200"+
		"\5H%\2\u01fe\u0200\5J&\2\u01ff\u01f9\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff"+
		"\u01fb\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2"+
		"\2\2\u0200?\3\2\2\2\u0201\u0202\7Z\2\2\u0202A\3\2\2\2\u0203\u0204\7c\2"+
		"\2\u0204C\3\2\2\2\u0205\u0206\7`\2\2\u0206E\3\2\2\2\u0207\u0208\7a\2\2"+
		"\u0208G\3\2\2\2\u0209\u020a\7d\2\2\u020aI\3\2\2\2\u020b\u020c\7b\2\2\u020c"+
		"K\3\2\2\2\u020d\u020e\t\16\2\2\u020eM\3\2\2\2-QX\u0086\u008f\u0097\u00a4"+
		"\u00a8\u00b4\u00c2\u00c4\u00ce\u00d9\u00df\u00e3\u00e7\u00ed\u00f9\u0101"+
		"\u010c\u0115\u0117\u012f\u013d\u0142\u014b\u0157\u0163\u0168\u016c\u0170"+
		"\u0174\u017b\u0188\u0198\u019d\u01a6\u01b2\u01be\u01d2\u01d8\u01dd\u01eb"+
		"\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}