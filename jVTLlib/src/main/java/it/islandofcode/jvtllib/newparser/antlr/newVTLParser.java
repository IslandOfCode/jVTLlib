// Generated from newVTL.g4 by ANTLR 4.6
package it.islandofcode.jvtllib.newparser.antlr;
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
		SCOL=36, AT=37, DIESIS=38, RESTRICT=39, GET=40, PUT=41, REGEXP=42, CHECK=43, 
		VALID=44, NVALID=45, ALL=46, CONDITION=47, MEASURES=48, JOIN=49, INNER=50, 
		LEFT=51, ON=52, KEEP=53, RENAME=54, FILTER=55, CALC=56, DROP=57, UNION=58, 
		INTERSECT=59, SYMDIFF=60, SETDIFF=61, NVL=62, IF=63, ELSEIF=64, ELSE=65, 
		INPUT=66, OUTPUT=67, ROUND=68, CEIL=69, FLOOR=70, ABS=71, EXP=72, LOGN=73, 
		LOG=74, POW=75, SQRT=76, NROOT=77, MOD=78, TRUNC=79, MIN=80, MAX=81, SUM=82, 
		AVG=83, GROPUBY=84, SUBSTR=85, REPLACE=86, STARTWITH=87, ROLE=88, IDENTIFIER=89, 
		MEASURE=90, ATTRIBUTE=91, DEFINE=92, DEFVAR=93, DEFVALUEDOM=94, DEFDATSTRUCT=95, 
		DEFDATASET=96, DATAPOINT=97, RULESET=98, HIERARCHICAL=99, MAPPING=100, 
		PROCEDURE=101, CREATE=102, FUNCTION=103, CALL=104, RETURN=105, NULLTYPE=106, 
		STRINGTYPE=107, INTTYPE=108, FLOATTYPE=109, BOOLTYPE=110, DATETYPE=111, 
		DATASET=112, DATE_LITERAL=113, INTEGER_LITERAL=114, STRING_LITERAL=115, 
		BOOLEAN_LITERAL=116, FLOAT_LITERAL=117, REG_IDENTIFIER=118, ESCAPED_IDENTIFIER=119, 
		WS=120, COMMENT=121, LINE_COMMENT=122;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_assignment = 2, RULE_expr = 3, 
		RULE_checkfunction = 4, RULE_checkParamEnum = 5, RULE_checkParamOpt = 6, 
		RULE_define = 7, RULE_dpruleset = 8, RULE_singlerule = 9, RULE_errorCode = 10, 
		RULE_getFunction = 11, RULE_putFunction = 12, RULE_clausefun = 13, RULE_clausebody = 14, 
		RULE_clausebodyparam = 15, RULE_clausebodycalc = 16, RULE_joinblock = 17, 
		RULE_setfun = 18, RULE_condOperator = 19, RULE_aggregationFun = 20, RULE_namedProcDef = 21, 
		RULE_procVarInList = 22, RULE_singleVarIn = 23, RULE_callProc = 24, RULE_namedFunDef = 25, 
		RULE_callFun = 26, RULE_injection = 27, RULE_debug = 28, RULE_varname = 29, 
		RULE_varmember = 30, RULE_variable = 31, RULE_dataType = 32, RULE_scalartype = 33, 
		RULE_nulltype = 34, RULE_booleantype = 35, RULE_datetype = 36, RULE_integertype = 37, 
		RULE_floattype = 38, RULE_stringtype = 39, RULE_literal = 40, RULE_nullLiteral = 41, 
		RULE_booleanLiteral = 42, RULE_dateLiteral = 43, RULE_integerLiteral = 44, 
		RULE_floatLiteral = 45, RULE_stringLiteral = 46, RULE_componentRole = 47, 
		RULE_aggregationOp = 48;
	public static final String[] ruleNames = {
		"parse", "statement", "assignment", "expr", "checkfunction", "checkParamEnum", 
		"checkParamOpt", "define", "dpruleset", "singlerule", "errorCode", "getFunction", 
		"putFunction", "clausefun", "clausebody", "clausebodyparam", "clausebodycalc", 
		"joinblock", "setfun", "condOperator", "aggregationFun", "namedProcDef", 
		"procVarInList", "singleVarIn", "callProc", "namedFunDef", "callFun", 
		"injection", "debug", "varname", "varmember", "variable", "dataType", 
		"scalartype", "nulltype", "booleantype", "datetype", "integertype", "floattype", 
		"stringtype", "literal", "nullLiteral", "booleanLiteral", "dateLiteral", 
		"integerLiteral", "floatLiteral", "stringLiteral", "componentRole", "aggregationOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'variable'", "'printvar'", "'nop'", "':='", "'.'", "'*'", "'/'", 
		"'+'", "'-'", "'||'", "'='", "'<>'", "'<='", "'<'", "'>='", "'>'", "'and'", 
		"'or'", "'xor'", "'not'", "'isnull'", "'is not null'", "'when'", "'then'", 
		"'in'", "'as'", "'errorcode'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"','", "':'", "';'", "'@'", "'#'", "'restrict'", "'get'", "'put'", "'regexp'", 
		"'check'", "'valid'", "'not valid'", "'all'", "'condition'", "'measures'", 
		"'join'", "'inner'", "'left'", "'on'", "'keep'", "'rename'", "'filter'", 
		"'calc'", "'drop'", "'union'", "'intersect'", "'symdiff'", "'setdiff'", 
		"'nvl'", "'if'", "'elseif'", "'else'", "'input'", "'output'", "'round'", 
		"'ceil'", "'floor'", "'abs'", "'exp'", "'ln'", "'log'", "'power'", "'sqrt'", 
		"'nroot'", "'mod'", "'trunc'", "'min'", "'max'", "'sum'", "'avg'", "'group by'", 
		"'substr'", "'replace'", "'startwith'", "'role'", null, null, null, "'define'", 
		"'defineVariable'", "'defineValueDomain'", "'defineDataStructure'", "'defineDataSet'", 
		"'datapoint'", "'ruleset'", "'hierarchical'", "'mapping'", "'procedure'", 
		"'create'", "'function'", "'call'", "'returns'", "'null'", "'string'", 
		"'integer'", "'float'", "'boolean'", "'date'", "'dataset'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ASSIGN", "MEMBER", "MUL", "DIV", "PLUS", "MINUS", 
		"CONCAT", "EQ", "NE", "LE", "LT", "GE", "GT", "AND", "OR", "XOR", "NOT", 
		"ISNULL", "ISNOTNULL", "WHEN", "THEN", "IN", "AS", "ERRCODE", "LPAR", 
		"RPAR", "LBRA", "RBRA", "LSQR", "RSQR", "COMMA", "COLON", "SCOL", "AT", 
		"DIESIS", "RESTRICT", "GET", "PUT", "REGEXP", "CHECK", "VALID", "NVALID", 
		"ALL", "CONDITION", "MEASURES", "JOIN", "INNER", "LEFT", "ON", "KEEP", 
		"RENAME", "FILTER", "CALC", "DROP", "UNION", "INTERSECT", "SYMDIFF", "SETDIFF", 
		"NVL", "IF", "ELSEIF", "ELSE", "INPUT", "OUTPUT", "ROUND", "CEIL", "FLOOR", 
		"ABS", "EXP", "LOGN", "LOG", "POW", "SQRT", "NROOT", "MOD", "TRUNC", "MIN", 
		"MAX", "SUM", "AVG", "GROPUBY", "SUBSTR", "REPLACE", "STARTWITH", "ROLE", 
		"IDENTIFIER", "MEASURE", "ATTRIBUTE", "DEFINE", "DEFVAR", "DEFVALUEDOM", 
		"DEFDATSTRUCT", "DEFDATASET", "DATAPOINT", "RULESET", "HIERARCHICAL", 
		"MAPPING", "PROCEDURE", "CREATE", "FUNCTION", "CALL", "RETURN", "NULLTYPE", 
		"STRINGTYPE", "INTTYPE", "FLOATTYPE", "BOOLTYPE", "DATETYPE", "DATASET", 
		"DATE_LITERAL", "INTEGER_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
		"FLOAT_LITERAL", "REG_IDENTIFIER", "ESCAPED_IDENTIFIER", "WS", "COMMENT", 
		"LINE_COMMENT"
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
		public List<TerminalNode> SCOL() { return getTokens(newVTLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(newVTLParser.SCOL, i);
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
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				statement();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(99);
					match(SCOL);
					}
				}

				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << PUT))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (DEFINE - 92)) | (1L << (CREATE - 92)) | (1L << (CALL - 92)) | (1L << (REG_IDENTIFIER - 92)) | (1L << (ESCAPED_IDENTIFIER - 92)))) != 0) );
			setState(106);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefFunctionContext extends StatementContext {
		public NamedFunDefContext namedFunDef() {
			return getRuleContext(NamedFunDefContext.class,0);
		}
		public DefFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDefFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DebugstatementContext extends StatementContext {
		public DebugContext debug() {
			return getRuleContext(DebugContext.class,0);
		}
		public DebugstatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDebugstatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallProcStatContext extends StatementContext {
		public CallProcContext callProc() {
			return getRuleContext(CallProcContext.class,0);
		}
		public CallProcStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCallProcStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssingstatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssingstatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitAssingstatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinestatementContext extends StatementContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public DefinestatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDefinestatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutDataContext extends StatementContext {
		public PutFunctionContext putFunction() {
			return getRuleContext(PutFunctionContext.class,0);
		}
		public PutDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitPutData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUT:
				_localctx = new PutDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				putFunction();
				}
				break;
			case DEFINE:
				_localctx = new DefinestatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				define();
				}
				break;
			case CALL:
				_localctx = new CallProcStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				callProc();
				}
				break;
			case CREATE:
				_localctx = new DefFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				namedFunDef();
				}
				break;
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new AssingstatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				assignment();
				}
				break;
			case T__1:
			case T__2:
				_localctx = new DebugstatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
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
			setState(116);
			varname();
			setState(117);
			match(ASSIGN);
			setState(118);
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
	public static class AddMulExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(newVTLParser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(newVTLParser.MUL, 0); }
		public AddMulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitAddMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(newVTLParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(newVTLParser.DIV, 0); }
		public MinDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitMinDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggrFunExprContext extends ExprContext {
		public AggregationFunContext aggregationFun() {
			return getRuleContext(AggregationFunContext.class,0);
		}
		public AggrFunExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitAggrFunExpr(this);
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
	public static class DateExprContext extends ExprContext {
		public TerminalNode DIESIS() { return getToken(newVTLParser.DIESIS, 0); }
		public TerminalNode LBRA() { return getToken(newVTLParser.LBRA, 0); }
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(newVTLParser.RBRA, 0); }
		public DateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDateExpr(this);
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
	public static class CondOpExprContext extends ExprContext {
		public CondOperatorContext condOperator() {
			return getRuleContext(CondOperatorContext.class,0);
		}
		public CondOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCondOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFunReplaceContext extends ExprContext {
		public TerminalNode REPLACE() { return getToken(newVTLParser.REPLACE, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public StringFunReplaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStringFunReplace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringStartWithContext extends ExprContext {
		public TerminalNode STARTWITH() { return getToken(newVTLParser.STARTWITH, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public StringStartWithContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitStringStartWith(this);
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
	public static class InjectionExprContext extends ExprContext {
		public InjectionContext injection() {
			return getRuleContext(InjectionContext.class,0);
		}
		public InjectionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitInjectionExpr(this);
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
	public static class RegExprContext extends ExprContext {
		public TerminalNode REGEXP() { return getToken(newVTLParser.REGEXP, 0); }
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public RegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitRegExpr(this);
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
	public static class CallFunExprContext extends ExprContext {
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public CallFunExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCallFunExpr(this);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new DateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				match(DIESIS);
				setState(122);
				match(LBRA);
				setState(123);
				dateLiteral();
				setState(124);
				match(RBRA);
				}
				break;
			case 2:
				{
				_localctx = new UnaryexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
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
				setState(127);
				((UnaryexprContext)_localctx).right = expr(29);
				}
				break;
			case 3:
				{
				_localctx = new PrecedenceexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(LPAR);
				setState(129);
				expr(0);
				setState(130);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new CondOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				condOperator();
				}
				break;
			case 5:
				{
				_localctx = new RoundexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(ROUND);
				setState(134);
				match(LPAR);
				setState(135);
				varname();
				setState(136);
				match(COMMA);
				setState(137);
				integerLiteral();
				setState(138);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new CeilFloorexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
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
				setState(141);
				match(LPAR);
				setState(142);
				varname();
				setState(143);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new SingleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				((SingleparamMathfunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ABS - 71)) | (1L << (EXP - 71)) | (1L << (LOGN - 71)) | (1L << (SQRT - 71)))) != 0)) ) {
					((SingleparamMathfunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				match(LPAR);
				setState(147);
				varname();
				setState(148);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new DoubleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				((DoubleparamMathfunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (POW - 75)) | (1L << (NROOT - 75)) | (1L << (MOD - 75)) | (1L << (TRUNC - 75)))) != 0)) ) {
					((DoubleparamMathfunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				match(LPAR);
				setState(152);
				varname();
				setState(153);
				match(COMMA);
				setState(154);
				integerLiteral();
				setState(155);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new LogexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(LOG);
				setState(158);
				match(LPAR);
				setState(159);
				integerLiteral();
				setState(160);
				match(COMMA);
				setState(161);
				varname();
				setState(162);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new InCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				varname();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(165);
					match(NOT);
					}
				}

				setState(168);
				match(IN);
				setState(169);
				match(LPAR);
				setState(170);
				literal();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					literal();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new IsNullCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(180);
					match(NOT);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(ISNULL);
				setState(187);
				match(LPAR);
				setState(188);
				expr(0);
				setState(189);
				match(RPAR);
				}
				break;
			case 12:
				{
				_localctx = new RegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(REGEXP);
				setState(192);
				match(LPAR);
				setState(193);
				varname();
				setState(194);
				match(COMMA);
				setState(195);
				stringLiteral();
				setState(196);
				match(RPAR);
				}
				break;
			case 13:
				{
				_localctx = new StringFunSubstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(SUBSTR);
				setState(199);
				match(LPAR);
				setState(200);
				expr(0);
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(201);
					match(COMMA);
					setState(202);
					integerLiteral();
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(205);
					match(COMMA);
					setState(206);
					integerLiteral();
					}
				}

				setState(209);
				match(RPAR);
				}
				break;
			case 14:
				{
				_localctx = new StringFunReplaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(REPLACE);
				setState(212);
				match(LPAR);
				setState(213);
				varname();
				setState(214);
				match(COMMA);
				setState(215);
				stringLiteral();
				setState(216);
				match(COMMA);
				setState(217);
				stringLiteral();
				setState(218);
				match(RPAR);
				}
				break;
			case 15:
				{
				_localctx = new StringStartWithContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(STARTWITH);
				setState(221);
				match(LPAR);
				setState(222);
				varname();
				setState(223);
				match(COMMA);
				setState(224);
				stringLiteral();
				setState(225);
				match(RPAR);
				}
				break;
			case 16:
				{
				_localctx = new CheckExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				checkfunction();
				}
				break;
			case 17:
				{
				_localctx = new ClauseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				clausefun();
				}
				break;
			case 18:
				{
				_localctx = new AggrFunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				aggregationFun();
				}
				break;
			case 19:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				setfun();
				}
				break;
			case 20:
				{
				_localctx = new CallFunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				callFun();
				}
				break;
			case 21:
				{
				_localctx = new GetDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				getFunction();
				}
				break;
			case 22:
				{
				_localctx = new InjectionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				injection();
				}
				break;
			case 23:
				{
				_localctx = new MembershipexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				varmember();
				}
				break;
			case 24:
				{
				_localctx = new VarexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				varname();
				}
				break;
			case 25:
				{
				_localctx = new LiteralexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AddMulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(240);
						((AddMulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==PLUS) ) {
							((AddMulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new MinDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(243);
						((MinDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MINUS) ) {
							((MinDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new RelationalCondContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(246);
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
						setState(247);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new LogicalexprContext(new ExprContext(_parentctx, _parentState));
						((LogicalexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(249);
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
						setState(250);
						((LogicalexprContext)_localctx).right = expr(17);
						}
						break;
					case 5:
						{
						_localctx = new StringConcatContext(new ExprContext(_parentctx, _parentState));
						((StringConcatContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(252);
						match(CONCAT);
						setState(253);
						((StringConcatContext)_localctx).b = expr(15);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CheckFunBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(CHECK);
				setState(260);
				match(LPAR);
				setState(261);
				varname();
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262);
					match(COMMA);
					setState(263);
					varname();
					}
					}
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(268);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new CheckFunWithOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(CHECK);
				setState(271);
				match(LPAR);
				setState(272);
				varname();
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(273);
						match(COMMA);
						setState(274);
						varname();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(279);
				checkParamEnum();
				setState(280);
				checkParamOpt();
				setState(281);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(285);
				match(COMMA);
				setState(286);
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(289);
				match(COMMA);
				setState(290);
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
	public static class DefineProcedureContext extends DefineContext {
		public NamedProcDefContext namedProcDef() {
			return getRuleContext(NamedProcDefContext.class,0);
		}
		public DefineProcedureContext(DefineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDefineProcedure(this);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DatapointrulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				dpruleset();
				}
				break;
			case 2:
				_localctx = new DefinevariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(DEFINE);
				setState(295);
				match(T__0);
				setState(296);
				varname();
				}
				break;
			case 3:
				_localctx = new DefineProcedureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				namedProcDef();
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
			setState(300);
			match(DEFINE);
			setState(301);
			match(DATAPOINT);
			setState(302);
			match(RULESET);
			setState(303);
			varname();
			setState(304);
			match(LPAR);
			setState(305);
			varname();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				varname();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(RPAR);
			setState(314);
			match(LBRA);
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(315);
				singlerule();
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(320);
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
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new SingleruleConsequenceOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				varname();
				setState(323);
				match(COLON);
				setState(324);
				match(WHEN);
				setState(325);
				booleanLiteral();
				setState(326);
				match(THEN);
				setState(327);
				expr(0);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(328);
					errorCode();
					}
				}

				}
				break;
			case 2:
				_localctx = new SingleruleBothContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				varname();
				setState(332);
				match(COLON);
				setState(333);
				match(WHEN);
				setState(334);
				expr(0);
				setState(335);
				match(THEN);
				setState(336);
				expr(0);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(337);
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
			setState(342);
			match(ERRCODE);
			setState(343);
			match(LPAR);
			setState(344);
			literal();
			setState(345);
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
		public List<TerminalNode> LPAR() { return getTokens(newVTLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(newVTLParser.LPAR, i);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(newVTLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(newVTLParser.RPAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public TerminalNode KEEP() { return getToken(newVTLParser.KEEP, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(GET);
			setState(348);
			match(LPAR);
			setState(349);
			stringLiteral();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(350);
				match(COMMA);
				setState(351);
				match(KEEP);
				setState(352);
				match(LPAR);
				setState(353);
				varname();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354);
					match(COMMA);
					setState(355);
					varname();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(RPAR);
				}
			}

			setState(365);
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
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
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
			setState(367);
			match(PUT);
			setState(368);
			match(LPAR);
			setState(369);
			stringLiteral();
			setState(370);
			match(COMMA);
			setState(371);
			varname();
			setState(372);
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
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new ClausebaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				varname();
				setState(375);
				match(LSQR);
				setState(376);
				clausebody();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(377);
					match(COMMA);
					setState(378);
					clausebody();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
				match(RSQR);
				}
				break;
			case LSQR:
				_localctx = new ClausejoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(LSQR);
				setState(387);
				joinblock();
				setState(388);
				match(RSQR);
				setState(389);
				match(LBRA);
				setState(390);
				clausebody();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(391);
					match(COMMA);
					setState(392);
					clausebody();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
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
	public static class ClausedropContext extends ClausebodyContext {
		public TerminalNode DROP() { return getToken(newVTLParser.DROP, 0); }
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
		public ClausedropContext(ClausebodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitClausedrop(this);
			else return visitor.visitChildren(this);
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
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEEP:
			case RENAME:
				_localctx = new ClauseKeepRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
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
				setState(403);
				match(LPAR);
				setState(404);
				clausebodyparam();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
					clausebodyparam();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(RPAR);
				}
				break;
			case FILTER:
				_localctx = new ClauseFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(FILTER);
				setState(415);
				match(LPAR);
				setState(416);
				expr(0);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					expr(0);
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(424);
				match(RPAR);
				}
				break;
			case CALC:
				_localctx = new ClausecalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(CALC);
				setState(427);
				match(LPAR);
				setState(428);
				clausebodycalc();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(429);
					match(COMMA);
					setState(430);
					clausebodycalc();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				match(RPAR);
				}
				break;
			case DROP:
				_localctx = new ClausedropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(DROP);
				setState(439);
				match(LPAR);
				setState(440);
				varname();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(441);
					match(COMMA);
					setState(442);
					varname();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(452);
				varname();
				}
				break;
			case 2:
				{
				setState(453);
				varmember();
				}
				break;
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(456);
				match(AS);
				setState(457);
				stringLiteral();
				}
			}

			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(460);
				match(ROLE);
				setState(461);
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
			setState(464);
			expr(0);
			setState(465);
			match(AS);
			setState(466);
			stringLiteral();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(467);
				match(ROLE);
				setState(468);
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
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				_localctx = new JoinblockInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(INNER);
				setState(472);
				varname();
				setState(473);
				match(AS);
				setState(474);
				stringLiteral();
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(475);
					match(COMMA);
					setState(476);
					varname();
					setState(477);
					match(AS);
					setState(478);
					stringLiteral();
					}
					}
					setState(482); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(484);
				match(ON);
				setState(485);
				expr(0);
				}
				break;
			case LEFT:
				_localctx = new JoinblockLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(LEFT);
				setState(488);
				varname();
				setState(489);
				match(AS);
				setState(490);
				stringLiteral();
				setState(496); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(491);
					match(COMMA);
					setState(492);
					varname();
					setState(493);
					match(AS);
					setState(494);
					stringLiteral();
					}
					}
					setState(498); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(500);
				match(ON);
				setState(501);
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
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				_localctx = new SetUnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(UNION);
				setState(506);
				match(LPAR);
				setState(507);
				varname();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(508);
					match(COMMA);
					setState(509);
					varname();
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				match(RPAR);
				}
				break;
			case INTERSECT:
				_localctx = new SetIntersectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(INTERSECT);
				setState(518);
				match(LPAR);
				setState(519);
				varname();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(520);
					match(COMMA);
					setState(521);
					varname();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				match(RPAR);
				}
				break;
			case SYMDIFF:
			case SETDIFF:
				_localctx = new SetSetSymDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
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
				setState(530);
				match(LPAR);
				setState(531);
				varname();
				setState(532);
				match(COMMA);
				setState(533);
				varname();
				setState(534);
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
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NVL:
				_localctx = new NvlCondOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(NVL);
				setState(539);
				match(LPAR);
				setState(540);
				varname();
				setState(541);
				match(COMMA);
				setState(542);
				expr(0);
				setState(543);
				match(RPAR);
				}
				break;
			case IF:
				_localctx = new IfThenElseCondOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(IF);
				setState(546);
				expr(0);
				setState(547);
				match(THEN);
				setState(548);
				expr(0);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(549);
					match(ELSEIF);
					setState(550);
					expr(0);
					setState(551);
					match(THEN);
					setState(552);
					expr(0);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(ELSE);
				setState(560);
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

	public static class AggregationFunContext extends ParserRuleContext {
		public AggregationOpContext aggregationOp() {
			return getRuleContext(AggregationOpContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(newVTLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(newVTLParser.LPAR, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(newVTLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(newVTLParser.RPAR, i);
		}
		public TerminalNode GROPUBY() { return getToken(newVTLParser.GROPUBY, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AggregationFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitAggregationFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunContext aggregationFun() throws RecognitionException {
		AggregationFunContext _localctx = new AggregationFunContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_aggregationFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			aggregationOp();
			setState(565);
			match(LPAR);
			setState(566);
			variable();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(567);
				match(COMMA);
				setState(568);
				stringLiteral();
				}
			}

			setState(571);
			match(RPAR);
			setState(572);
			match(GROPUBY);
			setState(573);
			match(LPAR);
			setState(574);
			varname();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(575);
				match(COMMA);
				setState(576);
				varname();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
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

	public static class NamedProcDefContext extends ParserRuleContext {
		public Token datatype;
		public TerminalNode DEFINE() { return getToken(newVTLParser.DEFINE, 0); }
		public TerminalNode PROCEDURE() { return getToken(newVTLParser.PROCEDURE, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public ProcVarInListContext procVarInList() {
			return getRuleContext(ProcVarInListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode LBRA() { return getToken(newVTLParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(newVTLParser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(newVTLParser.COMMA, 0); }
		public TerminalNode OUTPUT() { return getToken(newVTLParser.OUTPUT, 0); }
		public TerminalNode AS() { return getToken(newVTLParser.AS, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode DATASET() { return getToken(newVTLParser.DATASET, 0); }
		public TerminalNode STRINGTYPE() { return getToken(newVTLParser.STRINGTYPE, 0); }
		public NamedProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedProcDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitNamedProcDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedProcDefContext namedProcDef() throws RecognitionException {
		NamedProcDefContext _localctx = new NamedProcDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_namedProcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(DEFINE);
			setState(585);
			match(PROCEDURE);
			setState(586);
			varname();
			setState(587);
			match(LPAR);
			setState(588);
			procVarInList();
			{
			setState(589);
			match(COMMA);
			setState(590);
			match(OUTPUT);
			setState(591);
			varname();
			setState(592);
			match(AS);
			setState(593);
			((NamedProcDefContext)_localctx).datatype = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRINGTYPE || _la==DATASET) ) {
				((NamedProcDefContext)_localctx).datatype = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(595);
			match(RPAR);
			setState(596);
			match(LBRA);
			setState(598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(597);
				assignment();
				}
				}
				setState(600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(602);
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

	public static class ProcVarInListContext extends ParserRuleContext {
		public List<SingleVarInContext> singleVarIn() {
			return getRuleContexts(SingleVarInContext.class);
		}
		public SingleVarInContext singleVarIn(int i) {
			return getRuleContext(SingleVarInContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public ProcVarInListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procVarInList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitProcVarInList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcVarInListContext procVarInList() throws RecognitionException {
		ProcVarInListContext _localctx = new ProcVarInListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_procVarInList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			singleVarIn();
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(COMMA);
					setState(606);
					singleVarIn();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class SingleVarInContext extends ParserRuleContext {
		public Token datatype;
		public TerminalNode INPUT() { return getToken(newVTLParser.INPUT, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode AS() { return getToken(newVTLParser.AS, 0); }
		public TerminalNode DATASET() { return getToken(newVTLParser.DATASET, 0); }
		public TerminalNode STRINGTYPE() { return getToken(newVTLParser.STRINGTYPE, 0); }
		public SingleVarInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarIn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitSingleVarIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarInContext singleVarIn() throws RecognitionException {
		SingleVarInContext _localctx = new SingleVarInContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_singleVarIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(612);
			match(INPUT);
			setState(613);
			varname();
			setState(614);
			match(AS);
			setState(615);
			((SingleVarInContext)_localctx).datatype = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRINGTYPE || _la==DATASET) ) {
				((SingleVarInContext)_localctx).datatype = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CallProcContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(newVTLParser.CALL, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public CallProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callProc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCallProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallProcContext callProc() throws RecognitionException {
		CallProcContext _localctx = new CallProcContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(CALL);
			setState(618);
			varname();
			setState(619);
			match(LPAR);
			setState(620);
			varname();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(621);
				match(COMMA);
				setState(622);
				varname();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
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

	public static class NamedFunDefContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(newVTLParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(newVTLParser.FUNCTION, 0); }
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public TerminalNode LBRA() { return getToken(newVTLParser.LBRA, 0); }
		public TerminalNode RETURN() { return getToken(newVTLParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(newVTLParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(newVTLParser.RBRA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public NamedFunDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitNamedFunDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunDefContext namedFunDef() throws RecognitionException {
		NamedFunDefContext _localctx = new NamedFunDefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_namedFunDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(CREATE);
			setState(631);
			match(FUNCTION);
			setState(632);
			varname();
			setState(633);
			match(LPAR);
			setState(634);
			varname();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(635);
				match(COMMA);
				setState(636);
				varname();
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(642);
			match(RPAR);
			setState(643);
			match(LBRA);
			setState(644);
			match(RETURN);
			setState(645);
			expr(0);
			setState(646);
			match(AS);
			setState(647);
			dataType();
			setState(648);
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

	public static class CallFunContext extends ParserRuleContext {
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(newVTLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(newVTLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(newVTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(newVTLParser.COMMA, i);
		}
		public CallFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitCallFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunContext callFun() throws RecognitionException {
		CallFunContext _localctx = new CallFunContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			varname();
			setState(651);
			match(LPAR);
			setState(652);
			varname();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				varname();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
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

	public static class InjectionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(newVTLParser.AT, 0); }
		public TerminalNode LBRA() { return getToken(newVTLParser.LBRA, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(newVTLParser.RBRA, 0); }
		public InjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitInjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectionContext injection() throws RecognitionException {
		InjectionContext _localctx = new InjectionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_injection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(AT);
			setState(663);
			match(LBRA);
			setState(664);
			varname();
			setState(665);
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
		enterRule(_localctx, 56, RULE_debug);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new DBGprintvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(T__1);
				setState(668);
				varname();
				}
				break;
			case T__2:
				_localctx = new DBGnopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
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
		enterRule(_localctx, 58, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		enterRule(_localctx, 60, RULE_varmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			((VarmemberContext)_localctx).left = varname();
			setState(675);
			((VarmemberContext)_localctx).op = match(MEMBER);
			setState(676);
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

	public static class VariableContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public VarmemberContext varmember() {
			return getRuleContext(VarmemberContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable);
		try {
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				varname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				varmember();
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

	public static class DataTypeContext extends ParserRuleContext {
		public ScalartypeContext scalartype() {
			return getRuleContext(ScalartypeContext.class,0);
		}
		public TerminalNode DATASET() { return getToken(newVTLParser.DATASET, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dataType);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
			case STRINGTYPE:
			case INTTYPE:
			case FLOATTYPE:
			case BOOLTYPE:
			case DATETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				scalartype();
				}
				break;
			case DATASET:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(DATASET);
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
		enterRule(_localctx, 66, RULE_scalartype);
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				nulltype();
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				booleantype();
				}
				break;
			case DATETYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				datetype();
				}
				break;
			case INTTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				integertype();
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(690);
				floattype();
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(691);
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
		enterRule(_localctx, 68, RULE_nulltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
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
		enterRule(_localctx, 70, RULE_booleantype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
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
		enterRule(_localctx, 72, RULE_datetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
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
		enterRule(_localctx, 74, RULE_integertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		enterRule(_localctx, 76, RULE_floattype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
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
		enterRule(_localctx, 78, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
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
		enterRule(_localctx, 80, RULE_literal);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				nullLiteral();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				booleanLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(709);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(710);
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
		enterRule(_localctx, 82, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
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
		enterRule(_localctx, 84, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
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
		enterRule(_localctx, 86, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		enterRule(_localctx, 88, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		enterRule(_localctx, 90, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		enterRule(_localctx, 92, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		enterRule(_localctx, 94, RULE_componentRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			((ComponentRoleContext)_localctx).role = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IDENTIFIER - 89)) | (1L << (MEASURE - 89)) | (1L << (ATTRIBUTE - 89)))) != 0)) ) {
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

	public static class AggregationOpContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(newVTLParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(newVTLParser.MAX, 0); }
		public TerminalNode SUM() { return getToken(newVTLParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(newVTLParser.AVG, 0); }
		public AggregationOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof newVTLVisitor ) return ((newVTLVisitor<? extends T>)visitor).visitAggregationOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationOpContext aggregationOp() throws RecognitionException {
		AggregationOpContext _localctx = new AggregationOpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_aggregationOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (MIN - 80)) | (1L << (MAX - 80)) | (1L << (SUM - 80)) | (1L << (AVG - 80)))) != 0)) ) {
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
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3|\u02dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\5\2g\n\2"+
		"\6\2i\n\2\r\2\16\2j\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3u\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a9\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u00b0\n\5\f\5\16\5\u00b3\13\5\3\5\3\5\3\5\7\5\u00b8"+
		"\n\5\f\5\16\5\u00bb\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ce\n\5\3\5\3\5\5\5\u00d2\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f0\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0101\n\5\f\5\16\5\u0104\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\6\6\u010b\n\6\r\6\16\6\u010c\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\6\6\u0116\n\6\r\6\16\6\u0117\3\6\3\6\3\6\3\6\5\6\u011e\n\6\3\7"+
		"\3\7\5\7\u0122\n\7\3\b\3\b\5\b\u0126\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u012d"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0137\n\n\f\n\16\n\u013a\13\n"+
		"\3\n\3\n\3\n\6\n\u013f\n\n\r\n\16\n\u0140\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u014c\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0155\n\13\5\13\u0157\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0167\n\r\f\r\16\r\u016a\13\r\3\r\3\r\5\r\u016e\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u017e\n\17\f\17\16\17\u0181\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u018c\n\17\f\17\16\17\u018f\13\17\3\17\3\17\5\17\u0193"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u019a\n\20\f\20\16\20\u019d\13\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01a6\n\20\f\20\16\20\u01a9\13"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01b2\n\20\f\20\16\20\u01b5"+
		"\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01be\n\20\f\20\16\20\u01c1"+
		"\13\20\3\20\3\20\5\20\u01c5\n\20\3\21\3\21\5\21\u01c9\n\21\3\21\3\21\5"+
		"\21\u01cd\n\21\3\21\3\21\5\21\u01d1\n\21\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01d8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u01e3\n"+
		"\23\r\23\16\23\u01e4\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\6\23\u01f3\n\23\r\23\16\23\u01f4\3\23\3\23\3\23\5\23\u01fa"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u0201\n\24\f\24\16\24\u0204\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u020d\n\24\f\24\16\24\u0210\13"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u021b\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u022d\n\25\f\25\16\25\u0230\13\25\3\25\3\25\3\25\5\25\u0235"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u023c\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0244\n\26\f\26\16\26\u0247\13\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0259\n\27"+
		"\r\27\16\27\u025a\3\27\3\27\3\30\3\30\3\30\7\30\u0262\n\30\f\30\16\30"+
		"\u0265\13\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7"+
		"\32\u0272\n\32\f\32\16\32\u0275\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\7\33\u0280\n\33\f\33\16\33\u0283\13\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u0292\n\34\f\34"+
		"\16\34\u0295\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\5"+
		"\36\u02a1\n\36\3\37\3\37\3 \3 \3 \3 \3!\3!\5!\u02ab\n!\3\"\3\"\5\"\u02af"+
		"\n\"\3#\3#\3#\3#\3#\3#\5#\u02b7\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3*\3*\3*\5*\u02ca\n*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\2\3\b\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\22\4\2\n\13\26\26\3"+
		"\2GH\4\2IKNN\4\2MMOQ\4\2\b\b\n\n\4\2\t\t\13\13\3\2\r\22\3\2\23\24\3\2"+
		".\60\3\2\61\62\3\2\678\3\2>?\4\2mmrr\3\2xy\3\2[]\3\2RU\u030b\2h\3\2\2"+
		"\2\4t\3\2\2\2\6v\3\2\2\2\b\u00ef\3\2\2\2\n\u011d\3\2\2\2\f\u0121\3\2\2"+
		"\2\16\u0125\3\2\2\2\20\u012c\3\2\2\2\22\u012e\3\2\2\2\24\u0156\3\2\2\2"+
		"\26\u0158\3\2\2\2\30\u015d\3\2\2\2\32\u0171\3\2\2\2\34\u0192\3\2\2\2\36"+
		"\u01c4\3\2\2\2 \u01c8\3\2\2\2\"\u01d2\3\2\2\2$\u01f9\3\2\2\2&\u021a\3"+
		"\2\2\2(\u0234\3\2\2\2*\u0236\3\2\2\2,\u024a\3\2\2\2.\u025e\3\2\2\2\60"+
		"\u0266\3\2\2\2\62\u026b\3\2\2\2\64\u0278\3\2\2\2\66\u028c\3\2\2\28\u0298"+
		"\3\2\2\2:\u02a0\3\2\2\2<\u02a2\3\2\2\2>\u02a4\3\2\2\2@\u02aa\3\2\2\2B"+
		"\u02ae\3\2\2\2D\u02b6\3\2\2\2F\u02b8\3\2\2\2H\u02ba\3\2\2\2J\u02bc\3\2"+
		"\2\2L\u02be\3\2\2\2N\u02c0\3\2\2\2P\u02c2\3\2\2\2R\u02c9\3\2\2\2T\u02cb"+
		"\3\2\2\2V\u02cd\3\2\2\2X\u02cf\3\2\2\2Z\u02d1\3\2\2\2\\\u02d3\3\2\2\2"+
		"^\u02d5\3\2\2\2`\u02d7\3\2\2\2b\u02d9\3\2\2\2df\5\4\3\2eg\7&\2\2fe\3\2"+
		"\2\2fg\3\2\2\2gi\3\2\2\2hd\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2"+
		"\2\2lm\7\2\2\3m\3\3\2\2\2nu\5\32\16\2ou\5\20\t\2pu\5\62\32\2qu\5\64\33"+
		"\2ru\5\6\4\2su\5:\36\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2"+
		"\2ts\3\2\2\2u\5\3\2\2\2vw\5<\37\2wx\7\6\2\2xy\5\b\5\2y\7\3\2\2\2z{\b\5"+
		"\1\2{|\7(\2\2|}\7 \2\2}~\5X-\2~\177\7!\2\2\177\u00f0\3\2\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\u00f0\5\b\5\37\u0082\u0083\7\36\2\2\u0083\u0084\5\b\5\2"+
		"\u0084\u0085\7\37\2\2\u0085\u00f0\3\2\2\2\u0086\u00f0\5(\25\2\u0087\u0088"+
		"\7F\2\2\u0088\u0089\7\36\2\2\u0089\u008a\5<\37\2\u008a\u008b\7$\2\2\u008b"+
		"\u008c\5Z.\2\u008c\u008d\7\37\2\2\u008d\u00f0\3\2\2\2\u008e\u008f\t\3"+
		"\2\2\u008f\u0090\7\36\2\2\u0090\u0091\5<\37\2\u0091\u0092\7\37\2\2\u0092"+
		"\u00f0\3\2\2\2\u0093\u0094\t\4\2\2\u0094\u0095\7\36\2\2\u0095\u0096\5"+
		"<\37\2\u0096\u0097\7\37\2\2\u0097\u00f0\3\2\2\2\u0098\u0099\t\5\2\2\u0099"+
		"\u009a\7\36\2\2\u009a\u009b\5<\37\2\u009b\u009c\7$\2\2\u009c\u009d\5Z"+
		".\2\u009d\u009e\7\37\2\2\u009e\u00f0\3\2\2\2\u009f\u00a0\7L\2\2\u00a0"+
		"\u00a1\7\36\2\2\u00a1\u00a2\5Z.\2\u00a2\u00a3\7$\2\2\u00a3\u00a4\5<\37"+
		"\2\u00a4\u00a5\7\37\2\2\u00a5\u00f0\3\2\2\2\u00a6\u00a8\5<\37\2\u00a7"+
		"\u00a9\7\26\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\7\36\2\2\u00ac\u00b1\5R*\2\u00ad"+
		"\u00ae\7$\2\2\u00ae\u00b0\5R*\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\7\37\2\2\u00b5\u00f0\3\2\2\2\u00b6\u00b8\7\26\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\27\2\2"+
		"\u00bd\u00be\7\36\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\7\37\2\2\u00c0\u00f0"+
		"\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\5<\37\2\u00c4"+
		"\u00c5\7$\2\2\u00c5\u00c6\5^\60\2\u00c6\u00c7\7\37\2\2\u00c7\u00f0\3\2"+
		"\2\2\u00c8\u00c9\7W\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00cd\5\b\5\2\u00cb"+
		"\u00cc\7$\2\2\u00cc\u00ce\5Z.\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d2\5Z.\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\37\2\2"+
		"\u00d4\u00f0\3\2\2\2\u00d5\u00d6\7X\2\2\u00d6\u00d7\7\36\2\2\u00d7\u00d8"+
		"\5<\37\2\u00d8\u00d9\7$\2\2\u00d9\u00da\5^\60\2\u00da\u00db\7$\2\2\u00db"+
		"\u00dc\5^\60\2\u00dc\u00dd\7\37\2\2\u00dd\u00f0\3\2\2\2\u00de\u00df\7"+
		"Y\2\2\u00df\u00e0\7\36\2\2\u00e0\u00e1\5<\37\2\u00e1\u00e2\7$\2\2\u00e2"+
		"\u00e3\5^\60\2\u00e3\u00e4\7\37\2\2\u00e4\u00f0\3\2\2\2\u00e5\u00f0\5"+
		"\n\6\2\u00e6\u00f0\5\34\17\2\u00e7\u00f0\5*\26\2\u00e8\u00f0\5&\24\2\u00e9"+
		"\u00f0\5\66\34\2\u00ea\u00f0\5\30\r\2\u00eb\u00f0\58\35\2\u00ec\u00f0"+
		"\5> \2\u00ed\u00f0\5<\37\2\u00ee\u00f0\5R*\2\u00efz\3\2\2\2\u00ef\u0080"+
		"\3\2\2\2\u00ef\u0082\3\2\2\2\u00ef\u0086\3\2\2\2\u00ef\u0087\3\2\2\2\u00ef"+
		"\u008e\3\2\2\2\u00ef\u0093\3\2\2\2\u00ef\u0098\3\2\2\2\u00ef\u009f\3\2"+
		"\2\2\u00ef\u00a6\3\2\2\2\u00ef\u00b9\3\2\2\2\u00ef\u00c1\3\2\2\2\u00ef"+
		"\u00c8\3\2\2\2\u00ef\u00d5\3\2\2\2\u00ef\u00de\3\2\2\2\u00ef\u00e5\3\2"+
		"\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef"+
		"\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u0102\3\2\2\2\u00f1"+
		"\u00f2\f\34\2\2\u00f2\u00f3\t\6\2\2\u00f3\u0101\5\b\5\35\u00f4\u00f5\f"+
		"\33\2\2\u00f5\u00f6\t\7\2\2\u00f6\u0101\5\b\5\34\u00f7\u00f8\f\25\2\2"+
		"\u00f8\u00f9\t\b\2\2\u00f9\u0101\5\b\5\26\u00fa\u00fb\f\22\2\2\u00fb\u00fc"+
		"\t\t\2\2\u00fc\u0101\5\b\5\23\u00fd\u00fe\f\20\2\2\u00fe\u00ff\7\f\2\2"+
		"\u00ff\u0101\5\b\5\21\u0100\u00f1\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f7"+
		"\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\t\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0106\7-\2\2\u0106\u0107\7\36\2\2\u0107\u010a\5<\37\2\u0108\u0109"+
		"\7$\2\2\u0109\u010b\5<\37\2\u010a\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\37"+
		"\2\2\u010f\u011e\3\2\2\2\u0110\u0111\7-\2\2\u0111\u0112\7\36\2\2\u0112"+
		"\u0115\5<\37\2\u0113\u0114\7$\2\2\u0114\u0116\5<\37\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\5\f\7\2\u011a\u011b\5\16\b\2\u011b\u011c\7"+
		"\37\2\2\u011c\u011e\3\2\2\2\u011d\u0105\3\2\2\2\u011d\u0110\3\2\2\2\u011e"+
		"\13\3\2\2\2\u011f\u0120\7$\2\2\u0120\u0122\t\n\2\2\u0121\u011f\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\r\3\2\2\2\u0123\u0124\7$\2\2\u0124\u0126\t"+
		"\13\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\17\3\2\2\2\u0127"+
		"\u012d\5\22\n\2\u0128\u0129\7^\2\2\u0129\u012a\7\3\2\2\u012a\u012d\5<"+
		"\37\2\u012b\u012d\5,\27\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\21\3\2\2\2\u012e\u012f\7^\2\2\u012f\u0130\7c\2\2"+
		"\u0130\u0131\7d\2\2\u0131\u0132\5<\37\2\u0132\u0133\7\36\2\2\u0133\u0138"+
		"\5<\37\2\u0134\u0135\7$\2\2\u0135\u0137\5<\37\2\u0136\u0134\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\37\2\2\u013c\u013e\7 \2\2\u013d"+
		"\u013f\5\24\13\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7!\2\2\u0143"+
		"\23\3\2\2\2\u0144\u0145\5<\37\2\u0145\u0146\7%\2\2\u0146\u0147\7\31\2"+
		"\2\u0147\u0148\5V,\2\u0148\u0149\7\32\2\2\u0149\u014b\5\b\5\2\u014a\u014c"+
		"\5\26\f\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0157\3\2\2\2"+
		"\u014d\u014e\5<\37\2\u014e\u014f\7%\2\2\u014f\u0150\7\31\2\2\u0150\u0151"+
		"\5\b\5\2\u0151\u0152\7\32\2\2\u0152\u0154\5\b\5\2\u0153\u0155\5\26\f\2"+
		"\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0144"+
		"\3\2\2\2\u0156\u014d\3\2\2\2\u0157\25\3\2\2\2\u0158\u0159\7\35\2\2\u0159"+
		"\u015a\7\36\2\2\u015a\u015b\5R*\2\u015b\u015c\7\37\2\2\u015c\27\3\2\2"+
		"\2\u015d\u015e\7*\2\2\u015e\u015f\7\36\2\2\u015f\u016d\5^\60\2\u0160\u0161"+
		"\7$\2\2\u0161\u0162\7\67\2\2\u0162\u0163\7\36\2\2\u0163\u0168\5<\37\2"+
		"\u0164\u0165\7$\2\2\u0165\u0167\5<\37\2\u0166\u0164\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016c\7\37\2\2\u016c\u016e\3\2\2\2\u016d\u0160\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\37\2\2\u0170"+
		"\31\3\2\2\2\u0171\u0172\7+\2\2\u0172\u0173\7\36\2\2\u0173\u0174\5^\60"+
		"\2\u0174\u0175\7$\2\2\u0175\u0176\5<\37\2\u0176\u0177\7\37\2\2\u0177\33"+
		"\3\2\2\2\u0178\u0179\5<\37\2\u0179\u017a\7\"\2\2\u017a\u017f\5\36\20\2"+
		"\u017b\u017c\7$\2\2\u017c\u017e\5\36\20\2\u017d\u017b\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0183\7#\2\2\u0183\u0193\3\2\2\2\u0184\u0185\7\""+
		"\2\2\u0185\u0186\5$\23\2\u0186\u0187\7#\2\2\u0187\u0188\7 \2\2\u0188\u018d"+
		"\5\36\20\2\u0189\u018a\7$\2\2\u018a\u018c\5\36\20\2\u018b\u0189\3\2\2"+
		"\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7!\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0178\3\2\2\2\u0192\u0184\3\2\2\2\u0193\35\3\2\2\2\u0194\u0195\t\f\2"+
		"\2\u0195\u0196\7\36\2\2\u0196\u019b\5 \21\2\u0197\u0198\7$\2\2\u0198\u019a"+
		"\5 \21\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\37"+
		"\2\2\u019f\u01c5\3\2\2\2\u01a0\u01a1\79\2\2\u01a1\u01a2\7\36\2\2\u01a2"+
		"\u01a7\5\b\5\2\u01a3\u01a4\7$\2\2\u01a4\u01a6\5\b\5\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\37\2\2\u01ab\u01c5\3"+
		"\2\2\2\u01ac\u01ad\7:\2\2\u01ad\u01ae\7\36\2\2\u01ae\u01b3\5\"\22\2\u01af"+
		"\u01b0\7$\2\2\u01b0\u01b2\5\"\22\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b6\u01b7\7\37\2\2\u01b7\u01c5\3\2\2\2\u01b8\u01b9\7"+
		";\2\2\u01b9\u01ba\7\36\2\2\u01ba\u01bf\5<\37\2\u01bb\u01bc\7$\2\2\u01bc"+
		"\u01be\5<\37\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c3\7\37\2\2\u01c3\u01c5\3\2\2\2\u01c4\u0194\3\2\2\2\u01c4\u01a0\3"+
		"\2\2\2\u01c4\u01ac\3\2\2\2\u01c4\u01b8\3\2\2\2\u01c5\37\3\2\2\2\u01c6"+
		"\u01c9\5<\37\2\u01c7\u01c9\5> \2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2"+
		"\2\u01c9\u01cc\3\2\2\2\u01ca\u01cb\7\34\2\2\u01cb\u01cd\5^\60\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cf\7Z"+
		"\2\2\u01cf\u01d1\5`\61\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"!\3\2\2\2\u01d2\u01d3\5\b\5\2\u01d3\u01d4\7\34\2\2\u01d4\u01d7\5^\60\2"+
		"\u01d5\u01d6\7Z\2\2\u01d6\u01d8\5`\61\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8#\3\2\2\2\u01d9\u01da\7\64\2\2\u01da\u01db\5<\37\2\u01db"+
		"\u01dc\7\34\2\2\u01dc\u01e2\5^\60\2\u01dd\u01de\7$\2\2\u01de\u01df\5<"+
		"\37\2\u01df\u01e0\7\34\2\2\u01e0\u01e1\5^\60\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01dd\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\66\2\2\u01e7\u01e8\5\b\5\2\u01e8"+
		"\u01fa\3\2\2\2\u01e9\u01ea\7\65\2\2\u01ea\u01eb\5<\37\2\u01eb\u01ec\7"+
		"\34\2\2\u01ec\u01f2\5^\60\2\u01ed\u01ee\7$\2\2\u01ee\u01ef\5<\37\2\u01ef"+
		"\u01f0\7\34\2\2\u01f0\u01f1\5^\60\2\u01f1\u01f3\3\2\2\2\u01f2\u01ed\3"+
		"\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\7\66\2\2\u01f7\u01f8\5\b\5\2\u01f8\u01fa\3"+
		"\2\2\2\u01f9\u01d9\3\2\2\2\u01f9\u01e9\3\2\2\2\u01fa%\3\2\2\2\u01fb\u01fc"+
		"\7<\2\2\u01fc\u01fd\7\36\2\2\u01fd\u0202\5<\37\2\u01fe\u01ff\7$\2\2\u01ff"+
		"\u0201\5<\37\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0206\7\37\2\2\u0206\u021b\3\2\2\2\u0207\u0208\7=\2\2\u0208\u0209\7\36"+
		"\2\2\u0209\u020e\5<\37\2\u020a\u020b\7$\2\2\u020b\u020d\5<\37\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7\37\2\2\u0212"+
		"\u021b\3\2\2\2\u0213\u0214\t\r\2\2\u0214\u0215\7\36\2\2\u0215\u0216\5"+
		"<\37\2\u0216\u0217\7$\2\2\u0217\u0218\5<\37\2\u0218\u0219\7\37\2\2\u0219"+
		"\u021b\3\2\2\2\u021a\u01fb\3\2\2\2\u021a\u0207\3\2\2\2\u021a\u0213\3\2"+
		"\2\2\u021b\'\3\2\2\2\u021c\u021d\7@\2\2\u021d\u021e\7\36\2\2\u021e\u021f"+
		"\5<\37\2\u021f\u0220\7$\2\2\u0220\u0221\5\b\5\2\u0221\u0222\7\37\2\2\u0222"+
		"\u0235\3\2\2\2\u0223\u0224\7A\2\2\u0224\u0225\5\b\5\2\u0225\u0226\7\32"+
		"\2\2\u0226\u022e\5\b\5\2\u0227\u0228\7B\2\2\u0228\u0229\5\b\5\2\u0229"+
		"\u022a\7\32\2\2\u022a\u022b\5\b\5\2\u022b\u022d\3\2\2\2\u022c\u0227\3"+
		"\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\7C\2\2\u0232\u0233\5\b"+
		"\5\2\u0233\u0235\3\2\2\2\u0234\u021c\3\2\2\2\u0234\u0223\3\2\2\2\u0235"+
		")\3\2\2\2\u0236\u0237\5b\62\2\u0237\u0238\7\36\2\2\u0238\u023b\5@!\2\u0239"+
		"\u023a\7$\2\2\u023a\u023c\5^\60\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023e\7\37\2\2\u023e\u023f\7V\2\2\u023f"+
		"\u0240\7\36\2\2\u0240\u0245\5<\37\2\u0241\u0242\7$\2\2\u0242\u0244\5<"+
		"\37\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7\37"+
		"\2\2\u0249+\3\2\2\2\u024a\u024b\7^\2\2\u024b\u024c\7g\2\2\u024c\u024d"+
		"\5<\37\2\u024d\u024e\7\36\2\2\u024e\u024f\5.\30\2\u024f\u0250\7$\2\2\u0250"+
		"\u0251\7E\2\2\u0251\u0252\5<\37\2\u0252\u0253\7\34\2\2\u0253\u0254\t\16"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7\37\2\2\u0256\u0258\7 \2\2\u0257"+
		"\u0259\5\6\4\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7!\2\2\u025d"+
		"-\3\2\2\2\u025e\u0263\5\60\31\2\u025f\u0260\7$\2\2\u0260\u0262\5\60\31"+
		"\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264/\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7D\2\2\u0267\u0268"+
		"\5<\37\2\u0268\u0269\7\34\2\2\u0269\u026a\t\16\2\2\u026a\61\3\2\2\2\u026b"+
		"\u026c\7j\2\2\u026c\u026d\5<\37\2\u026d\u026e\7\36\2\2\u026e\u0273\5<"+
		"\37\2\u026f\u0270\7$\2\2\u0270\u0272\5<\37\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0276\u0277\7\37\2\2\u0277\63\3\2\2\2\u0278\u0279"+
		"\7h\2\2\u0279\u027a\7i\2\2\u027a\u027b\5<\37\2\u027b\u027c\7\36\2\2\u027c"+
		"\u0281\5<\37\2\u027d\u027e\7$\2\2\u027e\u0280\5<\37\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\7\37\2\2\u0285\u0286\7"+
		" \2\2\u0286\u0287\7k\2\2\u0287\u0288\5\b\5\2\u0288\u0289\7\34\2\2\u0289"+
		"\u028a\5B\"\2\u028a\u028b\7!\2\2\u028b\65\3\2\2\2\u028c\u028d\5<\37\2"+
		"\u028d\u028e\7\36\2\2\u028e\u0293\5<\37\2\u028f\u0290\7$\2\2\u0290\u0292"+
		"\5<\37\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7\37"+
		"\2\2\u0297\67\3\2\2\2\u0298\u0299\7\'\2\2\u0299\u029a\7 \2\2\u029a\u029b"+
		"\5<\37\2\u029b\u029c\7!\2\2\u029c9\3\2\2\2\u029d\u029e\7\4\2\2\u029e\u02a1"+
		"\5<\37\2\u029f\u02a1\7\5\2\2\u02a0\u029d\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1"+
		";\3\2\2\2\u02a2\u02a3\t\17\2\2\u02a3=\3\2\2\2\u02a4\u02a5\5<\37\2\u02a5"+
		"\u02a6\7\7\2\2\u02a6\u02a7\5<\37\2\u02a7?\3\2\2\2\u02a8\u02ab\5<\37\2"+
		"\u02a9\u02ab\5> \2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02abA\3\2"+
		"\2\2\u02ac\u02af\5D#\2\u02ad\u02af\7r\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02afC\3\2\2\2\u02b0\u02b7\5F$\2\u02b1\u02b7\5H%\2\u02b2\u02b7"+
		"\5J&\2\u02b3\u02b7\5L\'\2\u02b4\u02b7\5N(\2\u02b5\u02b7\5P)\2\u02b6\u02b0"+
		"\3\2\2\2\u02b6\u02b1\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7E\3\2\2\2\u02b8\u02b9\7l\2\2\u02b9"+
		"G\3\2\2\2\u02ba\u02bb\7p\2\2\u02bbI\3\2\2\2\u02bc\u02bd\7q\2\2\u02bdK"+
		"\3\2\2\2\u02be\u02bf\7n\2\2\u02bfM\3\2\2\2\u02c0\u02c1\7o\2\2\u02c1O\3"+
		"\2\2\2\u02c2\u02c3\7m\2\2\u02c3Q\3\2\2\2\u02c4\u02ca\5T+\2\u02c5\u02ca"+
		"\5V,\2\u02c6\u02ca\5Z.\2\u02c7\u02ca\5\\/\2\u02c8\u02ca\5^\60\2\u02c9"+
		"\u02c4\3\2\2\2\u02c9\u02c5\3\2\2\2\u02c9\u02c6\3\2\2\2\u02c9\u02c7\3\2"+
		"\2\2\u02c9\u02c8\3\2\2\2\u02caS\3\2\2\2\u02cb\u02cc\7l\2\2\u02ccU\3\2"+
		"\2\2\u02cd\u02ce\7v\2\2\u02ceW\3\2\2\2\u02cf\u02d0\7s\2\2\u02d0Y\3\2\2"+
		"\2\u02d1\u02d2\7t\2\2\u02d2[\3\2\2\2\u02d3\u02d4\7w\2\2\u02d4]\3\2\2\2"+
		"\u02d5\u02d6\7u\2\2\u02d6_\3\2\2\2\u02d7\u02d8\t\20\2\2\u02d8a\3\2\2\2"+
		"\u02d9\u02da\t\21\2\2\u02dac\3\2\2\2:fjt\u00a8\u00b1\u00b9\u00cd\u00d1"+
		"\u00ef\u0100\u0102\u010c\u0117\u011d\u0121\u0125\u012c\u0138\u0140\u014b"+
		"\u0154\u0156\u0168\u016d\u017f\u018d\u0192\u019b\u01a7\u01b3\u01bf\u01c4"+
		"\u01c8\u01cc\u01d0\u01d7\u01e4\u01f4\u01f9\u0202\u020e\u021a\u022e\u0234"+
		"\u023b\u0245\u025a\u0263\u0273\u0281\u0293\u02a0\u02aa\u02ae\u02b6\u02c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}