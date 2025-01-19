import java.util.ArrayList;
import java.util.List;

/*Using the KarpRabin Algorithm*/
public class Q1408_StringMatchingInAnArray {
    private final int PRIME = 3;

    public static void main(String[] args) {
        String[] words1 = {"mass","as","hero","superhero"};
        String[] words2 = {"leetcode","et","code"};
        String[] words3 = {"blue","green","bu"};
        String[] words4 = {"kztyhsguy","ykztyhsguy","jiyelaqq","fnjiyelaqqz","izpdtk","fnjiyelaqqzxr","tgwczsd","yizpdtkwh",
                "xpjjzwy","jjiyelaqq","upancmpr","fcxpjjzwy","asuotubui","xpjjzwyw","ihguhgpj","fcxpjjzwyd",
                "tbvfnypb","erfnjiyelaqqzxrg","jhvwrvszn","ykztyhsguysu"};

        Q1408_StringMatchingInAnArray q1408 = new Q1408_StringMatchingInAnArray();
        System.out.println(q1408.stringMatching(words1));
        System.out.println(q1408.stringMatching(words2));
        System.out.println(q1408.stringMatching(words3));
        System.out.println(q1408.stringMatching(words4));
    }

    public List<String> stringMatching(String[] words) {
        List<String> word = new ArrayList<>();
        String text , pattern;

        for (String s : words) {
            for (String string : words) {
                if (s.equals(string))
                    continue;

                if (s.length() > string.length()) {
                    text = s;
                    pattern = string;
                } else {
                    text = string;
                    pattern = s;
                }

                if (search(text, pattern))
                    if (!word.contains(pattern))
                        word.add(pattern);
            }
        }

        return word;
    }

    private double calculateHashValue(String str){
        double hash = 0;

        for(int i=0;i<str.length();i++){
            hash += (str.charAt(i) * Math.pow(PRIME ,i));
        }

        return hash;
    }

    private double updateHash(double prevHash , char oldChar , char newChar, int patternLength){
        double newHash = (prevHash - oldChar)/PRIME;
        newHash += (newChar * Math.pow(PRIME , patternLength-1));

        return newHash;
    }

    public boolean search(String text , String pattern){
        int patternLength = pattern.length();

        double patternHash = calculateHashValue(pattern);
        double textHash = calculateHashValue(text.substring(0,patternLength));

        for(int i=0; i<=text.length()-patternLength;i++){
            if(textHash == patternHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    return true;
                }
            }

            if(i < text.length() - patternLength){
                textHash = updateHash(textHash , text.charAt(i) , text.charAt(i+patternLength) , patternLength);
            }
        }

        return false;
    }
}