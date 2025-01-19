public class Q2185_CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String[] words1 = {"pay","attention","practice","attend"};
        String pref1 = "at";

        String[] words2 = {"leetcode","win","loops","success"};
        String pref2 = "code";

        System.out.println(prefixCount(words1,pref1));
        System.out.println(prefixCount(words2,pref2));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String word : words) {
            if (word.equals(pref) || word.startsWith(pref))
                count++;
        }
        return count;
    }
}