import java.util.Stack;

public class Q20_ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "}{";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }

    public static boolean isValid_withoutStack(String s) {
        while(true){
            if(s.contains("()"))
                s = s.replace("()","");
            else if(s.contains("{}"))
                s = s.replace("{}","");
            else if(s.contains("[]"))
                s = s.replace("[]","");
            else
                return s.isEmpty();
        }
    }
}