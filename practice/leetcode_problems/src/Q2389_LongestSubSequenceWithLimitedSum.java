import java.util.Arrays;

public class Q2389_LongestSubSequenceWithLimitedSum {
    public static void main(String[] args) {
        int[] nums1 = {4,5,2,1};
        int[] queries1 = {3,10,21};

        int[] nums2 = {2,3,4,5};
        int[] queries2 = {1};

        System.out.println(Arrays.toString(answerQueries(nums1,queries1)));
        System.out.println(Arrays.toString(answerQueries(nums2,queries2)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int[] prefixSum = new int[nums.length];
        int[] result = new int[queries.length];

        Arrays.sort(nums);
        prefixSum[0] = nums[0];

        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i]; // 4 , 9, 11 , 12
        }

        for(int i=0;i<queries.length;i++){
            result[i] = binarySearch(prefixSum,queries[i]);
        }
        return result;
    }

    private static int calculate(int[] nums , int queryValue){
        int count = 0;

        for (int num : nums) {
            if (num <= queryValue)
                count++;
        }

        return count;
    }

   private static int binarySearch(int[] nums , int queryValue){
        int left = 0;
        int right = nums.length-1;
        int mid;

        while(left <= right){
            mid = left + (right-left)/2;

            if(nums[mid] > queryValue){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }

        return left;
   }
}
