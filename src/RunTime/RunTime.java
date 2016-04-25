package RunTime;

import Exceptions.VariableNotDeclaredException;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class RunTime {
    public static Stack<Integer> varStack = new Stack<>();
    public static HashMap<String,LinkedList<Integer>> symbolTable = new HashMap<>();
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(new File(args[0]));
        if(sc.nextLine().equalsIgnoreCase("Program Body begins")){
            startExecution(sc);
        }
    }

    public static void startExecution(Scanner sc) throws Exception{
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] opCode = s.split(" ");
            switch(opCode[0]){
                case "PUSH":
                    varStack.push(Integer.parseInt(opCode[1]));
                    break;
                case "STORE":
                    if(symbolTable.containsKey(opCode[1])){
                        LinkedList<Integer> list = symbolTable.get(opCode[1]);
                        list.add(varStack.pop());
                    } else {
                        LinkedList<Integer> list = new LinkedList<>();
                        list.add(varStack.pop());
                        symbolTable.put(opCode[1],list);
                    }
                    break;
                case "LOAD":
                    if(symbolTable.containsKey(opCode[1])){
                        LinkedList<Integer> list = symbolTable.get(opCode[1]);
                        varStack.push(list.get(list.size()-1));
                    } else {
                        throw new VariableNotDeclaredException("The variable has not been declared");
                    }
                    break;
                case "DIV":
                    int a = varStack.pop();
                    int b = varStack.pop();
                    varStack.push(b/a);
                    break;
                case "MUL":
                    int c = varStack.pop();
                    int d = varStack.pop();
                    varStack.push(c*d);
                    break;
                case "ADD":
                    int e = varStack.pop();
                    int f = varStack.pop();
                    varStack.push(e+f);
                    break;
                case "SUB":
                    int g = varStack.pop();
                    int h = varStack.pop();
                    varStack.push(h-g);
                    break;
                case "Print":
                    System.out.print(varStack.pop());
                    break;
                case "PrintLN":
                    System.out.println(varStack.pop());
                    break;
                case "ENDS":
                    System.exit(0);
                case "EQUAL":
                    int i=varStack.pop();
                    int j=varStack.pop();
                    varStack.push(i==j);
                    break;
                case "GT":
                    int k=varStack.pop();
                    int l=varStack.pop();
                    varStack.push(k>l);
                    break;
                case "LT":
                    int m=varStack.pop();
                    int n=varStack.pop();
                    varStack.push(m<n);
                    break;
                case "LTE":
                    int o=varStack.pop();
                    int p=varStack.pop();
                    varStack.push(o<=p);
                    break;
                case "GTE":
                    int q=varStack.pop();
                    int r=varStack.pop();
                    varStack.push(q>=r);
                    break;
                case "NOTEQUALS":
                    int s=varStack.pop();
                    int t=varStack.pop();
                    varStack.push(s!=t);
                    break;
                case "MOD":
                    int u=varStack.pop();
                    int v=varStack.pop();
                    if(u==0.0){
                        varStack.push(0);
                    }
                    else{
                        varStack.push(u%v);
                    }

                    break;
                case "ASSIGNMENT":
                    int x=varStack.pop();
                    int y=varStack.pop();
                    varStack.push(x=y);
                    break;
                case "if":
                    int op1=varStack.pop();
                    int op2=varStack.pop();



                default:
                    throw new IllegalArgumentException(opCode[0]+" Arguement is not defined");
            }
        }
    }
}