public class Q1832_CheckIfTheSentenceIsAPanagram {
    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";

        System.out.println(checkIfPangram(sentence1));
        System.out.println(checkIfPangram(sentence2));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] letters =  new boolean[26];
        int uniqueLetters = 0;

        for(char c : sentence.toCharArray()){
            int index = c - 'a';

            if(!letters[index]){
                letters[index] = true;
                uniqueLetters++;
            }
        }

        return uniqueLetters == 26;
    }
}
