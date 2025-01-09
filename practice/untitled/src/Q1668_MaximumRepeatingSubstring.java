public class Q1668_MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence1 = "ababc";
        String word1 = "ab";

        String sequence2 = "ababc";
        String word2 = "ba";

        String sequence3 = "ababc";
        String word3 = "ac";

        String sequence4 = "aaa";
        String word4 = "a";

        String sequence5 = "aa";
        String word5 = "a";

        System.out.println(maxRepeating(sequence1,word1));
        System.out.println(maxRepeating(sequence2,word2));
        System.out.println(maxRepeating(sequence3,word3));
        System.out.println(maxRepeating(sequence4,word4));
        System.out.println(maxRepeating(sequence5,word5));
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String concatenatedWord = word;

        if(word.length() == sequence.length() && word.equals(sequence))
            return 1;

        for(int i=0;i<sequence.length();i++){
            if(concatenatedWord.length() <= sequence.length()){
                if(sequence.contains(concatenatedWord))
                    count++;
            }

            concatenatedWord = concatenatedWord.concat(word);
        }
        return count;
    }
}