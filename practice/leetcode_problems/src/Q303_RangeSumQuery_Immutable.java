public class Q303_RangeSumQuery_Immutable {
    private int[] prefixSum;

    public Q303_RangeSumQuery_Immutable(int[] nums){
        prefixSum = new int[nums.length+1];

        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 0, 3, -5, 2, -1};
        Q303_RangeSumQuery_Immutable q303_1 = new Q303_RangeSumQuery_Immutable(nums1);

        System.out.println(q303_1.sumRange(0,2));
        System.out.println(q303_1.sumRange(2,5));
        System.out.println(q303_1.sumRange(0,5));
    }

    private int calculatePrefixSum(int[] nums , int left , int right){
        return nums[right+1] - nums[left];
    }

    public int sumRange(int left, int right) {
       return calculatePrefixSum(prefixSum , left , right);
    }
}
