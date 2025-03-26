import java.util.HashSet;
import java.util.Set;

public class Q1763_LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();

        for(int i=0;i<s.length();i++){
            characterSet.add(s.charAt(i));
        }

        for(int i=0;i<s.length();i++){
            if(characterSet.contains(Character.toUpperCase(s.charAt(i))) &&
            characterSet.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
            }

            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));

            return s1.length() >= s2.length()? s1: s2;
        }

        return s;
    }
}