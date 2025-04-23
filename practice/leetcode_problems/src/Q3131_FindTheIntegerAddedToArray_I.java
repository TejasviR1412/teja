import java.util.Arrays;

public class Q3131_FindTheIntegerAddedToArray_I {
    public int addedInteger_Approach1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return nums2[0] - nums1[0];
    }

    public int addedInteger_Approach2(int[] nums1, int[] nums2) {
        return getMinimumArrayElement(nums2) - getMinimumArrayElement(nums1);
    }

    private int getMinimumArrayElement(int[] nums){
        int minimumElement = Integer.MAX_VALUE;

        for(int num:nums){
            minimumElement = Math.min(minimumElement,num);
        }

        return minimumElement;
    }
}
