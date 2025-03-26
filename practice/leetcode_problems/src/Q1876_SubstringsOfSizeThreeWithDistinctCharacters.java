public class Q1876_SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int i=0,j=1,k=2;
        int count = 0;

        while(k < s.length()){
            if(s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(k) != s.charAt(i)){
                count++;
            }
            i++;
            j++;
            k++;
        }

        return count;
    }
}