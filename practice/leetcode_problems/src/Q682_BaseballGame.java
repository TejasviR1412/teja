import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q682_BaseballGame {
    public static void main(String[] args) {
        String[] ops1 = {"5","2","C","D","+"};
        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        String[] ops3 = {"1","C"};

        System.out.println(calPoints(ops1));
        System.out.println(calPoints(ops2));
        System.out.println(calPoints(ops3));
        System.out.println("*****************");
        System.out.println(calPoints_WithoutStack(ops1));
        System.out.println(calPoints_WithoutStack(ops2));
        System.out.println(calPoints_WithoutStack(ops3));
    }

    public static int calPoints(String[] operations) {
        int result = 0;
        int lastValInStack;
        int sum = 0;
        Stack<Integer> integerStack = new Stack<>();

        //regex for positive and negative numbers
        String regex = "[-+]?\\d+\\.?\\d*";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        for(String s : operations){
            // Create a Matcher object
            Matcher matcher = pattern.matcher(s);

            if(matcher.matches()){
                integerStack.push(Integer.valueOf(s));
            }else if(s.equals("C")){
                integerStack.pop();
            }else if(s.equals("D")){
                integerStack.push(integerStack.peek() + integerStack.peek());
            }else{
                lastValInStack = integerStack.pop();
                sum = lastValInStack + integerStack.peek();
                integerStack.push(lastValInStack);
                integerStack.push(sum);
            }
        }

        while(!integerStack.isEmpty()){
            result += integerStack.pop();
        }

        return result;
    }

    public static int calPoints_WithoutStack(String[] operations) {
        int result = 0;
        int index = 0;
        int[] scores = new int[operations.length];

        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    scores[index] = scores[index - 2] + scores[index - 1];
                    result += scores[index];
                    index++;
                }
                case "D" -> {
                    scores[index] = scores[index - 1] * 2;
                    result += scores[index];
                    index++;
                }
                case "C" -> {
                    index--;
                    result -= scores[index];
                    scores[index] = 0;
                }
                default -> {
                    scores[index] = Integer.parseInt(operation);
                    result += scores[index];
                    index++;
                }
            }
        }
        return result;
    }
}