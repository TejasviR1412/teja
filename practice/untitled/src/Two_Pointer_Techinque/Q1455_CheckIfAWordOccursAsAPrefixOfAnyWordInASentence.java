package Two_Pointer_Techinque;

public class Q1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public static void main(String[] args) {
        String sentence1 = "i love eating burger";
        String searchWord1 = "burg";

        String sentence2 = "this problem is an easy problem";
        String searchWord2 = "pro";

        String sentence3 = "i am tired";
        String searchWord3 = "you";

        System.out.println(isPrefixOfWord(sentence1,searchWord1));
        System.out.println(isPrefixOfWord(sentence2,searchWord2));
        System.out.println(isPrefixOfWord(sentence3,searchWord3));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        int searchWordLength = searchWord.length();

        String[] words = sentence.trim().split(" ");

        for(int i=0;i<words.length;i++){
            if(words[i].length() < searchWordLength)
                continue;

            if(words[i].substring(0,searchWordLength).equals(searchWord))
                return i+1;
        }

        return -1;
    }
}