import java.util.Arrays;

public class Q1480_RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,1,1,1,1};
        int[] nums3 = {3,1,2,10,1};

        System.out.println(Arrays.toString(runningSum_Approach1(nums1)));
        System.out.println(Arrays.toString(runningSum_Approach1(nums2)));
        System.out.println(Arrays.toString(runningSum_Approach1(nums3)));
        System.out.println("***************************************************");
        System.out.println(Arrays.toString(runningSum_Approach2(nums1)));
        System.out.println(Arrays.toString(runningSum_Approach2(nums2)));
        System.out.println(Arrays.toString(runningSum_Approach2(nums3)));
    }

    public static int[] runningSum_Approach1(int[] nums) {
        int j;
        int[] ans = nums.clone();

        for(int i=1;i<nums.length;i++){
            j=0;

            while(j < i){
                ans[i] += nums[j];
                j++;
            }
        }

        return ans;
    }

    public static int[] runningSum_Approach2(int[] nums) {
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
