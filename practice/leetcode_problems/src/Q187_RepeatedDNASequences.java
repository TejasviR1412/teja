import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q187_RepeatedDNASequences {
    public static void main(String[] args) {
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String s2 = "AAAAAAAAAAAAA";

        System.out.println(findRepeatedDnaSequences_Approach1(s1));
        System.out.println(findRepeatedDnaSequences_Approach1(s2));
        System.out.println("***************************************");
    }

    /*
        Linear time slice using substring and hashset

        Algorithm:
        1. Move a sliding window of Length L along the string length
        2. Check if the sequence is present in the HashSet
            2.1. if yes, update the output. Add the sequence to the List
            2.2. if no, add the sequence in the hashset.
     */
    public static List<String> findRepeatedDnaSequences_Approach1(String s) {
        int slidingWindowLength = 10;
        int stringLength = s.length();
        String temp;
        Set<String> seen = new HashSet<>();
        Set<String> answer = new HashSet<>();

        for(int i=0;i<stringLength-slidingWindowLength+1;i++){
            temp = s.substring(i , i+slidingWindowLength);

            if(seen.contains(temp))
                answer.add(temp);

            seen.add(temp);
        }

        return new ArrayList<>(answer);
    }
}
