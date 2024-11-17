import java.util.ArrayList;
import java.util.List;

public class Q442_FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1,2};
        int[] nums3 = {1};

        System.out.println(findDuplicates(nums1));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i=0;
        int correctIndex;

        while(i < nums.length){
            correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        for(int index = 0; index<nums.length;index++){
            if(nums[index] != index+1){
                result.add(nums[index]);
            }
        }
        return result;
    }

    private static void swap(int[] nums , int i, int j){
        int temp;

        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
