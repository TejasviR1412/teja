public class Q557_ReverseAString_III_Approach2 {
    public static void main(String[] args) {
        String s1 = "Let's take LeetCode contest";
        String s2 = "Mr Ding";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split(" ");

        String output = "";
        for(int i= 0; i < words.length ;i++){
            sb.append(words[i]);
            sb.reverse();
            sb.append(" ");
            output = output.concat(sb.toString());
            sb = new StringBuilder();
        }
        return output.trim();
    }
}
