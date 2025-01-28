import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Q3174_ClearDigits {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cb34";
        String s3 = "abc1";

        System.out.println(clearDigits_UsingDeque(s1));
        System.out.println(clearDigits_UsingDeque(s2));
        System.out.println(clearDigits_UsingDeque(s3));
        System.out.println("***************************");
        System.out.println(clearDigits_UsingStack(s1));
        System.out.println(clearDigits_UsingStack(s2));
        System.out.println(clearDigits_UsingStack(s3));
    }

    public static String clearDigits_UsingDeque(String s) {
        String result = "";

        Deque<Character> deque = new LinkedList<>();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                deque.add(c);
            }else if(Character.isDigit(c)){
                deque.removeLast();
            }
        }

        for (Character character : deque) {
            result = result + character;
        }
        return result;
    }

    public static String clearDigits_UsingStack(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char letter : s.toCharArray()){
            if(Character.isLetter(letter))
                stack.push(letter);
            else if(Character.isDigit(letter))
                stack.pop();
        }

        while(!stack.isEmpty())
            sb.append(stack.pop());

        return sb.reverse().toString();
    }
}
