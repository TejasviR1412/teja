import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q409_LongestPalindrome {
    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "a";
        String s3 = "abc";

        System.out.println(longestPalindrome_UsingSet(s1));
        System.out.println(longestPalindrome_UsingSet(s2));
        System.out.println(longestPalindrome_UsingSet(s3));

        System.out.println("************");
    }

    public static int longestPalindrome_UsingSet(String s) {
        Set<Character> characterSet = new HashSet<>();
        int result = 0;

        for(char c : s.toCharArray()){
            if(characterSet.contains(c)){
                characterSet.remove(c);
                result += 2;
            }else{
                characterSet.add(c);
            }
        }

        if(!characterSet.isEmpty())
            result ++;

        return result;
    }

    public static int longestPalindrome_UsingHashMap(String s) {
        int oddFrequencyCount = 0;

        Map<Character,Integer> frequencyMap = new HashMap<>();

        for(char c : s.toCharArray()){
            frequencyMap.put(c ,frequencyMap.getOrDefault(c,0)+1);

            if(frequencyMap.get(c) % 2 == 1){
                oddFrequencyCount++;
            }else{
                oddFrequencyCount--;
            }
        }

        if(oddFrequencyCount > 0){
            return s.length() - oddFrequencyCount + 1;
        }else{
            return s.length();
        }
    }
}