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
    public static HashMap<String, LinkedList<Integer>> symbolTable = new HashMap<>();
    public static Stack<Integer> varStack = new Stack<>();
    public static int counter = 0;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(new File(args[0]));
        if (sc.nextLine().equalsIgnoreCase("Program Body begins")) {
            startExecution(sc);
        }
    }

    public static void startExecution(Scanner sc) throws Exception {
        int a;
        int b;
        boolean conditional;
        while (sc.hasNext()) {
            String s = sc.nextLine();

//            checks if it is at the end or meant to go to the end
//            while instead of if for nested if loops
            if(s.equals("EndWHILE")){
//                TODO: record whileloop # and set sc equal to the start of the while loop
            }
            while(s.equals("GO TO EndIF" + counter) || s.equals("EndIF" + counter)) {
                //     skip the lines until it reaches the outer if ending
                while (!s.equals("EndIF" + counter)) {
                           s = sc.nextLine();
                }
//                go to line after ENDIF
                s = sc.nextLine();
                counter -= 1;
            }
            //System.out.println("test: " + s);
            String[] opCode = s.split(" ");
            switch (opCode[0]) {
                case "PUSH":
                    varStack.push(Integer.parseInt(opCode[1]));
                    break;
                case "STORE":
                    if (symbolTable.containsKey(opCode[1])) {
                        LinkedList<Integer> list = symbolTable.get(opCode[1]);
                        list.add(varStack.pop());
                    } else {
                        LinkedList<Integer> list = new LinkedList<>();
                        list.add(varStack.pop());
                        symbolTable.put(opCode[1], list);
                    }
                    break;
                case "LOAD":
                    if (symbolTable.containsKey(opCode[1])) {
                        LinkedList<Integer> list = symbolTable.get(opCode[1]);
                        varStack.push(list.get(list.size() - 1));
                    } else {
                        throw new VariableNotDeclaredException("The variable has not been declared");
                    }
                    break;
                case "DIV":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b / a);
                    break;
                case "MUL":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b * a);
                    break;
                case "ADD":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b + a);
                    break;
                case "SUB":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b - a);
                    break;
                case "Print":
                    System.out.print(varStack.pop());
                    break;
                case "PrintLN":
                    System.out.println(varStack.pop());
                    break;
                case "EQUAL":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(a == b ? 1 : 0);
                    break;
                case "GT":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b > a ? 1 : 0);
                    break;
                case "LT":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b < a ? 1 : 0);
                    break;
                case "LTE":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b <= a ? 1 : 0);
                    break;
                case "GTE":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b >= a ? 1 : 0);
                    break;
                case "NOTEQUALS":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b != a ? 1 : 0);
                    break;
                case "MOD":
                    a = varStack.pop();
                    b = varStack.pop();
                    if (a == 0.0) {
                        varStack.push(0);
                    } else {
                        varStack.push(b % a);
                    }

                    break;
                case "ASSIGNMENT":
                    a = varStack.pop();
                    b = varStack.pop();
                    varStack.push(b = a);
                    break;
                case "if":
                    a = varStack.pop();
                    conditional = a > 0;

                    counter ++;
                    if (conditional) {
//                        if command is true, continue until 'ENDIF#'
                    }
                    else {
//                        else, continue until 'GO TO EndIF#'
                        while (!s.equals("GO TO EndIF" + counter)){
//                            just skips the lines
                            s = sc.nextLine();
                        }
                    }
                    break;
                case "else":
//                    continue to process lines
                    break;
                case "while":
                    a = varStack.pop();
                    conditional = a > 0;
                    counter ++;
                    if(conditional){
//                        continue to process
//                      TODO: record line nummber

                    }
                    else{
//                        skip lines
                        while (!s.equals("GO TO EndWHILE" + counter)){
//                            just skips the lines, next iteration will go past the endwhile and break the loop
                            s = sc.nextLine();
                        }
                    }
                    break;
                case "ENDS":
                    System.exit(0);
                case "Else":
                    break;
                case "GO":
                    break;
                default:
                    if(opCode[0].substring(0,4).contains("EndIF")){
                        throw new IllegalArgumentException(opCode[0] + " Arguement is not defined");
                    }

            }
        }
    }
}
