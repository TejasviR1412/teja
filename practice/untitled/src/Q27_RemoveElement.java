public class Q27_RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int[] nums2 = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums1,3));
        System.out.println(removeElement(nums2,2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
