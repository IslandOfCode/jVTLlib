// Generated from newVTL.g4 by ANTLR 4.6
package it.islandofcode.jvtllib.newparser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link newVTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface newVTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link newVTLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(newVTLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putData}
	 * labeled alternative in {@link newVTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutData(newVTLParser.PutDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definestatement}
	 * labeled alternative in {@link newVTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinestatement(newVTLParser.DefinestatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callProcStat}
	 * labeled alternative in {@link newVTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallProcStat(newVTLParser.CallProcStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defFunction}
	 * labeled alternative in {@link newVTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(newVTLParser.DefFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingstatement}
	 * labeled alternative in {@link newVTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingstatement(newVTLParser.AssingstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code debugstatement}
	 * labeled alternative in {@link newVTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugstatement(newVTLParser.DebugstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(newVTLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpr(newVTLParser.UnaryexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralexpr(newVTLParser.LiteralexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarexpr(newVTLParser.VarexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddMulExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMulExpr(newVTLParser.AddMulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinDivExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinDivExpr(newVTLParser.MinDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggrFunExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunExpr(newVTLParser.AggrFunExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CeilFloorexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeilFloorexpr(newVTLParser.CeilFloorexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logicalexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalexpr(newVTLParser.LogicalexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleparamMathfun}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleparamMathfun(newVTLParser.SingleparamMathfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getData}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetData(newVTLParser.GetDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogexpr(newVTLParser.LogexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalCond}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalCond(newVTLParser.RelationalCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConcat}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConcat(newVTLParser.StringConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOpExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOpExpr(newVTLParser.CondOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringFunReplace}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunReplace(newVTLParser.StringFunReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckExpr(newVTLParser.CheckExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringFunSubstr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunSubstr(newVTLParser.StringFunSubstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNullCondexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullCondexpr(newVTLParser.IsNullCondexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code precedenceexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedenceexpr(newVTLParser.PrecedenceexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleparamMathfun}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleparamMathfun(newVTLParser.DoubleparamMathfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code membershipexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembershipexpr(newVTLParser.MembershipexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roundexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundexpr(newVTLParser.RoundexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clauseExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseExpr(newVTLParser.ClauseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunExpr(newVTLParser.CallFunExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InCondexpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInCondexpr(newVTLParser.InCondexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setExpr}
	 * labeled alternative in {@link newVTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(newVTLParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkFunBase}
	 * labeled alternative in {@link newVTLParser#checkfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckFunBase(newVTLParser.CheckFunBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkFunWithOpt}
	 * labeled alternative in {@link newVTLParser#checkfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckFunWithOpt(newVTLParser.CheckFunWithOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#checkParamEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckParamEnum(newVTLParser.CheckParamEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#checkParamOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckParamOpt(newVTLParser.CheckParamOptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datapointruleset}
	 * labeled alternative in {@link newVTLParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatapointruleset(newVTLParser.DatapointrulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definevariable}
	 * labeled alternative in {@link newVTLParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinevariable(newVTLParser.DefinevariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineProcedure}
	 * labeled alternative in {@link newVTLParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineProcedure(newVTLParser.DefineProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#dpruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpruleset(newVTLParser.DprulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleruleConsequenceOnly}
	 * labeled alternative in {@link newVTLParser#singlerule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleruleConsequenceOnly(newVTLParser.SingleruleConsequenceOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleruleBoth}
	 * labeled alternative in {@link newVTLParser#singlerule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleruleBoth(newVTLParser.SingleruleBothContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#errorCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCode(newVTLParser.ErrorCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#getFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFunction(newVTLParser.GetFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#putFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutFunction(newVTLParser.PutFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clausebase}
	 * labeled alternative in {@link newVTLParser#clausefun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausebase(newVTLParser.ClausebaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clausejoin}
	 * labeled alternative in {@link newVTLParser#clausefun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausejoin(newVTLParser.ClausejoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clauseKeepRename}
	 * labeled alternative in {@link newVTLParser#clausebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseKeepRename(newVTLParser.ClauseKeepRenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clauseFilter}
	 * labeled alternative in {@link newVTLParser#clausebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseFilter(newVTLParser.ClauseFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clausecalc}
	 * labeled alternative in {@link newVTLParser#clausebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausecalc(newVTLParser.ClausecalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clausedrop}
	 * labeled alternative in {@link newVTLParser#clausebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausedrop(newVTLParser.ClausedropContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#clausebodyparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausebodyparam(newVTLParser.ClausebodyparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#clausebodycalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausebodycalc(newVTLParser.ClausebodycalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinblockInner}
	 * labeled alternative in {@link newVTLParser#joinblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinblockInner(newVTLParser.JoinblockInnerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinblockLeft}
	 * labeled alternative in {@link newVTLParser#joinblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinblockLeft(newVTLParser.JoinblockLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setUnion}
	 * labeled alternative in {@link newVTLParser#setfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUnion(newVTLParser.SetUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setIntersect}
	 * labeled alternative in {@link newVTLParser#setfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetIntersect(newVTLParser.SetIntersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSetSymDiff}
	 * labeled alternative in {@link newVTLParser#setfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSetSymDiff(newVTLParser.SetSetSymDiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nvlCondOp}
	 * labeled alternative in {@link newVTLParser#condOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlCondOp(newVTLParser.NvlCondOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfThenElseCondOp}
	 * labeled alternative in {@link newVTLParser#condOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseCondOp(newVTLParser.IfThenElseCondOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#aggregationFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFun(newVTLParser.AggregationFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(newVTLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#namedProcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedProcDef(newVTLParser.NamedProcDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#procVarInList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcVarInList(newVTLParser.ProcVarInListContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#singleVarIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarIn(newVTLParser.SingleVarInContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#callProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallProc(newVTLParser.CallProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#namedFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunDef(newVTLParser.NamedFunDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#callFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFun(newVTLParser.CallFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DBGprintvar}
	 * labeled alternative in {@link newVTLParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDBGprintvar(newVTLParser.DBGprintvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DBGnop}
	 * labeled alternative in {@link newVTLParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDBGnop(newVTLParser.DBGnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(newVTLParser.VarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#varmember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarmember(newVTLParser.VarmemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(newVTLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#scalartype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalartype(newVTLParser.ScalartypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#nulltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNulltype(newVTLParser.NulltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#booleantype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleantype(newVTLParser.BooleantypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#datetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetype(newVTLParser.DatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#integertype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegertype(newVTLParser.IntegertypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#floattype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloattype(newVTLParser.FloattypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(newVTLParser.StringtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(newVTLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(newVTLParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(newVTLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(newVTLParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(newVTLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(newVTLParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(newVTLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#componentRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentRole(newVTLParser.ComponentRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link newVTLParser#aggregationOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationOp(newVTLParser.AggregationOpContext ctx);
}