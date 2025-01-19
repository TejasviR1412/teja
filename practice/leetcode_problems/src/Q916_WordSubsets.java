import java.util.ArrayList;
import java.util.List;

public class Q916_WordSubsets {
    private static final int LETTER_COUNT = 26;
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};

        String[] words3 = {"amazon","apple","facebook","google","leetcode"};
        String[] words4 = {"lc","eo"};

        String[] words5 = {"acaac","cccbb","aacbb","caacc","bcbbb"};
        String[] words6 = {"c","cc","b"};

        System.out.println(wordSubsets(words1,words2));
        System.out.println(wordSubsets(words3,words4));
        System.out.println(wordSubsets(words5,words6));
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxCount = new int[LETTER_COUNT];

        //get the frequency of each word present in words2
        for(String word : words2){
            int[] wordCount = count(word);

            for(int i=0;i<LETTER_COUNT;i++){
                maxCount[i] = Math.max(maxCount[i],wordCount[i]);
            }
        }

        List<String> result = new ArrayList<>();

        for(String word : words1){
            if(isWordUniversal(word,maxCount))
                result.add(word);
        }

        return result;
    }

    private static int[] count(String word){
        int[] count = new int[LETTER_COUNT];

        for(char c : word.toCharArray()){
            count[c-'a']++;
        }
        return count;
    }

    private static boolean isWordUniversal(String word , int[] maxCount){
        int[] wordCount = count(word);

        for(int i=0; i<LETTER_COUNT;i++){
            if(wordCount[i] < maxCount[i])
                return false;
        }

        return true;
    }
}