import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParameterList;

import java.io.*;
import java.util.Iterator;

/**
 * Created by Dhawal Soni on 4/19/2016.
 */
public class MyCompiler extends DJPBaseVisitor {
    int ifCounter = 1, elseCounter = 1, whileCounter=1;
    StringBuilder sb = new StringBuilder();
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
        sb.append(" Data Type ").append(ctx.Type.getText());
        //System.out.println("STORE "+ctx.Type.getText());
        return null;
    }


    @Override
    public Object visitAssignment(DJPParser.AssignmentContext ctx) {
        //System.out.println("In assignmnet");
        if(ctx.e != null) {
            visit(ctx.e);
        } else if(ctx.var.getText().equals("END")){
            sb.append("\nENDS");
            endProgram(sb);
        } else if(ctx.var.getText().equals("BEGIN")) {
            sb.append("Program Body begins");
        }
        if(!ctx.var.getText().equals("BEGIN")) {
            sb.append("\nSTORE ").append(ctx.getChild(0).getText());
        }
        return null;
        }

    @Override
    public Object visitAdd(DJPParser.AddContext ctx) {
        visitChildren(ctx);
        sb.append("\nADD");
        //System.out.println("ADD");
        return null;
    }

    @Override
    public Object visitSub(DJPParser.SubContext ctx) {
        visitChildren(ctx);
        sb.append("\nSUB");
        //System.out.println("SUB");
        return null;
    }

    @Override
    public Object visitDiv(DJPParser.DivContext ctx) {
        visitChildren(ctx);
        //System.out.println("DIV");
        sb.append("\nDIV");
        return null;
    }

    @Override
    public Object visitMul(DJPParser.MulContext ctx) {
        visitChildren(ctx);
        sb.append("\nMUL");
        //System.out.println("MUL");
        return null;
    }

    @Override
    public Object visitGt(DJPParser.GtContext ctx) {
        visitChildren(ctx);
        sb.append("\nGT");
        //System.out.println("GT");
        return null;
    }

    @Override
    public Object visitGte(DJPParser.GteContext ctx) {
        visitChildren(ctx);
        sb.append("\nGTE");
        //System.out.println("GTE");
        return null;
    }

    @Override
    public Object visitLt(DJPParser.LtContext ctx) {
        visitChildren(ctx);
        sb.append("\nLT");
        //System.out.println("LT");
        return null;
    }

    @Override
    public Object visitLte(DJPParser.LteContext ctx) {
        visitChildren(ctx);
        sb.append("\nLTE");
        //System.out.println("LTE");
        return null;
    }

    @Override
    public Object visitEq(DJPParser.EqContext ctx) {
        visitChildren(ctx);
        sb.append("\nEQ");
        //System.out.println("EQ");
        return null;
    }

    @Override
    public Object visitNe(DJPParser.NeContext ctx) {
        visitChildren(ctx);
        sb.append("\nNE");
        //System.out.println("NE");
        return null;
    }

    @Override
    public Object visitAnd(DJPParser.AndContext ctx) {
        visitChildren(ctx);
        sb.append("\nAND");
        //System.out.println("AND");
        return null;
    }

    @Override
    public Object visitOr(DJPParser.OrContext ctx) {
        visitChildren(ctx);
        sb.append("\nOR");
        //System.out.println("OR");
        return null;
    }

    @Override
    public Object visitBool(DJPParser.BoolContext ctx) {
        visitChildren(ctx);
        //System.out.println("BOOL");
        return null;
    }

    @Override
    public Object visitIdent(DJPParser.IdentContext ctx) {
        sb.append("\nLOAD ").append(ctx.getChild(0).getText());
        //System.out.println("LOAD " + ctx.getChild(0).getText());
        return null;
    }

    @Override
    public Object visitDigit(DJPParser.DigitContext ctx) {
        sb.append("\nPUSH ").append(ctx.getChild(0).getText());
        //System.out.println("PUSH " + ctx.getChild(0).getText());
        return null;
    }

    @Override
    public Object visitType(DJPParser.TypeContext ctx) {
        sb.append("\nData type:").append(ctx.getChild(0));
        //System.out.println("Data type:"+ctx.getChild(0));
        return null;
    }

    @Override
    public Object visitStackDec(DJPParser.StackDecContext ctx) {
        //sb.append("\nStack ").append(ctx.getChild(0).getText());
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitStack(DJPParser.StackContext ctx) {
        sb.append("\nStack ").append(ctx.stckid.getText());
        return null;
    }

    @Override
    public Object visitStackOps(DJPParser.StackOpsContext ctx) {
        String stkOper = ctx.getChild(2).getText().replaceAll("\\(","").replaceAll("\\)","");
        if(stkOper.equalsIgnoreCase("push")){
            sb.append("\nSTACKPUSH ").append(ctx.var.getText()).append(" ").append(ctx.dig.getText());
        } else if (stkOper.equalsIgnoreCase("pop")) {
            sb.append("\nSTACKPOP ").append(ctx.var.getText());
        } else if (stkOper.equalsIgnoreCase("top")) {
            sb.append("\nSTACKTOP ").append(ctx.var.getText());
        } else if (stkOper.equalsIgnoreCase("isEmpty")) {
            sb.append("\nSTACKEMPTY ").append(ctx.var.getText());
        } else {
            throw new IllegalArgumentException("Trying to call Undefined Operation of Stack");
        }
        return null;
    }

    @Override
    public Object visitInbuiltFuncCall(DJPParser.InbuiltFuncCallContext ctx) {
        if(ctx.getChild(0).getText().equalsIgnoreCase("println")){
            visit(ctx.prExpLn);
            sb.append("\nPrintLN -> New Line");
            //System.out.println("PrintLN -> New Line");
        } else {
            visit(ctx.prExp);
            sb.append("\nPrint -> Same Line");
            //System.out.println("Print -> Same Line");
        }
        //sb.append("\nPRINTLN");
        return null;
    }

    @Override
    public Object visitIfStatement(DJPParser.IfStatementContext ctx) {
        //sb.append("\nIF");
        //System.out.println("IF");
        visit(ctx.ifs);
        if(ctx.getChildCount() > 1){
            visit(ctx.el);
        }

        return null;
    }

    @Override
    public Object visitIfStat(DJPParser.IfStatContext ctx) {
        visit(ctx.ie);
        sb.append("\nif true ").append(ifCounter++);
        elseCounter++;
        visit(ctx.iftrue);
        sb.append("\nGO TO EndIF").append(--ifCounter);
        if(ctx.parent.getChildCount() < 2){
            sb.append("\nEndIF").append(ifCounter);
        }
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
        sb.append("\nelse ").append( --elseCounter);
        visit(ctx.elsetrue);
        sb.append("\nElse Ends").append(elseCounter);
        sb.append("\nEndIF").append(ifCounter);
        return null;
    }

    @Override
    public Object visitWhileStat(DJPParser.WhileStatContext ctx) {
//        edited by Justin: Felt like just checking if true at the While line would make runtime easier.
        int temp = whileCounter;
        sb.append("\nWhile Start ").append(whileCounter++);
        visit(ctx.whileEx);
        sb.append("\nWhile").append(" "+temp);
        visit(ctx.whileBody);
        sb.append("\nGO To WhileStart").append(--whileCounter);
        return null;
    }

    @Override
    public Object visitFunctionCall(DJPParser.FunctionCallContext ctx) {
        visitChildren(ctx);
        sb.append("\nGO TO ").append(ctx.getChild(0).getText());
        return null;
    }

    @Override
    public Object visitFunctionDeclaration(DJPParser.FunctionDeclarationContext ctx) {
        sb.append("\nFunction Name: ").append(ctx.getChild(1).getText());
        sb.append("\nParameters Start");
        visit(ctx.para);
        sb.append("\nParameters End");
        sb.append("\nFunction Body Starts");
        visit(ctx.funcBody);
        sb.append("\nFunction Body Ends");
        return null;
    }

    @Override
    public Object visitParameterList(DJPParser.ParameterListContext ctx) {
        sb.append("\nNo of parameters:").append(ctx.paraDec.size());
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitParameterDeclaration(DJPParser.ParameterDeclarationContext ctx) {
        visitChildren(ctx);
        sb.append("\nSTORE ").append(ctx.getChild(1).getText());
        return null;
    }

    @Override
    public Object visitReturn(DJPParser.ReturnContext ctx) {
        sb.append("\nRETURN ").append(ctx.right.getText());
        return null;
    }

    public void endProgram(StringBuilder sb){
        try{
            BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("Intermediate.txt")));
            bwr.write(sb.toString());
            bwr.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
