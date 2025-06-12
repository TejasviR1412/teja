import java.util.*;

public class Q819_MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] words = paragraph.split("\\s+");

        Set<String> hashSet = new HashSet<>(Arrays.asList(banned));
        Map<String,Integer> hashMap = new HashMap<>();

        for(String word : words){
            boolean b = !(hashSet.contains(word));
            if (!hashSet.contains(word)) {
                hashMap.put(word,hashMap.getOrDefault(word,0)+1);
            }
        }

        return Collections.max(hashMap.entrySet(),Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};

        String paragraph2 = "a.";
        String[] banned2 = {};

        System.out.println(mostCommonWord(paragraph1,banned1));
        System.out.println(mostCommonWord(paragraph2,banned2));
    }
}