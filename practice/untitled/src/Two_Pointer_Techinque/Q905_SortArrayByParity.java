package Two_Pointer_Techinque;

public class Q905_SortArrayByParity {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2,4};
        int[] nums2 = {0};

        int[] output1 = sortArrayByParity(nums1);
        for(int a : output1)
            System.out.print(a + " ");

        System.out.println();

        int[] output2 = sortArrayByParity(nums2);
        for(int a : output2)
            System.out.print(a + " ");
    }

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int i=0;

        while(i <= right){
            if(nums[i] % 2 == 0){
                swap(nums , i , left);
                left++;
                i++;
            }else if(nums[i] % 2 == 1){
                swap(nums , i , right);
                right--;
            }else{
                i++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums , int i , int j){
        int temp;

        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
