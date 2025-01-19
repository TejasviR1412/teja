import java.util.Arrays;

public class Q34_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;

        int[] nums3 = {};
        int target3 = 0;

        int[] nums4 = {1};
        int target4 = 1;

        System.out.println(Arrays.toString(searchRange(nums1,target1)));
        System.out.println(Arrays.toString(searchRange(nums2,target2)));
        System.out.println(Arrays.toString(searchRange(nums3,target3)));
        System.out.println(Arrays.toString(searchRange(nums4, target4)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        //get the 1st occurrence
        result[0] = search(nums, target, true);

        //get the last occurrence
        result[1] = search(nums, target, false);

        return result;
    }

    private static int search(int[] nums, int target, boolean findStartIndex) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        int answer = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (target < nums[mid])
                right = mid - 1;
            else if (target > nums[mid])
                left = mid + 1;
            else {
                answer = mid;

                if (findStartIndex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        return answer;
    }
}