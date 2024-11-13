public class Q75_SortColors {
    public static void main(String[] args) {
        int[] nums1 = {2,0,2,1,1,0};
        int[] nums2 = {2,0,1};

        sortColors(nums1);
        for(int a : nums1)
            System.out.print(a + " ");

        System.out.println();

        sortColors(nums2);
        for(int a : nums2)
            System.out.print(a + " ");
    }

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1 ;
        int i=0;

        while(i <= right){
            if(nums[i] == 0){
                swap(nums,i,left);
                left++;
                i++;
            }else if(nums[i] == 2){
                swap(nums,i,right);
                right--;
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] nums , int i , int j){
        int temp;

        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
