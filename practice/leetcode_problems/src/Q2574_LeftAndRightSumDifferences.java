import java.util.Arrays;

public class Q2574_LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] nums1 = {10,4,8,3};

        int[] nums2 = {1};

        System.out.println(Arrays.toString(leftRightDifference(nums1)));
        System.out.println(Arrays.toString(leftRightDifference(nums2)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        //get the total sum of all the elements in the array
        for(int num: nums)
            totalSum += num;

        /**
         * 1. Get the rightSum element
         * 2. For that i index, find the leftSum - rightSum difference
         * 3. Maintain the leftSum value for that index
         */
        for(int i=0;i<length;i++){
            rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return answer;
    }
}