import java.util.HashMap;
import java.util.Map;

public class Q3541_FindMostFrequentVowelAndConsonant {
    static final String VOWEL = "aeiou";
    public static int maxFreqSum_UsingHashMaps(String s) {
        int vowelCount = 0;
        int consonantCount = 0;

        Map<Character,Integer> consonantMap = new HashMap<>();
        Map<Character,Integer> vowelMap = new HashMap<>();

        for(char c: s.toCharArray()){
            if(VOWEL.indexOf(c) != -1){
                vowelMap.put(c , vowelMap.getOrDefault(c,0)+1);
            }else{
                consonantMap.put(c,consonantMap.getOrDefault(c,0)+1);
            }
        }

        for(int count : vowelMap.values()){
            vowelCount = Math.max(count,vowelCount);
        }

        for(int count : consonantMap.values()){
            consonantCount = Math.max(count,consonantCount);
        }

        return vowelCount + consonantCount;
    }

    public static int maxFreqSum_UsingArrays(String s) {
        int[] alphabets = new int[26];
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i=0;i<s.length();i++){
            alphabets[s.charAt(i)-'a']++;
        }

        for(int i=0;i<alphabets.length;i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20){
                vowelCount = Math.max(vowelCount,alphabets[i]);
            }else{
                consonantCount = Math.max(consonantCount, alphabets[i]);
            }
        }
        return vowelCount + consonantCount;
    }

    public static void main(String[] args) {
        String s1 = "successes";

        String s2 = "aeiaeia";

        System.out.println(maxFreqSum_UsingHashMaps(s1));
        System.out.println(maxFreqSum_UsingHashMaps(s2));
        System.out.println("*********************************");
        System.out.println(maxFreqSum_UsingArrays(s1));
        System.out.println(maxFreqSum_UsingArrays(s2));
    }
}
