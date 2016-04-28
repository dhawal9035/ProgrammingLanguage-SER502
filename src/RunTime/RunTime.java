package RunTime;

import Exceptions.VariableNotDeclaredException;

import java.io.File;
import java.util.*;

/**
 * Created by Dhawal Soni on 4/23/2016.
 */
public class RunTime {
    public static HashMap<String, LinkedList<Integer>> symbolTable = new HashMap<>();
    public static Stack<Integer> varStack = new Stack<>();
    public static int[] counterArray = new int[2];
    public static int lineNum = 0;
    public static ArrayList<String> lines = new ArrayList<String>();

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(new File(args[0]));

        while (sc.hasNext()) {
            lines.add(sc.nextLine());
        }
        if (lines.get(lineNum).equalsIgnoreCase("Program Body begins")) {
            startExecution(sc);
        }
    }

    public static void startExecution(Scanner sc) throws Exception {
        int a;
        int b;
        boolean conditional;
        while (!lines.get(lineNum+1).isEmpty()) {
            lineNum++;
            String s = lines.get(lineNum);



//          If at the end of the while loop, go back to the start of the current while statement
            while(s.equals("GO To While" + counterArray[1])){
                String whileIdent = "WHILE" + counterArray[1];
                counterArray[1] --;
                if (symbolTable.containsKey(whileIdent)){
                    lineNum = symbolTable.get(whileIdent).pop();
                    s = lines.get(lineNum);
                }
//                TODO: test
            }
//            checks if it is at the end or meant to go to the end
//            while instead of if for nested if loops
            while(s.equals("GO TO EndIF" + counterArray[0]) || s.equals("EndIF" + counterArray[0])) {
                //     skip the lines until it reaches the outer if ending
                while (!s.equals("EndIF" + counterArray[0])) {
                    lineNum++;
                    s = lines.get(lineNum);
                }
//                go to line after ENDIF
                lineNum++;
                s = lines.get(lineNum);
                counterArray[0] -= 1;
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

                    counterArray[0] ++;
                    if (conditional) {
//                        if command is true, continue until 'ENDIF#'
                    }
                    else {
//                        else, continue until 'GO TO EndIF#'
                        while (!s.equals("GO TO EndIF" + counterArray[0])){
//                            just skips the lines
                            lineNum++;
                            s = lines.get(lineNum);
                        }
                    }
                    break;
                case "else":
//                    continue to process lines
                    break;
                case "while":
                    a = varStack.pop();
                    conditional = a > 0;
                    counterArray[1] ++;
                    if(conditional){
//                        continue to process
//                      stores while loop line number in the symbolTable
                        String whileIdent = "While" + counterArray[1];
                        LinkedList<Integer> list = new LinkedList<>();
                        list.add(lineNum);
                        symbolTable.put(whileIdent, list);

                    }
                    else{
//                        skip lines
                        while (!s.equals("EndWHILE" + counterArray[1])){
//                            just skips the lines untile endwhile, next iteration will go past the endwhile and break the loop
                            lineNum++;
                            s = lines.get(lineNum);
                        }
                    }
                    break;
                case "ENDS":
                    System.exit(0);
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
