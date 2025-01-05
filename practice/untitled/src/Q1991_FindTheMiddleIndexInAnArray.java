public class Q1991_FindTheMiddleIndexInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,-1,8,4};
        int[] nums2 = {1,-1,4};

        System.out.println(findMiddleIndex(nums1));
        System.out.println(findMiddleIndex(nums2));
    }

    public static int findMiddleIndex(int[] nums) {
        int sum =0;
        int leftSum = 0;

        for(int number : nums){
            sum += number;
        }

        for(int i=0;i<nums.length;i++){
            if(leftSum == (sum - leftSum - nums[i]))
                return i;

            leftSum += nums[i];
        }

        return -1;
    }
}
