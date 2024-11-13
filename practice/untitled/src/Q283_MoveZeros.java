public class Q283_MoveZeros {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};

        moveZeroes(nums1);

        for(int a : nums1){
            System.out.print(a+" ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;

        for(int i=0 ;i < nums.length ;i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }

        while(count<nums.length)
            nums[count++] = 0;
    }
}
