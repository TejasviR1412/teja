import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3364_MinimumPositiveSumSubArray {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(3, -2, 1, 4));
        int l1 = 2;
        int r1 = 3;

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(-2, 2, -3, 1));
        int l2 = 2;
        int r2 = 3;

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int l3 = 2;
        int r3 = 4;

        System.out.println(minimumSumSubarray(nums1,l1,r1));
        System.out.println(minimumSumSubarray(nums2,l2,r2));
        System.out.println(minimumSumSubarray(nums3,l3,r3));
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minimumSubArraySum = Integer.MAX_VALUE;
        int sum;

        //calculate the prefix sum of the elements in the array
        int[] prefixSum = new int[nums.size() + 1];

        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums.get(i-1);
        }

        for(int len = l;len<=r;len++){
            //apply the sliding window from the range l -> r
            for (int i=0; i + len <= nums.size() ; i++){
                sum = prefixSum[i+len] - prefixSum[i];

                if(sum > 0){
                    minimumSubArraySum = Math.min(sum , minimumSubArraySum);
                }
            }
        }

        return minimumSubArraySum == Integer.MAX_VALUE? -1 : minimumSubArraySum;
    }
}