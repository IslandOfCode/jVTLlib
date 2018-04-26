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
		MOD=75, TRUNC=76, SUBSTR=77, ROLE=78, IDENTIFIER=79, MEASURE=80, ATTRIBUTE=81, 
		DEFINE=82, DEFVAR=83, DEFVALUEDOM=84, DEFDATSTRUCT=85, DEFDATASET=86, 
		DATAPOINT=87, RULESET=88, HIERARCHICAL=89, MAPPING=90, PROCEDURE=91, CREATE=92, 
		FUNCTION=93, CALL=94, RETURN=95, NULLTYPE=96, STRINGTYPE=97, INTTYPE=98, 
		FLOATTYPE=99, BOOLTYPE=100, DATETYPE=101, DATASET=102, DATE_LITERAL=103, 
		INTEGER_LITERAL=104, STRING_LITERAL=105, BOOLEAN_LITERAL=106, FLOAT_LITERAL=107, 
		REG_IDENTIFIER=108, ESCAPED_IDENTIFIER=109, WS=110, COMMENT=111, LINE_COMMENT=112;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_assignment = 2, RULE_expr = 3, 
		RULE_checkfunction = 4, RULE_checkParamEnum = 5, RULE_checkParamOpt = 6, 
		RULE_define = 7, RULE_dpruleset = 8, RULE_singlerule = 9, RULE_errorCode = 10, 
		RULE_getFunction = 11, RULE_putFunction = 12, RULE_clausefun = 13, RULE_clausebody = 14, 
		RULE_clausebodyparam = 15, RULE_clausebodycalc = 16, RULE_joinblock = 17, 
		RULE_setfun = 18, RULE_condOperator = 19, RULE_namedProcDef = 20, RULE_procVarInList = 21, 
		RULE_singleVarIn = 22, RULE_callProc = 23, RULE_namedFunDef = 24, RULE_callFun = 25, 
		RULE_debug = 26, RULE_varname = 27, RULE_varmember = 28, RULE_dataType = 29, 
		RULE_scalartype = 30, RULE_nulltype = 31, RULE_booleantype = 32, RULE_datetype = 33, 
		RULE_integertype = 34, RULE_floattype = 35, RULE_stringtype = 36, RULE_literal = 37, 
		RULE_nullLiteral = 38, RULE_booleanLiteral = 39, RULE_dateLiteral = 40, 
		RULE_integerLiteral = 41, RULE_floatLiteral = 42, RULE_stringLiteral = 43, 
		RULE_componentRole = 44;
	public static final String[] ruleNames = {
		"parse", "statement", "assignment", "expr", "checkfunction", "checkParamEnum", 
		"checkParamOpt", "define", "dpruleset", "singlerule", "errorCode", "getFunction", 
		"putFunction", "clausefun", "clausebody", "clausebodyparam", "clausebodycalc", 
		"joinblock", "setfun", "condOperator", "namedProcDef", "procVarInList", 
		"singleVarIn", "callProc", "namedFunDef", "callFun", "debug", "varname", 
		"varmember", "dataType", "scalartype", "nulltype", "booleantype", "datetype", 
		"integertype", "floattype", "stringtype", "literal", "nullLiteral", "booleanLiteral", 
		"dateLiteral", "integerLiteral", "floatLiteral", "stringLiteral", "componentRole"
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
		"'substr'", "'role'", null, null, null, "'define'", "'defineVariable'", 
		"'defineValueDomain'", "'defineDataStructure'", "'defineDataSet'", "'datapoint'", 
		"'ruleset'", "'hierarchical'", "'mapping'", "'procedure'", "'create'", 
		"'function'", "'call'", "'return'", "'null'", "'string'", "'integer'", 
		"'float'", "'boolean'", "'date'", "'dataset'"
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
		"POW", "SQRT", "NROOT", "MOD", "TRUNC", "SUBSTR", "ROLE", "IDENTIFIER", 
		"MEASURE", "ATTRIBUTE", "DEFINE", "DEFVAR", "DEFVALUEDOM", "DEFDATSTRUCT", 
		"DEFDATASET", "DATAPOINT", "RULESET", "HIERARCHICAL", "MAPPING", "PROCEDURE", 
		"CREATE", "FUNCTION", "CALL", "RETURN", "NULLTYPE", "STRINGTYPE", "INTTYPE", 
		"FLOATTYPE", "BOOLTYPE", "DATETYPE", "DATASET", "DATE_LITERAL", "INTEGER_LITERAL", 
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
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << PUT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (DEFINE - 82)) | (1L << (CREATE - 82)) | (1L << (REG_IDENTIFIER - 82)) | (1L << (ESCAPED_IDENTIFIER - 82)))) != 0) );
			setState(95);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PutDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				putFunction();
				}
				break;
			case 2:
				_localctx = new DefinestatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				define();
				}
				break;
			case 3:
				_localctx = new CallProcStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				callProc();
				}
				break;
			case 4:
				_localctx = new DefFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				namedFunDef();
				}
				break;
			case 5:
				_localctx = new AssingstatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				assignment();
				}
				break;
			case 6:
				_localctx = new DebugstatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				debug();
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
			setState(105);
			varname();
			setState(106);
			match(ASSIGN);
			setState(107);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
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
				setState(111);
				((UnaryexprContext)_localctx).right = expr(24);
				}
				break;
			case 2:
				{
				_localctx = new PrecedenceexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(LPAR);
				setState(113);
				expr(0);
				setState(114);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CondOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				condOperator();
				}
				break;
			case 4:
				{
				_localctx = new RoundexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(ROUND);
				setState(118);
				match(LPAR);
				setState(119);
				varname();
				setState(120);
				match(COMMA);
				setState(121);
				integerLiteral();
				setState(122);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new CeilFloorexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
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
				setState(125);
				match(LPAR);
				setState(126);
				varname();
				setState(127);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new SingleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
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
				setState(130);
				match(LPAR);
				setState(131);
				varname();
				setState(132);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new DoubleparamMathfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
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
				setState(135);
				match(LPAR);
				setState(136);
				varname();
				setState(137);
				match(COMMA);
				setState(138);
				integerLiteral();
				setState(139);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new LogexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(LOG);
				setState(142);
				match(LPAR);
				setState(143);
				integerLiteral();
				setState(144);
				match(COMMA);
				setState(145);
				varname();
				setState(146);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new InCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				varname();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(149);
					match(NOT);
					}
				}

				setState(152);
				match(IN);
				setState(153);
				match(LPAR);
				setState(154);
				literal();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(155);
					match(COMMA);
					setState(156);
					literal();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new IsNullCondexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOT) {
					{
					{
					setState(164);
					match(NOT);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(ISNULL);
				setState(171);
				match(LPAR);
				setState(172);
				expr(0);
				setState(173);
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new StringFunSubstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(SUBSTR);
				setState(176);
				match(LPAR);
				setState(177);
				expr(0);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(178);
					match(COMMA);
					setState(179);
					integerLiteral();
					}
					break;
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(182);
					match(COMMA);
					setState(183);
					integerLiteral();
					}
				}

				setState(186);
				match(RPAR);
				}
				break;
			case 12:
				{
				_localctx = new CheckExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				checkfunction();
				}
				break;
			case 13:
				{
				_localctx = new ClauseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				clausefun();
				}
				break;
			case 14:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				setfun();
				}
				break;
			case 15:
				{
				_localctx = new CallFunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				callFun();
				}
				break;
			case 16:
				{
				_localctx = new GetDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				getFunction();
				}
				break;
			case 17:
				{
				_localctx = new MembershipexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				varmember();
				}
				break;
			case 18:
				{
				_localctx = new VarexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				varname();
				}
				break;
			case 19:
				{
				_localctx = new LiteralexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AddMulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(199);
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
						setState(200);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new MinDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(202);
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
						setState(203);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new RelationalCondContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(205);
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
						setState(206);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new LogicalexprContext(new ExprContext(_parentctx, _parentState));
						((LogicalexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(208);
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
						setState(209);
						((LogicalexprContext)_localctx).right = expr(12);
						}
						break;
					case 5:
						{
						_localctx = new StringConcatContext(new ExprContext(_parentctx, _parentState));
						((StringConcatContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(211);
						match(CONCAT);
						setState(212);
						((StringConcatContext)_localctx).b = expr(11);
						}
						break;
					}
					} 
				}
				setState(217);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CheckFunBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(CHECK);
				setState(219);
				match(LPAR);
				setState(220);
				varname();
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					varname();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(227);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new CheckFunWithOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(CHECK);
				setState(230);
				match(LPAR);
				setState(231);
				varname();
				setState(234); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(232);
						match(COMMA);
						setState(233);
						varname();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(236); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(238);
				checkParamEnum();
				setState(239);
				checkParamOpt();
				setState(240);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(244);
				match(COMMA);
				setState(245);
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
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(248);
				match(COMMA);
				setState(249);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DatapointrulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				dpruleset();
				}
				break;
			case 2:
				_localctx = new DefinevariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(DEFINE);
				setState(254);
				match(T__0);
				setState(255);
				varname();
				}
				break;
			case 3:
				_localctx = new DefineProcedureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
			setState(259);
			match(DEFINE);
			setState(260);
			match(DATAPOINT);
			setState(261);
			match(RULESET);
			setState(262);
			varname();
			setState(263);
			match(LPAR);
			setState(264);
			varname();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				varname();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(RPAR);
			setState(273);
			match(LBRA);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				singlerule();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(279);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SingleruleConsequenceOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				varname();
				setState(282);
				match(COLON);
				setState(283);
				match(WHEN);
				setState(284);
				booleanLiteral();
				setState(285);
				match(THEN);
				setState(286);
				expr(0);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(287);
					errorCode();
					}
				}

				}
				break;
			case 2:
				_localctx = new SingleruleBothContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				varname();
				setState(291);
				match(COLON);
				setState(292);
				match(WHEN);
				setState(293);
				expr(0);
				setState(294);
				match(THEN);
				setState(295);
				expr(0);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ERRCODE) {
					{
					setState(296);
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
			setState(301);
			match(ERRCODE);
			setState(302);
			match(LPAR);
			setState(303);
			literal();
			setState(304);
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
			setState(306);
			match(GET);
			setState(307);
			match(LPAR);
			setState(308);
			stringLiteral();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(309);
				match(COMMA);
				setState(310);
				match(KEEP);
				setState(311);
				match(LPAR);
				setState(312);
				varname();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					varname();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(RPAR);
				}
			}

			setState(324);
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
			setState(326);
			match(PUT);
			setState(327);
			match(LPAR);
			setState(328);
			stringLiteral();
			setState(329);
			match(COMMA);
			setState(330);
			varname();
			setState(331);
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new ClausebaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				varname();
				setState(334);
				match(LSQR);
				setState(335);
				clausebody();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(336);
					match(COMMA);
					setState(337);
					clausebody();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(RSQR);
				}
				break;
			case LSQR:
				_localctx = new ClausejoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(LSQR);
				setState(346);
				joinblock();
				setState(347);
				match(RSQR);
				setState(348);
				match(LBRA);
				setState(349);
				clausebody();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(350);
					match(COMMA);
					setState(351);
					clausebody();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
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
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEEP:
			case RENAME:
				_localctx = new ClauseKeepRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
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
				setState(362);
				match(LPAR);
				setState(363);
				clausebodyparam();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(364);
					match(COMMA);
					setState(365);
					clausebodyparam();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(RPAR);
				}
				break;
			case FILTER:
				_localctx = new ClauseFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(FILTER);
				setState(374);
				match(LPAR);
				setState(375);
				expr(0);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(377);
					expr(0);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(RPAR);
				}
				break;
			case CALC:
				_localctx = new ClausecalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(CALC);
				setState(386);
				match(LPAR);
				setState(387);
				clausebodycalc();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(388);
					match(COMMA);
					setState(389);
					clausebodycalc();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				match(RPAR);
				}
				break;
			case DROP:
				_localctx = new ClausedropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(DROP);
				setState(398);
				match(LPAR);
				setState(399);
				varname();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(400);
					match(COMMA);
					setState(401);
					varname();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
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
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(411);
				varname();
				}
				break;
			case 2:
				{
				setState(412);
				varmember();
				}
				break;
			}
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(415);
				match(AS);
				setState(416);
				stringLiteral();
				}
			}

			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(419);
				match(ROLE);
				setState(420);
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
			setState(423);
			expr(0);
			setState(424);
			match(AS);
			setState(425);
			stringLiteral();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(426);
				match(ROLE);
				setState(427);
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
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				_localctx = new JoinblockInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(INNER);
				setState(431);
				varname();
				setState(432);
				match(AS);
				setState(433);
				stringLiteral();
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(434);
					match(COMMA);
					setState(435);
					varname();
					setState(436);
					match(AS);
					setState(437);
					stringLiteral();
					}
					}
					setState(441); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(443);
				match(ON);
				setState(444);
				expr(0);
				}
				break;
			case LEFT:
				_localctx = new JoinblockLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(LEFT);
				setState(447);
				varname();
				setState(448);
				match(AS);
				setState(449);
				stringLiteral();
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(450);
					match(COMMA);
					setState(451);
					varname();
					setState(452);
					match(AS);
					setState(453);
					stringLiteral();
					}
					}
					setState(457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(459);
				match(ON);
				setState(460);
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
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				_localctx = new SetUnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(UNION);
				setState(465);
				match(LPAR);
				setState(466);
				varname();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(467);
					match(COMMA);
					setState(468);
					varname();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
				match(RPAR);
				}
				break;
			case INTERSECT:
				_localctx = new SetIntersectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(INTERSECT);
				setState(477);
				match(LPAR);
				setState(478);
				varname();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(479);
					match(COMMA);
					setState(480);
					varname();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
				match(RPAR);
				}
				break;
			case SYMDIFF:
			case SETDIFF:
				_localctx = new SetSetSymDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
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
				setState(489);
				match(LPAR);
				setState(490);
				varname();
				setState(491);
				match(COMMA);
				setState(492);
				varname();
				setState(493);
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
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NVL:
				_localctx = new NvlCondOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(NVL);
				setState(498);
				match(LPAR);
				setState(499);
				varname();
				setState(500);
				match(COMMA);
				setState(501);
				expr(0);
				setState(502);
				match(RPAR);
				}
				break;
			case IF:
				_localctx = new IfThenElseCondOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(IF);
				setState(505);
				expr(0);
				setState(506);
				match(THEN);
				setState(507);
				expr(0);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(508);
					match(ELSEIF);
					setState(509);
					expr(0);
					setState(510);
					match(THEN);
					setState(511);
					expr(0);
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(518);
				match(ELSE);
				setState(519);
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
		enterRule(_localctx, 40, RULE_namedProcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(DEFINE);
			setState(524);
			match(PROCEDURE);
			setState(525);
			varname();
			setState(526);
			match(LPAR);
			setState(527);
			procVarInList();
			{
			setState(528);
			match(COMMA);
			setState(529);
			match(OUTPUT);
			setState(530);
			varname();
			setState(531);
			match(AS);
			setState(532);
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
			setState(534);
			match(RPAR);
			setState(535);
			match(LBRA);
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(536);
				assignment();
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(541);
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
		enterRule(_localctx, 42, RULE_procVarInList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			singleVarIn();
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(544);
					match(COMMA);
					setState(545);
					singleVarIn();
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 44, RULE_singleVarIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(551);
			match(INPUT);
			setState(552);
			varname();
			setState(553);
			match(AS);
			setState(554);
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
		enterRule(_localctx, 46, RULE_callProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			varname();
			setState(557);
			match(LPAR);
			setState(558);
			varname();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(559);
				match(COMMA);
				setState(560);
				varname();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
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
		enterRule(_localctx, 48, RULE_namedFunDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(CREATE);
			setState(569);
			match(FUNCTION);
			setState(570);
			varname();
			setState(571);
			match(LPAR);
			setState(572);
			varname();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(573);
				match(COMMA);
				setState(574);
				varname();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(RPAR);
			setState(581);
			match(LBRA);
			setState(582);
			match(RETURN);
			setState(583);
			expr(0);
			setState(584);
			match(AS);
			setState(585);
			dataType();
			setState(586);
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
		enterRule(_localctx, 50, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(CALL);
			setState(589);
			varname();
			setState(590);
			match(LPAR);
			setState(591);
			varname();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(592);
				match(COMMA);
				setState(593);
				varname();
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
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
		enterRule(_localctx, 52, RULE_debug);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new DBGprintvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				match(T__1);
				setState(602);
				varname();
				}
				break;
			case T__2:
				_localctx = new DBGnopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
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
		enterRule(_localctx, 54, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
		enterRule(_localctx, 56, RULE_varmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			((VarmemberContext)_localctx).left = varname();
			setState(609);
			((VarmemberContext)_localctx).op = match(MEMBER);
			setState(610);
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
		enterRule(_localctx, 58, RULE_dataType);
		try {
			setState(614);
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
				setState(612);
				scalartype();
				}
				break;
			case DATASET:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
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
		enterRule(_localctx, 60, RULE_scalartype);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				nulltype();
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				booleantype();
				}
				break;
			case DATETYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				datetype();
				}
				break;
			case INTTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				integertype();
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(620);
				floattype();
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(621);
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
		enterRule(_localctx, 62, RULE_nulltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
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
		enterRule(_localctx, 64, RULE_booleantype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
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
		enterRule(_localctx, 66, RULE_datetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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
		enterRule(_localctx, 68, RULE_integertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
		enterRule(_localctx, 70, RULE_floattype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
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
		enterRule(_localctx, 72, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		enterRule(_localctx, 74, RULE_literal);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				nullLiteral();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				booleanLiteral();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				dateLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(641);
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
		enterRule(_localctx, 76, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		enterRule(_localctx, 78, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
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
		enterRule(_localctx, 80, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		enterRule(_localctx, 82, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
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
		enterRule(_localctx, 84, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
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
		enterRule(_localctx, 86, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		enterRule(_localctx, 88, RULE_componentRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((ComponentRoleContext)_localctx).role = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IDENTIFIER - 79)) | (1L << (MEASURE - 79)) | (1L << (ATTRIBUTE - 79)))) != 0)) ) {
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
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u0295\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\6\2^\n\2\r\2\16\2_\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0099\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3\13\5\3\5\3\5\3\5\7\5\u00a8"+
		"\n\5\f\5\16\5\u00ab\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b7"+
		"\n\5\3\5\3\5\5\5\u00bb\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u00c7\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u00d8\n\5\f\5\16\5\u00db\13\5\3\6\3\6\3\6\3\6\3\6\6\6\u00e2\n\6\r"+
		"\6\16\6\u00e3\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00ed\n\6\r\6\16\6\u00ee"+
		"\3\6\3\6\3\6\3\6\5\6\u00f5\n\6\3\7\3\7\5\7\u00f9\n\7\3\b\3\b\5\b\u00fd"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0104\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u010e\n\n\f\n\16\n\u0111\13\n\3\n\3\n\3\n\6\n\u0116\n\n\r\n\16\n"+
		"\u0117\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0123\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012c\n\13\5\13\u012e\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013e\n\r\f\r\16"+
		"\r\u0141\13\r\3\r\3\r\5\r\u0145\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0155\n\17\f\17\16\17\u0158\13"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0163\n\17\f\17"+
		"\16\17\u0166\13\17\3\17\3\17\5\17\u016a\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0171\n\20\f\20\16\20\u0174\13\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u017d\n\20\f\20\16\20\u0180\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0189\n\20\f\20\16\20\u018c\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0195\n\20\f\20\16\20\u0198\13\20\3\20\3\20\5\20"+
		"\u019c\n\20\3\21\3\21\5\21\u01a0\n\21\3\21\3\21\5\21\u01a4\n\21\3\21\3"+
		"\21\5\21\u01a8\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u01af\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u01ba\n\23\r\23\16\23\u01bb\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u01ca"+
		"\n\23\r\23\16\23\u01cb\3\23\3\23\3\23\5\23\u01d1\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u01d8\n\24\f\24\16\24\u01db\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u01e4\n\24\f\24\16\24\u01e7\13\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u01f2\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0204\n\25"+
		"\f\25\16\25\u0207\13\25\3\25\3\25\3\25\5\25\u020c\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u021c\n\26"+
		"\r\26\16\26\u021d\3\26\3\26\3\27\3\27\3\27\7\27\u0225\n\27\f\27\16\27"+
		"\u0228\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0234"+
		"\n\31\f\31\16\31\u0237\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u0242\n\32\f\32\16\32\u0245\13\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0255\n\33\f\33\16\33"+
		"\u0258\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u025f\n\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\5\37\u0269\n\37\3 \3 \3 \3 \3 \3 \5 \u0271\n "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0285"+
		"\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\2\3\b/\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\21\4"+
		"\2\n\13\26\26\3\2DE\4\2FHKK\4\2JJLN\4\2\b\b\n\n\4\2\t\t\13\13\3\2\r\22"+
		"\3\2\23\24\3\2+-\3\2./\3\2\64\65\3\2;<\4\2cchh\3\2no\3\2QS\u02bf\2]\3"+
		"\2\2\2\4i\3\2\2\2\6k\3\2\2\2\b\u00c6\3\2\2\2\n\u00f4\3\2\2\2\f\u00f8\3"+
		"\2\2\2\16\u00fc\3\2\2\2\20\u0103\3\2\2\2\22\u0105\3\2\2\2\24\u012d\3\2"+
		"\2\2\26\u012f\3\2\2\2\30\u0134\3\2\2\2\32\u0148\3\2\2\2\34\u0169\3\2\2"+
		"\2\36\u019b\3\2\2\2 \u019f\3\2\2\2\"\u01a9\3\2\2\2$\u01d0\3\2\2\2&\u01f1"+
		"\3\2\2\2(\u020b\3\2\2\2*\u020d\3\2\2\2,\u0221\3\2\2\2.\u0229\3\2\2\2\60"+
		"\u022e\3\2\2\2\62\u023a\3\2\2\2\64\u024e\3\2\2\2\66\u025e\3\2\2\28\u0260"+
		"\3\2\2\2:\u0262\3\2\2\2<\u0268\3\2\2\2>\u0270\3\2\2\2@\u0272\3\2\2\2B"+
		"\u0274\3\2\2\2D\u0276\3\2\2\2F\u0278\3\2\2\2H\u027a\3\2\2\2J\u027c\3\2"+
		"\2\2L\u0284\3\2\2\2N\u0286\3\2\2\2P\u0288\3\2\2\2R\u028a\3\2\2\2T\u028c"+
		"\3\2\2\2V\u028e\3\2\2\2X\u0290\3\2\2\2Z\u0292\3\2\2\2\\^\5\4\3\2]\\\3"+
		"\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\2\2\3b\3\3\2\2\2cj"+
		"\5\32\16\2dj\5\20\t\2ej\5\60\31\2fj\5\62\32\2gj\5\6\4\2hj\5\66\34\2ic"+
		"\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\5\3\2\2\2"+
		"kl\58\35\2lm\7\6\2\2mn\5\b\5\2n\7\3\2\2\2op\b\5\1\2pq\t\2\2\2q\u00c7\5"+
		"\b\5\32rs\7\36\2\2st\5\b\5\2tu\7\37\2\2u\u00c7\3\2\2\2v\u00c7\5(\25\2"+
		"wx\7C\2\2xy\7\36\2\2yz\58\35\2z{\7$\2\2{|\5T+\2|}\7\37\2\2}\u00c7\3\2"+
		"\2\2~\177\t\3\2\2\177\u0080\7\36\2\2\u0080\u0081\58\35\2\u0081\u0082\7"+
		"\37\2\2\u0082\u00c7\3\2\2\2\u0083\u0084\t\4\2\2\u0084\u0085\7\36\2\2\u0085"+
		"\u0086\58\35\2\u0086\u0087\7\37\2\2\u0087\u00c7\3\2\2\2\u0088\u0089\t"+
		"\5\2\2\u0089\u008a\7\36\2\2\u008a\u008b\58\35\2\u008b\u008c\7$\2\2\u008c"+
		"\u008d\5T+\2\u008d\u008e\7\37\2\2\u008e\u00c7\3\2\2\2\u008f\u0090\7I\2"+
		"\2\u0090\u0091\7\36\2\2\u0091\u0092\5T+\2\u0092\u0093\7$\2\2\u0093\u0094"+
		"\58\35\2\u0094\u0095\7\37\2\2\u0095\u00c7\3\2\2\2\u0096\u0098\58\35\2"+
		"\u0097\u0099\7\26\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\7\33\2\2\u009b\u009c\7\36\2\2\u009c\u00a1\5L\'\2"+
		"\u009d\u009e\7$\2\2\u009e\u00a0\5L\'\2\u009f\u009d\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00c7\3\2\2\2\u00a6\u00a8\7"+
		"\26\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\27"+
		"\2\2\u00ad\u00ae\7\36\2\2\u00ae\u00af\5\b\5\2\u00af\u00b0\7\37\2\2\u00b0"+
		"\u00c7\3\2\2\2\u00b1\u00b2\7O\2\2\u00b2\u00b3\7\36\2\2\u00b3\u00b6\5\b"+
		"\5\2\u00b4\u00b5\7$\2\2\u00b5\u00b7\5T+\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\u00bb\5T+\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\37"+
		"\2\2\u00bd\u00c7\3\2\2\2\u00be\u00c7\5\n\6\2\u00bf\u00c7\5\34\17\2\u00c0"+
		"\u00c7\5&\24\2\u00c1\u00c7\5\64\33\2\u00c2\u00c7\5\30\r\2\u00c3\u00c7"+
		"\5:\36\2\u00c4\u00c7\58\35\2\u00c5\u00c7\5L\'\2\u00c6o\3\2\2\2\u00c6r"+
		"\3\2\2\2\u00c6v\3\2\2\2\u00c6w\3\2\2\2\u00c6~\3\2\2\2\u00c6\u0083\3\2"+
		"\2\2\u00c6\u0088\3\2\2\2\u00c6\u008f\3\2\2\2\u00c6\u0096\3\2\2\2\u00c6"+
		"\u00a9\3\2\2\2\u00c6\u00b1\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00bf\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00d9\3\2"+
		"\2\2\u00c8\u00c9\f\27\2\2\u00c9\u00ca\t\6\2\2\u00ca\u00d8\5\b\5\30\u00cb"+
		"\u00cc\f\26\2\2\u00cc\u00cd\t\7\2\2\u00cd\u00d8\5\b\5\27\u00ce\u00cf\f"+
		"\20\2\2\u00cf\u00d0\t\b\2\2\u00d0\u00d8\5\b\5\21\u00d1\u00d2\f\r\2\2\u00d2"+
		"\u00d3\t\t\2\2\u00d3\u00d8\5\b\5\16\u00d4\u00d5\f\f\2\2\u00d5\u00d6\7"+
		"\f\2\2\u00d6\u00d8\5\b\5\r\u00d7\u00c8\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7"+
		"\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\t\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\u00de\7\36\2\2\u00de\u00e1\58\35\2\u00df"+
		"\u00e0\7$\2\2\u00e0\u00e2\58\35\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7\37\2\2\u00e6\u00f5\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\7\36"+
		"\2\2\u00e9\u00ec\58\35\2\u00ea\u00eb\7$\2\2\u00eb\u00ed\58\35\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\f\7\2\u00f1\u00f2\5\16\b\2\u00f2"+
		"\u00f3\7\37\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00e7\3"+
		"\2\2\2\u00f5\13\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7\u00f9\t\n\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\r\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb"+
		"\u00fd\t\13\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\17\3\2\2"+
		"\2\u00fe\u0104\5\22\n\2\u00ff\u0100\7T\2\2\u0100\u0101\7\3\2\2\u0101\u0104"+
		"\58\35\2\u0102\u0104\5*\26\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\21\3\2\2\2\u0105\u0106\7T\2\2\u0106\u0107\7Y\2\2"+
		"\u0107\u0108\7Z\2\2\u0108\u0109\58\35\2\u0109\u010a\7\36\2\2\u010a\u010f"+
		"\58\35\2\u010b\u010c\7$\2\2\u010c\u010e\58\35\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\37\2\2\u0113\u0115\7 \2\2\u0114"+
		"\u0116\5\24\13\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7!\2\2\u011a"+
		"\23\3\2\2\2\u011b\u011c\58\35\2\u011c\u011d\7%\2\2\u011d\u011e\7\31\2"+
		"\2\u011e\u011f\5P)\2\u011f\u0120\7\32\2\2\u0120\u0122\5\b\5\2\u0121\u0123"+
		"\5\26\f\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u012e\3\2\2\2"+
		"\u0124\u0125\58\35\2\u0125\u0126\7%\2\2\u0126\u0127\7\31\2\2\u0127\u0128"+
		"\5\b\5\2\u0128\u0129\7\32\2\2\u0129\u012b\5\b\5\2\u012a\u012c\5\26\f\2"+
		"\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u011b"+
		"\3\2\2\2\u012d\u0124\3\2\2\2\u012e\25\3\2\2\2\u012f\u0130\7\35\2\2\u0130"+
		"\u0131\7\36\2\2\u0131\u0132\5L\'\2\u0132\u0133\7\37\2\2\u0133\27\3\2\2"+
		"\2\u0134\u0135\7(\2\2\u0135\u0136\7\36\2\2\u0136\u0144\5X-\2\u0137\u0138"+
		"\7$\2\2\u0138\u0139\7\64\2\2\u0139\u013a\7\36\2\2\u013a\u013f\58\35\2"+
		"\u013b\u013c\7$\2\2\u013c\u013e\58\35\2\u013d\u013b\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\7\37\2\2\u0143\u0145\3\2\2\2\u0144\u0137\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\37\2\2\u0147"+
		"\31\3\2\2\2\u0148\u0149\7)\2\2\u0149\u014a\7\36\2\2\u014a\u014b\5X-\2"+
		"\u014b\u014c\7$\2\2\u014c\u014d\58\35\2\u014d\u014e\7\37\2\2\u014e\33"+
		"\3\2\2\2\u014f\u0150\58\35\2\u0150\u0151\7\"\2\2\u0151\u0156\5\36\20\2"+
		"\u0152\u0153\7$\2\2\u0153\u0155\5\36\20\2\u0154\u0152\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\7#\2\2\u015a\u016a\3\2\2\2\u015b\u015c\7\""+
		"\2\2\u015c\u015d\5$\23\2\u015d\u015e\7#\2\2\u015e\u015f\7 \2\2\u015f\u0164"+
		"\5\36\20\2\u0160\u0161\7$\2\2\u0161\u0163\5\36\20\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7!\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u014f\3\2\2\2\u0169\u015b\3\2\2\2\u016a\35\3\2\2\2\u016b\u016c\t\f\2"+
		"\2\u016c\u016d\7\36\2\2\u016d\u0172\5 \21\2\u016e\u016f\7$\2\2\u016f\u0171"+
		"\5 \21\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\37"+
		"\2\2\u0176\u019c\3\2\2\2\u0177\u0178\7\66\2\2\u0178\u0179\7\36\2\2\u0179"+
		"\u017e\5\b\5\2\u017a\u017b\7$\2\2\u017b\u017d\5\b\5\2\u017c\u017a\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\37\2\2\u0182\u019c\3"+
		"\2\2\2\u0183\u0184\7\67\2\2\u0184\u0185\7\36\2\2\u0185\u018a\5\"\22\2"+
		"\u0186\u0187\7$\2\2\u0187\u0189\5\"\22\2\u0188\u0186\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\7\37\2\2\u018e\u019c\3\2\2\2\u018f\u0190\7"+
		"8\2\2\u0190\u0191\7\36\2\2\u0191\u0196\58\35\2\u0192\u0193\7$\2\2\u0193"+
		"\u0195\58\35\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019a\7\37\2\2\u019a\u019c\3\2\2\2\u019b\u016b\3\2\2\2\u019b\u0177\3"+
		"\2\2\2\u019b\u0183\3\2\2\2\u019b\u018f\3\2\2\2\u019c\37\3\2\2\2\u019d"+
		"\u01a0\58\35\2\u019e\u01a0\5:\36\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a2\7\34\2\2\u01a2\u01a4\5X-\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a6\7P"+
		"\2\2\u01a6\u01a8\5Z.\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8!"+
		"\3\2\2\2\u01a9\u01aa\5\b\5\2\u01aa\u01ab\7\34\2\2\u01ab\u01ae\5X-\2\u01ac"+
		"\u01ad\7P\2\2\u01ad\u01af\5Z.\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2"+
		"\2\u01af#\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\58\35\2\u01b2\u01b3"+
		"\7\34\2\2\u01b3\u01b9\5X-\2\u01b4\u01b5\7$\2\2\u01b5\u01b6\58\35\2\u01b6"+
		"\u01b7\7\34\2\2\u01b7\u01b8\5X-\2\u01b8\u01ba\3\2\2\2\u01b9\u01b4\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\7\63\2\2\u01be\u01bf\5\b\5\2\u01bf\u01d1\3"+
		"\2\2\2\u01c0\u01c1\7\62\2\2\u01c1\u01c2\58\35\2\u01c2\u01c3\7\34\2\2\u01c3"+
		"\u01c9\5X-\2\u01c4\u01c5\7$\2\2\u01c5\u01c6\58\35\2\u01c6\u01c7\7\34\2"+
		"\2\u01c7\u01c8\5X-\2\u01c8\u01ca\3\2\2\2\u01c9\u01c4\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\7\63\2\2\u01ce\u01cf\5\b\5\2\u01cf\u01d1\3\2\2\2\u01d0\u01b0\3"+
		"\2\2\2\u01d0\u01c0\3\2\2\2\u01d1%\3\2\2\2\u01d2\u01d3\79\2\2\u01d3\u01d4"+
		"\7\36\2\2\u01d4\u01d9\58\35\2\u01d5\u01d6\7$\2\2\u01d6\u01d8\58\35\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\37\2\2\u01dd"+
		"\u01f2\3\2\2\2\u01de\u01df\7:\2\2\u01df\u01e0\7\36\2\2\u01e0\u01e5\58"+
		"\35\2\u01e1\u01e2\7$\2\2\u01e2\u01e4\58\35\2\u01e3\u01e1\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7\37\2\2\u01e9\u01f2\3\2\2\2\u01ea"+
		"\u01eb\t\r\2\2\u01eb\u01ec\7\36\2\2\u01ec\u01ed\58\35\2\u01ed\u01ee\7"+
		"$\2\2\u01ee\u01ef\58\35\2\u01ef\u01f0\7\37\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01d2\3\2\2\2\u01f1\u01de\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f2\'\3\2\2\2"+
		"\u01f3\u01f4\7=\2\2\u01f4\u01f5\7\36\2\2\u01f5\u01f6\58\35\2\u01f6\u01f7"+
		"\7$\2\2\u01f7\u01f8\5\b\5\2\u01f8\u01f9\7\37\2\2\u01f9\u020c\3\2\2\2\u01fa"+
		"\u01fb\7>\2\2\u01fb\u01fc\5\b\5\2\u01fc\u01fd\7\32\2\2\u01fd\u0205\5\b"+
		"\5\2\u01fe\u01ff\7?\2\2\u01ff\u0200\5\b\5\2\u0200\u0201\7\32\2\2\u0201"+
		"\u0202\5\b\5\2\u0202\u0204\3\2\2\2\u0203\u01fe\3\2\2\2\u0204\u0207\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u0209\7@\2\2\u0209\u020a\5\b\5\2\u020a\u020c\3\2"+
		"\2\2\u020b\u01f3\3\2\2\2\u020b\u01fa\3\2\2\2\u020c)\3\2\2\2\u020d\u020e"+
		"\7T\2\2\u020e\u020f\7]\2\2\u020f\u0210\58\35\2\u0210\u0211\7\36\2\2\u0211"+
		"\u0212\5,\27\2\u0212\u0213\7$\2\2\u0213\u0214\7B\2\2\u0214\u0215\58\35"+
		"\2\u0215\u0216\7\34\2\2\u0216\u0217\t\16\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\7\37\2\2\u0219\u021b\7 \2\2\u021a\u021c\5\6\4\2\u021b\u021a\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0220\7!\2\2\u0220+\3\2\2\2\u0221\u0226\5.\30\2\u0222"+
		"\u0223\7$\2\2\u0223\u0225\5.\30\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227-\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0229\u022a\7A\2\2\u022a\u022b\58\35\2\u022b\u022c\7\34\2\2\u022c"+
		"\u022d\t\16\2\2\u022d/\3\2\2\2\u022e\u022f\58\35\2\u022f\u0230\7\36\2"+
		"\2\u0230\u0235\58\35\2\u0231\u0232\7$\2\2\u0232\u0234\58\35\2\u0233\u0231"+
		"\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239\7\37\2\2\u0239\61\3\2\2"+
		"\2\u023a\u023b\7^\2\2\u023b\u023c\7_\2\2\u023c\u023d\58\35\2\u023d\u023e"+
		"\7\36\2\2\u023e\u0243\58\35\2\u023f\u0240\7$\2\2\u0240\u0242\58\35\2\u0241"+
		"\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7\37\2\2\u0247"+
		"\u0248\7 \2\2\u0248\u0249\7a\2\2\u0249\u024a\5\b\5\2\u024a\u024b\7\34"+
		"\2\2\u024b\u024c\5<\37\2\u024c\u024d\7!\2\2\u024d\63\3\2\2\2\u024e\u024f"+
		"\7`\2\2\u024f\u0250\58\35\2\u0250\u0251\7\36\2\2\u0251\u0256\58\35\2\u0252"+
		"\u0253\7$\2\2\u0253\u0255\58\35\2\u0254\u0252\3\2\2\2\u0255\u0258\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259\u025a\7\37\2\2\u025a\65\3\2\2\2\u025b\u025c\7\4\2"+
		"\2\u025c\u025f\58\35\2\u025d\u025f\7\5\2\2\u025e\u025b\3\2\2\2\u025e\u025d"+
		"\3\2\2\2\u025f\67\3\2\2\2\u0260\u0261\t\17\2\2\u02619\3\2\2\2\u0262\u0263"+
		"\58\35\2\u0263\u0264\7\7\2\2\u0264\u0265\58\35\2\u0265;\3\2\2\2\u0266"+
		"\u0269\5> \2\u0267\u0269\7h\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2"+
		"\2\u0269=\3\2\2\2\u026a\u0271\5@!\2\u026b\u0271\5B\"\2\u026c\u0271\5D"+
		"#\2\u026d\u0271\5F$\2\u026e\u0271\5H%\2\u026f\u0271\5J&\2\u0270\u026a"+
		"\3\2\2\2\u0270\u026b\3\2\2\2\u0270\u026c\3\2\2\2\u0270\u026d\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271?\3\2\2\2\u0272\u0273\7b\2\2\u0273"+
		"A\3\2\2\2\u0274\u0275\7f\2\2\u0275C\3\2\2\2\u0276\u0277\7g\2\2\u0277E"+
		"\3\2\2\2\u0278\u0279\7d\2\2\u0279G\3\2\2\2\u027a\u027b\7e\2\2\u027bI\3"+
		"\2\2\2\u027c\u027d\7c\2\2\u027dK\3\2\2\2\u027e\u0285\5N(\2\u027f\u0285"+
		"\5P)\2\u0280\u0285\5R*\2\u0281\u0285\5T+\2\u0282\u0285\5V,\2\u0283\u0285"+
		"\5X-\2\u0284\u027e\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0284"+
		"\u0281\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285M\3\2\2\2"+
		"\u0286\u0287\7b\2\2\u0287O\3\2\2\2\u0288\u0289\7l\2\2\u0289Q\3\2\2\2\u028a"+
		"\u028b\7i\2\2\u028bS\3\2\2\2\u028c\u028d\7j\2\2\u028dU\3\2\2\2\u028e\u028f"+
		"\7m\2\2\u028fW\3\2\2\2\u0290\u0291\7k\2\2\u0291Y\3\2\2\2\u0292\u0293\t"+
		"\20\2\2\u0293[\3\2\2\2\66_i\u0098\u00a1\u00a9\u00b6\u00ba\u00c6\u00d7"+
		"\u00d9\u00e3\u00ee\u00f4\u00f8\u00fc\u0103\u010f\u0117\u0122\u012b\u012d"+
		"\u013f\u0144\u0156\u0164\u0169\u0172\u017e\u018a\u0196\u019b\u019f\u01a3"+
		"\u01a7\u01ae\u01bb\u01cb\u01d0\u01d9\u01e5\u01f1\u0205\u020b\u021d\u0226"+
		"\u0235\u0243\u0256\u025e\u0268\u0270\u0284";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}