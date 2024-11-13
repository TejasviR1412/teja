package Binary_Search;

public class Q704_BinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;

        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;

        System.out.println(search(nums1,target1));
        System.out.println(search(nums2,target2));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int mid;

        while(left <= right){
            mid = left + (right-left)/2;

            if(nums[mid]== target)
                return mid;
            else if(target < nums[mid])
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }
}