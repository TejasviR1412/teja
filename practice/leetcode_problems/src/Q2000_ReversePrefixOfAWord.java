import java.util.Stack;

public class Q2000_ReversePrefixOfAWord {
    public static void main(String[] args) {
        String word1 = "abcdefd";
        char ch1 = 'd';

        String word2 = "xyxzxe";
        char ch2 = 'z';

        String word3 = "abcd";
        char ch3 = 'z';

        System.out.println(reversePrefix(word1,ch1));
        System.out.println(reversePrefix_UsingStack(word1,ch1));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(reversePrefix(word2,ch2));
        System.out.println(reversePrefix_UsingStack(word2,ch2));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(reversePrefix(word3,ch3));
        System.out.println(reversePrefix_UsingStack(word3,ch3));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();

        if(word.indexOf(ch)!= -1){
            sb.append(word, 0, word.indexOf(ch)+1).reverse()
                    .append(word.substring(word.indexOf(ch)+1));
        }else{
            return word;
        }

        return sb.toString();
    }

    public static String reversePrefix_UsingStack(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack= new Stack<>();

        String stringToBeReveresed = word.substring(0, word.indexOf(ch)+1);

        for(int i=0; i<stringToBeReveresed.length();i++){
            stack.push(stringToBeReveresed.charAt(i));
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        sb.append(word.substring(word.indexOf(ch)+1));

        return sb.toString();
    }
}