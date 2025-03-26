public class Q3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {3,6,9};

        System.out.println(minimumOperations(nums1));
        System.out.println(minimumOperations(nums2));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;

        for(int num : nums){
            count += Math.min(num%3 , 3 - (num%3));
        }
        return count;
    }
}