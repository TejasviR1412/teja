public class Q26_RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;

        for(int j=0;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}
