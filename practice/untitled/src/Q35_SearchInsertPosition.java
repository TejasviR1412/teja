public class Q35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 5;

        int[] nums2 = {1,3,5,6};
        int target2 = 2;

        int[] nums3 = {1,3,5,6};
        int target3 = 7;

        int[] nums4 = {1,3,5,6};
        int target4 = 0;

        System.out.println(searchInsert(nums1,target1));
        System.out.println(searchInsert(nums2,target2));
        System.out.println(searchInsert(nums3,target3));
        System.out.println(searchInsert(nums4,target4));
    }

    /**
     * ceiling = smallest number in the array that is greater than or
     *           equal to the target element --> return low
     *
     * floor = biggest number in the array that is smaller than or
     *         equal to the target element --> return high
     */
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;

        /*if(target > nums[nums.length-1])
            return -1;*/

        while(low <= high){
            mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }

        return low;
    }
}
