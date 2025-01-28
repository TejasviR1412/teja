import java.util.Stack;

public class Q2696_MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        String s1 = "ABFCACDB";
        String s2 = "ACBBD";
        String s3 = "D";

        System.out.println(minLength(s1));
        System.out.println(minLength(s2));
        System.out.println(minLength(s3));
    }

    public static int minLength(String s) {
        Stack<Character> characterStack = new Stack<>();

        for(char letter : s.toCharArray()){
            if(!characterStack.isEmpty() && ((letter == 'B' && characterStack.peek()=='A')
                || (letter == 'D' && characterStack.peek() == 'C'))){
                characterStack.pop();
            }else
                characterStack.push(letter);
        }

        return characterStack.size();
    }
}