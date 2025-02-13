public class Q3105_LongestStrictlyIncreasingOrDecreasingSubarray {
    public static void main(String[] args) {
        int[] nums1 = {1,4,3,3,2};

        int[] nums2 = {3,3,3,3};

        int[] nums3 = {3,2,1};

        int[] nums4 = {1,10,10};

        System.out.println(longestMonotonicSubarray(nums1));
        System.out.println(longestMonotonicSubarray(nums2));
        System.out.println(longestMonotonicSubarray(nums3));
        System.out.println(longestMonotonicSubarray(nums4));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int increasingLength = 1;
        int decreasingLength = 1;
        int maxLength = 1;

        for(int i=0; i<nums.length-1;i++){
            if(nums[i+1] > nums[i]){
                increasingLength++;
                decreasingLength = 1;
            }else if(nums[i+1] < nums[i]){
                decreasingLength++;
                increasingLength = 1;
            }else{
                increasingLength = 1;
                decreasingLength = 1;
            }

            maxLength = Math.max(maxLength, Math.max(increasingLength,decreasingLength));
        }
        return maxLength;
    }
}
