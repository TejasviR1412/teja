import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q003_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println("*******************************");
        System.out.println(lengthOfLongestSubstring_UsingSlidingWindow(s1));
        System.out.println(lengthOfLongestSubstring_UsingSlidingWindow(s2));
        System.out.println(lengthOfLongestSubstring_UsingSlidingWindow(s3));
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

    public static int lengthOfLongestSubstring_UsingSlidingWindow(String s) {
        int size = s.length();

        if(size < 2)
            return size;

        int left = 0;
        int right = 0;
        int maxLength = 0;
        Map<Character,Integer> characterIntegerMap = new HashMap<>();

        while(right<size){
            if(characterIntegerMap.containsKey(s.charAt(right))){
                maxLength = Math.max(maxLength, right - left);
                left = Math.max(left , characterIntegerMap.get(s.charAt(right))+1);
            }

            characterIntegerMap.put(s.charAt(right),right);
            right++;
        }

        return Math.max(maxLength,right-left);
    }
}
