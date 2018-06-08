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
		SCOL=36, RESTRICT=37, GET=38, PUT=39, CHECK=40, VALID=41, NVALID=42, ALL=43, 
		CONDITION=44, MEASURES=45, JOIN=46, INNER=47, LEFT=48, ON=49, KEEP=50, 
		RENAME=51, FILTER=52, CALC=53, DROP=54, UNION=55, INTERSECT=56, SYMDIFF=57, 
		SETDIFF=58, NVL=59, IF=60, ELSEIF=61, ELSE=62, INPUT=63, OUTPUT=64, ROUND=65, 
		CEIL=66, FLOOR=67, ABS=68, EXP=69, LOGN=70, LOG=71, POW=72, SQRT=73, NROOT=74, 
		MOD=75, TRUNC=76, MIN=77, MAX=78, SUM=79, AVG=80, GROPUBY=81, SUBSTR=82, 
		REPLACE=83, ROLE=84, IDENTIFIER=85, MEASURE=86, ATTRIBUTE=87, DEFINE=88, 
		DEFVAR=89, DEFVALUEDOM=90, DEFDATSTRUCT=91, DEFDATASET=92, DATAPOINT=93, 
		RULESET=94, HIERARCHICAL=95, MAPPING=96, PROCEDURE=97, CREATE=98, FUNCTION=99, 
		CALL=100, RETURN=101, NULLTYPE=102, STRINGTYPE=103, INTTYPE=104, FLOATTYPE=105, 
		BOOLTYPE=106, DATETYPE=107, DATASET=108, DATE_LITERAL=109, INTEGER_LITERAL=110, 
		STRING_LITERAL=111, BOOLEAN_LITERAL=112, FLOAT_LITERAL=113, REG_IDENTIFIER=114, 
		ESCAPED_IDENTIFIER=115, WS=116, COMMENT=117, LINE_COMMENT=118;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_assignment = 2, RULE_expr = 3, 
		RULE_checkfunction = 4, RULE_checkParamEnum = 5, RULE_checkParamOpt = 6, 
		RULE_define = 7, RULE_dpruleset = 8, RULE_singlerule = 9, RULE_errorCode = 10, 
		RULE_getFunction = 11, RULE_putFunction = 12, RULE_clausefun = 13, RULE_clausebody = 14, 
		RULE_clausebodyparam = 15, RULE_clausebodycalc = 16, RULE_joinblock = 17, 
		RULE_setfun = 18, RULE_condOperator = 19, RULE_aggregationFun = 20, RULE_namedProcDef = 21, 
		RULE_procVarInList = 22, RULE_singleVarIn = 23, RULE_callProc = 24, RULE_namedFunDef = 25, 
		RULE_callFun = 26, RULE_debug = 27, RULE_varname = 28, RULE_varmember = 29, 
		RULE_variable = 30, RULE_dataType = 31, RULE_scalartype = 32, RULE_nulltype = 33, 
		RULE_booleantype = 34, RULE_datetype = 35, RULE_integertype = 36, RULE_floattype = 37, 
		RULE_stringtype = 38, RULE_literal = 39, RULE_nullLiteral = 40, RULE_booleanLiteral = 41, 
		RULE_dateLiteral = 42, RULE_integerLiteral = 43, RULE_floatLiteral = 44, 
		RULE_stringLiteral = 45, RULE_componentRole = 46, RULE_aggregationOp = 47;
	public static final String[] ruleNames = {
		"parse", "statement", "assignment", "expr", "checkfunction", "checkParamEnum", 
		"checkParamOpt", "define", "dpruleset", "singlerule", "errorCode", "getFunction", 
		"putFunction", "clausefun", "clausebody", "clausebodyparam", "clausebodycalc", 
		"joinblock", "setfun", "condOperator", "aggregationFun", "namedProcDef", 
		"procVarInList", "singleVarIn", "callProc", "namedFunDef", "callFun", 
		"debug", "varname", "varmember", "variable", "dataType", "scalartype", 
		"nulltype", "booleantype", "datetype", "integertype", "floattype", "stringtype", 
		"literal", "nullLiteral", "booleanLiteral", "dateLiteral", "integerLiteral", 
		"floatLiteral", "stringLiteral", "componentRole", "aggregationOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'variable'", "'printvar'", "'nop'", "':='", "'.'", "'*'", "'/'", 
		"'+'", "'-'", "'||'", "'='", "'<>'", "'<='", "'<'", "'>='", "'>'", "'and'", 
		"'or'", "'xor'", "'not'", "'isnull'", "'is not null'", "'when'", "'then'", 
		"'in'", "'as'", "'errorcode'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"','", "':'", "';'", "'restrict'", "'get'", "'put'", "'check'", "'valid'", 
		"'not valid'", "'all'", "'condition'", "'measures'", "'join'", "'inner'", 
		"'left'", "'on'", "'keep'", "'rename'", "'filter'", "'calc'", "'drop'", 
		"'union'", "'intersect'", "'symdiff'", "'setdiff'", "'nvl'", "'if'", "'elseif'", 
		"'else'", "'input'", "'output'", "'round'", "'ceil'", "'floor'", "'abs'", 
		"'exp'", "'ln'", "'log'", "'power'", "'sqrt'", "'nroot'", "'mod'", "'trunc'", 
		"'min'", "'max'", "'sum'", "'avg'", "'group by'", "'substr'", "'replace'", 
		"'role'", null, null, null, "'define'", "'defineVariable'", "'defineValueDomain'", 
		"'defineDataStructure'", "'defineDataSet'", "'datapoint'", "'ruleset'", 
		"'hierarchical'", "'mapping'", "'procedure'", "'create'", "'function'", 
		"'call'", "'returns'", "'null'", "'string'", "'integer'", "'float'", "'boolean'", 
		"'date'", "'dataset'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ASSIGN", "MEMBER", "MUL", "DIV", "PLUS", "MINUS", 
		"CONCAT", "EQ", "NE", "LE", "LT", "GE", "GT", "AND", "OR", "XOR", "NOT", 
		"ISNULL", "ISNOTNULL", "WHEN", "THEN", "IN", "AS", "ERRCODE", "LPAR", 
		"RPAR", "LBRA", "RBRA", "LSQR", "RSQR", "COMMA", "COLON", "SCOL", "RESTRICT", 
		"GET", "PUT", "CHECK", "VALID", "NVALID", "ALL", "CONDITION", "MEASURES", 
		"JOIN", "INNER", "LEFT", "ON", "KEEP", "RENAME", "FILTER", "CALC", "DROP", 
		"UNION", "INTERSECT", "SYMDIFF", "SETDIFF", "NVL", "IF", "ELSEIF", "ELSE", 
		"INPUT", "OUTPUT", "ROUND", "CEIL", "FLOOR", "ABS", "EXP", "LOGN", "LOG", 
		"POW", "SQRT", "NROOT", "MOD", "TRUNC", "MIN", "MAX", "SUM", "AVG", "GROPUBY", 
		"SUBSTR", "REPLACE", "ROLE", "IDENTIFIER", "MEASURE", "ATTRIBUTE", "DEFINE", 
		"DEFVAR", "DEFVALUEDOM", "DEFDATSTRUCT", "DEFDATASET", "DATAPOINT", "RULESET", 
		"HIERARCHICAL", "MAPPING", "PROCEDURE", "CREATE", "FUNCTION", "CALL", 
		"RETURN", "NULLTYPE", "STRINGTYPE", "INTTYPE", "FLOATTYPE", "BOOLTYPE", 
		"DATETYPE", "DATASET", "DATE_LITERAL", "INTEGER_LITERAL", "STRING_LITERAL", 
		"BOOLEAN_LITERAL", "FLOAT_LITERAL", "REG_IDENTIFIER", "ESCAPED_IDENTIFIER", 
		"WS", "COMMENT", "LINE_COMMENT"
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
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				statement();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(97);
					match(SCOL);
					}
				}

				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << PUT))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (DEFINE - 88)) | (1L << (CREATE - 88)) | (1L << (CALL - 88)) | (1L << (REG_IDENTIFIER - 88)) | (1L << (ESCAPED_IDENTIFIER - 88)))) != 0) );
			setState(104);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUT:
				_localctx = new PutDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				putFunction();
				}
				break;
			case DEFINE:
				_localctx = new DefinestatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				define();
				}
				break;
			case CALL:
				_localctx = new CallProcStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				callProc();
				}
				break;
			case CREATE:
				_localctx = new DefFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				namedFunDef();
				}
				break;
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new AssingstatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				assignment();
				}
				break;
			case T__1:
			case T__2:
				_localctx = new DebugstatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
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
			setState(114);
			varname();
			setState(115);
			match(ASSIGN);
			setState(116);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
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
				setState(120);
				((UnaryexprContext)_localctx).right = expr(26);
				}
				break;
			case 2:
				{
				_localctx = new PrecedenceexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(LPAR);
				setState(122);
				expr(0);
				setState(123);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CondOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				condOperator();
				}
				break;
			case 4:
				{
				_localctx = new RoundexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(ROUND);
				setState(127);
				match(LPAR);
				setState(128);
				varname();
				setState(129);
				match(COMMA);
				setState(130);
				integerLiteral();
				setState(131);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new CeilFloorexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
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
				setState(134);
				match(LPAR);
				setState(135);
				varname();
				setState(136);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new SingleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				((SingleparamMathfunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ABS - 68)) | (1L << (EXP - 68)) | (1L << (LOGN - 68)) | (1L << (SQRT - 68)))) != 0)) ) {
					((SingleparamMathfunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				match(LPAR);
				setState(140);
				varname();
				setState(141);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new DoubleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				((DoubleparamMathfunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (POW - 72)) | (1L << (NROOT - 72)) | (1L << (MOD - 72)) | (1L << (TRUNC - 72)))) != 0)) ) {
					((DoubleparamMathfunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				match(LPAR);
				setState(145);
				varname();
				setState(146);
				match(COMMA);
				setState(147);
				integerLiteral();
				setState(148);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new LogexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(LOG);
				setState(151);
				match(LPAR);
				setState(152);
				integerLiteral();
				setState(153);
				match(COMMA);
				setState(154);
				varname();
				setState(155);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new InCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				varname();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(158);
					match(NOT);
					}
				}

				setState(161);
				match(IN);
				setState(162);
				match(LPAR);
				setState(163);
				literal();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(164);
					match(COMMA);
					setState(165);
					literal();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new IsNullCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(173);
					match(NOT);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(ISNULL);
				setState(180);
				match(LPAR);
				setState(181);
				expr(0);
				setState(182);
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new StringFunSubstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(SUBSTR);
				setState(185);
				match(LPAR);
				setState(186);
				expr(0);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(187);
					match(COMMA);
					setState(188);
					integerLiteral();
					}
					break;
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(191);
					match(COMMA);
					setState(192);
					integerLiteral();
					}
				}

				setState(195);
				match(RPAR);
				}
				break;
			case 12:
				{
				_localctx = new StringFunReplaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(REPLACE);
				setState(198);
				match(LPAR);
				setState(199);
				varname();
				setState(200);
				match(COMMA);
				setState(201);
				stringLiteral();
				setState(202);
				match(COMMA);
				setState(203);
				stringLiteral();
				setState(204);
				match(RPAR);
				}
				break;
			case 13:
				{
				_localctx = new CheckExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				checkfunction();
				}
				break;
			case 14:
				{
				_localctx = new ClauseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				clausefun();
				}
				break;
			case 15:
				{
				_localctx = new AggrFunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				aggregationFun();
				}
				break;
			case 16:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				setfun();
				}
				break;
			case 17:
				{
				_localctx = new CallFunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				callFun();
				}
				break;
			case 18:
				{
				_localctx = new GetDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				getFunction();
				}
				break;
			case 19:
				{
				_localctx = new MembershipexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				varmember();
				}
				break;
			case 20:
				{
				_localctx = new VarexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				varname();
				}
				break;
			case 21:
				{
				_localctx = new LiteralexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AddMulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(218);
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
						setState(219);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new MinDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(221);
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
						setState(222);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new RelationalCondContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(224);
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
						setState(225);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new LogicalexprContext(new ExprContext(_parentctx, _parentState));
						((LogicalexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(227);
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
						setState(228);
						((LogicalexprContext)_localctx).right = expr(14);
						}
						break;
					case 5:
						{
						_localctx = new StringConcatContext(new ExprContext(_parentctx, _parentState));
						((StringConcatContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(230);
						match(CONCAT);
						setState(231);
						((StringConcatContext)_localctx).b = expr(13);
						}
						break;
					}
					} 
				}
				setState(236);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CheckFunBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(CHECK);
				setState(238);
				match(LPAR);
				setState(239);
				varname();
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					match(COMMA);
					setState(241);
					varname();
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(246);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new CheckFunWithOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(CHECK);
				setState(249);
				match(LPAR);
				setState(250);
				varname();
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(251);
						match(COMMA);
						setState(252);
						varname();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(257);
				checkParamEnum();
				setState(258);
				checkParamOpt();
				setState(259);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(263);
				match(COMMA);
				setState(264);
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
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(267);
				match(COMMA);
				setState(268);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DatapointrulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				dpruleset();
				}
				break;
			case 2:
				_localctx = new DefinevariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(DEFINE);
				setState(273);
				match(T__0);
				setState(274);
				varname();
				}
				break;
			case 3:
				_localctx = new DefineProcedureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
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
			setState(278);
			match(DEFINE);
			setState(279);
			match(DATAPOINT);
			setState(280);
			match(RULESET);
			setState(281);
			varname();
			setState(282);
			match(LPAR);
			setState(283);
			varname();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(284);
				match(COMMA);
				setState(285);
				varname();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(RPAR);
			setState(292);
			match(LBRA);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				singlerule();
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(298);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new SingleruleConsequenceOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				varname();
				setState(301);
				match(COLON);
				setState(302);
				match(WHEN);
				setState(303);
				booleanLiteral();
				setState(304);
				match(THEN);
				setState(305);
				expr(0);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(306);
					errorCode();
					}
				}

				}
				break;
			case 2:
				_localctx = new SingleruleBothContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				varname();
				setState(310);
				match(COLON);
				setState(311);
				match(WHEN);
				setState(312);
				expr(0);
				setState(313);
				match(THEN);
				setState(314);
				expr(0);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(315);
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
			setState(320);
			match(ERRCODE);
			setState(321);
			match(LPAR);
			setState(322);
			literal();
			setState(323);
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
			setState(325);
			match(GET);
			setState(326);
			match(LPAR);
			setState(327);
			stringLiteral();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(328);
				match(COMMA);
				setState(329);
				match(KEEP);
				setState(330);
				match(LPAR);
				setState(331);
				varname();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(332);
					match(COMMA);
					setState(333);
					varname();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(RPAR);
				}
			}

			setState(343);
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
			setState(345);
			match(PUT);
			setState(346);
			match(LPAR);
			setState(347);
			stringLiteral();
			setState(348);
			match(COMMA);
			setState(349);
			varname();
			setState(350);
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
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new ClausebaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				varname();
				setState(353);
				match(LSQR);
				setState(354);
				clausebody();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(355);
					match(COMMA);
					setState(356);
					clausebody();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				match(RSQR);
				}
				break;
			case LSQR:
				_localctx = new ClausejoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(LSQR);
				setState(365);
				joinblock();
				setState(366);
				match(RSQR);
				setState(367);
				match(LBRA);
				setState(368);
				clausebody();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(369);
					match(COMMA);
					setState(370);
					clausebody();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
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
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEEP:
			case RENAME:
				_localctx = new ClauseKeepRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
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
				setState(381);
				match(LPAR);
				setState(382);
				clausebodyparam();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(383);
					match(COMMA);
					setState(384);
					clausebodyparam();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(RPAR);
				}
				break;
			case FILTER:
				_localctx = new ClauseFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(FILTER);
				setState(393);
				match(LPAR);
				setState(394);
				expr(0);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(395);
					match(COMMA);
					setState(396);
					expr(0);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(RPAR);
				}
				break;
			case CALC:
				_localctx = new ClausecalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(CALC);
				setState(405);
				match(LPAR);
				setState(406);
				clausebodycalc();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(407);
					match(COMMA);
					setState(408);
					clausebodycalc();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(RPAR);
				}
				break;
			case DROP:
				_localctx = new ClausedropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				match(DROP);
				setState(417);
				match(LPAR);
				setState(418);
				varname();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					varname();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
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
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(430);
				varname();
				}
				break;
			case 2:
				{
				setState(431);
				varmember();
				}
				break;
			}
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(434);
				match(AS);
				setState(435);
				stringLiteral();
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(438);
				match(ROLE);
				setState(439);
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
			setState(442);
			expr(0);
			setState(443);
			match(AS);
			setState(444);
			stringLiteral();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(445);
				match(ROLE);
				setState(446);
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
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				_localctx = new JoinblockInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(INNER);
				setState(450);
				varname();
				setState(451);
				match(AS);
				setState(452);
				stringLiteral();
				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(453);
					match(COMMA);
					setState(454);
					varname();
					setState(455);
					match(AS);
					setState(456);
					stringLiteral();
					}
					}
					setState(460); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(462);
				match(ON);
				setState(463);
				expr(0);
				}
				break;
			case LEFT:
				_localctx = new JoinblockLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(LEFT);
				setState(466);
				varname();
				setState(467);
				match(AS);
				setState(468);
				stringLiteral();
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(469);
					match(COMMA);
					setState(470);
					varname();
					setState(471);
					match(AS);
					setState(472);
					stringLiteral();
					}
					}
					setState(476); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(478);
				match(ON);
				setState(479);
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
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				_localctx = new SetUnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(UNION);
				setState(484);
				match(LPAR);
				setState(485);
				varname();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(486);
					match(COMMA);
					setState(487);
					varname();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				match(RPAR);
				}
				break;
			case INTERSECT:
				_localctx = new SetIntersectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(INTERSECT);
				setState(496);
				match(LPAR);
				setState(497);
				varname();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(498);
					match(COMMA);
					setState(499);
					varname();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				match(RPAR);
				}
				break;
			case SYMDIFF:
			case SETDIFF:
				_localctx = new SetSetSymDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
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
				setState(508);
				match(LPAR);
				setState(509);
				varname();
				setState(510);
				match(COMMA);
				setState(511);
				varname();
				setState(512);
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
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NVL:
				_localctx = new NvlCondOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(NVL);
				setState(517);
				match(LPAR);
				setState(518);
				varname();
				setState(519);
				match(COMMA);
				setState(520);
				expr(0);
				setState(521);
				match(RPAR);
				}
				break;
			case IF:
				_localctx = new IfThenElseCondOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(IF);
				setState(524);
				expr(0);
				setState(525);
				match(THEN);
				setState(526);
				expr(0);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(527);
					match(ELSEIF);
					setState(528);
					expr(0);
					setState(529);
					match(THEN);
					setState(530);
					expr(0);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(ELSE);
				setState(538);
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
			setState(542);
			aggregationOp();
			setState(543);
			match(LPAR);
			setState(544);
			variable();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(545);
				match(COMMA);
				setState(546);
				stringLiteral();
				}
			}

			setState(549);
			match(RPAR);
			setState(550);
			match(GROPUBY);
			setState(551);
			match(LPAR);
			setState(552);
			varname();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(553);
				match(COMMA);
				setState(554);
				varname();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
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
			setState(562);
			match(DEFINE);
			setState(563);
			match(PROCEDURE);
			setState(564);
			varname();
			setState(565);
			match(LPAR);
			setState(566);
			procVarInList();
			{
			setState(567);
			match(COMMA);
			setState(568);
			match(OUTPUT);
			setState(569);
			varname();
			setState(570);
			match(AS);
			setState(571);
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
			setState(573);
			match(RPAR);
			setState(574);
			match(LBRA);
			setState(576); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(575);
				assignment();
				}
				}
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(580);
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
			setState(582);
			singleVarIn();
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					match(COMMA);
					setState(584);
					singleVarIn();
					}
					} 
				}
				setState(589);
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
			setState(590);
			match(INPUT);
			setState(591);
			varname();
			setState(592);
			match(AS);
			setState(593);
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
			setState(595);
			match(CALL);
			setState(596);
			varname();
			setState(597);
			match(LPAR);
			setState(598);
			varname();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(599);
				match(COMMA);
				setState(600);
				varname();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
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
			setState(608);
			match(CREATE);
			setState(609);
			match(FUNCTION);
			setState(610);
			varname();
			setState(611);
			match(LPAR);
			setState(612);
			varname();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(613);
				match(COMMA);
				setState(614);
				varname();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			match(RPAR);
			setState(621);
			match(LBRA);
			setState(622);
			match(RETURN);
			setState(623);
			expr(0);
			setState(624);
			match(AS);
			setState(625);
			dataType();
			setState(626);
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
			setState(628);
			varname();
			setState(629);
			match(LPAR);
			setState(630);
			varname();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(631);
				match(COMMA);
				setState(632);
				varname();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
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
		enterRule(_localctx, 54, RULE_debug);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new DBGprintvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(T__1);
				setState(641);
				varname();
				}
				break;
			case T__2:
				_localctx = new DBGnopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
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
		enterRule(_localctx, 56, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
		enterRule(_localctx, 58, RULE_varmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			((VarmemberContext)_localctx).left = varname();
			setState(648);
			((VarmemberContext)_localctx).op = match(MEMBER);
			setState(649);
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
		enterRule(_localctx, 60, RULE_variable);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				varname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
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
		enterRule(_localctx, 62, RULE_dataType);
		try {
			setState(657);
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
				setState(655);
				scalartype();
				}
				break;
			case DATASET:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
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
		enterRule(_localctx, 64, RULE_scalartype);
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				nulltype();
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				booleantype();
				}
				break;
			case DATETYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				datetype();
				}
				break;
			case INTTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				integertype();
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				floattype();
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
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
		enterRule(_localctx, 66, RULE_nulltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
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
		enterRule(_localctx, 68, RULE_booleantype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
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
		enterRule(_localctx, 70, RULE_datetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
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
		enterRule(_localctx, 72, RULE_integertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
		enterRule(_localctx, 74, RULE_floattype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		enterRule(_localctx, 76, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
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
		enterRule(_localctx, 78, RULE_literal);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				nullLiteral();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				booleanLiteral();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				dateLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(683);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(684);
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
		enterRule(_localctx, 80, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		enterRule(_localctx, 82, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		enterRule(_localctx, 84, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		enterRule(_localctx, 86, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		enterRule(_localctx, 88, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		enterRule(_localctx, 90, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		enterRule(_localctx, 92, RULE_componentRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			((ComponentRoleContext)_localctx).role = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (IDENTIFIER - 85)) | (1L << (MEASURE - 85)) | (1L << (ATTRIBUTE - 85)))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_aggregationOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MIN - 77)) | (1L << (MAX - 77)) | (1L << (SUM - 77)) | (1L << (AVG - 77)))) != 0)) ) {
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
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3x\u02c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\5\2e\n\2\6\2g\n\2\r"+
		"\2\16\2h\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a9\n\5\f"+
		"\5\16\5\u00ac\13\5\3\5\3\5\3\5\7\5\u00b1\n\5\f\5\16\5\u00b4\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c0\n\5\3\5\3\5\5\5\u00c4\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00da\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u00eb\n\5\f\5\16\5\u00ee\13\5\3\6\3\6\3\6\3\6\3\6\6"+
		"\6\u00f5\n\6\r\6\16\6\u00f6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0100\n\6"+
		"\r\6\16\6\u0101\3\6\3\6\3\6\3\6\5\6\u0108\n\6\3\7\3\7\5\7\u010c\n\7\3"+
		"\b\3\b\5\b\u0110\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0117\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0121\n\n\f\n\16\n\u0124\13\n\3\n\3\n\3\n\6\n\u0129"+
		"\n\n\r\n\16\n\u012a\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0136"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013f\n\13\5\13\u0141\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0151"+
		"\n\r\f\r\16\r\u0154\13\r\3\r\3\r\5\r\u0158\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0168\n\17\f\17\16"+
		"\17\u016b\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0176"+
		"\n\17\f\17\16\17\u0179\13\17\3\17\3\17\5\17\u017d\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0184\n\20\f\20\16\20\u0187\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0190\n\20\f\20\16\20\u0193\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u019c\n\20\f\20\16\20\u019f\13\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u01a8\n\20\f\20\16\20\u01ab\13\20\3\20"+
		"\3\20\5\20\u01af\n\20\3\21\3\21\5\21\u01b3\n\21\3\21\3\21\5\21\u01b7\n"+
		"\21\3\21\3\21\5\21\u01bb\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u01c2\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u01cd\n\23\r\23\16"+
		"\23\u01ce\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\6\23\u01dd\n\23\r\23\16\23\u01de\3\23\3\23\3\23\5\23\u01e4\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u01eb\n\24\f\24\16\24\u01ee\13\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u01f7\n\24\f\24\16\24\u01fa\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0205\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0217\n\25\f\25\16\25\u021a\13\25\3\25\3\25\3\25\5\25\u021f\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0226\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u022e\n\26\f\26\16\26\u0231\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0243\n\27\r\27\16"+
		"\27\u0244\3\27\3\27\3\30\3\30\3\30\7\30\u024c\n\30\f\30\16\30\u024f\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u025c"+
		"\n\32\f\32\16\32\u025f\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u026a\n\33\f\33\16\33\u026d\13\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u027c\n\34\f\34\16\34\u027f"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\5\35\u0286\n\35\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \5 \u0290\n \3!\3!\5!\u0294\n!\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u029c\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\5"+
		")\u02b0\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\2\3\b\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`\2\22\4\2\n\13\26\26\3\2DE\4\2FHKK\4\2JJLN\4\2\b"+
		"\b\n\n\4\2\t\t\13\13\3\2\r\22\3\2\23\24\3\2+-\3\2./\3\2\64\65\3\2;<\4"+
		"\2iinn\3\2tu\3\2WY\3\2OR\u02ef\2f\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\b\u00d9"+
		"\3\2\2\2\n\u0107\3\2\2\2\f\u010b\3\2\2\2\16\u010f\3\2\2\2\20\u0116\3\2"+
		"\2\2\22\u0118\3\2\2\2\24\u0140\3\2\2\2\26\u0142\3\2\2\2\30\u0147\3\2\2"+
		"\2\32\u015b\3\2\2\2\34\u017c\3\2\2\2\36\u01ae\3\2\2\2 \u01b2\3\2\2\2\""+
		"\u01bc\3\2\2\2$\u01e3\3\2\2\2&\u0204\3\2\2\2(\u021e\3\2\2\2*\u0220\3\2"+
		"\2\2,\u0234\3\2\2\2.\u0248\3\2\2\2\60\u0250\3\2\2\2\62\u0255\3\2\2\2\64"+
		"\u0262\3\2\2\2\66\u0276\3\2\2\28\u0285\3\2\2\2:\u0287\3\2\2\2<\u0289\3"+
		"\2\2\2>\u028f\3\2\2\2@\u0293\3\2\2\2B\u029b\3\2\2\2D\u029d\3\2\2\2F\u029f"+
		"\3\2\2\2H\u02a1\3\2\2\2J\u02a3\3\2\2\2L\u02a5\3\2\2\2N\u02a7\3\2\2\2P"+
		"\u02af\3\2\2\2R\u02b1\3\2\2\2T\u02b3\3\2\2\2V\u02b5\3\2\2\2X\u02b7\3\2"+
		"\2\2Z\u02b9\3\2\2\2\\\u02bb\3\2\2\2^\u02bd\3\2\2\2`\u02bf\3\2\2\2bd\5"+
		"\4\3\2ce\7&\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fb\3\2\2\2gh\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\2\2\3k\3\3\2\2\2ls\5\32\16\2ms\5\20\t\2"+
		"ns\5\62\32\2os\5\64\33\2ps\5\6\4\2qs\58\35\2rl\3\2\2\2rm\3\2\2\2rn\3\2"+
		"\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\5\3\2\2\2tu\5:\36\2uv\7\6\2\2vw\5"+
		"\b\5\2w\7\3\2\2\2xy\b\5\1\2yz\t\2\2\2z\u00da\5\b\5\34{|\7\36\2\2|}\5\b"+
		"\5\2}~\7\37\2\2~\u00da\3\2\2\2\177\u00da\5(\25\2\u0080\u0081\7C\2\2\u0081"+
		"\u0082\7\36\2\2\u0082\u0083\5:\36\2\u0083\u0084\7$\2\2\u0084\u0085\5X"+
		"-\2\u0085\u0086\7\37\2\2\u0086\u00da\3\2\2\2\u0087\u0088\t\3\2\2\u0088"+
		"\u0089\7\36\2\2\u0089\u008a\5:\36\2\u008a\u008b\7\37\2\2\u008b\u00da\3"+
		"\2\2\2\u008c\u008d\t\4\2\2\u008d\u008e\7\36\2\2\u008e\u008f\5:\36\2\u008f"+
		"\u0090\7\37\2\2\u0090\u00da\3\2\2\2\u0091\u0092\t\5\2\2\u0092\u0093\7"+
		"\36\2\2\u0093\u0094\5:\36\2\u0094\u0095\7$\2\2\u0095\u0096\5X-\2\u0096"+
		"\u0097\7\37\2\2\u0097\u00da\3\2\2\2\u0098\u0099\7I\2\2\u0099\u009a\7\36"+
		"\2\2\u009a\u009b\5X-\2\u009b\u009c\7$\2\2\u009c\u009d\5:\36\2\u009d\u009e"+
		"\7\37\2\2\u009e\u00da\3\2\2\2\u009f\u00a1\5:\36\2\u00a0\u00a2\7\26\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\7\33\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00aa\5P)\2\u00a6\u00a7\7$\2\2\u00a7"+
		"\u00a9\5P)\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7\37\2\2\u00ae\u00da\3\2\2\2\u00af\u00b1\7\26\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\7\36\2\2"+
		"\u00b7\u00b8\5\b\5\2\u00b8\u00b9\7\37\2\2\u00b9\u00da\3\2\2\2\u00ba\u00bb"+
		"\7T\2\2\u00bb\u00bc\7\36\2\2\u00bc\u00bf\5\b\5\2\u00bd\u00be\7$\2\2\u00be"+
		"\u00c0\5X-\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2"+
		"\2\u00c1\u00c2\7$\2\2\u00c2\u00c4\5X-\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\37\2\2\u00c6\u00da\3\2\2\2"+
		"\u00c7\u00c8\7U\2\2\u00c8\u00c9\7\36\2\2\u00c9\u00ca\5:\36\2\u00ca\u00cb"+
		"\7$\2\2\u00cb\u00cc\5\\/\2\u00cc\u00cd\7$\2\2\u00cd\u00ce\5\\/\2\u00ce"+
		"\u00cf\7\37\2\2\u00cf\u00da\3\2\2\2\u00d0\u00da\5\n\6\2\u00d1\u00da\5"+
		"\34\17\2\u00d2\u00da\5*\26\2\u00d3\u00da\5&\24\2\u00d4\u00da\5\66\34\2"+
		"\u00d5\u00da\5\30\r\2\u00d6\u00da\5<\37\2\u00d7\u00da\5:\36\2\u00d8\u00da"+
		"\5P)\2\u00d9x\3\2\2\2\u00d9{\3\2\2\2\u00d9\177\3\2\2\2\u00d9\u0080\3\2"+
		"\2\2\u00d9\u0087\3\2\2\2\u00d9\u008c\3\2\2\2\u00d9\u0091\3\2\2\2\u00d9"+
		"\u0098\3\2\2\2\u00d9\u009f\3\2\2\2\u00d9\u00b2\3\2\2\2\u00d9\u00ba\3\2"+
		"\2\2\u00d9\u00c7\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9"+
		"\u00d2\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2"+
		"\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00ec\3\2\2\2\u00db\u00dc\f\31\2\2\u00dc\u00dd\t\6\2\2\u00dd\u00eb\5"+
		"\b\5\32\u00de\u00df\f\30\2\2\u00df\u00e0\t\7\2\2\u00e0\u00eb\5\b\5\31"+
		"\u00e1\u00e2\f\22\2\2\u00e2\u00e3\t\b\2\2\u00e3\u00eb\5\b\5\23\u00e4\u00e5"+
		"\f\17\2\2\u00e5\u00e6\t\t\2\2\u00e6\u00eb\5\b\5\20\u00e7\u00e8\f\16\2"+
		"\2\u00e8\u00e9\7\f\2\2\u00e9\u00eb\5\b\5\17\u00ea\u00db\3\2\2\2\u00ea"+
		"\u00de\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2"+
		"\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\t\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7*\2\2\u00f0\u00f1\7\36\2\2"+
		"\u00f1\u00f4\5:\36\2\u00f2\u00f3\7$\2\2\u00f3\u00f5\5:\36\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\7\37\2\2\u00f9\u0108\3\2\2\2\u00fa\u00fb\7"+
		"*\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00ff\5:\36\2\u00fd\u00fe\7$\2\2\u00fe"+
		"\u0100\5:\36\2\u00ff\u00fd\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\f\7\2\u0104"+
		"\u0105\5\16\b\2\u0105\u0106\7\37\2\2\u0106\u0108\3\2\2\2\u0107\u00ef\3"+
		"\2\2\2\u0107\u00fa\3\2\2\2\u0108\13\3\2\2\2\u0109\u010a\7$\2\2\u010a\u010c"+
		"\t\n\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\r\3\2\2\2\u010d"+
		"\u010e\7$\2\2\u010e\u0110\t\13\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\17\3\2\2\2\u0111\u0117\5\22\n\2\u0112\u0113\7Z\2\2\u0113\u0114"+
		"\7\3\2\2\u0114\u0117\5:\36\2\u0115\u0117\5,\27\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0112\3\2\2\2\u0116\u0115\3\2\2\2\u0117\21\3\2\2\2\u0118\u0119\7Z\2\2"+
		"\u0119\u011a\7_\2\2\u011a\u011b\7`\2\2\u011b\u011c\5:\36\2\u011c\u011d"+
		"\7\36\2\2\u011d\u0122\5:\36\2\u011e\u011f\7$\2\2\u011f\u0121\5:\36\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\37\2\2\u0126"+
		"\u0128\7 \2\2\u0127\u0129\5\24\13\2\u0128\u0127\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7!\2\2\u012d\23\3\2\2\2\u012e\u012f\5:\36\2\u012f\u0130\7%\2\2"+
		"\u0130\u0131\7\31\2\2\u0131\u0132\5T+\2\u0132\u0133\7\32\2\2\u0133\u0135"+
		"\5\b\5\2\u0134\u0136\5\26\f\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0141\3\2\2\2\u0137\u0138\5:\36\2\u0138\u0139\7%\2\2\u0139\u013a"+
		"\7\31\2\2\u013a\u013b\5\b\5\2\u013b\u013c\7\32\2\2\u013c\u013e\5\b\5\2"+
		"\u013d\u013f\5\26\f\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141"+
		"\3\2\2\2\u0140\u012e\3\2\2\2\u0140\u0137\3\2\2\2\u0141\25\3\2\2\2\u0142"+
		"\u0143\7\35\2\2\u0143\u0144\7\36\2\2\u0144\u0145\5P)\2\u0145\u0146\7\37"+
		"\2\2\u0146\27\3\2\2\2\u0147\u0148\7(\2\2\u0148\u0149\7\36\2\2\u0149\u0157"+
		"\5\\/\2\u014a\u014b\7$\2\2\u014b\u014c\7\64\2\2\u014c\u014d\7\36\2\2\u014d"+
		"\u0152\5:\36\2\u014e\u014f\7$\2\2\u014f\u0151\5:\36\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\37\2\2\u0156\u0158\3"+
		"\2\2\2\u0157\u014a\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\7\37\2\2\u015a\31\3\2\2\2\u015b\u015c\7)\2\2\u015c\u015d\7\36\2"+
		"\2\u015d\u015e\5\\/\2\u015e\u015f\7$\2\2\u015f\u0160\5:\36\2\u0160\u0161"+
		"\7\37\2\2\u0161\33\3\2\2\2\u0162\u0163\5:\36\2\u0163\u0164\7\"\2\2\u0164"+
		"\u0169\5\36\20\2\u0165\u0166\7$\2\2\u0166\u0168\5\36\20\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7#\2\2\u016d\u017d\3\2"+
		"\2\2\u016e\u016f\7\"\2\2\u016f\u0170\5$\23\2\u0170\u0171\7#\2\2\u0171"+
		"\u0172\7 \2\2\u0172\u0177\5\36\20\2\u0173\u0174\7$\2\2\u0174\u0176\5\36"+
		"\20\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7!"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u0162\3\2\2\2\u017c\u016e\3\2\2\2\u017d"+
		"\35\3\2\2\2\u017e\u017f\t\f\2\2\u017f\u0180\7\36\2\2\u0180\u0185\5 \21"+
		"\2\u0181\u0182\7$\2\2\u0182\u0184\5 \21\2\u0183\u0181\3\2\2\2\u0184\u0187"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0189\7\37\2\2\u0189\u01af\3\2\2\2\u018a\u018b\7"+
		"\66\2\2\u018b\u018c\7\36\2\2\u018c\u0191\5\b\5\2\u018d\u018e\7$\2\2\u018e"+
		"\u0190\5\b\5\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0195\7\37\2\2\u0195\u01af\3\2\2\2\u0196\u0197\7\67\2\2\u0197\u0198\7"+
		"\36\2\2\u0198\u019d\5\"\22\2\u0199\u019a\7$\2\2\u019a\u019c\5\"\22\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\37\2\2\u01a1"+
		"\u01af\3\2\2\2\u01a2\u01a3\78\2\2\u01a3\u01a4\7\36\2\2\u01a4\u01a9\5:"+
		"\36\2\u01a5\u01a6\7$\2\2\u01a6\u01a8\5:\36\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\37\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u017e\3\2\2\2\u01ae\u018a\3\2\2\2\u01ae\u0196\3\2\2\2\u01ae\u01a2\3\2"+
		"\2\2\u01af\37\3\2\2\2\u01b0\u01b3\5:\36\2\u01b1\u01b3\5<\37\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\7\34\2\2"+
		"\u01b5\u01b7\5\\/\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b9\7V\2\2\u01b9\u01bb\5^\60\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb!\3\2\2\2\u01bc\u01bd\5\b\5\2\u01bd\u01be\7\34\2\2"+
		"\u01be\u01c1\5\\/\2\u01bf\u01c0\7V\2\2\u01c0\u01c2\5^\60\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2#\3\2\2\2\u01c3\u01c4\7\61\2\2\u01c4"+
		"\u01c5\5:\36\2\u01c5\u01c6\7\34\2\2\u01c6\u01cc\5\\/\2\u01c7\u01c8\7$"+
		"\2\2\u01c8\u01c9\5:\36\2\u01c9\u01ca\7\34\2\2\u01ca\u01cb\5\\/\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7\63\2\2\u01d1"+
		"\u01d2\5\b\5\2\u01d2\u01e4\3\2\2\2\u01d3\u01d4\7\62\2\2\u01d4\u01d5\5"+
		":\36\2\u01d5\u01d6\7\34\2\2\u01d6\u01dc\5\\/\2\u01d7\u01d8\7$\2\2\u01d8"+
		"\u01d9\5:\36\2\u01d9\u01da\7\34\2\2\u01da\u01db\5\\/\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01d7\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\63\2\2\u01e1\u01e2\5"+
		"\b\5\2\u01e2\u01e4\3\2\2\2\u01e3\u01c3\3\2\2\2\u01e3\u01d3\3\2\2\2\u01e4"+
		"%\3\2\2\2\u01e5\u01e6\79\2\2\u01e6\u01e7\7\36\2\2\u01e7\u01ec\5:\36\2"+
		"\u01e8\u01e9\7$\2\2\u01e9\u01eb\5:\36\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\7\37\2\2\u01f0\u0205\3\2\2\2\u01f1\u01f2\7"+
		":\2\2\u01f2\u01f3\7\36\2\2\u01f3\u01f8\5:\36\2\u01f4\u01f5\7$\2\2\u01f5"+
		"\u01f7\5:\36\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fc\7\37\2\2\u01fc\u0205\3\2\2\2\u01fd\u01fe\t\r\2\2\u01fe\u01ff\7"+
		"\36\2\2\u01ff\u0200\5:\36\2\u0200\u0201\7$\2\2\u0201\u0202\5:\36\2\u0202"+
		"\u0203\7\37\2\2\u0203\u0205\3\2\2\2\u0204\u01e5\3\2\2\2\u0204\u01f1\3"+
		"\2\2\2\u0204\u01fd\3\2\2\2\u0205\'\3\2\2\2\u0206\u0207\7=\2\2\u0207\u0208"+
		"\7\36\2\2\u0208\u0209\5:\36\2\u0209\u020a\7$\2\2\u020a\u020b\5\b\5\2\u020b"+
		"\u020c\7\37\2\2\u020c\u021f\3\2\2\2\u020d\u020e\7>\2\2\u020e\u020f\5\b"+
		"\5\2\u020f\u0210\7\32\2\2\u0210\u0218\5\b\5\2\u0211\u0212\7?\2\2\u0212"+
		"\u0213\5\b\5\2\u0213\u0214\7\32\2\2\u0214\u0215\5\b\5\2\u0215\u0217\3"+
		"\2\2\2\u0216\u0211\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7@"+
		"\2\2\u021c\u021d\5\b\5\2\u021d\u021f\3\2\2\2\u021e\u0206\3\2\2\2\u021e"+
		"\u020d\3\2\2\2\u021f)\3\2\2\2\u0220\u0221\5`\61\2\u0221\u0222\7\36\2\2"+
		"\u0222\u0225\5> \2\u0223\u0224\7$\2\2\u0224\u0226\5\\/\2\u0225\u0223\3"+
		"\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\7\37\2\2\u0228"+
		"\u0229\7S\2\2\u0229\u022a\7\36\2\2\u022a\u022f\5:\36\2\u022b\u022c\7$"+
		"\2\2\u022c\u022e\5:\36\2\u022d\u022b\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0232\u0233\7\37\2\2\u0233+\3\2\2\2\u0234\u0235\7Z\2\2\u0235\u0236"+
		"\7c\2\2\u0236\u0237\5:\36\2\u0237\u0238\7\36\2\2\u0238\u0239\5.\30\2\u0239"+
		"\u023a\7$\2\2\u023a\u023b\7B\2\2\u023b\u023c\5:\36\2\u023c\u023d\7\34"+
		"\2\2\u023d\u023e\t\16\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\37\2\2\u0240"+
		"\u0242\7 \2\2\u0241\u0243\5\6\4\2\u0242\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\7!\2\2\u0247-\3\2\2\2\u0248\u024d\5\60\31\2\u0249\u024a\7$\2\2"+
		"\u024a\u024c\5\60\31\2\u024b\u0249\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e/\3\2\2\2\u024f\u024d\3\2\2\2\u0250"+
		"\u0251\7A\2\2\u0251\u0252\5:\36\2\u0252\u0253\7\34\2\2\u0253\u0254\t\16"+
		"\2\2\u0254\61\3\2\2\2\u0255\u0256\7f\2\2\u0256\u0257\5:\36\2\u0257\u0258"+
		"\7\36\2\2\u0258\u025d\5:\36\2\u0259\u025a\7$\2\2\u025a\u025c\5:\36\2\u025b"+
		"\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\37\2\2\u0261"+
		"\63\3\2\2\2\u0262\u0263\7d\2\2\u0263\u0264\7e\2\2\u0264\u0265\5:\36\2"+
		"\u0265\u0266\7\36\2\2\u0266\u026b\5:\36\2\u0267\u0268\7$\2\2\u0268\u026a"+
		"\5:\36\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\37"+
		"\2\2\u026f\u0270\7 \2\2\u0270\u0271\7g\2\2\u0271\u0272\5\b\5\2\u0272\u0273"+
		"\7\34\2\2\u0273\u0274\5@!\2\u0274\u0275\7!\2\2\u0275\65\3\2\2\2\u0276"+
		"\u0277\5:\36\2\u0277\u0278\7\36\2\2\u0278\u027d\5:\36\2\u0279\u027a\7"+
		"$\2\2\u027a\u027c\5:\36\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0281\7\37\2\2\u0281\67\3\2\2\2\u0282\u0283\7\4\2\2\u0283\u0286"+
		"\5:\36\2\u0284\u0286\7\5\2\2\u0285\u0282\3\2\2\2\u0285\u0284\3\2\2\2\u0286"+
		"9\3\2\2\2\u0287\u0288\t\17\2\2\u0288;\3\2\2\2\u0289\u028a\5:\36\2\u028a"+
		"\u028b\7\7\2\2\u028b\u028c\5:\36\2\u028c=\3\2\2\2\u028d\u0290\5:\36\2"+
		"\u028e\u0290\5<\37\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290?\3"+
		"\2\2\2\u0291\u0294\5B\"\2\u0292\u0294\7n\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294A\3\2\2\2\u0295\u029c\5D#\2\u0296\u029c\5F$\2\u0297"+
		"\u029c\5H%\2\u0298\u029c\5J&\2\u0299\u029c\5L\'\2\u029a\u029c\5N(\2\u029b"+
		"\u0295\3\2\2\2\u029b\u0296\3\2\2\2\u029b\u0297\3\2\2\2\u029b\u0298\3\2"+
		"\2\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029cC\3\2\2\2\u029d\u029e"+
		"\7h\2\2\u029eE\3\2\2\2\u029f\u02a0\7l\2\2\u02a0G\3\2\2\2\u02a1\u02a2\7"+
		"m\2\2\u02a2I\3\2\2\2\u02a3\u02a4\7j\2\2\u02a4K\3\2\2\2\u02a5\u02a6\7k"+
		"\2\2\u02a6M\3\2\2\2\u02a7\u02a8\7i\2\2\u02a8O\3\2\2\2\u02a9\u02b0\5R*"+
		"\2\u02aa\u02b0\5T+\2\u02ab\u02b0\5V,\2\u02ac\u02b0\5X-\2\u02ad\u02b0\5"+
		"Z.\2\u02ae\u02b0\5\\/\2\u02af\u02a9\3\2\2\2\u02af\u02aa\3\2\2\2\u02af"+
		"\u02ab\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2"+
		"\2\2\u02b0Q\3\2\2\2\u02b1\u02b2\7h\2\2\u02b2S\3\2\2\2\u02b3\u02b4\7r\2"+
		"\2\u02b4U\3\2\2\2\u02b5\u02b6\7o\2\2\u02b6W\3\2\2\2\u02b7\u02b8\7p\2\2"+
		"\u02b8Y\3\2\2\2\u02b9\u02ba\7s\2\2\u02ba[\3\2\2\2\u02bb\u02bc\7q\2\2\u02bc"+
		"]\3\2\2\2\u02bd\u02be\t\20\2\2\u02be_\3\2\2\2\u02bf\u02c0\t\21\2\2\u02c0"+
		"a\3\2\2\2:dhr\u00a1\u00aa\u00b2\u00bf\u00c3\u00d9\u00ea\u00ec\u00f6\u0101"+
		"\u0107\u010b\u010f\u0116\u0122\u012a\u0135\u013e\u0140\u0152\u0157\u0169"+
		"\u0177\u017c\u0185\u0191\u019d\u01a9\u01ae\u01b2\u01b6\u01ba\u01c1\u01ce"+
		"\u01de\u01e3\u01ec\u01f8\u0204\u0218\u021e\u0225\u022f\u0244\u024d\u025d"+
		"\u026b\u027d\u0285\u028f\u0293\u029b\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}