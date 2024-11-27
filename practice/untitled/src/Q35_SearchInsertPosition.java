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

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;

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
