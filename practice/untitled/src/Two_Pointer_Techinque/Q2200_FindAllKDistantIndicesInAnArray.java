package Two_Pointer_Techinque;

import java.util.ArrayList;
import java.util.List;

public class Q2200_FindAllKDistantIndicesInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {3,4,9,1,3,9,5};
        int key1 = 9;
        int k1 = 1;

        int[] nums2 = {2,2,2,2,2};
        int key2 = 2;
        int k2 = 2;

        System.out.println(findKDistantIndices(nums1,key1,k1));
        System.out.println(findKDistantIndices(nums2,key2,k2));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                for (j = Math.max(i - k, j); j <= Math.min(nums.length - 1, i + k); j++) {
                    ans.add(j);
                }
            }
        }
        return ans;
    }
}