package it.islandofcode.jvtllib;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import it.islandofcode.jvtllib.antlr.VTLBaseVisitor;
import it.islandofcode.jvtllib.antlr.VTLParser.*;
import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.VTLObj;

/**
 * @author Pier Riccardo Monzo
 */
public class Evaluation extends VTLBaseVisitor<VTLObj> {
	
	private Map<String, VTLObj> memory = new HashMap<String, VTLObj>();

	public Evaluation(IConnector con) {
		// TODO COMPLETAMI
		System.out.println("[debug] Creato Evaluation object.");
	}

	@Override
	public VTLObj visitStart(StartContext ctx) {
		// XXX ELIMINAMI, NON SERVO
		return super.visitStart(ctx);
	}

	@Override
	public VTLObj visitStatement(StatementContext ctx) {
		// XXX ELIMINAMI, NON SERVO
		return super.visitStatement(ctx);
	}

	@Override
	public VTLObj visitAssignment(AssignmentContext ctx) {
		
		System.out.println("[debug] ASSIGNMENT");
		
		String varname = ctx.variable().getText();
		VTLObj value = this.visit(ctx.expression());
		System.out.println("\t" + varname + "\n\t\t" + ctx.ASSIGNMENT().getText() + " " + value);
		this.memory.put(varname, value);
		return this.memory.get(varname);
		//return super.visitAssignment(ctx);
	}

