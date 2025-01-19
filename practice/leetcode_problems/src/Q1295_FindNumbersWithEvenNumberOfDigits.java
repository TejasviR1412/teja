public class Q1295_FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,17731};

        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums){
            if(noOfDigits(num) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int noOfDigits(int num){
        int count = 0;

        while(num != 0){
            count++;
            num = num/10;
        }

        return count;
    }
}