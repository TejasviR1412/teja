public class Q1085_SumOfDigitsInTheMinimumNumber {
    public static int sumOfDigits(int[] nums) {
        int sum = 0;
        int minNumber = Integer.MAX_VALUE;

        for(int num : nums){
            minNumber = Math.min(minNumber,num);
        }

        while (minNumber!=0){
            sum += minNumber % 10;
            minNumber /= 10;
        }

        if(sum % 2 == 0)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {34,23,1,24,75,33,54,8};

        int[] nums2 = {99,77,33,66,55};

        System.out.println(sumOfDigits(nums1));
        System.out.println(sumOfDigits(nums2));
    }
}