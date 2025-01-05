import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q1930_UniqueLength3PalindromeSubsequences {
    public static void main(String[] args) {
        String s1 = "aabca";
        String s2 = "adc";
        String s3 = "bbcbaba";

        System.out.println(countPalindromicSubsequence(s1));
        System.out.println(countPalindromicSubsequence(s2));
        System.out.println(countPalindromicSubsequence(s3));
    }

    public static int countPalindromicSubsequence_1(String s) {
        int count = 0;
        int i,j;
        Set<Character> letters = new HashSet<>();
        for(char c : s.toCharArray())
            letters.add(c);


        for(Character letter : letters){
            i = -1;
            j = 0;

            //this will find the first and last occurrence of a character in the string
            for(int k=0;k<s.length();k++){
                if(s.charAt(k) == letter){
                    if(i == -1){
                        i = k;
                    }

                    j=k;
                }
            }

            Set<Character> uniqueCharacters = new HashSet<>();
            for(int k = i+1; k<j;k++){
                uniqueCharacters.add(s.charAt(k));
            }

            count += uniqueCharacters.size();
        }
        return count;
    }
    public static int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        int curr;
        int answer=0;
        Set<Character> inBetweenCharacters;

        Arrays.fill(first,-1);

        for(int i=0; i<s.length();i++){
            curr = s.charAt(i)-'a';

            if(first[curr] == -1){
                first[curr] = i;
            }

            last[curr] = i;
        }

        for(int i=0 ;i<26; i++){
            if(first[i] == -1){
                continue;
            }

            inBetweenCharacters =  new HashSet<>();

            for(int j= first[i] + 1;j<last[i];j++){
                inBetweenCharacters.add(s.charAt(j));
            }

            answer += inBetweenCharacters.size();
        }
        return answer;
    }
}