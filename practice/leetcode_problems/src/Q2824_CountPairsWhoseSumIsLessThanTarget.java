import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2824_CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        Integer[] nums1 = {-1,1,2,3,1};
        int target1 = 2;

        Integer[] nums2 = {-6,2,5,-2,-7,-1,3};
        int target2 = -2;

        System.out.println(countPairs_BruteForceApproach(Arrays.asList(nums1),target1));
        System.out.println(countPairs_BruteForceApproach(Arrays.asList(nums2),target2));
        System.out.println("*******************************");
        System.out.println(countPairs_TwoPointerApproach(Arrays.asList(nums1),target1));
        System.out.println(countPairs_TwoPointerApproach(Arrays.asList(nums2),target2));
    }

    //Time complexity = O(n^2)
    public static int countPairs_BruteForceApproach(List<Integer> nums, int target) {
        int count = 0;

        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                count += (nums.get(i) + nums.get(j) < target) ? 1 : 0;
            }
        }
        return count;
    }

    public static int countPairs_TwoPointerApproach(List<Integer> nums, int target) {
        Collections.sort(nums); // O(n logn)
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right){
            if(nums.get(left) + nums.get(right) <target){
                count += right - left;
                left++;
            }else right--;
        }

        return count;
    }
}