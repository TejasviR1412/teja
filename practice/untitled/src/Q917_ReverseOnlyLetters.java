public class Q917_ReverseOnlyLetters {
    public static void main(String[] args) {
        String s1 = "ab-cd";
        String s2 = "a-bC-dEf-ghIj";
        String s3 = "Test1ng-Leet=code-Q!";

        System.out.println(reverseOnlyLetters(s1));
        System.out.println(reverseOnlyLetters(s2));
        System.out.println(reverseOnlyLetters(s3));
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length-1;

        while(left <= right){
            if(!Character.isLetter(chars[left]))
                left++;
            else if(!Character.isLetter(chars[right]))
                right--;
            else if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])){
                swap(chars,left,right);
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    private static void swap(char[] letters , int i , int j){
        char temp;

        temp = letters[i];
        letters[i] = letters[j];
        letters[j] = temp;
    }
}
