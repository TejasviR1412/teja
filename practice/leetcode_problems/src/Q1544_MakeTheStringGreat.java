import java.util.ArrayDeque;
import java.util.Deque;

public class Q1544_MakeTheStringGreat {
    public static void main(String[] args) {
        String s1 = "leEeetcode";
        String s2 = "abBAcC";
        String s3 = "s";

        System.out.println(makeGood(s1));
        System.out.println(makeGood(s2));
        System.out.println(makeGood(s3));
    }

    public static String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        String result = "";

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() &&
               (stack.peekLast()+32 == c || stack.peekLast()-32 ==c)){
                stack.removeLast();
            }else
                stack.addLast(c);
        }

        while(!stack.isEmpty()){
            result += stack.pollFirst();
            //sb.append(stack.pollFirst());
        }

        return result;
    }
}