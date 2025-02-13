import java.util.Stack;

public class Q224_BasicCalculator {
    public static void main(String[] args) {
        String s1 = "1 + 1";
        String s2 = " 2-1 + 2 ";
        String s3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(calculate(s1));
        System.out.println(calculate(s2));
        System.out.println(calculate(s3));
    }

    /**
     * Constraints:
     * 1. 1 <= s.length <= 3 * 10^5
     * 2. s consists of digits, '+', '-', '(', ')', and ' '.
     * 3. Every number and running calculation will fit in a signed 32-bit integer.
     */
    public static int calculate(String s) {
        Stack<Integer> integerStack = new Stack<>();
        int operand = 0;
        int result = 0;
        int sign = 1; // 1 means positive, -1 means negative

        char ch;

        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);

            if(Character.isDigit(ch)){
                operand = operand * 10 + ch - '0';
            }else if(ch == '+'){
                result += sign * operand;
                sign = 1;
                operand = 0;
            }else if(ch == '-'){
                result  += sign * operand;
                sign = -1;
                operand = 0;
            }else if(ch == '('){
                integerStack.push(result);
                integerStack.push(sign);

                sign = 1;
                result = 0;
            }else if(ch == ')'){
                result += sign * operand;
                result *= integerStack.pop();
                result += integerStack.pop();

                operand = 0;
            }
        }

        return result + (sign * operand);
    }
}