public class Q643_MaximumAverageSubArray_I {
    public static void main(String[] args) {
        int[] nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;

        int[] nums2 = {5};
        int k2 = 1;

        int[] nums3 = {-1};
        int k3 = 1;

        System.out.println(findMaxAverage(nums1,k1));
        System.out.println(findMaxAverage(nums2,k2));
        System.out.println(findMaxAverage(nums3,k3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        double currentRunningSum = 0;

        for(int i=0;i<nums.length;i++){
            currentRunningSum += nums[i];

            if(i >= k-1){
                maxAverage = Math.max(maxAverage , (currentRunningSum/k));
                currentRunningSum -= nums[i - (k-1)];
            }
        }

        return maxAverage;
    }
}