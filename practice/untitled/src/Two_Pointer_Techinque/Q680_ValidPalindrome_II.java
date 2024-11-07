package Two_Pointer_Techinque;

public class Q680_ValidPalindrome_II {
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "abca";
        String s3 = "abc";

        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
        System.out.println(validPalindrome(s3));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        char charAtLeft;
        char charAtRight;

        while(left <= right){
            charAtLeft = s.charAt(left);
            charAtRight = s.charAt(right);

            if(charAtLeft != charAtRight){
                return checkPalindrome(s , left , right-1) || checkPalindrome(s , left +1 , right);
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean checkPalindrome(String s , int left , int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
