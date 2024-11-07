package Two_Pointer_Techinque;

import java.util.Arrays;
import java.util.List;

public class Q2824_CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        Integer[] nums1 = {-1,1,2,3,1};
        int target1 = 2;

        Integer[] nums2 = {-6,2,5,-2,-7,-1,3};
        int target2 = -2;

        System.out.println(countPairs(Arrays.asList(nums1),target1));
        System.out.println(countPairs(Arrays.asList(nums2),target2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                count += (nums.get(i) + nums.get(j) < target) ? 1 : 0;
            }
        }
        return count;
    }
}
