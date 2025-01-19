public class Q2825_MakeStringASubsequenceUsingCyclicIncrements {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ad";

        String str3 = "zc";
        String str4 = "ad";

        String str5 = "ab";
        String str6 = "d";

        System.out.println(canMakeSubsequence(str1,str2));
        System.out.println(canMakeSubsequence(str3,str4));
        System.out.println(canMakeSubsequence(str5,str6));
    }

    /**
     * Hints:
     * 1. Consider the indices we will increment separately.
     * 2. We can maintain two pointers: pointer i for str1 and pointer j for str2,
     *    while ensuring they remain within the bounds of the strings.
     * 3. If both str1[i] and str2[j] match, or if incrementing str1[i] matches str2[j],
     *    we increase both pointers; otherwise, we increment only pointer i.
     * 4. It is possible to make str2 a subsequence of str1 if j is at the end of str2,
     *    after we can no longer find a match.
     */
    public static boolean canMakeSubsequence(String str1, String str2) {
        int str2Index = 0;
        int lengthStr1 = str1.length();
        int lengthStr2 = str2.length();

        /**
         * Traverse through both the strings
         */
        for(int str1Index = 0;
        str1Index<lengthStr1 && str2Index<lengthStr2;
        str1Index++){
            /*
            Check if characters match,
            or if str1[str1Index] can be incremented to str2[str2Index]
             */
            if((str1.charAt(str1Index) == str2.charAt(str2Index)) ||
                    ((str1.charAt(str1Index)+1) == str2.charAt(str2Index)) ||
                    ((str1.charAt(str1Index)-25) == str2.charAt(str2Index))
            ){
                str2Index++; // if match found, move to next character in str2
            }
        }
        return str2Index == lengthStr2;
    }
}
