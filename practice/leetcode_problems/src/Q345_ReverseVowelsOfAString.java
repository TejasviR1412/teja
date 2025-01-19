public class Q345_ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s1 = "IceCreAm";
        String s2 = "leetcode";

        System.out.println(reverseVowels(s1));
    }

    public static String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int left = 0;
        int right = letters.length-1;
        char temp;

        while(left<right){
            while(left<right && !vowels.contains(letters[left]+""))
                left++;

            while(left<right && !vowels.contains(letters[right]+""))
                right--;

            temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;

            left++;
            right--;
        }

        return new String(letters);
    }
}
