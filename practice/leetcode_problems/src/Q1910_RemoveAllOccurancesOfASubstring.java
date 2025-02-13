import java.util.Stack;

public class Q1910_RemoveAllOccurancesOfASubstring {
    public static void main(String[] args) {
        String s1 = "daabcbaabcbc";
        String part1 = "abc";

        String s2 = "axxxxyyyyb";
        String part2 = "xy";

        System.out.println(removeOccurrences_Approach1(s1,part1));
        System.out.println(removeOccurrences_Approach1(s2,part2));
        System.out.println("*******************************************");
        System.out.println(removeOccurrences_Approach2(s1,part1));
        System.out.println(removeOccurrences_Approach2(s2,part2));
    }

    /**
     * Constraints:
     * 1 <= s.length <= 1000
     * 1 <= part.length <= 1000
     *
     * Since the constraints are small , Brute Force can be used
     *
     * Time complexity : O(n^2 / m)
     * Space complexity : O(n)
     */
    public static String removeOccurrences_Approach1(String s, String part) {
        int partIndex;

        while(s.contains(part)){
            partIndex = s.indexOf(part);

            s = s.substring(0,partIndex) + s.substring(partIndex+part.length());
        }

        return s;
    }

    /**
     * Time complexity : O(n * m)
     * Space complexity : O(n + m)
     */
    public static String removeOccurrences_Approach2(String s, String part) {
        Stack<Character> characterStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int stringLength = s.length();
        int partLength = part.length();

        for(int i=0;i<stringLength;i++){
            characterStack.push(s.charAt(i));

            if(characterStack.size() >= partLength && isMatch(characterStack,part,partLength)){
                for(int j=0;j<partLength;j++){
                    characterStack.pop();
                }
            }
        }

        while (!characterStack.isEmpty()){
            sb.append(characterStack.pop());
        }

        return sb.reverse().toString();
    }

    private static boolean isMatch(Stack<Character> stack , String part , int partLength){
        Stack<Character> tempStack = new Stack<>();
        tempStack.addAll(stack);

        for(int i = partLength-1 ; i>=0;i--){
            if(tempStack.isEmpty() || tempStack.peek()!= part.charAt(i))
                return false;

            tempStack.pop();
        }

        return true;
    }
}