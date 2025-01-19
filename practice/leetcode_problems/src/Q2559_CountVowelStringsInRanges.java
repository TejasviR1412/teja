import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2559_CountVowelStringsInRanges {

    public static void main(String[] args) {
        String[] words1 = {"aba","bcb","ece","aa","e"};
        int[][] queries1  = {{0,2},{1,4},{1,1}};

        String[] words2 = {"a","e","i"};
        int[][] queries2  = {{0,2},{0,1},{2,2}};

        System.out.println(Arrays.toString(vowelStrings(words1,queries1)));
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] result = new int[queries.length];
        int[] prefixSum = new int[words.length];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        String currentWord;
        int sum=0;
        int[] currentQuery;
        for(int i=0; i<prefixSum.length ;i++){
            currentWord = words[i];
            if(vowels.contains(currentWord.charAt(0))
                    && vowels.contains(currentWord.charAt(currentWord.length()-1))){
                sum++;
            }

            prefixSum[i] = sum;
        }

        for(int i=0; i< queries.length;i++){
            currentQuery = queries[i];

            result[i] = prefixSum[currentQuery[1]] - (currentQuery[0] == 0 ? 0 : prefixSum[currentQuery[0] - 1]);
        }

        return result;
    }

}
