/**
 * Constraints:
 * 1. 2 <= nums.length <= 50
 * 2. 0 <= nums[i] <= 100
 * 3. The largest element in nums is unique.
 *
 * Hint :
 * Scan through the array to find the unique largest element `m`,keeping track of it's index `maxIndex`.
 * Scan through the array again.
 * If we find some `x != m` with `m < 2*x`, we should return `-1`.
 * Otherwise, we should return `maxIndex`.
 */
public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums1 = {3,6,1,0};
        int[] nums2 = {1,2,3,4};

        System.out.println(dominantIndex(nums1));
        System.out.println(dominantIndex(nums2));
    }

    public static int dominantIndex(int[] nums) {
        int max = -1, index = -1, second = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second)
                second = nums[i];
        }
        return second * 2 <= max ? index : -1;
    }
}
