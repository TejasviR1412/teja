package Two_Pointer_Techinque;

public class Q125_ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        String string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0 ;
        int right = string.length()-1;

        while(left <= right){
            if(string.charAt(left) != string.charAt(right))
                return false;

            left++;
            right--;
        }

        //System.out.println(string);
        return true;
    }
}
