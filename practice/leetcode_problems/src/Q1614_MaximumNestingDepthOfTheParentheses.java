import java.util.Stack;

public class Q1614_MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s1 = "(1+(2*3)+((8)/4))+1";
        String s2 = "(1)+((2))+(((3)))";
        String s3 = "()(())((()()))";

        System.out.println(maxDepth(s1));
        System.out.println(maxDepth(s2));
        System.out.println(maxDepth(s3));
        System.out.println("***********");
        System.out.println(maxDepth_1(s1));
        System.out.println(maxDepth_1(s2));
        System.out.println(maxDepth_1(s3));
    }

    public static int maxDepth(String s) {
        Stack<Character> openBracketStack = new Stack<>();
        int result = 0;

        for(char c : s.toCharArray()){
            if(c == '(')
                openBracketStack.push(c);
            else if(c == ')')
                openBracketStack.pop();

            result = Math.max(result,openBracketStack.size());
        }

        return result;
    }

    public static int maxDepth_1(String s) {
        int result = 0;
        int countOpenBracket = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                countOpenBracket++;
            }else if(c == ')')
                countOpenBracket--;

            result = Math.max(result , countOpenBracket);
        }

        return result;
    }
}
