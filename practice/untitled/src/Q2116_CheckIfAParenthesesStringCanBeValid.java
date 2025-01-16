import java.util.Stack;

public class Q2116_CheckIfAParenthesesStringCanBeValid {
    public static void main(String[] args) {
        String s1 = "))()))";
        String locked1 = "010100";

        String s2 = "()()";
        String locked2 = "0000";

        String s3 = ")";
        String locked3 = "0";

        System.out.println(canBeValid(s1,locked1));
        System.out.println(canBeValid(s2,locked2));
        System.out.println(canBeValid(s3,locked3));
    }

    public static boolean canBeValid(String s, String locked) {
        int length = s.length();

        if(length%2 == 1)
            return false;

        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for(int i=0;i<length;i++){
            if(locked.charAt(i) == '0'){
                unlocked.push(i);
            }else if(s.charAt(i) == '('){
                openBrackets.push(i);
            }else if(s.charAt(i) == ')'){
                if(!openBrackets.empty())
                    openBrackets.pop();
                else if(!unlocked.empty())
                    unlocked.pop();
                else
                    return false;
            }
        }

        while(!openBrackets.empty() &&
                !unlocked.empty() &&
                openBrackets.peek()<unlocked.peek()){
            openBrackets.pop();
            unlocked.pop();
        }

        return openBrackets.empty();
    }

    public boolean canBeValid_withputStack(String s, String locked) {
        int length = s.length();

        // If length of string is odd, return false.
        if (length % 2 == 1) {
            return false;
        }
        int openBrackets = 0;
        int unlocked = 0;

        // Iterate through the string to handle '(' and ')'.
        for (int i = 0; i < length; i++) {
            if (locked.charAt(i) == '0') {
                unlocked++;
            } else if (s.charAt(i) == '(') {
                openBrackets++;
            } else if (s.charAt(i) == ')') {
                if (openBrackets > 0) {
                    openBrackets--;
                } else if (unlocked > 0) {
                    unlocked--;
                } else {
                    return false;
                }
            }
        }

        // Match remaining open brackets with unlocked characters.
        int balance = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                balance--;
                unlocked--;
            } else if (s.charAt(i) == '(') {
                balance++;
                openBrackets--;
            } else if (s.charAt(i) == ')') {
                balance--;
            }
            if (balance > 0) {
                return false;
            }
            if (unlocked == 0 && openBrackets == 0) {
                break;
            }
        }

        if (openBrackets > 0) {
            return false;
        }

        return true;
    }
}