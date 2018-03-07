// Generated from VTL.g4 by ANTLR 4.6
package it.islandofcode.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ALONG=37, GROUP_BY=38, 
		ASSIGNMENT=39, MEMBERSHIP=40, CONCAT=41, EQ=42, NE=43, LE=44, LT=45, GE=46, 
		GT=47, AND=48, OR=49, XOR=50, NOT=51, ISNULL=52, ISNOTNULL=53, NATIVE_FUNCTIONS=54, 
		FUNC_ISNULL=55, FUNC_ROUND=56, FUNC_CEIL=57, FUNC_FLOOR=58, FUNC_ABS=59, 
		FUNC_TRUNC=60, FUNC_EXP=61, FUNC_LN=62, FUNC_LOG=63, FUNC_POWER=64, FUNC_SQRT=65, 
		FUNC_NROOT=66, FUNC_MOD=67, FUNC_LISTSUM=68, FUNC_LENGTH=69, FUNC_TRIM=70, 
		FUNC_LTRIM=71, FUNC_RTRIM=72, FUNC_UPPER=73, FUNC_LOWER=74, FUNC_SUBSTR=75, 
		FUNC_INSTR=76, FUNC_D_F_S=77, FUNC_I_F_S=78, FUNC_F_F_S=79, FUNC_S_F_N=80, 
		FUNC_REPLACE=81, INNER=82, OUTER=83, CROSS=84, ROLE=85, DATE_LITERAL=86, 
		INTEGER_LITERAL=87, BOOLEAN_LITERAL=88, STRING_LITERAL=89, FLOAT_LITERAL=90, 
		NULL=91, IMPLICIT=92, IDENTIFIER=93, MEASURE=94, ATTRIBUTE=95, REG_IDENTIFIER=96, 
		ESCAPED_IDENTIFIER=97, MUL=98, DIV=99, PLUS=100, MINUS=101, LPAR=102, 
		RPAR=103, COMMA=104, COLON=105, WS=106, COMMENT=107, LINE_COMMENT=108;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_assignment = 2, RULE_functionCall = 3, 
		RULE_userFunctionCall = 4, RULE_nativeFunctionCall = 5, RULE_functionParameters = 6, 
		RULE_namedExpression = 7, RULE_expression = 8, RULE_membershipExpression = 9, 
		RULE_variable = 10, RULE_literal = 11, RULE_nullLiteral = 12, RULE_booleanLiteral = 13, 
		RULE_dateLiteral = 14, RULE_integerLiteral = 15, RULE_floatLiteral = 16, 
		RULE_stringLiteral = 17, RULE_datasetExpression = 18, RULE_hierarchyExpression = 19, 
		RULE_hierarchyReference = 20, RULE_function = 21, RULE_getFunction = 22, 
		RULE_putFunction = 23, RULE_aggregationFunction = 24, RULE_aggregationParams = 25, 
		RULE_checkFunction = 26, RULE_checkParam = 27, RULE_checkRows = 28, RULE_checkColumns = 29, 
		RULE_errorCode = 30, RULE_errorLevel = 31, RULE_variableExpression = 32, 
		RULE_clauseExpression = 33, RULE_clause = 34, RULE_renameParam = 35, RULE_filter = 36, 
		RULE_keep = 37, RULE_calc = 38, RULE_attrcalc = 39, RULE_aggregate = 40, 
		RULE_nvlFunction = 41, RULE_ifThenElseExpression = 42, RULE_ifBody = 43, 
		RULE_ifBodyExpression = 44, RULE_relationalExpression = 45, RULE_unionExpression = 46, 
		RULE_joinExpression = 47, RULE_joinDefinition = 48, RULE_joinBody = 49, 
		RULE_joinClause = 50, RULE_joinAssignment = 51, RULE_joinFoldExpression = 52, 
		RULE_joinUnfoldExpression = 53, RULE_joinDropExpression = 54, RULE_joinKeepExpression = 55, 
		RULE_joinRenameExpression = 56, RULE_joinRenameParameter = 57, RULE_joinFilterExpression = 58, 
		RULE_componentRole = 59;
	public static final String[] ruleNames = {
		"start", "statement", "assignment", "functionCall", "userFunctionCall", 
		"nativeFunctionCall", "functionParameters", "namedExpression", "expression", 
		"membershipExpression", "variable", "literal", "nullLiteral", "booleanLiteral", 
		"dateLiteral", "integerLiteral", "floatLiteral", "stringLiteral", "datasetExpression", 
		"hierarchyExpression", "hierarchyReference", "function", "getFunction", 
		"putFunction", "aggregationFunction", "aggregationParams", "checkFunction", 
		"checkParam", "checkRows", "checkColumns", "errorCode", "errorLevel", 
		"variableExpression", "clauseExpression", "clause", "renameParam", "filter", 
		"keep", "calc", "attrcalc", "aggregate", "nvlFunction", "ifThenElseExpression", 
		"ifBody", "ifBodyExpression", "relationalExpression", "unionExpression", 
		"joinExpression", "joinDefinition", "joinBody", "joinClause", "joinAssignment", 
		"joinFoldExpression", "joinUnfoldExpression", "joinDropExpression", "joinKeepExpression", 
		"joinRenameExpression", "joinRenameParameter", "joinFilterExpression", 
		"componentRole"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hierarchy'", "'sum'", "'prod'", "'get'", "'put'", "'avg'", "'check'", 
		"'errorcode'", "'errorlevel'", "'not_valid'", "'valid'", "'all'", "'measures'", 
		"'condition'", "'['", "']'", "'rename'", "'as'", "'filter'", "'keep'", 
		"'calc'", "'attrcalc'", "'aggregate'", "'nvl'", "'if'", "'elseif'", "'else'", 
		"'then'", "'union'", "'{'", "'}'", "'on'", "'fold'", "'to'", "'unfold'", 
		"'drop'", "'along'", "'group by'", "':='", "'.'", "'||'", "'='", "'<>'", 
		"'<='", "'<'", "'>='", "'>'", "'and'", "'or'", "'xor'", "'not'", "'is null'", 
		"'is not null'", null, "'isnull'", "'round'", "'ceil'", "'floor'", "'abs'", 
		"'trunc'", "'exp'", "'ln'", "'log'", "'power'", "'sqrt'", "'nroot'", "'mod'", 
		"'listsum'", "'length'", "'trim'", "'ltrim'", "'rtrim'", "'upper'", "'lower'", 
		"'substr'", "'instr'", "'date_from_string'", "'integer_from_string'", 
		"'float_from_string'", "'string_from_number'", "'replace'", "'inner'", 
		"'outer'", "'cross'", "'role'", null, null, null, null, null, "'null'", 
		"'implicit'", null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", 
		"'('", "')'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ALONG", "GROUP_BY", "ASSIGNMENT", "MEMBERSHIP", "CONCAT", "EQ", 
		"NE", "LE", "LT", "GE", "GT", "AND", "OR", "XOR", "NOT", "ISNULL", "ISNOTNULL", 
		"NATIVE_FUNCTIONS", "FUNC_ISNULL", "FUNC_ROUND", "FUNC_CEIL", "FUNC_FLOOR", 
		"FUNC_ABS", "FUNC_TRUNC", "FUNC_EXP", "FUNC_LN", "FUNC_LOG", "FUNC_POWER", 
		"FUNC_SQRT", "FUNC_NROOT", "FUNC_MOD", "FUNC_LISTSUM", "FUNC_LENGTH", 
		"FUNC_TRIM", "FUNC_LTRIM", "FUNC_RTRIM", "FUNC_UPPER", "FUNC_LOWER", "FUNC_SUBSTR", 
		"FUNC_INSTR", "FUNC_D_F_S", "FUNC_I_F_S", "FUNC_F_F_S", "FUNC_S_F_N", 
		"FUNC_REPLACE", "INNER", "OUTER", "CROSS", "ROLE", "DATE_LITERAL", "INTEGER_LITERAL", 
		"BOOLEAN_LITERAL", "STRING_LITERAL", "FLOAT_LITERAL", "NULL", "IMPLICIT", 
		"IDENTIFIER", "MEASURE", "ATTRIBUTE", "REG_IDENTIFIER", "ESCAPED_IDENTIFIER", 
		"MUL", "DIV", "PLUS", "MINUS", "LPAR", "RPAR", "COMMA", "COLON", "WS", 
		"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "VTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VTLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REG_IDENTIFIER || _la==ESCAPED_IDENTIFIER );
			setState(125);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			assignment();
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(VTLParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DatasetExpressionContext datasetExpression() {
			return getRuleContext(DatasetExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			variable();
			setState(130);
			match(ASSIGNMENT);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(131);
				expression(0);
				}
				break;
			case 2:
				{
				setState(132);
				datasetExpression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public NvlFunctionContext nvlFunction() {
			return getRuleContext(NvlFunctionContext.class,0);
		}
		public NativeFunctionCallContext nativeFunctionCall() {
			return getRuleContext(NativeFunctionCallContext.class,0);
		}
		public UserFunctionCallContext userFunctionCall() {
			return getRuleContext(UserFunctionCallContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				nvlFunction();
				}
				break;
			case NATIVE_FUNCTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				nativeFunctionCall();
				}
				break;
			case REG_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				userFunctionCall();
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

	public static class UserFunctionCallContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode LPAR() { return getToken(VTLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VTLParser.RPAR, 0); }
		public TerminalNode REG_IDENTIFIER() { return getToken(VTLParser.REG_IDENTIFIER, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public UserFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterUserFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitUserFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitUserFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserFunctionCallContext userFunctionCall() throws RecognitionException {
		UserFunctionCallContext _localctx = new UserFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_userFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((UserFunctionCallContext)_localctx).functionName = match(REG_IDENTIFIER);
			setState(141);
			match(LPAR);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << NOT) | (1L << NATIVE_FUNCTIONS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (DATE_LITERAL - 86)) | (1L << (INTEGER_LITERAL - 86)) | (1L << (BOOLEAN_LITERAL - 86)) | (1L << (STRING_LITERAL - 86)) | (1L << (FLOAT_LITERAL - 86)) | (1L << (NULL - 86)) | (1L << (REG_IDENTIFIER - 86)) | (1L << (ESCAPED_IDENTIFIER - 86)) | (1L << (PLUS - 86)) | (1L << (MINUS - 86)) | (1L << (LPAR - 86)))) != 0)) {
				{
				setState(142);
				functionParameters();
				}
			}

			setState(145);
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

	public static class NativeFunctionCallContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode LPAR() { return getToken(VTLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VTLParser.RPAR, 0); }
		public TerminalNode NATIVE_FUNCTIONS() { return getToken(VTLParser.NATIVE_FUNCTIONS, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public NativeFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNativeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNativeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitNativeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeFunctionCallContext nativeFunctionCall() throws RecognitionException {
		NativeFunctionCallContext _localctx = new NativeFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nativeFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((NativeFunctionCallContext)_localctx).functionName = match(NATIVE_FUNCTIONS);
			setState(148);
			match(LPAR);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << NOT) | (1L << NATIVE_FUNCTIONS))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (DATE_LITERAL - 86)) | (1L << (INTEGER_LITERAL - 86)) | (1L << (BOOLEAN_LITERAL - 86)) | (1L << (STRING_LITERAL - 86)) | (1L << (FLOAT_LITERAL - 86)) | (1L << (NULL - 86)) | (1L << (REG_IDENTIFIER - 86)) | (1L << (ESCAPED_IDENTIFIER - 86)) | (1L << (PLUS - 86)) | (1L << (MINUS - 86)) | (1L << (LPAR - 86)))) != 0)) {
				{
				setState(149);
				functionParameters();
				}
			}

			setState(152);
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VTLParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				namedExpression();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(155);
					match(COMMA);
					setState(156);
					namedExpression();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				expression(0);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					expression(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				expression(0);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						match(COMMA);
						setState(172);
						expression(0);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(178);
				match(COMMA);
				setState(179);
				namedExpression();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					namedExpression();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode COLON() { return getToken(VTLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode REG_IDENTIFIER() { return getToken(VTLParser.REG_IDENTIFIER, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((NamedExpressionContext)_localctx).name = match(REG_IDENTIFIER);
			setState(190);
			match(COLON);
			setState(191);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MembershipExprContext extends ExpressionContext {
		public MembershipExpressionContext membershipExpression() {
			return getRuleContext(MembershipExpressionContext.class,0);
		}
		public MembershipExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMembershipExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMembershipExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitMembershipExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(VTLParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(VTLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VTLParser.MINUS, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExpressionContext {
		public IfThenElseExpressionContext ifThenElseExpression() {
			return getRuleContext(IfThenElseExpressionContext.class,0);
		}
		public IfExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(VTLParser.CONCAT, 0); }
		public TerminalNode LE() { return getToken(VTLParser.LE, 0); }
		public TerminalNode LT() { return getToken(VTLParser.LT, 0); }
		public TerminalNode GE() { return getToken(VTLParser.GE, 0); }
		public TerminalNode GT() { return getToken(VTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(VTLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(VTLParser.NE, 0); }
		public TerminalNode AND() { return getToken(VTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(VTLParser.OR, 0); }
		public TerminalNode XOR() { return getToken(VTLParser.XOR, 0); }
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(VTLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VTLParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(VTLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VTLParser.MINUS, 0); }
		public ArithmeticExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitArithmeticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitArithmeticExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(VTLParser.ISNULL, 0); }
		public TerminalNode ISNOTNULL() { return getToken(VTLParser.ISNOTNULL, 0); }
		public PostfixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrecedenceExprContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(VTLParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VTLParser.RPAR, 0); }
		public PrecedenceExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPrecedenceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPrecedenceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitPrecedenceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new PrecedenceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				match(LPAR);
				setState(195);
				expression(0);
				setState(196);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (NOT - 51)) | (1L << (PLUS - 51)) | (1L << (MINUS - 51)))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				((UnaryExprContext)_localctx).right = expression(12);
				}
				break;
			case 4:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				ifThenElseExpression();
				}
				break;
			case 5:
				{
				_localctx = new MembershipExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				membershipExpression();
				}
				break;
			case 6:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				variable();
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(208);
						((BinaryExprContext)_localctx).op = match(CONCAT);
						setState(209);
						((BinaryExprContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArithmeticExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(211);
						((ArithmeticExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ArithmeticExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						((ArithmeticExprContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArithmeticExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(214);
						((ArithmeticExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						((ArithmeticExprContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << LT) | (1L << GE) | (1L << GT))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						((BinaryExprContext)_localctx).right = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(221);
						((BinaryExprContext)_localctx).right = expression(7);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==XOR) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						((BinaryExprContext)_localctx).right = expression(6);
						}
						break;
					case 7:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((PostfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(226);
						((PostfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ISNULL || _la==ISNOTNULL) ) {
							((PostfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class MembershipExpressionContext extends ParserRuleContext {
		public VariableContext left;
		public Token op;
		public VariableContext right;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode MEMBERSHIP() { return getToken(VTLParser.MEMBERSHIP, 0); }
		public MembershipExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membershipExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMembershipExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMembershipExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitMembershipExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembershipExpressionContext membershipExpression() throws RecognitionException {
		MembershipExpressionContext _localctx = new MembershipExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_membershipExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((MembershipExpressionContext)_localctx).left = variable();
			setState(233);
			((MembershipExpressionContext)_localctx).op = match(MEMBERSHIP);
			setState(234);
			((MembershipExpressionContext)_localctx).right = variable();
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
		public TerminalNode ESCAPED_IDENTIFIER() { return getToken(VTLParser.ESCAPED_IDENTIFIER, 0); }
		public TerminalNode REG_IDENTIFIER() { return getToken(VTLParser.REG_IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				nullLiteral();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				booleanLiteral();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				dateLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
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
		public TerminalNode NULL() { return getToken(VTLParser.NULL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(NULL);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(VTLParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		public TerminalNode DATE_LITERAL() { return getToken(VTLParser.DATE_LITERAL, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(VTLParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		public TerminalNode FLOAT_LITERAL() { return getToken(VTLParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		public TerminalNode STRING_LITERAL() { return getToken(VTLParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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

	public static class DatasetExpressionContext extends ParserRuleContext {
		public DatasetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetExpression; }
	 
		public DatasetExpressionContext() { }
		public void copyFrom(DatasetExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithRelationalContext extends DatasetExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public WithRelationalContext(DatasetExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithFunctionContext extends DatasetExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public WithFunctionContext(DatasetExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithAtomContext extends DatasetExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public WithAtomContext(DatasetExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithClauseContext extends DatasetExpressionContext {
		public DatasetExpressionContext datasetExpression() {
			return getRuleContext(DatasetExpressionContext.class,0);
		}
		public ClauseExpressionContext clauseExpression() {
			return getRuleContext(ClauseExpressionContext.class,0);
		}
		public WithClauseContext(DatasetExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithHierarchyContext extends DatasetExpressionContext {
		public HierarchyExpressionContext hierarchyExpression() {
			return getRuleContext(HierarchyExpressionContext.class,0);
		}
		public WithHierarchyContext(DatasetExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithHierarchy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithHierarchy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithHierarchy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetExpressionContext datasetExpression() throws RecognitionException {
		return datasetExpression(0);
	}

	private DatasetExpressionContext datasetExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DatasetExpressionContext _localctx = new DatasetExpressionContext(_ctx, _parentState);
		DatasetExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_datasetExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new WithHierarchyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259);
				hierarchyExpression();
				}
				break;
			case T__14:
			case T__28:
				{
				_localctx = new WithRelationalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				relationalExpression();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				{
				_localctx = new WithFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				function();
				}
				break;
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				{
				_localctx = new WithAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WithClauseContext(new DatasetExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_datasetExpression);
					setState(265);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(266);
					clauseExpression();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class HierarchyExpressionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public HierarchyReferenceContext hierarchyReference() {
			return getRuleContext(HierarchyReferenceContext.class,0);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(VTLParser.BOOLEAN_LITERAL, 0); }
		public HierarchyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterHierarchyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitHierarchyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitHierarchyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierarchyExpressionContext hierarchyExpression() throws RecognitionException {
		HierarchyExpressionContext _localctx = new HierarchyExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_hierarchyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__0);
			setState(273);
			match(LPAR);
			setState(274);
			variable();
			setState(275);
			match(COMMA);
			setState(276);
			variableExpression();
			setState(277);
			match(COMMA);
			setState(278);
			hierarchyReference();
			setState(279);
			match(COMMA);
			setState(280);
			match(BOOLEAN_LITERAL);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(281);
				match(COMMA);
				setState(282);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(285);
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

	public static class HierarchyReferenceContext extends ParserRuleContext {
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public HierarchyReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchyReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterHierarchyReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitHierarchyReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitHierarchyReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierarchyReferenceContext hierarchyReference() throws RecognitionException {
		HierarchyReferenceContext _localctx = new HierarchyReferenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hierarchyReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			variableExpression();
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithCheckContext extends FunctionContext {
		public CheckFunctionContext checkFunction() {
			return getRuleContext(CheckFunctionContext.class,0);
		}
		public WithCheckContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithGetContext extends FunctionContext {
		public GetFunctionContext getFunction() {
			return getRuleContext(GetFunctionContext.class,0);
		}
		public WithGetContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithPutContext extends FunctionContext {
		public PutFunctionContext putFunction() {
			return getRuleContext(PutFunctionContext.class,0);
		}
		public WithPutContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithPut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithAggregationContext extends FunctionContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public WithAggregationContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterWithAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitWithAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitWithAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new WithGetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				getFunction();
				}
				break;
			case T__4:
				_localctx = new WithPutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				putFunction();
				}
				break;
			case T__6:
				_localctx = new WithCheckContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				checkFunction();
				}
				break;
			case T__1:
			case T__5:
				_localctx = new WithAggregationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				aggregationFunction();
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

	public static class GetFunctionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(VTLParser.LPAR, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VTLParser.RPAR, 0); }
		public GetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterGetFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitGetFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitGetFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFunctionContext getFunction() throws RecognitionException {
		GetFunctionContext _localctx = new GetFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_getFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__3);
			setState(296);
			match(LPAR);
			setState(297);
			stringLiteral();
			setState(298);
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
		public TerminalNode LPAR() { return getToken(VTLParser.LPAR, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VTLParser.RPAR, 0); }
		public PutFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPutFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPutFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitPutFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutFunctionContext putFunction() throws RecognitionException {
		PutFunctionContext _localctx = new PutFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_putFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__4);
			setState(301);
			match(LPAR);
			setState(302);
			stringLiteral();
			setState(303);
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

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
	 
		public AggregationFunctionContext() { }
		public void copyFrom(AggregationFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregateSumContext extends AggregationFunctionContext {
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public AggregationParamsContext aggregationParams() {
			return getRuleContext(AggregationParamsContext.class,0);
		}
		public AggregateSumContext(AggregationFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAggregateSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAggregateSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAggregateSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggregateAvgContext extends AggregationFunctionContext {
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public AggregationParamsContext aggregationParams() {
			return getRuleContext(AggregationParamsContext.class,0);
		}
		public AggregateAvgContext(AggregationFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAggregateAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAggregateAvg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAggregateAvg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aggregationFunction);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new AggregateSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__1);
				setState(306);
				match(LPAR);
				setState(307);
				variableExpression();
				setState(308);
				match(RPAR);
				setState(309);
				aggregationParams();
				}
				break;
			case T__5:
				_localctx = new AggregateAvgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__5);
				setState(312);
				match(LPAR);
				setState(313);
				variableExpression();
				setState(314);
				match(RPAR);
				setState(315);
				aggregationParams();
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

	public static class AggregationParamsContext extends ParserRuleContext {
		public Token aggregationClause;
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public TerminalNode GROUP_BY() { return getToken(VTLParser.GROUP_BY, 0); }
		public TerminalNode ALONG() { return getToken(VTLParser.ALONG, 0); }
		public AggregationParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAggregationParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAggregationParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAggregationParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationParamsContext aggregationParams() throws RecognitionException {
		AggregationParamsContext _localctx = new AggregationParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_aggregationParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((AggregationParamsContext)_localctx).aggregationClause = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALONG || _la==GROUP_BY) ) {
				((AggregationParamsContext)_localctx).aggregationClause = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(320);
			variableExpression();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(COMMA);
					setState(322);
					variableExpression();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class CheckFunctionContext extends ParserRuleContext {
		public CheckParamContext checkParam() {
			return getRuleContext(CheckParamContext.class,0);
		}
		public CheckFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCheckFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCheckFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitCheckFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckFunctionContext checkFunction() throws RecognitionException {
		CheckFunctionContext _localctx = new CheckFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_checkFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__6);
			setState(329);
			match(LPAR);
			setState(330);
			checkParam();
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

	public static class CheckParamContext extends ParserRuleContext {
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public CheckRowsContext checkRows() {
			return getRuleContext(CheckRowsContext.class,0);
		}
		public CheckColumnsContext checkColumns() {
			return getRuleContext(CheckColumnsContext.class,0);
		}
		public ErrorCodeContext errorCode() {
			return getRuleContext(ErrorCodeContext.class,0);
		}
		public ErrorLevelContext errorLevel() {
			return getRuleContext(ErrorLevelContext.class,0);
		}
		public CheckParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCheckParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCheckParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitCheckParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckParamContext checkParam() throws RecognitionException {
		CheckParamContext _localctx = new CheckParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_checkParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			variableExpression();
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(334);
				match(COMMA);
				setState(335);
				checkRows();
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(338);
				match(COMMA);
				setState(339);
				checkColumns();
				}
				break;
			}
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(342);
				match(COMMA);
				setState(343);
				match(T__7);
				setState(344);
				match(LPAR);
				setState(345);
				errorCode();
				setState(346);
				match(RPAR);
				}
				break;
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(350);
				match(COMMA);
				setState(351);
				match(T__8);
				setState(352);
				match(EQ);
				setState(353);
				match(LPAR);
				setState(354);
				errorLevel();
				setState(355);
				match(RPAR);
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

	public static class CheckRowsContext extends ParserRuleContext {
		public CheckRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkRows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCheckRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCheckRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitCheckRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckRowsContext checkRows() throws RecognitionException {
		CheckRowsContext _localctx = new CheckRowsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_checkRows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class CheckColumnsContext extends ParserRuleContext {
		public CheckColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCheckColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCheckColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitCheckColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckColumnsContext checkColumns() throws RecognitionException {
		CheckColumnsContext _localctx = new CheckColumnsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_checkColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class ErrorCodeContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ErrorCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterErrorCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitErrorCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitErrorCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCodeContext errorCode() throws RecognitionException {
		ErrorCodeContext _localctx = new ErrorCodeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_errorCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			stringLiteral();
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

	public static class ErrorLevelContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public ErrorLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterErrorLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitErrorLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitErrorLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorLevelContext errorLevel() throws RecognitionException {
		ErrorLevelContext _localctx = new ErrorLevelContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_errorLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			integerLiteral();
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

	public static class VariableExpressionContext extends ParserRuleContext {
		public MembershipExpressionContext membershipExpression() {
			return getRuleContext(MembershipExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExpressionContext variableExpression() throws RecognitionException {
		VariableExpressionContext _localctx = new VariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableExpression);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				membershipExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				variable();
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

	public static class ClauseExpressionContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public ClauseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterClauseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitClauseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitClauseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseExpressionContext clauseExpression() throws RecognitionException {
		ClauseExpressionContext _localctx = new ClauseExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_clauseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__14);
			setState(372);
			clause();
			setState(373);
			match(T__15);
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

	public static class ClauseContext extends ParserRuleContext {
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	 
		public ClauseContext() { }
		public void copyFrom(ClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RenameClauseContext extends ClauseContext {
		public List<RenameParamContext> renameParam() {
			return getRuleContexts(RenameParamContext.class);
		}
		public RenameParamContext renameParam(int i) {
			return getRuleContext(RenameParamContext.class,i);
		}
		public RenameClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterRenameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitRenameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitRenameClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterClauseContext extends ClauseContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeepClauseContext extends ClauseContext {
		public KeepContext keep() {
			return getRuleContext(KeepContext.class,0);
		}
		public KeepClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterKeepClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitKeepClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitKeepClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalcClauseContext extends ClauseContext {
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public CalcClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCalcClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCalcClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitCalcClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrcalcClauseContext extends ClauseContext {
		public AttrcalcContext attrcalc() {
			return getRuleContext(AttrcalcContext.class,0);
		}
		public AttrcalcClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAttrcalcClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAttrcalcClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAttrcalcClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggregateClauseContext extends ClauseContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public AggregateClauseContext(ClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAggregateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAggregateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAggregateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_clause);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new RenameClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(T__16);
				setState(376);
				renameParam();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(377);
					match(COMMA);
					setState(378);
					renameParam();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__18:
				_localctx = new FilterClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				filter();
				}
				break;
			case T__19:
				_localctx = new KeepClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				keep();
				}
				break;
			case T__20:
				_localctx = new CalcClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				calc();
				}
				break;
			case T__21:
				_localctx = new AttrcalcClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				attrcalc();
				}
				break;
			case T__22:
				_localctx = new AggregateClauseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				aggregate();
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

	public static class RenameParamContext extends ParserRuleContext {
		public VariableContext from;
		public VariableContext to;
		public ComponentRoleContext role;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ROLE() { return getToken(VTLParser.ROLE, 0); }
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public RenameParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterRenameParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitRenameParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitRenameParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameParamContext renameParam() throws RecognitionException {
		RenameParamContext _localctx = new RenameParamContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_renameParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((RenameParamContext)_localctx).from = variable();
			setState(392);
			match(T__17);
			setState(393);
			((RenameParamContext)_localctx).to = variable();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(394);
				match(ROLE);
				setState(395);
				((RenameParamContext)_localctx).role = componentRole();
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

	public static class FilterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__18);
			setState(399);
			expression(0);
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

	public static class KeepContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public KeepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterKeep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitKeep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitKeep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeepContext keep() throws RecognitionException {
		KeepContext _localctx = new KeepContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_keep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__19);
			setState(402);
			variable();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(403);
				match(COMMA);
				setState(404);
				variable();
				}
				}
				setState(409);
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

	public static class CalcContext extends ParserRuleContext {
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__20);
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

	public static class AttrcalcContext extends ParserRuleContext {
		public AttrcalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrcalc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAttrcalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAttrcalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAttrcalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrcalcContext attrcalc() throws RecognitionException {
		AttrcalcContext _localctx = new AttrcalcContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_attrcalc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__21);
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

	public static class AggregateContext extends ParserRuleContext {
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__22);
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

	public static class NvlFunctionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(VTLParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(VTLParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(VTLParser.RPAR, 0); }
		public NvlFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nvlFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNvlFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNvlFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitNvlFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NvlFunctionContext nvlFunction() throws RecognitionException {
		NvlFunctionContext _localctx = new NvlFunctionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_nvlFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__23);
			setState(417);
			match(LPAR);
			setState(418);
			expression(0);
			setState(419);
			match(COMMA);
			setState(420);
			expression(0);
			setState(421);
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

	public static class IfThenElseExpressionContext extends ParserRuleContext {
		public List<IfBodyContext> ifBody() {
			return getRuleContexts(IfBodyContext.class);
		}
		public IfBodyContext ifBody(int i) {
			return getRuleContext(IfBodyContext.class,i);
		}
		public IfBodyExpressionContext ifBodyExpression() {
			return getRuleContext(IfBodyExpressionContext.class,0);
		}
		public IfThenElseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIfThenElseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIfThenElseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitIfThenElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseExpressionContext ifThenElseExpression() throws RecognitionException {
		IfThenElseExpressionContext _localctx = new IfThenElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifThenElseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__24);
			setState(424);
			ifBody();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(425);
				match(T__25);
				setState(426);
				ifBody();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(432);
			match(T__26);
			setState(433);
			ifBodyExpression();
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

	public static class IfBodyContext extends ParserRuleContext {
		public List<IfBodyExpressionContext> ifBodyExpression() {
			return getRuleContexts(IfBodyExpressionContext.class);
		}
		public IfBodyExpressionContext ifBodyExpression(int i) {
			return getRuleContext(IfBodyExpressionContext.class,i);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			ifBodyExpression();
			setState(436);
			match(T__27);
			setState(437);
			ifBodyExpression();
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

	public static class IfBodyExpressionContext extends ParserRuleContext {
		public IfThenElseExpressionContext ifThenElseExpression() {
			return getRuleContext(IfThenElseExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfBodyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBodyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIfBodyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIfBodyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitIfBodyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyExpressionContext ifBodyExpression() throws RecognitionException {
		IfBodyExpressionContext _localctx = new IfBodyExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ifBodyExpression);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				ifThenElseExpression();
				notifyErrorListeners("value cannot be another if-then-else expression");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				expression(0);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public UnionExpressionContext unionExpression() {
			return getRuleContext(UnionExpressionContext.class,0);
		}
		public JoinExpressionContext joinExpression() {
			return getRuleContext(JoinExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relationalExpression);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				unionExpression();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				joinExpression();
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

	public static class UnionExpressionContext extends ParserRuleContext {
		public List<DatasetExpressionContext> datasetExpression() {
			return getRuleContexts(DatasetExpressionContext.class);
		}
		public DatasetExpressionContext datasetExpression(int i) {
			return getRuleContext(DatasetExpressionContext.class,i);
		}
		public UnionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterUnionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitUnionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitUnionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionExpressionContext unionExpression() throws RecognitionException {
		UnionExpressionContext _localctx = new UnionExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__28);
			setState(450);
			match(LPAR);
			setState(451);
			datasetExpression(0);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(452);
				match(COMMA);
				setState(453);
				datasetExpression(0);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
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

	public static class JoinExpressionContext extends ParserRuleContext {
		public JoinDefinitionContext joinDefinition() {
			return getRuleContext(JoinDefinitionContext.class,0);
		}
		public JoinBodyContext joinBody() {
			return getRuleContext(JoinBodyContext.class,0);
		}
		public JoinExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExpressionContext joinExpression() throws RecognitionException {
		JoinExpressionContext _localctx = new JoinExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__14);
			setState(462);
			joinDefinition();
			setState(463);
			match(T__15);
			setState(464);
			match(T__29);
			setState(465);
			joinBody();
			setState(466);
			match(T__30);
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

	public static class JoinDefinitionContext extends ParserRuleContext {
		public Token type;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public TerminalNode INNER() { return getToken(VTLParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(VTLParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(VTLParser.CROSS, 0); }
		public JoinDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinDefinitionContext joinDefinition() throws RecognitionException {
		JoinDefinitionContext _localctx = new JoinDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INNER - 82)) | (1L << (OUTER - 82)) | (1L << (CROSS - 82)))) != 0)) {
				{
				setState(468);
				((JoinDefinitionContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INNER - 82)) | (1L << (OUTER - 82)) | (1L << (CROSS - 82)))) != 0)) ) {
					((JoinDefinitionContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(471);
			variable();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(472);
				match(COMMA);
				setState(473);
				variable();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(479);
				match(T__31);
				setState(480);
				variableExpression();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(481);
					match(COMMA);
					setState(482);
					variableExpression();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class JoinBodyContext extends ParserRuleContext {
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public JoinBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinBodyContext joinBody() throws RecognitionException {
		JoinBodyContext _localctx = new JoinBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_joinBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			joinClause();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(491);
				match(COMMA);
				setState(492);
				joinClause();
				}
				}
				setState(497);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	 
		public JoinClauseContext() { }
		public void copyFrom(JoinClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinFoldClauseContext extends JoinClauseContext {
		public JoinFoldExpressionContext joinFoldExpression() {
			return getRuleContext(JoinFoldExpressionContext.class,0);
		}
		public JoinFoldClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinFoldClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinFoldClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinFoldClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinKeepClauseContext extends JoinClauseContext {
		public JoinKeepExpressionContext joinKeepExpression() {
			return getRuleContext(JoinKeepExpressionContext.class,0);
		}
		public JoinKeepClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinKeepClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinKeepClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinKeepClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRenameClauseContext extends JoinClauseContext {
		public JoinRenameExpressionContext joinRenameExpression() {
			return getRuleContext(JoinRenameExpressionContext.class,0);
		}
		public JoinRenameClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinRenameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinRenameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinRenameClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinCalcClauseContext extends JoinClauseContext {
		public JoinAssignmentContext joinAssignment() {
			return getRuleContext(JoinAssignmentContext.class,0);
		}
		public JoinCalcClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinCalcClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinCalcClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinCalcClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinDropClauseContext extends JoinClauseContext {
		public JoinDropExpressionContext joinDropExpression() {
			return getRuleContext(JoinDropExpressionContext.class,0);
		}
		public JoinDropClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinDropClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinDropClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinDropClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinFilterClauseContext extends JoinClauseContext {
		public JoinFilterExpressionContext joinFilterExpression() {
			return getRuleContext(JoinFilterExpressionContext.class,0);
		}
		public JoinFilterClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinUnfoldClauseContext extends JoinClauseContext {
		public JoinUnfoldExpressionContext joinUnfoldExpression() {
			return getRuleContext(JoinUnfoldExpressionContext.class,0);
		}
		public JoinUnfoldClauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinUnfoldClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinUnfoldClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinUnfoldClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joinClause);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLICIT:
			case IDENTIFIER:
			case MEASURE:
			case ATTRIBUTE:
			case REG_IDENTIFIER:
			case ESCAPED_IDENTIFIER:
				_localctx = new JoinCalcClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				joinAssignment();
				}
				break;
			case T__35:
				_localctx = new JoinDropClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				joinDropExpression();
				}
				break;
			case T__19:
				_localctx = new JoinKeepClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				joinKeepExpression();
				}
				break;
			case T__16:
				_localctx = new JoinRenameClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				joinRenameExpression();
				}
				break;
			case T__18:
				_localctx = new JoinFilterClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				joinFilterExpression();
				}
				break;
			case T__32:
				_localctx = new JoinFoldClauseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
				joinFoldExpression();
				}
				break;
			case T__34:
				_localctx = new JoinUnfoldClauseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(504);
				joinUnfoldExpression();
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

	public static class JoinAssignmentContext extends ParserRuleContext {
		public Token implicit;
		public ComponentRoleContext role;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(VTLParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IMPLICIT() { return getToken(VTLParser.IMPLICIT, 0); }
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public JoinAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinAssignmentContext joinAssignment() throws RecognitionException {
		JoinAssignmentContext _localctx = new JoinAssignmentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLICIT) {
				{
				setState(507);
				((JoinAssignmentContext)_localctx).implicit = match(IMPLICIT);
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (IDENTIFIER - 93)) | (1L << (MEASURE - 93)) | (1L << (ATTRIBUTE - 93)))) != 0)) {
				{
				setState(510);
				((JoinAssignmentContext)_localctx).role = componentRole();
				}
			}

			setState(513);
			variable();
			setState(514);
			match(ASSIGNMENT);
			setState(515);
			expression(0);
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

	public static class JoinFoldExpressionContext extends ParserRuleContext {
		public VariableContext dimension;
		public VariableContext measure;
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public JoinFoldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinFoldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinFoldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinFoldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinFoldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinFoldExpressionContext joinFoldExpression() throws RecognitionException {
		JoinFoldExpressionContext _localctx = new JoinFoldExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinFoldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(T__32);
			setState(518);
			variableExpression();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				variableExpression();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(T__33);
			setState(527);
			((JoinFoldExpressionContext)_localctx).dimension = variable();
			setState(528);
			match(COMMA);
			setState(529);
			((JoinFoldExpressionContext)_localctx).measure = variable();
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

	public static class JoinUnfoldExpressionContext extends ParserRuleContext {
		public VariableExpressionContext dimension;
		public VariableExpressionContext measure;
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public JoinUnfoldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinUnfoldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinUnfoldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinUnfoldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinUnfoldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinUnfoldExpressionContext joinUnfoldExpression() throws RecognitionException {
		JoinUnfoldExpressionContext _localctx = new JoinUnfoldExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_joinUnfoldExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__34);
			setState(532);
			((JoinUnfoldExpressionContext)_localctx).dimension = variableExpression();
			setState(533);
			match(COMMA);
			setState(534);
			((JoinUnfoldExpressionContext)_localctx).measure = variableExpression();
			setState(535);
			match(T__33);
			setState(536);
			stringLiteral();
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					match(COMMA);
					setState(538);
					stringLiteral();
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class JoinDropExpressionContext extends ParserRuleContext {
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public JoinDropExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinDropExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinDropExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinDropExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinDropExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinDropExpressionContext joinDropExpression() throws RecognitionException {
		JoinDropExpressionContext _localctx = new JoinDropExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_joinDropExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__35);
			setState(545);
			variableExpression();
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(546);
					match(COMMA);
					setState(547);
					variableExpression();
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class JoinKeepExpressionContext extends ParserRuleContext {
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public JoinKeepExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinKeepExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinKeepExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinKeepExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinKeepExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinKeepExpressionContext joinKeepExpression() throws RecognitionException {
		JoinKeepExpressionContext _localctx = new JoinKeepExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_joinKeepExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__19);
			setState(554);
			variableExpression();
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(COMMA);
					setState(556);
					variableExpression();
					}
					} 
				}
				setState(561);
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

	public static class JoinRenameExpressionContext extends ParserRuleContext {
		public List<JoinRenameParameterContext> joinRenameParameter() {
			return getRuleContexts(JoinRenameParameterContext.class);
		}
		public JoinRenameParameterContext joinRenameParameter(int i) {
			return getRuleContext(JoinRenameParameterContext.class,i);
		}
		public JoinRenameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRenameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinRenameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinRenameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinRenameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRenameExpressionContext joinRenameExpression() throws RecognitionException {
		JoinRenameExpressionContext _localctx = new JoinRenameExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_joinRenameExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__16);
			setState(563);
			joinRenameParameter();
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(564);
					match(COMMA);
					setState(565);
					joinRenameParameter();
					}
					} 
				}
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class JoinRenameParameterContext extends ParserRuleContext {
		public VariableExpressionContext from;
		public VariableContext to;
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public JoinRenameParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRenameParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinRenameParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinRenameParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinRenameParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRenameParameterContext joinRenameParameter() throws RecognitionException {
		JoinRenameParameterContext _localctx = new JoinRenameParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_joinRenameParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((JoinRenameParameterContext)_localctx).from = variableExpression();
			setState(572);
			match(T__33);
			setState(573);
			((JoinRenameParameterContext)_localctx).to = variable();
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

	public static class JoinFilterExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JoinFilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinFilterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterJoinFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitJoinFilterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitJoinFilterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinFilterExpressionContext joinFilterExpression() throws RecognitionException {
		JoinFilterExpressionContext _localctx = new JoinFilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_joinFilterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__18);
			setState(576);
			expression(0);
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
		public TerminalNode IDENTIFIER() { return getToken(VTLParser.IDENTIFIER, 0); }
		public TerminalNode MEASURE() { return getToken(VTLParser.MEASURE, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(VTLParser.ATTRIBUTE, 0); }
		public ComponentRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterComponentRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitComponentRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VTLVisitor ) return ((VTLVisitor<? extends T>)visitor).visitComponentRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentRoleContext componentRole() throws RecognitionException {
		ComponentRoleContext _localctx = new ComponentRoleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_componentRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			((ComponentRoleContext)_localctx).role = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (IDENTIFIER - 93)) | (1L << (MEASURE - 93)) | (1L << (ATTRIBUTE - 93)))) != 0)) ) {
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return datasetExpression_sempred((DatasetExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean datasetExpression_sempred(DatasetExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3n\u0247\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2|\n\2\r\2\16\2}\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0088\n\4"+
		"\3\5\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\5\6\u0092\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\5\7\u0099\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b"+
		"\3\b\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab\13\b\3\b\3\b\3\b\7\b\u00b0\n"+
		"\b\f\b\16\b\u00b3\13\b\3\b\3\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13"+
		"\b\5\b\u00be\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00d0\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e6\n\n\f\n\16\n\u00e9\13\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f7\n\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u010a\n\24\3\24\3\24\7\24\u010e\n\24\f\24\16\24\u0111"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011e"+
		"\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0128\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0140\n\32\3\33\3\33\3\33\3\33\7\33"+
		"\u0146\n\33\f\33\16\33\u0149\13\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\5\35\u0153\n\35\3\35\3\35\5\35\u0157\n\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u015f\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0168"+
		"\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\"\u0174\n\"\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\7$\u017e\n$\f$\16$\u0181\13$\3$\3$\3$\3$\3$\5$\u0188\n$"+
		"\3%\3%\3%\3%\3%\5%\u018f\n%\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0198\n\'\f\'"+
		"\16\'\u019b\13\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7"+
		",\u01ae\n,\f,\16,\u01b1\13,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\5.\u01be"+
		"\n.\3/\3/\5/\u01c2\n/\3\60\3\60\3\60\3\60\3\60\7\60\u01c9\n\60\f\60\16"+
		"\60\u01cc\13\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\5\62"+
		"\u01d8\n\62\3\62\3\62\3\62\7\62\u01dd\n\62\f\62\16\62\u01e0\13\62\3\62"+
		"\3\62\3\62\3\62\7\62\u01e6\n\62\f\62\16\62\u01e9\13\62\5\62\u01eb\n\62"+
		"\3\63\3\63\3\63\7\63\u01f0\n\63\f\63\16\63\u01f3\13\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u01fc\n\64\3\65\5\65\u01ff\n\65\3\65\5\65\u0202"+
		"\n\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u020c\n\66\f\66\16"+
		"\66\u020f\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u021e\n\67\f\67\16\67\u0221\13\67\38\38\38\38\78\u0227"+
		"\n8\f8\168\u022a\138\39\39\39\39\79\u0230\n9\f9\169\u0233\139\3:\3:\3"+
		":\3:\7:\u0239\n:\f:\16:\u023c\13:\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\2\4\22"+
		"&>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\\^`bdfhjlnprtvx\2\17\4\2\65\65fg\3\2de\3\2fg\3\2,\61\3\2\63"+
		"\64\3\2\66\67\3\2bc\3\2\4\5\3\2\'(\3\2\f\16\3\2\17\20\3\2TV\3\2_a\u0255"+
		"\2{\3\2\2\2\4\u0081\3\2\2\2\6\u0083\3\2\2\2\b\u008c\3\2\2\2\n\u008e\3"+
		"\2\2\2\f\u0095\3\2\2\2\16\u00bd\3\2\2\2\20\u00bf\3\2\2\2\22\u00cf\3\2"+
		"\2\2\24\u00ea\3\2\2\2\26\u00ee\3\2\2\2\30\u00f6\3\2\2\2\32\u00f8\3\2\2"+
		"\2\34\u00fa\3\2\2\2\36\u00fc\3\2\2\2 \u00fe\3\2\2\2\"\u0100\3\2\2\2$\u0102"+
		"\3\2\2\2&\u0109\3\2\2\2(\u0112\3\2\2\2*\u0121\3\2\2\2,\u0127\3\2\2\2."+
		"\u0129\3\2\2\2\60\u012e\3\2\2\2\62\u013f\3\2\2\2\64\u0141\3\2\2\2\66\u014a"+
		"\3\2\2\28\u014f\3\2\2\2:\u0169\3\2\2\2<\u016b\3\2\2\2>\u016d\3\2\2\2@"+
		"\u016f\3\2\2\2B\u0173\3\2\2\2D\u0175\3\2\2\2F\u0187\3\2\2\2H\u0189\3\2"+
		"\2\2J\u0190\3\2\2\2L\u0193\3\2\2\2N\u019c\3\2\2\2P\u019e\3\2\2\2R\u01a0"+
		"\3\2\2\2T\u01a2\3\2\2\2V\u01a9\3\2\2\2X\u01b5\3\2\2\2Z\u01bd\3\2\2\2\\"+
		"\u01c1\3\2\2\2^\u01c3\3\2\2\2`\u01cf\3\2\2\2b\u01d7\3\2\2\2d\u01ec\3\2"+
		"\2\2f\u01fb\3\2\2\2h\u01fe\3\2\2\2j\u0207\3\2\2\2l\u0215\3\2\2\2n\u0222"+
		"\3\2\2\2p\u022b\3\2\2\2r\u0234\3\2\2\2t\u023d\3\2\2\2v\u0241\3\2\2\2x"+
		"\u0244\3\2\2\2z|\5\4\3\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\2\2\3\u0080\3\3\2\2\2\u0081\u0082\5\6\4\2\u0082\5"+
		"\3\2\2\2\u0083\u0084\5\26\f\2\u0084\u0087\7)\2\2\u0085\u0088\5\22\n\2"+
		"\u0086\u0088\5&\24\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\7\3"+
		"\2\2\2\u0089\u008d\5T+\2\u008a\u008d\5\f\7\2\u008b\u008d\5\n\6\2\u008c"+
		"\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\t\3\2\2\2"+
		"\u008e\u008f\7b\2\2\u008f\u0091\7h\2\2\u0090\u0092\5\16\b\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7i\2\2\u0094"+
		"\13\3\2\2\2\u0095\u0096\78\2\2\u0096\u0098\7h\2\2\u0097\u0099\5\16\b\2"+
		"\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\7i\2\2\u009b\r\3\2\2\2\u009c\u00a1\5\20\t\2\u009d\u009e\7j\2\2\u009e"+
		"\u00a0\5\20\t\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00be\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a9\5\22\n\2\u00a5\u00a6\7j\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a5\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00be\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\5\22\n\2\u00ad\u00ae\7"+
		"j\2\2\u00ae\u00b0\5\22\n\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7j\2\2\u00b5\u00ba\5\20\t\2\u00b6\u00b7\7j\2\2\u00b7"+
		"\u00b9\5\20\t\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u009c\3\2\2\2\u00bd\u00a4\3\2\2\2\u00bd\u00ac\3\2\2\2\u00be\17\3\2\2"+
		"\2\u00bf\u00c0\7b\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\5\22\n\2\u00c2\21"+
		"\3\2\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\5\22\n\2\u00c6"+
		"\u00c7\7i\2\2\u00c7\u00d0\3\2\2\2\u00c8\u00d0\5\b\5\2\u00c9\u00ca\t\2"+
		"\2\2\u00ca\u00d0\5\22\n\16\u00cb\u00d0\5V,\2\u00cc\u00d0\5\24\13\2\u00cd"+
		"\u00d0\5\26\f\2\u00ce\u00d0\5\30\r\2\u00cf\u00c3\3\2\2\2\u00cf\u00c8\3"+
		"\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00e7\3\2\2\2\u00d1\u00d2\f\f"+
		"\2\2\u00d2\u00d3\7+\2\2\u00d3\u00e6\5\22\n\f\u00d4\u00d5\f\13\2\2\u00d5"+
		"\u00d6\t\3\2\2\u00d6\u00e6\5\22\n\f\u00d7\u00d8\f\n\2\2\u00d8\u00d9\t"+
		"\4\2\2\u00d9\u00e6\5\22\n\13\u00da\u00db\f\t\2\2\u00db\u00dc\t\5\2\2\u00dc"+
		"\u00e6\5\22\n\n\u00dd\u00de\f\b\2\2\u00de\u00df\7\62\2\2\u00df\u00e6\5"+
		"\22\n\t\u00e0\u00e1\f\7\2\2\u00e1\u00e2\t\6\2\2\u00e2\u00e6\5\22\n\b\u00e3"+
		"\u00e4\f\r\2\2\u00e4\u00e6\t\7\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d4\3\2"+
		"\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5"+
		"\u00e0\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\23\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb"+
		"\5\26\f\2\u00eb\u00ec\7*\2\2\u00ec\u00ed\5\26\f\2\u00ed\25\3\2\2\2\u00ee"+
		"\u00ef\t\b\2\2\u00ef\27\3\2\2\2\u00f0\u00f7\5\32\16\2\u00f1\u00f7\5\34"+
		"\17\2\u00f2\u00f7\5\36\20\2\u00f3\u00f7\5 \21\2\u00f4\u00f7\5\"\22\2\u00f5"+
		"\u00f7\5$\23\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\31\3\2\2\2\u00f8\u00f9\7]\2\2\u00f9\33\3\2\2\2\u00fa\u00fb\7Z\2\2\u00fb"+
		"\35\3\2\2\2\u00fc\u00fd\7X\2\2\u00fd\37\3\2\2\2\u00fe\u00ff\7Y\2\2\u00ff"+
		"!\3\2\2\2\u0100\u0101\7\\\2\2\u0101#\3\2\2\2\u0102\u0103\7[\2\2\u0103"+
		"%\3\2\2\2\u0104\u0105\b\24\1\2\u0105\u010a\5(\25\2\u0106\u010a\5\\/\2"+
		"\u0107\u010a\5,\27\2\u0108\u010a\5\26\f\2\u0109\u0104\3\2\2\2\u0109\u0106"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010f\3\2\2\2\u010b"+
		"\u010c\f\7\2\2\u010c\u010e\5D#\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\'\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0113\7\3\2\2\u0113\u0114\7h\2\2\u0114\u0115\5\26\f\2\u0115"+
		"\u0116\7j\2\2\u0116\u0117\5B\"\2\u0117\u0118\7j\2\2\u0118\u0119\5*\26"+
		"\2\u0119\u011a\7j\2\2\u011a\u011d\7Z\2\2\u011b\u011c\7j\2\2\u011c\u011e"+
		"\t\t\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\7i\2\2\u0120)\3\2\2\2\u0121\u0122\5B\"\2\u0122+\3\2\2\2\u0123\u0128"+
		"\5.\30\2\u0124\u0128\5\60\31\2\u0125\u0128\5\66\34\2\u0126\u0128\5\62"+
		"\32\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128-\3\2\2\2\u0129\u012a\7\6\2\2\u012a\u012b\7h\2\2\u012b"+
		"\u012c\5$\23\2\u012c\u012d\7i\2\2\u012d/\3\2\2\2\u012e\u012f\7\7\2\2\u012f"+
		"\u0130\7h\2\2\u0130\u0131\5$\23\2\u0131\u0132\7i\2\2\u0132\61\3\2\2\2"+
		"\u0133\u0134\7\4\2\2\u0134\u0135\7h\2\2\u0135\u0136\5B\"\2\u0136\u0137"+
		"\7i\2\2\u0137\u0138\5\64\33\2\u0138\u0140\3\2\2\2\u0139\u013a\7\b\2\2"+
		"\u013a\u013b\7h\2\2\u013b\u013c\5B\"\2\u013c\u013d\7i\2\2\u013d\u013e"+
		"\5\64\33\2\u013e\u0140\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0139\3\2\2\2"+
		"\u0140\63\3\2\2\2\u0141\u0142\t\n\2\2\u0142\u0147\5B\"\2\u0143\u0144\7"+
		"j\2\2\u0144\u0146\5B\"\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\65\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\u014a\u014b\7\t\2\2\u014b\u014c\7h\2\2\u014c\u014d\58\35\2\u014d\u014e"+
		"\7i\2\2\u014e\67\3\2\2\2\u014f\u0152\5B\"\2\u0150\u0151\7j\2\2\u0151\u0153"+
		"\5:\36\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0155\7j\2\2\u0155\u0157\5<\37\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u015e\3\2\2\2\u0158\u0159\7j\2\2\u0159\u015a\7\n\2\2\u015a"+
		"\u015b\7h\2\2\u015b\u015c\5> \2\u015c\u015d\7i\2\2\u015d\u015f\3\2\2\2"+
		"\u015e\u0158\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0167\3\2\2\2\u0160\u0161"+
		"\7j\2\2\u0161\u0162\7\13\2\2\u0162\u0163\7,\2\2\u0163\u0164\7h\2\2\u0164"+
		"\u0165\5@!\2\u0165\u0166\7i\2\2\u0166\u0168\3\2\2\2\u0167\u0160\3\2\2"+
		"\2\u0167\u0168\3\2\2\2\u01689\3\2\2\2\u0169\u016a\t\13\2\2\u016a;\3\2"+
		"\2\2\u016b\u016c\t\f\2\2\u016c=\3\2\2\2\u016d\u016e\5$\23\2\u016e?\3\2"+
		"\2\2\u016f\u0170\5 \21\2\u0170A\3\2\2\2\u0171\u0174\5\24\13\2\u0172\u0174"+
		"\5\26\f\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174C\3\2\2\2\u0175"+
		"\u0176\7\21\2\2\u0176\u0177\5F$\2\u0177\u0178\7\22\2\2\u0178E\3\2\2\2"+
		"\u0179\u017a\7\23\2\2\u017a\u017f\5H%\2\u017b\u017c\7j\2\2\u017c\u017e"+
		"\5H%\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0188\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0188\5J"+
		"&\2\u0183\u0188\5L\'\2\u0184\u0188\5N(\2\u0185\u0188\5P)\2\u0186\u0188"+
		"\5R*\2\u0187\u0179\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0187"+
		"\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188G\3\2\2\2"+
		"\u0189\u018a\5\26\f\2\u018a\u018b\7\24\2\2\u018b\u018e\5\26\f\2\u018c"+
		"\u018d\7W\2\2\u018d\u018f\5x=\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2"+
		"\2\u018fI\3\2\2\2\u0190\u0191\7\25\2\2\u0191\u0192\5\22\n\2\u0192K\3\2"+
		"\2\2\u0193\u0194\7\26\2\2\u0194\u0199\5\26\f\2\u0195\u0196\7j\2\2\u0196"+
		"\u0198\5\26\f\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019aM\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d"+
		"\7\27\2\2\u019dO\3\2\2\2\u019e\u019f\7\30\2\2\u019fQ\3\2\2\2\u01a0\u01a1"+
		"\7\31\2\2\u01a1S\3\2\2\2\u01a2\u01a3\7\32\2\2\u01a3\u01a4\7h\2\2\u01a4"+
		"\u01a5\5\22\n\2\u01a5\u01a6\7j\2\2\u01a6\u01a7\5\22\n\2\u01a7\u01a8\7"+
		"i\2\2\u01a8U\3\2\2\2\u01a9\u01aa\7\33\2\2\u01aa\u01af\5X-\2\u01ab\u01ac"+
		"\7\34\2\2\u01ac\u01ae\5X-\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01b3\7\35\2\2\u01b3\u01b4\5Z.\2\u01b4W\3\2\2\2\u01b5\u01b6"+
		"\5Z.\2\u01b6\u01b7\7\36\2\2\u01b7\u01b8\5Z.\2\u01b8Y\3\2\2\2\u01b9\u01ba"+
		"\5V,\2\u01ba\u01bb\b.\1\2\u01bb\u01be\3\2\2\2\u01bc\u01be\5\22\n\2\u01bd"+
		"\u01b9\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be[\3\2\2\2\u01bf\u01c2\5^\60\2"+
		"\u01c0\u01c2\5`\61\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2]\3"+
		"\2\2\2\u01c3\u01c4\7\37\2\2\u01c4\u01c5\7h\2\2\u01c5\u01ca\5&\24\2\u01c6"+
		"\u01c7\7j\2\2\u01c7\u01c9\5&\24\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01ce\7i\2\2\u01ce_\3\2\2\2\u01cf\u01d0\7\21\2\2"+
		"\u01d0\u01d1\5b\62\2\u01d1\u01d2\7\22\2\2\u01d2\u01d3\7 \2\2\u01d3\u01d4"+
		"\5d\63\2\u01d4\u01d5\7!\2\2\u01d5a\3\2\2\2\u01d6\u01d8\t\r\2\2\u01d7\u01d6"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01de\5\26\f\2"+
		"\u01da\u01db\7j\2\2\u01db\u01dd\5\26\f\2\u01dc\u01da\3\2\2\2\u01dd\u01e0"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01ea\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e2\7\"\2\2\u01e2\u01e7\5B\"\2\u01e3\u01e4\7j\2"+
		"\2\u01e4\u01e6\5B\"\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u01e1\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebc\3\2\2\2\u01ec\u01f1\5f\64\2"+
		"\u01ed\u01ee\7j\2\2\u01ee\u01f0\5f\64\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2e\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01fc\5h\65\2\u01f5\u01fc\5n8\2\u01f6\u01fc\5p9\2"+
		"\u01f7\u01fc\5r:\2\u01f8\u01fc\5v<\2\u01f9\u01fc\5j\66\2\u01fa\u01fc\5"+
		"l\67\2\u01fb\u01f4\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb"+
		"\u01f7\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2"+
		"\2\2\u01fcg\3\2\2\2\u01fd\u01ff\7^\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\5x=\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\26\f\2\u0204\u0205\7"+
		")\2\2\u0205\u0206\5\22\n\2\u0206i\3\2\2\2\u0207\u0208\7#\2\2\u0208\u020d"+
		"\5B\"\2\u0209\u020a\7j\2\2\u020a\u020c\5B\"\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7$\2\2\u0211\u0212\5\26\f\2\u0212"+
		"\u0213\7j\2\2\u0213\u0214\5\26\f\2\u0214k\3\2\2\2\u0215\u0216\7%\2\2\u0216"+
		"\u0217\5B\"\2\u0217\u0218\7j\2\2\u0218\u0219\5B\"\2\u0219\u021a\7$\2\2"+
		"\u021a\u021f\5$\23\2\u021b\u021c\7j\2\2\u021c\u021e\5$\23\2\u021d\u021b"+
		"\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"m\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7&\2\2\u0223\u0228\5B\"\2\u0224"+
		"\u0225\7j\2\2\u0225\u0227\5B\"\2\u0226\u0224\3\2\2\2\u0227\u022a\3\2\2"+
		"\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229o\3\2\2\2\u022a\u0228"+
		"\3\2\2\2\u022b\u022c\7\26\2\2\u022c\u0231\5B\"\2\u022d\u022e\7j\2\2\u022e"+
		"\u0230\5B\"\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232q\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235"+
		"\7\23\2\2\u0235\u023a\5t;\2\u0236\u0237\7j\2\2\u0237\u0239\5t;\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023bs\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\5B\"\2\u023e\u023f"+
		"\7$\2\2\u023f\u0240\5\26\f\2\u0240u\3\2\2\2\u0241\u0242\7\25\2\2\u0242"+
		"\u0243\5\22\n\2\u0243w\3\2\2\2\u0244\u0245\t\16\2\2\u0245y\3\2\2\2\60"+
		"}\u0087\u008c\u0091\u0098\u00a1\u00a9\u00b1\u00ba\u00bd\u00cf\u00e5\u00e7"+
		"\u00f6\u0109\u010f\u011d\u0127\u013f\u0147\u0152\u0156\u015e\u0167\u0173"+
		"\u017f\u0187\u018e\u0199\u01af\u01bd\u01c1\u01ca\u01d7\u01de\u01e7\u01ea"+
		"\u01f1\u01fb\u01fe\u0201\u020d\u021f\u0228\u0231\u023a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}