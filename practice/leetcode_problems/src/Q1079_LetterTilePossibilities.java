import java.util.HashSet;
import java.util.Set;

public class Q1079_LetterTilePossibilities {
    public static void main(String[] args) {
        String tiles1 = "AAB";
        String tiles2 = "AAABBC";
        String tiles3 = "V";

        System.out.println(numTilePossibilities(tiles1));
        System.out.println(numTilePossibilities(tiles2));
        System.out.println(numTilePossibilities(tiles3));
    }

    public static int numTilePossibilities(String tiles) {
        Set<String> sequences = new HashSet<>();
        int length = tiles.length();
        boolean[] used = new boolean[length];

        //generate all possible sequences
        generateSequences(tiles,"",used,sequences);

        //remove the empty string from the count
        return sequences.size()-1;
    }

    private static void generateSequences(String tiles,
                                   String current,
                                   boolean[] used,
                                   Set<String> sequences){
        //add the current sequence to the set
        sequences.add(current);

        //add each unused character to the current sequence
        for(int i=0;i<tiles.length();i++){
            if(!used[i]){
                used[i] = true;
                generateSequences(tiles,
                        current+tiles.charAt(i),
                        used,sequences);
                used[i] = false;
            }
        }
    }
}
