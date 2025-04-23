public class Q3095_ShortestSubarrayWithORAtleastK_I {
    public static int minimumSubarrayLength(int[] nums, int k) {
        int shortestSubarray = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int bit = 0;

            for(int j=i;j< nums.length;j++){
                bit = bit | nums[j];

                if(bit >= k){
                    shortestSubarray = Math.min(j-i+1,shortestSubarray);
                    break;
                }
            }
        }

        return shortestSubarray==Integer.MAX_VALUE?-1:shortestSubarray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int k1 = 2;

        int[] nums2 = {2,1,8};
        int k2 = 10;

        System.out.println(minimumSubarrayLength(nums1,k1));
        System.out.println(minimumSubarrayLength(nums2,k2));
    }
}
