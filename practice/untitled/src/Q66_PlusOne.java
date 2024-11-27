import java.util.Arrays;

public class Q66_PlusOne {
    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] digits2 = {1,2,9};
        int[] digits3 = {9,9,9};
        int[] digits4 = {1,9,1};

        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
        System.out.println(Arrays.toString(plusOne(digits4)));
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for(int index = length-1 ; index >=0 ; index--){
            if(digits[index] == 9){
                digits[index] = 0;
            }else{
                digits[index]++;
                return digits;
            }
        }

        digits = new int[length+1];
        digits[0] = 1;

        return digits;
    }
}