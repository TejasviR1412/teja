import java.util.Arrays;
import java.util.Map;

public class Q1413_MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] nums1 = {-3,2,-3,4,2};
        int[] nums2 = {1,2};
        int[] nums3 = {2,3,5,-5,1};

        System.out.println(minStartValue(nums1));
        System.out.println(minStartValue(nums2));
        System.out.println(minStartValue(nums3));
    }

    public static int minStartValue(int[] nums) {
        int minPrefixSum = Integer.MAX_VALUE;
        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];

        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for(int i=0;i<prefixSum.length;i++){
            minPrefixSum = Math.min(minPrefixSum,prefixSum[i]);
        }

        return (minPrefixSum<0 ? (-1*minPrefixSum):0)+1;
    }
}