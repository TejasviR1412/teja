package Two_Pointer_Techinque;

import java.util.Arrays;
import java.util.HashSet;

public class Q2465_NumberOfDistinctAverages {
    public static void main(String[] args) {
        int[] nums1 = {4,1,4,0,3,5};
        int[] nums2 = {1,100};

        System.out.println(distinctAverages(nums1));
        System.out.println(distinctAverages(nums2));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        HashSet<Double> hashSet = new HashSet<>();

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            hashSet.add((nums[left] + nums[right])/2.0);
            left++;
            right--;
        }
        return hashSet.size();
    }
}