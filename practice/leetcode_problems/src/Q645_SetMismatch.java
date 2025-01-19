import java.util.Arrays;

public class Q645_SetMismatch {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,4};
        int[] nums2 = {1,1};
        int[] nums3 = {1,2,3,4,5};

        System.out.println(Arrays.toString(findErrorNums(nums1)));
        System.out.println(Arrays.toString(findErrorNums(nums2)));
        System.out.println(Arrays.toString(findErrorNums(nums3)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i=0;
        int correctIndex;

        while(i < nums.length){
            correctIndex = nums[i] -1;

            if(nums[i] != nums[correctIndex]){
                swap(nums,i, correctIndex);
            }else{
                i++;
            }
        }

        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                return new int[] {nums[index] , index+1};
            }
        }

        return new int[] {-1,-1};
    }

    private static void swap(int[] nums , int i , int j){
        int temp;

        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
