import java.util.ArrayList;
import java.util.List;

public class Q003_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int substringLength = 0;
        int i = 0;
        int j = 0;

        List<Character> subString = new ArrayList<>();

        while(i < s.length()){
            if(!subString.contains(s.charAt(i))){
                subString.add(s.charAt(i));
                i++;
                substringLength = Math.max(substringLength,subString.size());
            }else{
                subString.remove(Character.valueOf(s.charAt(j)));
                j++;
            }
        }

        return substringLength;
    }
}
