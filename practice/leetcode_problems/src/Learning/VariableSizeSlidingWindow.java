package Learning;

public class VariableSizeSlidingWindow {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 20, 3, 10, 5 };
        int target = 33;

        System.out.println(findMaxSubArraySum(nums,target));
    }

    public static int findMaxSubArraySum(int[] nums , int target){
        int length = nums.length;

        if(length == 0)
            return 0;

        int start = 0, end = 0;
        int windowSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE;

        while(end < length){
            windowSum += nums[end];

            while (windowSum >= target){
                maxSubarraySum = Math.max(maxSubarraySum , windowSum);
                windowSum -= nums[start];
                start++;
            }

            end++;
        }

        return maxSubarraySum;
    }
}