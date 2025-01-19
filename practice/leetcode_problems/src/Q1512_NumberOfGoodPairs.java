import java.util.HashMap;
import java.util.Map;

public class Q1512_NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,3};
        int[] nums2 = {1,1,1,1};
        int[] nums3 = {1,2,3};

        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
        System.out.println(numIdenticalPairs(nums3));
    }

    public static int numIdenticalPairs(int[] nums) {
        int noOfGoodPairs = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);

        for(int num : map.values()){
            noOfGoodPairs += (num * (num-1))/2;
        }

        return noOfGoodPairs;
    }
}
