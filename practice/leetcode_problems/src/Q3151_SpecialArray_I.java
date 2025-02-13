public class Q3151_SpecialArray_I {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2,1,4};
        int[] nums3 = {4,3,1,6};

        System.out.println(isArraySpecial(nums1));
        System.out.println(isArraySpecial(nums2));
        System.out.println(isArraySpecial(nums3));
    }

    public static boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2 == nums[i+1]%2)
                return false;
        }

        return true;
    }
}
