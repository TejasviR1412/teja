package Two_Pointer_Techinque;

public class Q408_ValidWordAbbreviation {
    public static void main(String[] args) {
        String word1 = "internationalization";
        String abbr1 = "i12iz4n";

        String word2 = "apple";
        String abbr2 = "a2e";

        System.out.println(validWordAbbreviation(word1,abbr1));
      //  System.out.println(validWordAbbreviation(word2,abbr2));
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        if(word == null || abbr == null){
            throw new IllegalArgumentException("Input is null");
        }

        int wordLength = word.length();
        int abbreviationLength =  abbr.length();

        if(abbreviationLength > wordLength){
            return false;
        }

        if(wordLength == 0){
            return true;
        }

        int i=0;
        int j =0;

        while(i<wordLength && j<abbreviationLength){

            /*if the current characters in both the
            * strings is the same then increment and continue*/
            if(word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
                continue;
            }

            /*
            Check the current character in abbr and it should be a valid digit
            in the range of 0<x<=9
             */
            if(abbr.charAt(j)=='0' || !Character.isDigit(abbr.charAt(j))){
                return false;
            }

            int num = 0;

            while(j < abbreviationLength && Character.isDigit(abbr.charAt(j))){
                num = 10 * num + (abbr.charAt(j) - '0');
                j++;
            }

            i+=num;
        }

        return i == wordLength && j == abbreviationLength;
    }
}