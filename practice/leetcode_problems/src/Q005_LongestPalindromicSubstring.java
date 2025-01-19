public class Q005_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println(longestPalindrome(s1));
        System.out.println(longestPalindrome(s2));
    }

    public static String longestPalindrome(String s) {
        /**
         * Since we have to find the longest substring, we need to start from
         * the entire length of the string
         *
         * babad
         * baba
         * bab and so on
         */
        for(int end = s.length();end>0;end--){ // outerloop to get the max substring length for validation
            for(int start=0;start<=s.length()-end;start++){
                if(isPalindrome(start,start+end,s)){
                    return s.substring(start,start+end);
                }
            }
        }

        return "";
    }

    private static boolean isPalindrome(int start , int end , String s){
        int left = start;
        int right = end-1;

        while(left < right){
            if(s.charAt(left)!=s.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}