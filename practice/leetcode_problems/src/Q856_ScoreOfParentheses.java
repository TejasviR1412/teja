import java.util.Stack;

public class Q856_ScoreOfParentheses {
    public int scoreOfParentheses_UsingStack(String s) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(0);

        for(char c: s.toCharArray()){
            if(c == '(')
                integerStack.push(0);
            else{
                int v = integerStack.pop();
                int w = integerStack.pop();
                integerStack.push(w + Math.max(2 * v , 1));
            }
        }

        return integerStack.pop();
    }

    public int scoreOfParentheses_WithoutStack(String s) {
        int answer = 0;
        int balance = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                balance++;
            }else{
                balance--;
                if(s.charAt(i-1) == '('){
                    answer +=1 << balance;
                }
            }
        }

        return answer;
    }
}