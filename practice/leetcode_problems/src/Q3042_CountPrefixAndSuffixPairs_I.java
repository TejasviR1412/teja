public class Q3042_CountPrefixAndSuffixPairs_I {
    public static void main(String[] args) {
        String[] words1 = {"a","aba","ababa","aa"};
        String[] words2 = {"pa","papa","ma","mama"};
        String[] words3 = {"abab","ab"};

        System.out.println(countPrefixSuffixPairs(words1));
        System.out.println(countPrefixSuffixPairs(words2));
        System.out.println(countPrefixSuffixPairs(words3));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j< words.length;j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                    count++;
            }
        }
        return count;
    }
}