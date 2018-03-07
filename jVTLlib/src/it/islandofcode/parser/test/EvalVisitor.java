package it.islandofcode.parser.test;

import it.islandofcode.connector.IConnector;
import it.islandofcode.model.DataSet;
import it.islandofcode.parser.antlr.VTLBaseVisitor;
import it.islandofcode.parser.antlr.VTLParser.*;


/**
 * @author Pier Riccardo Monzo
 * In questa classe verrà effettuata tutta o quasi l'elaborazione del codice VTL.
 * ATTENZIONE! Se si aggiorna la grammatica, bisogna implementare gli aggiornamenti
 * in questa classe manualmente!
 */
public class EvalVisitor extends VTLBaseVisitor<Literal> {
	
	private IConnector connect;
	
	private String lastAssign;
	
	
	/**
	 * @deprecated
	 * Presente a solo scopo di test.
	 */
	public EvalVisitor() {	}
	
	public EvalVisitor(IConnector connect) {
		//TODO forse non è il modo migliore, checkstatus potrebbe lanciare NullPointerException
		//se l'AND non viene corto circuitato al solo controllo connect!=null.
		if(connect!=null && connect.checkStatus())
			this.connect = connect;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitStart(it.islandofcode.parser.antlr.VTLParser.StartContext)
	 */
	@Override
	public Literal visitStart(StartContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStart(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitStatement(it.islandofcode.parser.antlr.VTLParser.StatementContext)
	 */
	@Override
	public Literal visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAssignment(it.islandofcode.parser.antlr.VTLParser.AssignmentContext)
	 */
	@Override
	public Literal visitAssignment(AssignmentContext ctx) {
		System.out.println("ASSING: " + ctx.variable().getText());
		this.lastAssign = ctx.variable().getText();
		return super.visitAssignment(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitFunctionCall(it.islandofcode.parser.antlr.VTLParser.FunctionCallContext)
	 */
	@Override
	public Literal visitFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionCall(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitUserFunctionCall(it.islandofcode.parser.antlr.VTLParser.UserFunctionCallContext)
	 */
	@Override
	public Literal visitUserFunctionCall(UserFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUserFunctionCall(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitNativeFunctionCall(it.islandofcode.parser.antlr.VTLParser.NativeFunctionCallContext)
	 */
	@Override
	public Literal visitNativeFunctionCall(NativeFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNativeFunctionCall(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitFunctionParameters(it.islandofcode.parser.antlr.VTLParser.FunctionParametersContext)
	 */
	@Override
	public Literal visitFunctionParameters(FunctionParametersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionParameters(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitNamedExpression(it.islandofcode.parser.antlr.VTLParser.NamedExpressionContext)
	 */
	@Override
	public Literal visitNamedExpression(NamedExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNamedExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitMembershipExpr(it.islandofcode.parser.antlr.VTLParser.MembershipExprContext)
	 */
	@Override
	public Literal visitMembershipExpr(MembershipExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMembershipExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitVariableExpr(it.islandofcode.parser.antlr.VTLParser.VariableExprContext)
	 */
	@Override
	public Literal visitVariableExpr(VariableExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariableExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitUnaryExpr(it.islandofcode.parser.antlr.VTLParser.UnaryExprContext)
	 */
	@Override
	public Literal visitUnaryExpr(UnaryExprContext ctx) {
		System.out.println("UNARY: " + ctx.getText());
		return super.visitUnaryExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitLiteralExpr(it.islandofcode.parser.antlr.VTLParser.LiteralExprContext)
	 */
	@Override
	public Literal visitLiteralExpr(LiteralExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLiteralExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitIfExpr(it.islandofcode.parser.antlr.VTLParser.IfExprContext)
	 */
	@Override
	public Literal visitIfExpr(IfExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitBinaryExpr(it.islandofcode.parser.antlr.VTLParser.BinaryExprContext)
	 */
	@Override
	public Literal visitBinaryExpr(BinaryExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBinaryExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitArithmeticExpr(it.islandofcode.parser.antlr.VTLParser.ArithmeticExprContext)
	 */
	@Override
	public Literal visitArithmeticExpr(ArithmeticExprContext ctx) {
		System.out.println("ARITHMETIC: " + ctx.getText());
		System.out.println("\tCount: " + ctx.getChildCount());
		for(int i=0; i<ctx.getChildCount(); i++)
			System.out.println("\tCHILD["+i+"] -> " + ctx.getChild(i).getText());
		
		return super.visitArithmeticExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitPostfixExpr(it.islandofcode.parser.antlr.VTLParser.PostfixExprContext)
	 */
	@Override
	public Literal visitPostfixExpr(PostfixExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPostfixExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitPrecedenceExpr(it.islandofcode.parser.antlr.VTLParser.PrecedenceExprContext)
	 */
	@Override
	public Literal visitPrecedenceExpr(PrecedenceExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrecedenceExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitFunctionExpr(it.islandofcode.parser.antlr.VTLParser.FunctionExprContext)
	 */
	@Override
	public Literal visitFunctionExpr(FunctionExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionExpr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitMembershipExpression(it.islandofcode.parser.antlr.VTLParser.MembershipExpressionContext)
	 */
	@Override
	public Literal visitMembershipExpression(MembershipExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMembershipExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitVariable(it.islandofcode.parser.antlr.VTLParser.VariableContext)
	 */
	@Override
	public Literal visitVariable(VariableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariable(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitLiteral(it.islandofcode.parser.antlr.VTLParser.LiteralContext)
	 */
	@Override
	public Literal visitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitNullLiteral(it.islandofcode.parser.antlr.VTLParser.NullLiteralContext)
	 */
	@Override
	public Literal visitNullLiteral(NullLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNullLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitBooleanLiteral(it.islandofcode.parser.antlr.VTLParser.BooleanLiteralContext)
	 */
	@Override
	public Literal visitBooleanLiteral(BooleanLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBooleanLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitDateLiteral(it.islandofcode.parser.antlr.VTLParser.DateLiteralContext)
	 */
	@Override
	public Literal visitDateLiteral(DateLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDateLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitIntegerLiteral(it.islandofcode.parser.antlr.VTLParser.IntegerLiteralContext)
	 */
	@Override
	public Literal visitIntegerLiteral(IntegerLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntegerLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitFloatLiteral(it.islandofcode.parser.antlr.VTLParser.FloatLiteralContext)
	 */
	@Override
	public Literal visitFloatLiteral(FloatLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFloatLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitStringLiteral(it.islandofcode.parser.antlr.VTLParser.StringLiteralContext)
	 */
	@Override
	public Literal visitStringLiteral(StringLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringLiteral(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithRelational(it.islandofcode.parser.antlr.VTLParser.WithRelationalContext)
	 */
	@Override
	public Literal visitWithRelational(WithRelationalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithRelational(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithFunction(it.islandofcode.parser.antlr.VTLParser.WithFunctionContext)
	 */
	@Override
	public Literal visitWithFunction(WithFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithFunction(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithAtom(it.islandofcode.parser.antlr.VTLParser.WithAtomContext)
	 */
	@Override
	public Literal visitWithAtom(WithAtomContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithAtom(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithClause(it.islandofcode.parser.antlr.VTLParser.WithClauseContext)
	 */
	@Override
	public Literal visitWithClause(WithClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithHierarchy(it.islandofcode.parser.antlr.VTLParser.WithHierarchyContext)
	 */
	@Override
	public Literal visitWithHierarchy(WithHierarchyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithHierarchy(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitHierarchyExpression(it.islandofcode.parser.antlr.VTLParser.HierarchyExpressionContext)
	 */
	@Override
	public Literal visitHierarchyExpression(HierarchyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitHierarchyExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitHierarchyReference(it.islandofcode.parser.antlr.VTLParser.HierarchyReferenceContext)
	 */
	@Override
	public Literal visitHierarchyReference(HierarchyReferenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitHierarchyReference(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithGet(it.islandofcode.parser.antlr.VTLParser.WithGetContext)
	 */
	@Override
	public Literal visitWithGet(WithGetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithGet(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithPut(it.islandofcode.parser.antlr.VTLParser.WithPutContext)
	 */
	@Override
	public Literal visitWithPut(WithPutContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithPut(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithCheck(it.islandofcode.parser.antlr.VTLParser.WithCheckContext)
	 */
	@Override
	public Literal visitWithCheck(WithCheckContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithCheck(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitWithAggregation(it.islandofcode.parser.antlr.VTLParser.WithAggregationContext)
	 */
	@Override
	public Literal visitWithAggregation(WithAggregationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWithAggregation(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitGetFunction(it.islandofcode.parser.antlr.VTLParser.GetFunctionContext)
	 */
	@Override
	public Literal visitGetFunction(GetFunctionContext ctx) {
		String loc = ctx.getChild(2).getText().replaceAll("\"","");
		System.out.println("GET: " + loc);
		DataSet data = this.connect.get(this.lastAssign, loc);
		System.out.println("\tDATASET: " + data.getName() + " from " + this.connect.getLocation());
		
		/* TODO non deve tornare un Literal ma un dataset!
		 * Forse è il caso di ragionarci un pò sopra.
		 * Mettere riferimenti a DS, DP e DSTRUC in Literal.
		 */
		
		return super.visitGetFunction(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitPutFunction(it.islandofcode.parser.antlr.VTLParser.PutFunctionContext)
	 */
	@Override
	public Literal visitPutFunction(PutFunctionContext ctx) {
		System.out.println("PUT: " + ctx.getText());
		return super.visitPutFunction(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAggregateSum(it.islandofcode.parser.antlr.VTLParser.AggregateSumContext)
	 */
	@Override
	public Literal visitAggregateSum(AggregateSumContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregateSum(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAggregateAvg(it.islandofcode.parser.antlr.VTLParser.AggregateAvgContext)
	 */
	@Override
	public Literal visitAggregateAvg(AggregateAvgContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregateAvg(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAggregationParams(it.islandofcode.parser.antlr.VTLParser.AggregationParamsContext)
	 */
	@Override
	public Literal visitAggregationParams(AggregationParamsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregationParams(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitCheckFunction(it.islandofcode.parser.antlr.VTLParser.CheckFunctionContext)
	 */
	@Override
	public Literal visitCheckFunction(CheckFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckFunction(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitCheckParam(it.islandofcode.parser.antlr.VTLParser.CheckParamContext)
	 */
	@Override
	public Literal visitCheckParam(CheckParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckParam(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitCheckRows(it.islandofcode.parser.antlr.VTLParser.CheckRowsContext)
	 */
	@Override
	public Literal visitCheckRows(CheckRowsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckRows(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitCheckColumns(it.islandofcode.parser.antlr.VTLParser.CheckColumnsContext)
	 */
	@Override
	public Literal visitCheckColumns(CheckColumnsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCheckColumns(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitErrorCode(it.islandofcode.parser.antlr.VTLParser.ErrorCodeContext)
	 */
	@Override
	public Literal visitErrorCode(ErrorCodeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitErrorCode(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitErrorLevel(it.islandofcode.parser.antlr.VTLParser.ErrorLevelContext)
	 */
	@Override
	public Literal visitErrorLevel(ErrorLevelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitErrorLevel(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitVariableExpression(it.islandofcode.parser.antlr.VTLParser.VariableExpressionContext)
	 */
	@Override
	public Literal visitVariableExpression(VariableExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariableExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitClauseExpression(it.islandofcode.parser.antlr.VTLParser.ClauseExpressionContext)
	 */
	@Override
	public Literal visitClauseExpression(ClauseExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClauseExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitRenameClause(it.islandofcode.parser.antlr.VTLParser.RenameClauseContext)
	 */
	@Override
	public Literal visitRenameClause(RenameClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRenameClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitFilterClause(it.islandofcode.parser.antlr.VTLParser.FilterClauseContext)
	 */
	@Override
	public Literal visitFilterClause(FilterClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFilterClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitKeepClause(it.islandofcode.parser.antlr.VTLParser.KeepClauseContext)
	 */
	@Override
	public Literal visitKeepClause(KeepClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitKeepClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitCalcClause(it.islandofcode.parser.antlr.VTLParser.CalcClauseContext)
	 */
	@Override
	public Literal visitCalcClause(CalcClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCalcClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAttrcalcClause(it.islandofcode.parser.antlr.VTLParser.AttrcalcClauseContext)
	 */
	@Override
	public Literal visitAttrcalcClause(AttrcalcClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAttrcalcClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAggregateClause(it.islandofcode.parser.antlr.VTLParser.AggregateClauseContext)
	 */
	@Override
	public Literal visitAggregateClause(AggregateClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregateClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitRenameParam(it.islandofcode.parser.antlr.VTLParser.RenameParamContext)
	 */
	@Override
	public Literal visitRenameParam(RenameParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRenameParam(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitFilter(it.islandofcode.parser.antlr.VTLParser.FilterContext)
	 */
	@Override
	public Literal visitFilter(FilterContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFilter(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitKeep(it.islandofcode.parser.antlr.VTLParser.KeepContext)
	 */
	@Override
	public Literal visitKeep(KeepContext ctx) {
		// TODO Auto-generated method stub
		return super.visitKeep(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitCalc(it.islandofcode.parser.antlr.VTLParser.CalcContext)
	 */
	@Override
	public Literal visitCalc(CalcContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCalc(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAttrcalc(it.islandofcode.parser.antlr.VTLParser.AttrcalcContext)
	 */
	@Override
	public Literal visitAttrcalc(AttrcalcContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAttrcalc(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitAggregate(it.islandofcode.parser.antlr.VTLParser.AggregateContext)
	 */
	@Override
	public Literal visitAggregate(AggregateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAggregate(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitNvlFunction(it.islandofcode.parser.antlr.VTLParser.NvlFunctionContext)
	 */
	@Override
	public Literal visitNvlFunction(NvlFunctionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNvlFunction(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitIfThenElseExpression(it.islandofcode.parser.antlr.VTLParser.IfThenElseExpressionContext)
	 */
	@Override
	public Literal visitIfThenElseExpression(IfThenElseExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfThenElseExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitIfBody(it.islandofcode.parser.antlr.VTLParser.IfBodyContext)
	 */
	@Override
	public Literal visitIfBody(IfBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfBody(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitIfBodyExpression(it.islandofcode.parser.antlr.VTLParser.IfBodyExpressionContext)
	 */
	@Override
	public Literal visitIfBodyExpression(IfBodyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfBodyExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitRelationalExpression(it.islandofcode.parser.antlr.VTLParser.RelationalExpressionContext)
	 */
	@Override
	public Literal visitRelationalExpression(RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRelationalExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitUnionExpression(it.islandofcode.parser.antlr.VTLParser.UnionExpressionContext)
	 */
	@Override
	public Literal visitUnionExpression(UnionExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnionExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinExpression(it.islandofcode.parser.antlr.VTLParser.JoinExpressionContext)
	 */
	@Override
	public Literal visitJoinExpression(JoinExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinDefinition(it.islandofcode.parser.antlr.VTLParser.JoinDefinitionContext)
	 */
	@Override
	public Literal visitJoinDefinition(JoinDefinitionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinDefinition(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinBody(it.islandofcode.parser.antlr.VTLParser.JoinBodyContext)
	 */
	@Override
	public Literal visitJoinBody(JoinBodyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinBody(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinCalcClause(it.islandofcode.parser.antlr.VTLParser.JoinCalcClauseContext)
	 */
	@Override
	public Literal visitJoinCalcClause(JoinCalcClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinCalcClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinDropClause(it.islandofcode.parser.antlr.VTLParser.JoinDropClauseContext)
	 */
	@Override
	public Literal visitJoinDropClause(JoinDropClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinDropClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinKeepClause(it.islandofcode.parser.antlr.VTLParser.JoinKeepClauseContext)
	 */
	@Override
	public Literal visitJoinKeepClause(JoinKeepClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinKeepClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinRenameClause(it.islandofcode.parser.antlr.VTLParser.JoinRenameClauseContext)
	 */
	@Override
	public Literal visitJoinRenameClause(JoinRenameClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinRenameClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinFilterClause(it.islandofcode.parser.antlr.VTLParser.JoinFilterClauseContext)
	 */
	@Override
	public Literal visitJoinFilterClause(JoinFilterClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFilterClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinFoldClause(it.islandofcode.parser.antlr.VTLParser.JoinFoldClauseContext)
	 */
	@Override
	public Literal visitJoinFoldClause(JoinFoldClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFoldClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinUnfoldClause(it.islandofcode.parser.antlr.VTLParser.JoinUnfoldClauseContext)
	 */
	@Override
	public Literal visitJoinUnfoldClause(JoinUnfoldClauseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinUnfoldClause(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinAssignment(it.islandofcode.parser.antlr.VTLParser.JoinAssignmentContext)
	 */
	@Override
	public Literal visitJoinAssignment(JoinAssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinAssignment(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinFoldExpression(it.islandofcode.parser.antlr.VTLParser.JoinFoldExpressionContext)
	 */
	@Override
	public Literal visitJoinFoldExpression(JoinFoldExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFoldExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinUnfoldExpression(it.islandofcode.parser.antlr.VTLParser.JoinUnfoldExpressionContext)
	 */
	@Override
	public Literal visitJoinUnfoldExpression(JoinUnfoldExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinUnfoldExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinDropExpression(it.islandofcode.parser.antlr.VTLParser.JoinDropExpressionContext)
	 */
	@Override
	public Literal visitJoinDropExpression(JoinDropExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinDropExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinKeepExpression(it.islandofcode.parser.antlr.VTLParser.JoinKeepExpressionContext)
	 */
	@Override
	public Literal visitJoinKeepExpression(JoinKeepExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinKeepExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinRenameExpression(it.islandofcode.parser.antlr.VTLParser.JoinRenameExpressionContext)
	 */
	@Override
	public Literal visitJoinRenameExpression(JoinRenameExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinRenameExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinRenameParameter(it.islandofcode.parser.antlr.VTLParser.JoinRenameParameterContext)
	 */
	@Override
	public Literal visitJoinRenameParameter(JoinRenameParameterContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinRenameParameter(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitJoinFilterExpression(it.islandofcode.parser.antlr.VTLParser.JoinFilterExpressionContext)
	 */
	@Override
	public Literal visitJoinFilterExpression(JoinFilterExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinFilterExpression(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.parser.antlr.VTLBaseVisitor#visitComponentRole(it.islandofcode.parser.antlr.VTLParser.ComponentRoleContext)
	 */
	@Override
	public Literal visitComponentRole(ComponentRoleContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComponentRole(ctx);
	}

}
