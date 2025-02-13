import java.util.HashMap;
import java.util.Map;

public class Q2364_CountNumberOfBadPairs {
    public static void main(String[] args) {
        int[] nums1 = {4,1,3,3};
        int[] nums2 = {1,2,3,4,5};

        System.out.println(countBadPairs_Approach1(nums1));
        System.out.println(countBadPairs_Approach1(nums2));
        System.out.println("***************************************");
        System.out.println(countBadPairs_Approach2(nums1));
        System.out.println(countBadPairs_Approach2(nums2));
    }

    /**
     *  bad pair if i < j and j - i != nums[j] - nums[i]
     *
     *  constraints:
     *  1. 1 <= nums.length <= 10^5
     *  2. 1 <= nums[i] <= 10^9
     *
     *  Due to the above constraints, below code will run into TLE (Time limit exceeded error)
     *
     *  Time Complexity : O(N^2)
     *  Space Complexity : O(1)
     */
    public static long countBadPairs_Approach1(int[] nums) {
        long numberOfBadPairs = 0L;

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i != nums[j] - nums[i])
                    numberOfBadPairs++;
            }
        }
        return numberOfBadPairs;
    }

    /**
     * j-i = nums[j] - nums[i] means that pair is a GOOD PAIR
     *j - nums[j] = i- nums[i] will also make a GOOD PAIR
     *
     * thus , the position and the value at that position will let us know the good pair
     *
     * bar pair can be found by subtracting the good pair for that current index
     */
    public static long countBadPairs_Approach2(int[] nums) {
        long numberOfBadPairs = 0;
        Map<Integer,Integer> positionValueDifference = new HashMap<>();
        int difference , goodPairCount;

        for(int i=0;i<nums.length;i++){
            difference = i - nums[i];

            //count of previous good pair positions with the same difference
            goodPairCount = positionValueDifference.getOrDefault(difference,0);

            //total number of bad pairs for that current index
            numberOfBadPairs += i - goodPairCount;

            positionValueDifference.put(difference,goodPairCount+1);
        }

        return numberOfBadPairs;
    }
}