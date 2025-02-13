public class Q209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target1 = 7;
        int[] nums1 = {2,3,1,2,4,3};

        int target2 = 4;
        int[] nums2 = {1,4,4};

        int target3 = 11;
        int[] nums3 = {1,1,1,1,1,1,1,1};

        int target4 = 8;
        int[] nums4 = {4,2,2,7,8,1,2,8,1,0};

        System.out.println(minSubArrayLen(target1,nums1));
        System.out.println(minSubArrayLen(target2,nums2));
        System.out.println(minSubArrayLen(target3,nums3));
        System.out.println(minSubArrayLen(target4,nums4));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minSubArrayLength = Integer.MAX_VALUE;
        int currentRunningSum = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd<nums.length;windowEnd++){
            currentRunningSum += nums[windowEnd];

            while(currentRunningSum >= target){
                minSubArrayLength = Math.min(minSubArrayLength,windowEnd-windowStart+1);
                currentRunningSum -= nums[windowStart];
                windowStart++;
            }
        }

        return minSubArrayLength==Integer.MAX_VALUE?0:minSubArrayLength;
    }
}
