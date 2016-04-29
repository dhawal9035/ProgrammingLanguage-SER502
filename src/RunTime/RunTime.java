package RunTime;

import Exceptions.VariableNotDeclaredException;

import java.io.File;
import java.util.*;

/**
 * Created by Dhawal Soni on 4/23/2016.
 */
public class RunTime {
    public static HashMap<String, LinkedList<Integer>> outerSymbolTable = new HashMap<>();
    public static HashMap<String, LinkedList<Integer>> symbolTable = outerSymbolTable;
//    function name, hashmap with function values (funcLineNum, localVariables)
    public static HashMap<String, HashMap<String, LinkedList<Integer>>> functionTable = new HashMap<>();
//    todo: close function( get funct name, lineNumber, delte the rest, recreate with just name/lineNumber)
//    todo: varStack within function? for local variables/params
//    empty function table after come out.
    public static Stack<Integer> varStack = new Stack<>();
    public static Stack<Integer> functStack = new Stack<>();

//    todo: whenever a function is called, pop the name onto this recursive stack (so symbol table will switch)
//    todo: in a call, if the name already exists inside recursiveFunctions stack, name it functionName+ " " + num and
//    todo: store it in the hashmap as such
    public static Stack<String> recursiveFunctions = new Stack<>();
//    todo: Stacks to track the variables used in a scope.. If counter
//    each time if or while is created, pop value onto the stack and increment. append String when pushing to varstack
    public static Stack<String[]> ifWhileStack = new Stack<>();
//    todo: Implement block: ends an if or whileStack.
//    String[] keys = ifWhileStack.pop();
//    for(int i = 0; i < keys.length; i++){
//        if(symbolTable.containsKey(keys[i])){
//            LinkedList<Integer> newList = symbolTable.get(keys[i]);
//            newList.pop();
//            symbolTable.put(keys[i], newList);
//        }
//    }

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

//        todo: utilize properly.
        symbolTable = outerSymbolTable;
        outerSymbolTable = symbolTable;
        symbolTable = functionTable.get("FunctionName");
        functionTable.get("FunctionName").clear();
//        end

        while (!lines.get(lineNum+1).isEmpty()) {
            lineNum++;
            String s = lines.get(lineNum);
            System.out.println(s + " counter: " + counterArray[1]);


//          If at the end of the while loop, go back to the start of the current while statement
            while(s.equals("GO To WhileStart" + counterArray[1])){

                String whileIdent = "WHILE" + counterArray[1];
                counterArray[1] --;
                if (symbolTable.containsKey(whileIdent)){
                    lineNum = symbolTable.get(whileIdent).pop();
                    s = lines.get(lineNum);
                }
//                TODO: test
//                System.out.println("looping: " + s);
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
            if(s.equals("No of parameters: ")){
                String[] opCode = s.split(" ");
                for(int i = 0; i < Integer.parseInt(opCode[4]); i++){
//                    store params
                }
            }
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
                case "While":


                    if (opCode[1].equals("Start")) {
                        counterArray[1] ++;
                        LinkedList<Integer> list = new LinkedList<>();
                        list.add(lineNum);
                        String whileIdent = "WHILE" + counterArray[1];
                        symbolTable.put(whileIdent, list);
                    }
                    else{
                        a = varStack.pop();
                        conditional = a > 0;
                        if(conditional){
//                        continue to process

                        }
                        else{
//                        skip lines
                            while (!s.equals("GO To WhileStart" + counterArray[1])){
//                            just skips the lines untile endwhile, next iteration will go past the endwhile and break the loop
                                lineNum++;
                                s = lines.get(lineNum);
                            }
                            counterArray[1]--;
                        }
                    }

                    break;
                case "Function":
                    if(opCode[1].equals("Name:")){
//                        ArrayList<String> function = new ArrayList<>();
//                        Store function line and all lines up to and including 'function body ends'.
                        LinkedList<Integer> list = new LinkedList<>();
                        list.add(lineNum);
//                        list.add(function);
                        functionTable.put(opCode[2], list);
//                        function.add(lines.get(lineNum));
                        while (!s.equals("Function Body Ends")){
//                            just stores the function;
                            lineNum++;
                            s = lines.get(lineNum);
                        }
//                        put into new hashmap
//                        todo: Probably store in a cleaner hashmap.
//                        LinkedList<Integer> list = new LinkedList<>();
//                        list.add(lineNum);
//                        list.add(function);

                    }
                    else if(s.equals("Function Body Ends")){
                        lineNum = functStack.pop();
                    }
                    break;
                case "ENDS":
                    System.exit(0);
                case "GO":
//                    todo: function calls

                    if (opCode.length > 1 && opCode[1].equals("TO")) {
//                        get the function from the hashmap.
                        functStack.push(lineNum);
                        System.out.println("DEBUGGED REACHED FUNCTION: " + opCode[1] + " len: " + opCode.length);
                        lineNum = functionTable.get(opCode[2]).pop();
//                        todo: process the function and parameters.
                    }
                    break;
                default:
                    if(opCode[0].substring(0,4).contains("EndIF")){
                        throw new IllegalArgumentException(opCode[0] + " Arguement is not defined");
                    }

            }
        }
    }
}
