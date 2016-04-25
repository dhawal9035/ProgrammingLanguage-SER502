package RunTime;

import Exceptions.VariableNotDeclaredException;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Dhawal Soni on 4/23/2016.
 */
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
        int a;
        int b;
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
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b/a);
                    break;
                case "MUL":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b*a);
                    break;
                case "ADD":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b+a);
                    break;
                case "SUB":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b-a);
                    break;
                case "IF":
                    break;
                case "LT":
                    break;
                case "GT":
                    break;
                case "GTE":
                    break;
                case "LTE":
                    break;
                case "EQ":
                    break;
                case "NE":
                    break;
                case "Print":
                    System.out.print(varStack.pop());
                    break;
                case "PrintLN":
                    System.out.println(varStack.pop());
                    break;
                case "ENDS":
                    System.exit(0);
                default:
                    throw new IllegalArgumentException(opCode[0]+" Arguement is not defined");
            }
        }
    }
}