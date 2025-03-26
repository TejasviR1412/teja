package Learning;

import java.util.Arrays;

public class FixedLengthSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3,10, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(findMaxSubArraySum(nums,k)));
    }

    public static int[] findMaxSubArraySum(int[] nums,int k){
        int length = nums.length;

        if(k > length || length == 0 || k<1){
            return new int[0];
        }

        int[] result = new int[length - k + 1];
        int windowSum = 0;
        int maxSubarraySum;

        //calculate the first window sum
        for(int i=0;i<k;i++){
            windowSum += nums[i];
        }

        result[0] = windowSum;
        maxSubarraySum = windowSum;

        for(int i=1;i<=length-k;i++){
            windowSum = windowSum - nums[i-1] + nums[i+k-1];
            result[i] = windowSum;
            maxSubarraySum = Math.max(maxSubarraySum , windowSum);
        }

        System.out.println("Max SubArray Sum:" + maxSubarraySum);
        return result;
    }
}