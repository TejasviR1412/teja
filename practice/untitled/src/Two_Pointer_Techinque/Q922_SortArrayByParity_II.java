package Two_Pointer_Techinque;

public class Q922_SortArrayByParity_II {
    public static void main(String[] args) {
        int[] nums1 = {4,2,5,7};
        int[] nums2 = {2,3};

        int[] output1 = sortArrayByParityII(nums1);
        for(int a : output1)
            System.out.print(a + " ");

        System.out.println();

        int[] output2 = sortArrayByParityII(nums2);
        for(int a : output2)
            System.out.print(a + " ");
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int length = nums.length;

        while(odd < length && even < length){
            if(nums[odd]%2 < nums[even]%2){
                swap(nums,odd, even);
            }

            if(nums[odd]%2 ==1)
                odd += 2;

            if(nums[even]%2 ==0)
                even +=2;
        }

        return nums;
    }

    private static void swap(int[]nums , int i , int j){
        int temp;

        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
