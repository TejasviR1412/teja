public class Q3452_SumOfGoodNumbers {
    public static void main(String[] args) {
        int[] nums1 = {1,3,2,1,5,4};
        int k1 = 2;

        int[] nums2 = {2,1};
        int k2 = 1;

        System.out.println(sumOfGoodNumbers(nums1,k1));
        System.out.println(sumOfGoodNumbers(nums2,k2));
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {
        boolean left , right;
        int goodSum = 0;
        int length = nums.length;

        for(int i=0;i<length;i++){
            left = (i-k >=0 && nums[i]<=nums[i-k]);
            right = (i+k < length && nums[i] <= nums[i+k]);

            if(!left && !right){
                goodSum += nums[i];
            }
        }
        return goodSum;
    }
}
