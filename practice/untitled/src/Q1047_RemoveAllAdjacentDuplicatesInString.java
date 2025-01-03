import java.util.ArrayDeque;
import java.util.Deque;

public class Q1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s1 = "abbaca";
        String s2 = "azxxzy";

        System.out.println(removeDuplicates(s1));
        System.out.println(removeDuplicates(s2));
    }

    public static String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peekLast() == c){
                stack.removeLast();
            }else stack.addLast(c);
        }

        while(!stack.isEmpty()){
            sb.append(stack.pollFirst());
        }

        return sb.toString();
    }
}