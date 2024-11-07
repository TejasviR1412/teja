package Two_Pointer_Techinque;

public class Q977_SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-4,-1,0,3,10};
        int[] nums2 = {-7,-3,2,3,11};

        int[] output1 = sortedSquares(nums1);
        for(int a : output1)
            System.out.print(a + " ");

        System.out.println();

        int[] output2 = sortedSquares(nums2);
        for(int a : output2)
            System.out.print(a + " ");
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[index] = (int)Math.pow(nums[left],2);
                left++;
            }else{
                result[index] = (int)Math.pow(nums[right],2);
                right--;
            }
            index--;
        }

        return result;
    }
}
