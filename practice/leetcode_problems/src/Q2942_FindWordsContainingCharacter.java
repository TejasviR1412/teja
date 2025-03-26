import java.util.ArrayList;
import java.util.List;

public class Q2942_FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words1 = {"leet","code"};
        char x1 = 'e';

        String[] words2 = {"abc","bcd","aaaa","cbc"};
        char x2 = 'a';

        String[] words3 = {"abc","bcd","aaaa","cbc"};
        char x3 = 'z';

        System.out.println(findWordsContaining_Approach1_UsingIndexOf(words1,x1));
        System.out.println(findWordsContaining_Approach1_UsingIndexOf(words2,x2));
        System.out.println(findWordsContaining_Approach1_UsingIndexOf(words3,x3));
        System.out.println("************************");
        System.out.println(findWordsContaining_Approach2_WithoutIndexOf(words1,x1));
        System.out.println(findWordsContaining_Approach2_WithoutIndexOf(words2,x2));
        System.out.println(findWordsContaining_Approach2_WithoutIndexOf(words3,x3));
    }

    public static List<Integer> findWordsContaining_Approach1_UsingIndexOf(String[] words, char x) {
        List<Integer> integerList = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) > -1)
                integerList.add(i);
        }

        return integerList;
    }

    public static List<Integer> findWordsContaining_Approach2_WithoutIndexOf(String[] words, char x) {
        List<Integer> integerList = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(!integerList.contains(i) && words[i].charAt(j) == x)
                    integerList.add(i);
            }
        }
        return integerList;
    }
}