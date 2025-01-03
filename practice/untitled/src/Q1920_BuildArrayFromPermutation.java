import java.util.Arrays;

public class Q1920_BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums1 = {0,2,1,5,3,4};
        int[] nums2 = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(nums1)));
        System.out.println(Arrays.toString(buildArray(nums2)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int index=0;index<nums.length;index++){
            ans[index] = nums[nums[index]];
        }

        return ans;
    }
}
