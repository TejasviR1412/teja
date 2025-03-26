import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2161_PartitionArryAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums1 = {9,12,5,10,14,3,10};
        int pivot1 = 10;

        int[] nums2 = {-3,4,3,2};
        int pivot2 = 2;

        System.out.println(Arrays.toString(pivotArray_UsingLists(nums1,pivot1)));
        System.out.println(Arrays.toString(pivotArray_UsingLists(nums2,pivot2)));
        System.out.println("*******************************************************");
        System.out.println(Arrays.toString(pivotArray_UsingTwoPointers(nums1,pivot1)));
        System.out.println(Arrays.toString(pivotArray_UsingTwoPointers(nums2,pivot2)));
    }

    public static int[] pivotArray_UsingLists(int[] nums, int pivot) {
        int length = nums.length;

        if(length == 1)
            return nums;

        int[] answer = new int[length];

        List<Integer> smallElementList = new ArrayList<>();
        List<Integer> equalToPivot = new ArrayList<>();
        List<Integer> gretaerElementList = new ArrayList<>();

        //o(n)
        for(int num : nums){
            if(num < pivot)
                smallElementList.add(num);
            else if(num == pivot)
                equalToPivot.add(num);
            else
                gretaerElementList.add(num);
        }

        smallElementList.addAll(equalToPivot);
        smallElementList.addAll(gretaerElementList);

        //O(n)
        int i = 0;
        for(int num : smallElementList){
            answer[i++] = num;
        }

        return answer;
    }

    public static int[] pivotArray_UsingTwoPointers(int[] nums, int pivot) {
        int length = nums.length;

        if(length == 1)
            return nums;

        int[] answer = new int[length];
        int left = 0;
        int right = length - 1;

        for(int i=0,j=length-1;i<length;i++,j--){
            if(nums[i] < pivot){
                answer[left] = nums[i];
                left++;
            }

            if(nums[j] > pivot){
                answer[right] = nums[j];
                right--;
            }
        }

        while (left<right){
            answer[left] = pivot;
            left++;
        }

        return answer;
    }
}