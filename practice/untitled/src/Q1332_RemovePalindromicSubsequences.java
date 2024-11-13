public class Q1332_RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String s1 = "ababa";
        String s2 = "abb";
        String s3 = "baabb";

        System.out.println(removePalindromeSub(s1));
        System.out.println(removePalindromeSub(s2));
        System.out.println(removePalindromeSub(s3));
    }

    public static int removePalindromeSub(String s) {
       if(s.isEmpty())
            return 0;

       if(isPalindrome(s))
           return 1;

       return 2;
    }

    private static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
