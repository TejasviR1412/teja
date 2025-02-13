import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q030_SubstringWithConcatenationOfAllWords_Approach2 {
    private Map<String,Integer> wordCount = new HashMap<>();
    private int size;
    private int wordLength;
    private int subStringSize;
    private int k;

    public static void main(String[] args) {
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo","bar"};

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word","good","best","word"};

        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar","foo","the"};

        Q030_SubstringWithConcatenationOfAllWords_Approach2 q030 = new Q030_SubstringWithConcatenationOfAllWords_Approach2();
        System.out.println(q030.findSubstring(s1,words1));
        System.out.println(q030.findSubstring(s2,words2));
        System.out.println(q030.findSubstring(s3,words3));
    }

    private void slidingWindow(int left, String s, List<Integer> answer) {
        HashMap<String, Integer> wordsFound = new HashMap<>();
        int wordsUsed = 0;
        boolean excessWord = false;

        // Do the same iteration pattern as the previous approach - iterate
        // word_length at a time, and at each iteration we focus on one word
        for (int right = left; right <= size - wordLength; right += wordLength) {
            String sub = s.substring(right, right + wordLength);
            if (!wordCount.containsKey(sub)) {
                // Mismatched word - reset the window
                wordsFound.clear();
                wordsUsed = 0;
                excessWord = false;
                left = right + wordLength;
            } else {
                // If we reached max window size or have an excess word
                while (right - left == subStringSize || excessWord) {
                    String leftmostWord = s.substring(left, left + wordLength);
                    left += wordLength;
                    wordsFound.put(
                            leftmostWord,
                            wordsFound.get(leftmostWord) - 1
                    );

                    if (
                            wordsFound.get(leftmostWord) >=
                                    wordCount.get(leftmostWord)
                    ) {
                        // This word was an excess word
                        excessWord = false;
                    } else {
                        // Otherwise we actually needed it
                        wordsUsed--;
                    }
                }

                // Keep track of how many times this word occurs in the window
                wordsFound.put(sub, wordsFound.getOrDefault(sub, 0) + 1);
                if (wordsFound.get(sub) <= wordCount.get(sub)) {
                    wordsUsed++;
                } else {
                    // Found too many instances already
                    excessWord = true;
                }

                if (wordsUsed == k && !excessWord) {
                    // Found a valid substring
                    answer.add(left);
                }
            }
        }
    }

    public List<Integer> findSubstring(String s, String[] words) {
        size = s.length();
        k = words.length;
        wordLength = words[0].length();
        subStringSize = wordLength * k;

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < wordLength; i++) {
            slidingWindow(i, s, answer);
        }

        return answer;
    }
}