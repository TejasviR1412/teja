public class Q704_BinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;

        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;

        System.out.println(search(nums1,target1));
        System.out.println(search(nums2,target2));
        System.out.println("**************************");
        System.out.println(search_UsingRecursion(nums1,target1));
        System.out.println(search_UsingRecursion(nums2,target2));
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

    public static int search_UsingRecursion(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        return searchRecursively(left,right,target,nums);
    }

    private static int searchRecursively(int left , int right  , int target , int[] nums){
        if(left > right)
            return -1;

        int mid = left + (right - left)/2;

        if(target == nums[mid])
            return mid;

        if(target < nums[mid])
            return searchRecursively(left , mid -1 , target , nums);
        else
            return searchRecursively(mid+1 , right , target , nums);

    }
}