import java.util.Arrays;

public class Q287_FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        int[] nums3 = {3,3,3,3,3};
        int[] nums4 = {5,5,4,3,2,1};

        System.out.println(findDuplicate(nums1));
        System.out.println(findDuplicate(nums2));
        System.out.println(findDuplicate(nums3));
        System.out.println(findDuplicate(nums4));
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        int correctIndex = 0;
        int temp;
        while(i < nums.length){
            correctIndex = nums[i] - 1;

            if(nums[i]!= nums[correctIndex]){
                temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }

        return nums[nums.length-1];
    }
}
