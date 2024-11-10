package Two_Pointer_Techinque;

import java.util.HashSet;

public class Q2540_MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

        int[] nums3 = {1,2,3,6};
        int[] nums4 = {2,3,4,5};

        System.out.println(getCommon_UsingTwoPointers(nums1,nums2));
        System.out.println(getCommon_UsingTwoPointers(nums3,nums4));
    }

    //Approach1 - Using set
    public static int getCommon_UsingSet(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums1)
            set.add(num);

        for(int num : nums2)
            if(set.contains(num))
                return num;

        return -1;
    }

    public static int getCommon_UsingTwoPointers(int[] nums1, int[] nums2) {
        int nums1Index =0;
        int nums2Index =0;

        while(nums1Index < nums1.length && nums2Index < nums2.length){
            if(nums1[nums1Index] == nums2[nums2Index])
                return nums1[nums1Index];
            else if(nums1[nums1Index] < nums2[nums2Index])
                nums1Index++;
            else
                nums2Index++;
        }

        return -1;
    }
}
