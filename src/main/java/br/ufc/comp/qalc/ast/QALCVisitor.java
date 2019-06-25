// Generated from /UrukHai/repos/qalc/src/main/java/br/ufc/comp/qalc/antlr4/QALC.g4 by ANTLR 4.7.2
package br.ufc.comp.qalc.ast;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QALCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QALCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QALCParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(QALCParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QALCParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(QALCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(QALCParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(QALCParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(QALCParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(QALCParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(QALCParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(QALCParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(QALCParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#vatrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVatrib(QALCParser.VatribContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QALCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(QALCParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomLiteral}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomLiteral(QALCParser.AtomLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(QALCParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(QALCParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(QALCParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(QALCParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(QALCParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(QALCParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrderingExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderingExpression(QALCParser.OrderingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(QALCParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(QALCParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(QALCParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ResultUse}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultUse(QALCParser.ResultUseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(QALCParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(QALCParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VartAtribution}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartAtribution(QALCParser.VartAtributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(QALCParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(QALCParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableUse}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableUse(QALCParser.VariableUseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimesExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesExpression(QALCParser.TimesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(QALCParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numeroliteral}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroliteral(QALCParser.NumeroliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(QALCParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(QALCParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#fcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcall(QALCParser.FcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#fpars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpars(QALCParser.FparsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QALCParser#rpars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpars(QALCParser.RparsContext ctx);
}