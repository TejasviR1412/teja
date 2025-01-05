public class Q3028_AntOnTheBoundary {
    public static void main(String[] args) {
        int[] nums1 = {2,3,-5};
        int[] nums2 = {3,2,-3,-4};

        System.out.println(returnToBoundaryCount(nums1));
        System.out.println(returnToBoundaryCount(nums2));
    }

    public static int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int sum = 0;

        for(int value : nums){
            sum += value;

            if(sum == 0)
                count++;
        }

        return count;
    }
}
