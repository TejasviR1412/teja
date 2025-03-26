import java.util.Arrays;

public class Q2932_MaximumStrongPairXOR_I {
    public int maximumStrongPairXor_BruteForceApproach(int[] nums) {
        int maxStrongPair = 0;

        for(int i=0;i< nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i] , nums[j])){
                    maxStrongPair = Math.max(maxStrongPair , nums[i] ^ nums[j]);
                }
            }
        }

        return maxStrongPair;
    }

    public int maximumStrongPairXor_SlidingWindow(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        int left = 0;
        int right = 0;
        int maxStrongPair = 0;

        while (right < length){
            int x = nums[left];
            int y = nums[right];

            if(y - x > x){
                left++;
                continue;
            }

            for (int i = left ;i<right;i++){
                maxStrongPair = Math.max(maxStrongPair , nums[i] ^ y);
            }

            right++;
        }

        return maxStrongPair;
    }
}