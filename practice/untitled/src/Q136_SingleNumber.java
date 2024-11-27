import java.util.HashMap;

public class Q136_SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};

        System.out.println(singleNumber_1(nums1));
        System.out.println(singleNumber_1(nums2));
        System.out.println(singleNumber_1(nums3));
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(n)

     * NOT ACCEPTABLE since the problem statement says
     * solve the problem in CONSTANT SPACE i.e. O(1)
     */
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int num: nums){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(int num : nums){
            if(hashMap.get(num) == 1)
                return num;
        }

        return 0;
    }


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)

     * Feasible solution is to use XOR
     * XOR of 0 with a bit will return the bit i.e. 2^0 = 2
     * XOR of the same bits will return 0 i.e. 2^2 = 0
     */
    public static int singleNumber_1(int[] nums) {
        int a = 0;

        for(int num : nums){
            a ^= num;
        }

        return a;
    }
}
