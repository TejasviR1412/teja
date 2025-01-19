import java.util.HashSet;

public class Q2441_LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        int[] nums1 = {-1,2,-3,3};
        int[] nums2 = {-1,10,6,7,-7,1};
        int[] nums3 = {-10,8,6,7,-2,-3};
        int[] nums4 = {-9,-43,24,-23,-16,-30,-38,-30};

        System.out.println(findMaxK(nums1));
        System.out.println(findMaxK(nums2));
        System.out.println(findMaxK(nums3));
        System.out.println(findMaxK(nums4));
    }

    public static int findMaxK(int[] nums) {
        int largestPositiveInteger = -1;
        int absoluteNumber = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            absoluteNumber = Math.abs(num);

            if(absoluteNumber>largestPositiveInteger && set.contains(-num)){
                largestPositiveInteger = absoluteNumber;
            }

            set.add(num);
        }

        return largestPositiveInteger;
    }
}