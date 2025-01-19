public class Q724_FindPivotIndex {
    public static void main(String[] args) {
        int[] nums1 = {1,7,3,6,5,6};
        int[] nums2 = {1,2,3};
        int[] nums3 = {2,1,-1};

        System.out.println(pivotIndex(nums1));
        System.out.println(pivotIndex(nums2));
        System.out.println(pivotIndex(nums3));
    }

    public static int pivotIndex(int[] nums) {
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