	@Override
	public VTLObj visitFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionCall(ctx);
	}

	@Override
	public VTLObj visitUserFunctionCall(UserFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUserFunctionCall(ctx);
	}

	@Override
	public VTLObj visitNativeFunctionCall(NativeFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNativeFunctionCall(ctx);
	}

	@Override
	public VTLObj visitFunctionParameters(FunctionParametersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionParameters(ctx);
	}

	@Override
	public VTLObj visitNamedExpression(NamedExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNamedExpression(ctx);
	}

	@Override
	public VTLObj visitMembershipExpr(MembershipExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMembershipExpr(ctx);
	}

	@Override
	public VTLObj visitVariableExpr(VariableExprContext ctx) {
		System.out.println("[debug] variable \n\t" + ctx.variable().getText());
		return super.visitVariableExpr(ctx);
	}

	@Override
	public VTLObj visitUnaryExpr(UnaryExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnaryExpr(ctx);
	}

	@Override
	public VTLObj visitLiteralExpr(LiteralExprContext ctx) {
		System.out.println("[debug] literal \n\t" + ctx.literal().getText());
		return super.visitLiteralExpr(ctx);
	}

	@Override
	public VTLObj visitIfExpr(IfExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfExpr(ctx);
	}

	@Override
	public VTLObj visitBinaryExpr(BinaryExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBinaryExpr(ctx);
	}

	@Override
	public VTLObj visitArithmeticExpr(ArithmeticExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArithmeticExpr(ctx);
	}

	@Override
	public VTLObj visitPostfixExpr(PostfixExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPostfixExpr(ctx);
	}

	@Override
	public VTLObj visitPrecedenceExpr(PrecedenceExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrecedenceExpr(ctx);
	}

	@Override
	public VTLObj visitFunctionExpr(FunctionExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionExpr(ctx);
	}

	@Override
	public VTLObj visitMembershipExpression(MembershipExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMembershipExpression(ctx);
	}

	@Override
	public VTLObj visitVariable(VariableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariable(ctx);
	}

	@Override
	public VTLObj visitScalartype(ScalartypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitScalartype(ctx);
	}

	@Override
	public VTLObj visitNulltype(NulltypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNulltype(ctx);
	}

	@Override
	public VTLObj visitBooleantype(BooleantypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBooleantype(ctx);
	}

	@Override
	public VTLObj visitDatetype(DatetypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDatetype(ctx);
	}

	@Override
	public VTLObj visitIntegertype(IntegertypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntegertype(ctx);
	}

	@Override
	public VTLObj visitFloattype(FloattypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFloattype(ctx);
	}

	@Override
	public VTLObj visitStringtype(StringtypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringtype(ctx);
	}

	@Override
	public VTLObj visitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLiteral(ctx);
	}

	@Override
	public VTLObj visitNullLiteral(NullLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNullLiteral(ctx);
	}

	@Override
	public VTLObj visitBooleanLiteral(BooleanLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBooleanLiteral(ctx);
	}

	@Override
	public VTLObj visitDateLiteral(DateLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDateLiteral(ctx);
	}

	@Override
	public VTLObj visitIntegerLiteral(IntegerLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntegerLiteral(ctx);
	}

	@Override
	public VTLObj visitFloatLiteral(FloatLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFloatLiteral(ctx);
	}

	@Override
	public VTLObj visitStringLiteral(StringLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringLiteral(ctx);
	}

	@Override
	public VTLObj visitDefineVar(DefineVarContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefineVar(ctx);
	}

	@Override
	public VTLObj visitDefineValueDom(DefineValueDomContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefineValueDom(ctx);
	}

	@Override
	public VTLObj visitDefineValueDomRestrict(DefineValueDomRestrictContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefineValueDomRestrict(ctx);
	}

	@Override
	public VTLObj visitDefineDataStruct(DefineDataStructContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefineDataStruct(ctx);
	}

	@Override
	public VTLObj visitDefDataSetImplicit(DefDataSetImplicitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefDataSetImplicit(ctx);
	}

	@Override
	public VTLObj visitDefDataSet(DefDataSetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefDataSet(ctx);
	}

	@Override
	public VTLObj visitWithRelational(WithRelationalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithRelational(ctx);
	}

	@Override
	public VTLObj visitWithFunction(WithFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithFunction(ctx);
	}

	@Override
	public VTLObj visitWithAtom(WithAtomContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithAtom(ctx);
	}

	@Override
	public VTLObj visitWithClause(WithClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithClause(ctx);
	}

	@Override
	public VTLObj visitWithHierarchy(WithHierarchyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithHierarchy(ctx);
	}

	@Override
	public VTLObj visitHierarchyExpression(HierarchyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitHierarchyExpression(ctx);
	}

	@Override
	public VTLObj visitHierarchyReference(HierarchyReferenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitHierarchyReference(ctx);
	}

	@Override
	public VTLObj visitWithGet(WithGetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithGet(ctx);
	}

	@Override
	public VTLObj visitWithPut(WithPutContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithPut(ctx);
	}

	@Override
	public VTLObj visitWithCheck(WithCheckContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithCheck(ctx);
	}

	@Override
	public VTLObj visitWithAggregation(WithAggregationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithAggregation(ctx);
	}

	@Override
	public VTLObj visitGetFunction(GetFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGetFunction(ctx);
	}

	@Override
	public VTLObj visitPutFunction(PutFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPutFunction(ctx);
	}

	@Override
	public VTLObj visitAggregateSum(AggregateSumContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregateSum(ctx);
	}

	@Override
	public VTLObj visitAggregateAvg(AggregateAvgContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregateAvg(ctx);
	}

	@Override
	public VTLObj visitAggregationParams(AggregationParamsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregationParams(ctx);
	}

	@Override
	public VTLObj visitCheckFunction(CheckFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckFunction(ctx);
	}

	@Override
	public VTLObj visitCheckParam(CheckParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckParam(ctx);
	}

	@Override
	public VTLObj visitCheckRows(CheckRowsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckRows(ctx);
	}

	@Override
	public VTLObj visitCheckColumns(CheckColumnsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckColumns(ctx);
	}

	@Override
	public VTLObj visitErrorCode(ErrorCodeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitErrorCode(ctx);
	}

	@Override
	public VTLObj visitErrorLevel(ErrorLevelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitErrorLevel(ctx);
	}

	@Override
	public VTLObj visitVariableExpression(VariableExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariableExpression(ctx);
	}

	@Override
	public VTLObj visitClauseExpression(ClauseExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClauseExpression(ctx);
	}

	@Override
	public VTLObj visitRenameClause(RenameClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRenameClause(ctx);
	}

	@Override
	public VTLObj visitFilterClause(FilterClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFilterClause(ctx);
	}

	@Override
	public VTLObj visitKeepClause(KeepClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitKeepClause(ctx);
	}

	@Override
	public VTLObj visitCalcClause(CalcClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCalcClause(ctx);
	}

	@Override
	public VTLObj visitAttrcalcClause(AttrcalcClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAttrcalcClause(ctx);
	}

	@Override
	public VTLObj visitAggregateClause(AggregateClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregateClause(ctx);
	}

	@Override
	public VTLObj visitRenameParam(RenameParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRenameParam(ctx);
	}

	@Override
	public VTLObj visitFilter(FilterContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFilter(ctx);
	}

	@Override
	public VTLObj visitKeep(KeepContext ctx) {
		// TODO Auto-generated method stub
		return super.visitKeep(ctx);
	}

	@Override
	public VTLObj visitCalc(CalcContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCalc(ctx);
	}

	@Override
	public VTLObj visitAttrcalc(AttrcalcContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAttrcalc(ctx);
	}

	@Override
	public VTLObj visitAggregate(AggregateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregate(ctx);
	}

	@Override
	public VTLObj visitNvlFunction(NvlFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNvlFunction(ctx);
	}

	@Override
	public VTLObj visitIfThenElseExpression(IfThenElseExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfThenElseExpression(ctx);
	}

	@Override
	public VTLObj visitIfBody(IfBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfBody(ctx);
	}

	@Override
	public VTLObj visitIfBodyExpression(IfBodyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfBodyExpression(ctx);
	}

	@Override
	public VTLObj visitRelationalExpression(RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRelationalExpression(ctx);
	}

	@Override
	public VTLObj visitUnionExpression(UnionExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnionExpression(ctx);
	}

	@Override
	public VTLObj visitJoinExpression(JoinExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinExpression(ctx);
	}

	@Override
	public VTLObj visitJoinDefinition(JoinDefinitionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinDefinition(ctx);
	}

	@Override
	public VTLObj visitJoinBody(JoinBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinBody(ctx);
	}

	@Override
	public VTLObj visitJoinCalcClause(JoinCalcClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinCalcClause(ctx);
	}

	@Override
	public VTLObj visitJoinDropClause(JoinDropClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinDropClause(ctx);
	}

	@Override
	public VTLObj visitJoinKeepClause(JoinKeepClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinKeepClause(ctx);
	}

	@Override
	public VTLObj visitJoinRenameClause(JoinRenameClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinRenameClause(ctx);
	}

	@Override
	public VTLObj visitJoinFilterClause(JoinFilterClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFilterClause(ctx);
	}

	@Override
	public VTLObj visitJoinFoldClause(JoinFoldClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFoldClause(ctx);
	}

	@Override
	public VTLObj visitJoinUnfoldClause(JoinUnfoldClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinUnfoldClause(ctx);
	}

	@Override
	public VTLObj visitJoinAssignment(JoinAssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinAssignment(ctx);
	}

	@Override
	public VTLObj visitJoinFoldExpression(JoinFoldExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFoldExpression(ctx);
	}

	@Override
	public VTLObj visitJoinUnfoldExpression(JoinUnfoldExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinUnfoldExpression(ctx);
	}

	@Override
	public VTLObj visitJoinDropExpression(JoinDropExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinDropExpression(ctx);
	}

	@Override
	public VTLObj visitJoinKeepExpression(JoinKeepExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinKeepExpression(ctx);
	}

	@Override
	public VTLObj visitJoinRenameExpression(JoinRenameExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinRenameExpression(ctx);
	}

	@Override
	public VTLObj visitJoinRenameParameter(JoinRenameParameterContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinRenameParameter(ctx);
	}

	@Override
	public VTLObj visitJoinFilterExpression(JoinFilterExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFilterExpression(ctx);
	}

	@Override
	public VTLObj visitComponentRole(ComponentRoleContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComponentRole(ctx);
	}

	@Override
	protected VTLObj defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, VTLObj currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public VTLObj visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public VTLObj visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

	@Override
	public VTLObj visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	public VTLObj visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
