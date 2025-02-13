import java.util.Stack;

public class Q227_BasicCalculator_II {
    public static void main(String[] args) {
        String s1 = "3+2*2";
        String s2 = " 3/2 ";
        String s3 = " 3+5 / 2 ";

        System.out.println(calculate_Approach1(s1));
        System.out.println(calculate_Approach1(s2));
        System.out.println(calculate_Approach1(s3));
        System.out.println("****************************");
        System.out.println(calculate_Approach2(s1));
        System.out.println(calculate_Approach2(s2));
        System.out.println(calculate_Approach2(s3));
    }

    /**
     * Time Complexity : O(N)
     * Space Complexity : O(N)
     */
    public static int calculate_Approach1(String s) {
        Stack<Integer> integerStack = new Stack<>();
        int number = 0;
        int result = 0;
        char operator = '+';

        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                number = number * 10 + ch[i] - '0';
            }

            if(!Character.isSpaceChar(ch[i]) && !Character.isDigit(ch[i]) || i == ch.length-1){
                if(operator == '+')
                    integerStack.push(number);
                else if(operator == '-')
                    integerStack.push(-number);
                else if(operator == '*')
                    integerStack.push(integerStack.pop()*number);
                else if(operator == '/')
                    integerStack.push(integerStack.pop()/number);

                operator = ch[i];
                number = 0;
            }
        }

        while(!integerStack.isEmpty()){
            result += integerStack.pop();
        }

        return result;
    }

    /**
     * Time Complexity : O(N)
     * Space Complexity : O(1)
     */
    public static int calculate_Approach2(String s) {
        int result = 0;
        int currentNumber = 0;
        int lastNumber = 0;

        char operator = '+';
        char currentCharacter;

        for(int i=0;i<s.length();i++){
            currentCharacter = s.charAt(i);

            if(Character.isDigit(currentCharacter)){
                currentNumber = currentNumber * 10 + currentCharacter - '0';
            }

            if(!Character.isDigit(currentCharacter) && !Character.isSpaceChar(currentCharacter)
               || i == s.length()-1){
                if(operator == '+' || operator == '-'){
                    result += lastNumber;
                    lastNumber = (operator=='+')?currentNumber:-currentNumber;
                }else if(operator == '*'){
                    lastNumber *= currentNumber;
                }else if(operator == '/'){
                    lastNumber /= currentNumber;
                }

                operator = currentCharacter;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}