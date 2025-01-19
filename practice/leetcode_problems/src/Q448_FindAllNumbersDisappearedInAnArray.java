import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1};


        System.out.println(findDisappearedNumbers(nums1));
        System.out.println(findDisappearedNumbers(nums2));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int correctIndex;

        while(i < nums.length){
            correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex])
                swap(nums,i,correctIndex);
            else{
                i++;
            }
        }

        for(int index=0; index<nums.length;index++){
            if(nums[index] != index+1 )
                result.add(index+1);
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
