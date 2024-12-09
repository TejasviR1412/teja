public class Q1095_FindInMountainArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,1,3,5,6,4};

        System.out.println(findPeakIndexInMountainArray(nums1));
        System.out.println(findPeakIndexInMountainArray(nums2));
    }

    /*static int search(int[] nums , int target){

    }*/

    public static int findPeakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while(start < end){
            mid = start + (end - start)/2;

            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return nums[end];
    }
}