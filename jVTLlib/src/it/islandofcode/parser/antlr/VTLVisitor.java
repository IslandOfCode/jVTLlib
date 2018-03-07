// Generated from VTL.g4 by ANTLR 4.6
package it.islandofcode.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VTLParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(VTLParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VTLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(VTLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(VTLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#userFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserFunctionCall(VTLParser.UserFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#nativeFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeFunctionCall(VTLParser.NativeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(VTLParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(VTLParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code membershipExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembershipExpr(VTLParser.MembershipExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(VTLParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(VTLParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(VTLParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(VTLParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(VTLParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(VTLParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(VTLParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code precedenceExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedenceExpr(VTLParser.PrecedenceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link VTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(VTLParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#membershipExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembershipExpression(VTLParser.MembershipExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(VTLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(VTLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(VTLParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(VTLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(VTLParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(VTLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(VTLParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(VTLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withRelational}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithRelational(VTLParser.WithRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withFunction}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithFunction(VTLParser.WithFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAtom}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAtom(VTLParser.WithAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withClause}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(VTLParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withHierarchy}
	 * labeled alternative in {@link VTLParser#datasetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithHierarchy(VTLParser.WithHierarchyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#hierarchyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExpression(VTLParser.HierarchyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#hierarchyReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyReference(VTLParser.HierarchyReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withGet}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithGet(VTLParser.WithGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withPut}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithPut(VTLParser.WithPutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withCheck}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCheck(VTLParser.WithCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAggregation}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAggregation(VTLParser.WithAggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#getFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFunction(VTLParser.GetFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#putFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutFunction(VTLParser.PutFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateSum}
	 * labeled alternative in {@link VTLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateSum(VTLParser.AggregateSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateAvg}
	 * labeled alternative in {@link VTLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateAvg(VTLParser.AggregateAvgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#aggregationParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationParams(VTLParser.AggregationParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#checkFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckFunction(VTLParser.CheckFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#checkParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckParam(VTLParser.CheckParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#checkRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckRows(VTLParser.CheckRowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#checkColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckColumns(VTLParser.CheckColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#errorCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCode(VTLParser.ErrorCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#errorLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorLevel(VTLParser.ErrorLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(VTLParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#clauseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseExpression(VTLParser.ClauseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameClause(VTLParser.RenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(VTLParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keepClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClause(VTLParser.KeepClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClause(VTLParser.CalcClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrcalcClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrcalcClause(VTLParser.AttrcalcClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateClause}
	 * labeled alternative in {@link VTLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateClause(VTLParser.AggregateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#renameParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameParam(VTLParser.RenameParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(VTLParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#keep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep(VTLParser.KeepContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(VTLParser.CalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#attrcalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrcalc(VTLParser.AttrcalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(VTLParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#nvlFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlFunction(VTLParser.NvlFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#ifThenElseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseExpression(VTLParser.IfThenElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(VTLParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#ifBodyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBodyExpression(VTLParser.IfBodyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(VTLParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#unionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionExpression(VTLParser.UnionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpression(VTLParser.JoinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDefinition(VTLParser.JoinDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinBody(VTLParser.JoinBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinCalcClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCalcClause(VTLParser.JoinCalcClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinDropClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDropClause(VTLParser.JoinDropClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinKeepClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeepClause(VTLParser.JoinKeepClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRenameClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameClause(VTLParser.JoinRenameClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinFilterClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFilterClause(VTLParser.JoinFilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinFoldClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFoldClause(VTLParser.JoinFoldClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinUnfoldClause}
	 * labeled alternative in {@link VTLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinUnfoldClause(VTLParser.JoinUnfoldClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinAssignment(VTLParser.JoinAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinFoldExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFoldExpression(VTLParser.JoinFoldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinUnfoldExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinUnfoldExpression(VTLParser.JoinUnfoldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinDropExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDropExpression(VTLParser.JoinDropExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinKeepExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeepExpression(VTLParser.JoinKeepExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinRenameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameExpression(VTLParser.JoinRenameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinRenameParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameParameter(VTLParser.JoinRenameParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#joinFilterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFilterExpression(VTLParser.JoinFilterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VTLParser#componentRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentRole(VTLParser.ComponentRoleContext ctx);
}