public class Q2270_NumberOfWaysToSplitAnArray {
    public static void main(String[] args) {
        int[] nums1 = {10,4,-8,7};
        int[] nums2 = {2,3,1,0};

        System.out.println(waysToSplitArray(nums1));
        System.out.println(waysToSplitArray_1(nums1));
        System.out.println(waysToSplitArray(nums2));
        System.out.println(waysToSplitArray_1(nums2));
    }

    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        long leftSum;
        long rightSum;
        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];

        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for(int i=0;i<n-1;i++){
            leftSum = prefixSum[i];
            rightSum = prefixSum[n-1] - prefixSum[i];

            if(leftSum >= rightSum)
                count++;
        }

        return count;
    }

    public static int waysToSplitArray_1(int[] nums) {
        int count =0;

        int arraySum = totalSum(nums);

        for(int i=0; i< nums.length-1;i++){
            if(arraySum - nums[i] > nums[i])
                count++;
        }
        return count;
    }

    private static int totalSum(int[] nums){
        int total = 0;

        for(int num : nums){
            total += num;
        }
        return total;
    }
}
