import java.util.Stack;

public class Q394_DecodeString {
    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";
        String s4 = "100[leetcode]";

        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));
        System.out.println(decodeString(s4));
        System.out.println(decodeString(s3).equals("abcabccdcdcdef"));
    }

    public static String decodeString(String s) {
        StringBuilder currentString = new StringBuilder();
        StringBuilder decodedString = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringBuilderStack = new Stack<>();
        int noOfTimes = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                noOfTimes = noOfTimes * 10 + ch - '0';
            }else if(ch == '['){
                countStack.push(noOfTimes);
                stringBuilderStack.push(currentString);
                currentString = new StringBuilder();
                noOfTimes = 0;
            }else if(ch == ']'){
                decodedString = stringBuilderStack.pop();

                decodedString.append(String.valueOf(currentString).repeat(Math.max(0, countStack.pop())));
                currentString = decodedString;
            }else{
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}