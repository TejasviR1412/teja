import java.util.Arrays;

public class Q1961_CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        String s1 = "iloveleetcode";
        String[] words1 = {"i","love","leetcode","apples"};

        String s2 = "iloveleetcode";
        String[] words2 = {"apples","i","love","leetcode"};

        String s3 = "a";
        String[] words3 = {"aa","aaaa","banana"};

        System.out.println(isPrefixString(s1,words1));
        System.out.println(isPrefixString(s2,words2));
        System.out.println(isPrefixString(s3,words3));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            sb.append(word);

            if(s.contentEquals(sb))
                return true;

            if(!s.contains(sb.toString()))
                return false;
        }

        return false;
    }
}


