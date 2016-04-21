// Generated from C:/Users/Dhawal Soni/IdeaProjects/ProgrammingLanguage\DJP.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DJPParser}.
 */
public interface DJPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DJPParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DJPParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DJPParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DJPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DJPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DJPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DJPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#inbuiltFuncCall}.
	 * @param ctx the parse tree
	 */
	void enterInbuiltFuncCall(DJPParser.InbuiltFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#inbuiltFuncCall}.
	 * @param ctx the parse tree
	 */
	void exitInbuiltFuncCall(DJPParser.InbuiltFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DJPParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DJPParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(DJPParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(DJPParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(DJPParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(DJPParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(DJPParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(DJPParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(DJPParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(DJPParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(DJPParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(DJPParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(DJPParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(DJPParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(DJPParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(DJPParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(DJPParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(DJPParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DJPParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DJPParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DJPParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DJPParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSub(DJPParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSub(DJPParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(DJPParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(DJPParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(DJPParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(DJPParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(DJPParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(DJPParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ident}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdent(DJPParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ident}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdent(DJPParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLt(DJPParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLt(DJPParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEq(DJPParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEq(DJPParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(DJPParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(DJPParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGt(DJPParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGt(DJPParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DJPParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DJPParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(DJPParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(DJPParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ne}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNe(DJPParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNe(DJPParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gte}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGte(DJPParser.GteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gte}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGte(DJPParser.GteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lte}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLte(DJPParser.LteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lte}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLte(DJPParser.LteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn(DJPParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn(DJPParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digit}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit(DJPParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digit}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit(DJPParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DJPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DJPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DJPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DJPParser.TypeContext ctx);
}