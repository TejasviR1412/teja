import java.util.Stack;

public class Q150_EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens1 = {"2","1","+","3","*"};

        String[] tokens2 = {"4","13","5","/","+"};

        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(tokens1));
        System.out.println(evalRPN(tokens2));
        System.out.println(evalRPN(tokens3));
    }

    public static int evalRPN(String[] tokens) {
        int result = 0;
        int length = tokens.length;

        Stack<String> integerStack = new Stack<>();

        if(length == 1
                && !(tokens[0].equals("+")
                || tokens[0].equals("-")
                || tokens.equals("*")
                || tokens.equals("/"))){
            return Integer.parseInt(tokens[0]);
        }

        for(String token : tokens){
            if (token.equals("+") || token.equals("-") || token.equals("*")
                    || token.equals("/")){
                result = calculate(Integer.parseInt(integerStack.pop()) , Integer.parseInt(integerStack.pop()),token);
                integerStack.push(String.valueOf(result));
            }else{
                integerStack.push(token);
            }
        }
        return result;
    }

    private static int calculate(int operand1 , int operand2 , String operator){
        switch (operator){
            case "+" -> {
                return operand2 + operand1;
            }
            case "-" -> {
                return operand2 - operand1;
            }
            case "*" -> {
                return operand2 * operand1;
            }case "/" -> {
                return operand2 / operand1;
            }
        }

        return 0;
    }
}