public class Q2425_BitwiseXOROfAllPairings {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};

        System.out.println(xorAllNums(nums1,nums2));
        System.out.println(xorAllNums(nums3,nums4));

        System.out.println(xorAllNums_approach2(nums1,nums2));
        System.out.println(xorAllNums_approach2(nums3,nums4));
    }

    public static int xorAllNums(int[] nums1, int[] nums2) {
        int answer = 0;

        boolean isNums1Odd = nums1.length%2 != 0;
        boolean isNums2Odd = nums2.length%2 != 0;

        if(isNums1Odd){
            for(int num : nums2){
                answer ^= num;
            }
        }

        if(isNums2Odd){
            for(int num : nums1){
                answer ^= num;
            }
        }

        return answer;
    }

    public static int xorAllNums_approach2(int[] nums1, int[] nums2) {
        int answer = 0;

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        if(nums1Length % 2 == 1){
            for(int num : nums2){
                answer ^= num;
            }
        }

        if(nums2Length % 2 == 1){
            for(int num : nums1){
                answer ^= num;
            }
        }

        return answer;
    }
}