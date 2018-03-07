// Generated from VTL.g4 by ANTLR 4.6
package it.islandofcode.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VTLParser}.
 */
public interface VTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VTLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(VTLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(VTLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VTLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VTLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(VTLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(VTLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(VTLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(VTLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#userFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterUserFunctionCall(VTLParser.UserFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#userFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitUserFunctionCall(VTLParser.UserFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#nativeFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterNativeFunctionCall(VTLParser.NativeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#nativeFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitNativeFunctionCall(VTLParser.NativeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(VTLParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(VTLParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(VTLParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(VTLParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code membershipExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMembershipExpr(VTLParser.MembershipExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code membershipExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMembershipExpr(VTLParser.MembershipExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(VTLParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(VTLParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(VTLParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(VTLParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(VTLParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(VTLParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(VTLParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(VTLParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(VTLParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(VTLParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(VTLParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(VTLParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(VTLParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(VTLParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code precedenceExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceExpr(VTLParser.PrecedenceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code precedenceExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceExpr(VTLParser.PrecedenceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(VTLParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(VTLParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#membershipExpression}.
	 * @param ctx the parse tree
	 */
	void enterMembershipExpression(VTLParser.MembershipExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#membershipExpression}.
	 * @param ctx the parse tree
	 */
	void exitMembershipExpression(VTLParser.MembershipExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(VTLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(VTLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VTLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VTLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(VTLParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(VTLParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(VTLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(VTLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(VTLParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(VTLParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(VTLParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(VTLParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(VTLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(VTLParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(VTLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(VTLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withRelational}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithRelational(VTLParser.WithRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withRelational}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithRelational(VTLParser.WithRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withFunction}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithFunction(VTLParser.WithFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withFunction}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithFunction(VTLParser.WithFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAtom}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithAtom(VTLParser.WithAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAtom}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithAtom(VTLParser.WithAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withClause}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(VTLParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withClause}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(VTLParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withHierarchy}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithHierarchy(VTLParser.WithHierarchyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withHierarchy}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithHierarchy(VTLParser.WithHierarchyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#hierarchyExpression}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExpression(VTLParser.HierarchyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#hierarchyExpression}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExpression(VTLParser.HierarchyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#hierarchyReference}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyReference(VTLParser.HierarchyReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#hierarchyReference}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyReference(VTLParser.HierarchyReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withGet}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterWithGet(VTLParser.WithGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withGet}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitWithGet(VTLParser.WithGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withPut}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterWithPut(VTLParser.WithPutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withPut}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitWithPut(VTLParser.WithPutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withCheck}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterWithCheck(VTLParser.WithCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withCheck}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitWithCheck(VTLParser.WithCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAggregation}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterWithAggregation(VTLParser.WithAggregationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAggregation}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitWithAggregation(VTLParser.WithAggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#getFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFunction(VTLParser.GetFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#getFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFunction(VTLParser.GetFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#putFunction}.
	 * @param ctx the parse tree
	 */
	void enterPutFunction(VTLParser.PutFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#putFunction}.
	 * @param ctx the parse tree
	 */
	void exitPutFunction(VTLParser.PutFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateSum}
	 * labeled alternative in {@link VTLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateSum(VTLParser.AggregateSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateSum}
	 * labeled alternative in {@link VTLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateSum(VTLParser.AggregateSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateAvg}
	 * labeled alternative in {@link VTLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateAvg(VTLParser.AggregateAvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateAvg}
	 * labeled alternative in {@link VTLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateAvg(VTLParser.AggregateAvgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#aggregationParams}.
	 * @param ctx the parse tree
	 */
	void enterAggregationParams(VTLParser.AggregationParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#aggregationParams}.
	 * @param ctx the parse tree
	 */
	void exitAggregationParams(VTLParser.AggregationParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#checkFunction}.
	 * @param ctx the parse tree
	 */
	void enterCheckFunction(VTLParser.CheckFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#checkFunction}.
	 * @param ctx the parse tree
	 */
	void exitCheckFunction(VTLParser.CheckFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#checkParam}.
	 * @param ctx the parse tree
	 */
	void enterCheckParam(VTLParser.CheckParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#checkParam}.
	 * @param ctx the parse tree
	 */
	void exitCheckParam(VTLParser.CheckParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#checkRows}.
	 * @param ctx the parse tree
	 */
	void enterCheckRows(VTLParser.CheckRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#checkRows}.
	 * @param ctx the parse tree
	 */
	void exitCheckRows(VTLParser.CheckRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#checkColumns}.
	 * @param ctx the parse tree
	 */
	void enterCheckColumns(VTLParser.CheckColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#checkColumns}.
	 * @param ctx the parse tree
	 */
	void exitCheckColumns(VTLParser.CheckColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#errorCode}.
	 * @param ctx the parse tree
	 */
	void enterErrorCode(VTLParser.ErrorCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#errorCode}.
	 * @param ctx the parse tree
	 */
	void exitErrorCode(VTLParser.ErrorCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#errorLevel}.
	 * @param ctx the parse tree
	 */
	void enterErrorLevel(VTLParser.ErrorLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#errorLevel}.
	 * @param ctx the parse tree
	 */
	void exitErrorLevel(VTLParser.ErrorLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(VTLParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(VTLParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#clauseExpression}.
	 * @param ctx the parse tree
	 */
	void enterClauseExpression(VTLParser.ClauseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#clauseExpression}.
	 * @param ctx the parse tree
	 */
	void exitClauseExpression(VTLParser.ClauseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterRenameClause(VTLParser.RenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitRenameClause(VTLParser.RenameClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(VTLParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(VTLParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keepClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterKeepClause(VTLParser.KeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keepClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitKeepClause(VTLParser.KeepClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterCalcClause(VTLParser.CalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitCalcClause(VTLParser.CalcClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrcalcClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterAttrcalcClause(VTLParser.AttrcalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrcalcClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitAttrcalcClause(VTLParser.AttrcalcClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateClause(VTLParser.AggregateClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateClause(VTLParser.AggregateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#renameParam}.
	 * @param ctx the parse tree
	 */
	void enterRenameParam(VTLParser.RenameParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#renameParam}.
	 * @param ctx the parse tree
	 */
	void exitRenameParam(VTLParser.RenameParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(VTLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(VTLParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#keep}.
	 * @param ctx the parse tree
	 */
	void enterKeep(VTLParser.KeepContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#keep}.
	 * @param ctx the parse tree
	 */
	void exitKeep(VTLParser.KeepContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(VTLParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(VTLParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#attrcalc}.
	 * @param ctx the parse tree
	 */
	void enterAttrcalc(VTLParser.AttrcalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#attrcalc}.
	 * @param ctx the parse tree
	 */
	void exitAttrcalc(VTLParser.AttrcalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(VTLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(VTLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#nvlFunction}.
	 * @param ctx the parse tree
	 */
	void enterNvlFunction(VTLParser.NvlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#nvlFunction}.
	 * @param ctx the parse tree
	 */
	void exitNvlFunction(VTLParser.NvlFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#ifThenElseExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseExpression(VTLParser.IfThenElseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#ifThenElseExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseExpression(VTLParser.IfThenElseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(VTLParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(VTLParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#ifBodyExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfBodyExpression(VTLParser.IfBodyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#ifBodyExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfBodyExpression(VTLParser.IfBodyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(VTLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(VTLParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#unionExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnionExpression(VTLParser.UnionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#unionExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnionExpression(VTLParser.UnionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpression(VTLParser.JoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpression(VTLParser.JoinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinDefinition}.
	 * @param ctx the parse tree
	 */
	void enterJoinDefinition(VTLParser.JoinDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinDefinition}.
	 * @param ctx the parse tree
	 */
	void exitJoinDefinition(VTLParser.JoinDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinBody}.
	 * @param ctx the parse tree
	 */
	void enterJoinBody(VTLParser.JoinBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinBody}.
	 * @param ctx the parse tree
	 */
	void exitJoinBody(VTLParser.JoinBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinCalcClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinCalcClause(VTLParser.JoinCalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinCalcClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinCalcClause(VTLParser.JoinCalcClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinDropClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinDropClause(VTLParser.JoinDropClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinDropClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinDropClause(VTLParser.JoinDropClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinKeepClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeepClause(VTLParser.JoinKeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinKeepClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeepClause(VTLParser.JoinKeepClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRenameClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameClause(VTLParser.JoinRenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRenameClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameClause(VTLParser.JoinRenameClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinFilterClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFilterClause(VTLParser.JoinFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinFilterClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFilterClause(VTLParser.JoinFilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinFoldClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFoldClause(VTLParser.JoinFoldClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinFoldClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFoldClause(VTLParser.JoinFoldClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinUnfoldClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinUnfoldClause(VTLParser.JoinUnfoldClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinUnfoldClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinUnfoldClause(VTLParser.JoinUnfoldClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinAssignment}.
	 * @param ctx the parse tree
	 */
	void enterJoinAssignment(VTLParser.JoinAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinAssignment}.
	 * @param ctx the parse tree
	 */
	void exitJoinAssignment(VTLParser.JoinAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinFoldExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinFoldExpression(VTLParser.JoinFoldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinFoldExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinFoldExpression(VTLParser.JoinFoldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinUnfoldExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinUnfoldExpression(VTLParser.JoinUnfoldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinUnfoldExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinUnfoldExpression(VTLParser.JoinUnfoldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinDropExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinDropExpression(VTLParser.JoinDropExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinDropExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinDropExpression(VTLParser.JoinDropExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinKeepExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeepExpression(VTLParser.JoinKeepExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinKeepExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeepExpression(VTLParser.JoinKeepExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinRenameExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameExpression(VTLParser.JoinRenameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinRenameExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameExpression(VTLParser.JoinRenameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinRenameParameter}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameParameter(VTLParser.JoinRenameParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinRenameParameter}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameParameter(VTLParser.JoinRenameParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#joinFilterExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinFilterExpression(VTLParser.JoinFilterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#joinFilterExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinFilterExpression(VTLParser.JoinFilterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#componentRole}.
	 * @param ctx the parse tree
	 */
	void enterComponentRole(VTLParser.ComponentRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#componentRole}.
	 * @param ctx the parse tree
	 */
	void exitComponentRole(VTLParser.ComponentRoleContext ctx);
}