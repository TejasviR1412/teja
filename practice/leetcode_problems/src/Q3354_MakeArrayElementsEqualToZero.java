public class Q3354_MakeArrayElementsEqualToZero {
    public static void main(String[] args) {
        int[] nums1 = {1,0,2,0,3};
        int[] nums2 = {2,3,4,0,4,1,0};

        System.out.println(countValidSelections(nums1));
        System.out.println(countValidSelections(nums2));

        System.out.println(-7%3);
    }

    public static int countValidSelections(int[] nums) {
        int totalSum =0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum=0;
        int count=0;

        for (int num : nums) {
            if (num == 0) {
                int rightSum = totalSum - leftSum;

                if (rightSum == leftSum) {
                    count += 2;
                } else if (Math.abs(leftSum - rightSum) == 1) {
                    count += 1;
                }
            }
            leftSum += num;
        }
        return count;
    }
}
