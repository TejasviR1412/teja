public class Q3550_SmallestIndexWithDigitSumEqualToIndex {
    public static int smallestIndex(int[] nums) {
        int sum;

        for(int num=0 ; num< nums.length; num++){
            sum = 0;

            while(nums[num] !=0){
                sum += nums[num] % 10;
                nums[num] /= 10;
            }

            if(sum == num)
                return num;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,2};
        int[] nums2 = {1,10,11};
        int[] nums3 = {1,2,3};

        System.out.println(smallestIndex(nums1));
        System.out.println(smallestIndex(nums2));
        System.out.println(smallestIndex(nums3));
    }
}