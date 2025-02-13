import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  Check All Indices Using a Hash Table
 *
 *  one test case fails!!! TLE error
 */
public class Q030_SubstringWithConcatenationOfAllWords_Approach1 {
    private Map<String , Integer> wordCount = new HashMap<>();
    private int wordLength;
    private int substringSize;
    private int k;

    public static void main(String[] args) {
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo","bar"};

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word","good","best","word"};

        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar","foo","the"};

        Q030_SubstringWithConcatenationOfAllWords_Approach1 q030 = new Q030_SubstringWithConcatenationOfAllWords_Approach1();
        System.out.println(q030.findSubstring(s1,words1));
        System.out.println(q030.findSubstring(s2,words2));
        System.out.println(q030.findSubstring(s3,words3));
    }

    private boolean check(int i, String s){
        HashMap<String , Integer> remaining = new HashMap<>(wordCount);
        int wordsUsed = 0;
        String sub;

        for(int j = i; j < i+substringSize; j+= wordLength){
            sub = s.substring(j,j+wordLength);

            if(remaining.getOrDefault(sub,0) !=0){
                remaining.put(sub, remaining.get(sub) - 1);
                wordsUsed++;
            }else{
                break;
            }
        }

        return wordsUsed == k;
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        int size = s.length();
        k = words.length;
        wordLength = words[0].length();
        substringSize = wordLength * k;

        for(String word : words){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }

        for(int i=0; i<size-substringSize+1;i++){
            if(check(i,s))
                answer.add(i);
        }

        return answer;
    }
}
