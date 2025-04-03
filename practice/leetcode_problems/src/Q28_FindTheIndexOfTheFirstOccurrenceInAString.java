public class Q28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack1 = "sadbutnotsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println(strStr(haystack1,needle1));
        System.out.println(strStr(haystack2,needle2));
    }

    //Sliding window approach
    public static int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        for(int windowStart=0;windowStart<= n - m;windowStart++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i))
                    break;

                if(i == m-1)
                    return windowStart;
            }
        }

        return -1;
    }

    public static int strStr_1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int strStr_2(String haystack, String needle) {
        for(int i=0 , j=needle.length(); j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
