import java.util.Arrays;

public class Q3173_BitwiseOROfAdjacentElements {
    public static void main(String[] args) {
        int[] nums1 = {1,3,7,15};
        int[] nums2 = {8,4,2};
        int[] nums3 = {5,4,9,11};

        System.out.println(Arrays.toString(orArray(nums1)));
        System.out.println(Arrays.toString(orArray(nums2)));
        System.out.println(Arrays.toString(orArray(nums3)));
    }

    public static int[] orArray(int[] nums) {
        int[] result = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            result[i] = nums[i] | nums[i+1];
        }

        return result;
    }
}