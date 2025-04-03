public class Q189_RotateArray {

    //TLE Error will occur for larger datasets
    public void rotate_BruteForceApproach(int[] nums, int k) {
        k %= nums.length;

        int previous , temp;

        for(int i=0;i<k;i++){
            previous = nums[nums.length-1];

            for(int j=0;j< nums.length;j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public void rotate_usingReverse(int[] nums, int k) {
        k %= nums.length;

        reverse(nums,0,nums.length-1); //reverse all numbers
        reverse(nums,0,k-1); // reverse first k numbers
        reverse(nums,k,nums.length-1); // reverse last n-k numbers
    }

    private void reverse(int[] nums , int start , int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}