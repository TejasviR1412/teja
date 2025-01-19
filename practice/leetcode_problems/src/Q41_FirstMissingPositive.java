public class Q41_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums1 = {1,2,0};
        int[] nums2 = {3,4,-1,1};
        int[] nums3 = {7,8,9,11,12};

        System.out.println(firstMissingPositive(nums1));
        System.out.println(firstMissingPositive(nums2));
        System.out.println(firstMissingPositive(nums3));
    }

    public static int firstMissingPositive(int[] nums) {
        int i =0;
        int correctIndex;

        while (i < nums.length){
            correctIndex = nums[i]-1;

            if(nums[i] > 0 && nums[i] <= nums.length
            && nums[i] != nums[correctIndex]){
                swap (nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1)
                return index+1;
        }

        return nums.length+1;
    }

    private static void swap(int[] arr , int i , int j){
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}