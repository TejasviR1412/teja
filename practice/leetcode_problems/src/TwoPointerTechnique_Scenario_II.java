/**
 * Leetcode 27
 * Question : Given an array and a value, remove all instances of that value in-place and return the new length.
 */
public class TwoPointerTechnique_Scenario_II {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,1,2};

        int val = 2;

        System.out.println("Original nums.length:" + nums.length);

        System.out.println("New nums.length:" + removeElement(nums,val));
    }
}