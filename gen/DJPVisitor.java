// Generated from C:/Users/Dhawal Soni/IdeaProjects/ProgrammingLanguage\DJP.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DJPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DJPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DJPParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DJPParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DJPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DJPParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#inbuiltFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInbuiltFuncCall(DJPParser.InbuiltFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DJPParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(DJPParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(DJPParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(DJPParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(DJPParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DJPParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(DJPParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(DJPParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(DJPParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(DJPParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(DJPParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(DJPParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ident}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(DJPParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(DJPParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(DJPParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(DJPParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DJPParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(DJPParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(DJPParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gte}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGte(DJPParser.GteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lte}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLte(DJPParser.LteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(DJPParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digit}
	 * labeled alternative in {@link DJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(DJPParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(DJPParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DJPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DJPParser.TypeContext ctx);
}