package Two_Pointer_Techinque;

public class Q1768_MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        String word3 = "ab";
        String word4 = "pqrs";

        String word5 = "abcd";
        String word6 = "pq";

        System.out.println(mergeAlternately(word1,word2));
        System.out.println(mergeAlternately(word3,word4));
        System.out.println(mergeAlternately(word5,word6));
    }

    public static String mergeAlternately_Approach1(String word1, String word2) {
        int word1Index = 0;
        int word2Index = 0;

        int word1Length = word1.length();
        int word2Length = word2.length();

        StringBuilder sb = new StringBuilder();

        while(word1Index < word1Length || word2Index < word2Length){
            if(word1Index < word1Length){
                sb.append(word1.charAt(word1Index));
                word1Index++;
            }
            if(word2Index < word2Length){
                sb.append(word2.charAt(word2Index));
                word2Index++;
            }
        }

        return sb.toString();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int word1Length = word1.length();
        int word2Length = word2.length();

        while(i < word1Length && i < word2Length){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }

        if(i< word1Length){
            sb.append(word1.substring(i));
        }else if(i < word2Length){
            sb.append(word2.substring(i));
        }

        return sb.toString();
    }
}