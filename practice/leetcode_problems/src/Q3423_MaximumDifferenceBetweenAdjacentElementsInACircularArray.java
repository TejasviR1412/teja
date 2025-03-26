public class Q3423_MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {-5,-10,-5};

        System.out.println(maxAdjacentDistance(nums1));
        System.out.println(maxAdjacentDistance(nums2));
    }

    public static int maxAdjacentDistance(int[] nums) {
        int maximumAbsoluteDifference = Math.abs(nums[nums.length-1] - nums[0]);

        for(int i=1;i<nums.length;i++){
            maximumAbsoluteDifference = Math.max(maximumAbsoluteDifference , Math.abs(nums[i]-nums[i-1]));
        }

        return maximumAbsoluteDifference;
    }
}
