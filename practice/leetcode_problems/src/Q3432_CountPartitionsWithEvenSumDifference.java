public class Q3432_CountPartitionsWithEvenSumDifference {
    public static void main(String[] args) {
        int[] nums1 = {10,10,3,7,6};
        int[] nums2 = {1,2,2};
        int[] nums3 = {2,4,6,8};

        System.out.println(countPartitions(nums1));
        System.out.println(countPartitions(nums2));
        System.out.println(countPartitions(nums3));
    }

    public static int countPartitions(int[] nums) {
        int count = 0;
        int totalSum = 0;
        int leftSum=0;
        int rightSum;

        for(int num : nums){
            totalSum += num;
        }

        for(int i=0;i<nums.length-1;i++){
            leftSum += nums[i];

            rightSum = totalSum - leftSum;

            if((leftSum - rightSum) % 2 == 0)
                count++;
        }

        return count;
    }
}
