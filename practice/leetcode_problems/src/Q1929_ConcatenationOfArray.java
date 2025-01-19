import java.util.Arrays;

public class Q1929_ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,1};
        int[] nums2 = {1,3,2,1};

        System.out.println(Arrays.toString(getConcatenation(nums1)));
        System.out.println(Arrays.toString(getConcatenation(nums2)));
    }

    public static int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[2 * numsLength];

        for(int index=0;index<nums.length;index++){
            ans[index] = nums[index];
            ans[index + numsLength] = nums[index];
        }
        return ans;
    }
}