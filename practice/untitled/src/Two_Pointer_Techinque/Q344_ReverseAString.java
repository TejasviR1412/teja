package Two_Pointer_Techinque;

public class Q344_ReverseAString {
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};

        char[] s2 = {'H','a','n','n','a','h'};
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        char temp;
        while(left <= right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}