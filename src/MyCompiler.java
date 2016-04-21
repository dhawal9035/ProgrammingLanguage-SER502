import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParameterList;

import java.util.Iterator;

/**
 * Created by Dhawal Soni on 4/19/2016.
 */
public class MyCompiler extends DJPBaseVisitor {
    int ifCounter = 1, elseCounter = 1;
    @Override
    public Object visitBody(DJPParser.BodyContext ctx) {
        //System.out.println("In Body");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitStatement(DJPParser.StatementContext ctx) {
        //System.out.println("IN Statement");
        visitChildren(ctx);
        return null;
    }


    @Override
    public Object visitVariableDeclaration(DJPParser.VariableDeclarationContext ctx) {
        //System.out.println("IN Variable Dec");
        visit(ctx.assign);
        //System.out.println("STORE "+ctx.Type.getText());
        return null;
    }


    @Override
    public Object visitAssignment(DJPParser.AssignmentContext ctx) {
        //System.out.println("In assignmnet");
        visit(ctx.e);
        System.out.println("STORE " +ctx.getChild(0).getText());
        return null;
        }

    @Override
    public Object visitAdd(DJPParser.AddContext ctx) {
        visitChildren(ctx);
        System.out.println("ADD");
        return null;
    }

    @Override
    public Object visitSub(DJPParser.SubContext ctx) {
        visitChildren(ctx);
        System.out.println("SUB");
        return null;
    }

    @Override
    public Object visitDiv(DJPParser.DivContext ctx) {
        visitChildren(ctx);
        System.out.println("DIV");
        return null;
    }

    @Override
    public Object visitMul(DJPParser.MulContext ctx) {
        visitChildren(ctx);
        System.out.println("MUL");
        return null;
    }

    @Override
    public Object visitGt(DJPParser.GtContext ctx) {
        visitChildren(ctx);
        System.out.println("GT");
        return null;
    }

    @Override
    public Object visitGte(DJPParser.GteContext ctx) {
        visitChildren(ctx);
        System.out.println("GTE");
        return null;
    }

    @Override
    public Object visitLt(DJPParser.LtContext ctx) {
        visitChildren(ctx);
        System.out.println("LT");
        return null;
    }

    @Override
    public Object visitLte(DJPParser.LteContext ctx) {
        visitChildren(ctx);
        System.out.println("LTE");
        return null;
    }

    @Override
    public Object visitEq(DJPParser.EqContext ctx) {
        visitChildren(ctx);
        System.out.println("EQ");
        return null;
    }

    @Override
    public Object visitNe(DJPParser.NeContext ctx) {
        visitChildren(ctx);
        System.out.println("NE");
        return null;
    }

    @Override
    public Object visitAnd(DJPParser.AndContext ctx) {
        visitChildren(ctx);
        System.out.println("AND");
        return null;
    }

    @Override
    public Object visitOr(DJPParser.OrContext ctx) {
        visitChildren(ctx);
        System.out.println("OR");
        return null;
    }

    @Override
    public Object visitBool(DJPParser.BoolContext ctx) {
        visitChildren(ctx);
        System.out.println("BOOL");
        return null;
    }

    @Override
    public Object visitIdent(DJPParser.IdentContext ctx) {
        System.out.println("LOAD " + ctx.getChild(0).getText());
        return null;
    }

    @Override
    public Object visitDigit(DJPParser.DigitContext ctx) {
        System.out.println("PUSH " + ctx.getChild(0).getText());
        return null;
    }

    @Override
    public Object visitType(DJPParser.TypeContext ctx) {
        System.out.println("Data type:"+ctx.getChild(0));
        return null;
    }

    @Override
    public Object visitInbuiltFuncCall(DJPParser.InbuiltFuncCallContext ctx) {
        if(ctx.getChild(0).getText().equalsIgnoreCase("println")){
            visit(ctx.prExpLn);
            System.out.println("PrintLN -> New Line");
        } else {
            visit(ctx.prExp);
            System.out.println("Print -> Same Line");
        }
        System.out.println("Printed");
        return null;
    }

    @Override
    public Object visitIfStatement(DJPParser.IfStatementContext ctx) {
        System.out.println("IF");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitIfStat(DJPParser.IfStatContext ctx) {
        visit(ctx.ie);
        System.out.println("if true "+ ifCounter++);
        visit(ctx.iftrue);
        System.out.println("Skip Else");
        System.out.println("GO TO- End If");
        return null;
    }

    /*@Override
    public Object visitElseIfStat(DJPParser.ElseIfStatContext ctx) {
        visit(ctx.e);
        System.out.println("else if");
        return super.visitElseIfStat(ctx);
    }*/

    @Override
    public Object visitElseStat(DJPParser.ElseStatContext ctx) {
        System.out.println("else "+ elseCounter++);
        visit(ctx.elsetrue);
        System.out.println("Else Ends");
        System.out.println("End if");
        return null;
    }

    @Override
    public Object visitWhileStat(DJPParser.WhileStatContext ctx) {
        System.out.println("While");
        visit(ctx.whileEx);
        System.out.println("if True execute body");
        visit(ctx.whileBody);
        System.out.println("GO To While");
        return null;
    }

    @Override
    public Object visitFunctionCall(DJPParser.FunctionCallContext ctx) {
        visitChildren(ctx);
        System.out.println("GO TO "+ctx.getChild(0).getText());

        return null;
    }

    @Override
    public Object visitFunctionDeclaration(DJPParser.FunctionDeclarationContext ctx) {
        System.out.println("Function Name: "+ctx.getChild(1).getText());
        System.out.println("Parameters Start");
        //System.out.println(ctx.para.size());
        visit(ctx.para);
        System.out.println("Parameters End");
        System.out.println("Function Body Starts");
        visit(ctx.funcBody);
        System.out.println("Function Body Ends");
        return null;
    }

    @Override
    public Object visitParameterList(DJPParser.ParameterListContext ctx) {
        System.out.println("No of parameters:"+ctx.paraDec.size());
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitParameterDeclaration(DJPParser.ParameterDeclarationContext ctx) {
        visitChildren(ctx);
        System.out.println("STORE "+ctx.getChild(1).getText());
        return null;
    }

}
