public class Q3427_SumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1};
        int[] nums2 = {3,1,1,2};

        System.out.println(subarraySum(nums1));
        System.out.println(subarraySum(nums2));
    }

    public static int subarraySum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int result = 0;
        int start;

        prefixSum[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            start = Math.max(0,i-nums[i]);

            if(start == 0)
                result += prefixSum[i];
            else
                result += prefixSum[i] - prefixSum[start-1];
        }

        return result;
    }
}