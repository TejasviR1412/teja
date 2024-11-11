package Two_Pointer_Techinque;

public class Q2108_FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[] words1 = {"abc","car","ada","racecar","cool"};
        String[] words2 = {"notapalindrome","racecar"};
        String[] words3 = {"def","ghi"};
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word))
                return word;
        }
        return "";
    }

    private static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left <= right){
            if(s.charAt(left)!= s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
