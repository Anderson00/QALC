// Generated from /UrukHai/repos/qalc/src/main/java/br/ufc/comp/qalc/antlr4/QALC.g4 by ANTLR 4.7.2
package br.ufc.comp.qalc.ast;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QALCParser}.
 */
public interface QALCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QALCParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(QALCParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(QALCParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QALCParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QALCParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(QALCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(QALCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(QALCParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(QALCParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(QALCParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(QALCParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(QALCParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(QALCParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(QALCParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(QALCParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(QALCParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(QALCParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(QALCParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(QALCParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(QALCParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(QALCParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#vatrib}.
	 * @param ctx the parse tree
	 */
	void enterVatrib(QALCParser.VatribContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#vatrib}.
	 * @param ctx the parse tree
	 */
	void exitVatrib(QALCParser.VatribContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QALCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QALCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(QALCParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(QALCParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomLiteral}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomLiteral(QALCParser.AtomLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomLiteral}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomLiteral(QALCParser.AtomLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(QALCParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(QALCParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(QALCParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(QALCParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(QALCParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(QALCParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(QALCParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(QALCParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(QALCParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(QALCParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(QALCParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(QALCParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrderingExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrderingExpression(QALCParser.OrderingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrderingExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrderingExpression(QALCParser.OrderingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(QALCParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(QALCParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(QALCParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(QALCParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(QALCParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(QALCParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResultUse}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterResultUse(QALCParser.ResultUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResultUse}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitResultUse(QALCParser.ResultUseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(QALCParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(QALCParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(QALCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(QALCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VartAtribution}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVartAtribution(QALCParser.VartAtributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VartAtribution}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVartAtribution(QALCParser.VartAtributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(QALCParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(QALCParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(QALCParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(QALCParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableUse}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableUse(QALCParser.VariableUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableUse}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableUse(QALCParser.VariableUseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpression(QALCParser.TimesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesExpression}
	 * labeled alternative in {@link QALCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpression(QALCParser.TimesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(QALCParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(QALCParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Numeroliteral}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumeroliteral(QALCParser.NumeroliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Numeroliteral}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumeroliteral(QALCParser.NumeroliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(QALCParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(QALCParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(QALCParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link QALCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(QALCParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(QALCParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(QALCParser.FcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#fpars}.
	 * @param ctx the parse tree
	 */
	void enterFpars(QALCParser.FparsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#fpars}.
	 * @param ctx the parse tree
	 */
	void exitFpars(QALCParser.FparsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QALCParser#rpars}.
	 * @param ctx the parse tree
	 */
	void enterRpars(QALCParser.RparsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QALCParser#rpars}.
	 * @param ctx the parse tree
	 */
	void exitRpars(QALCParser.RparsContext ctx);
}