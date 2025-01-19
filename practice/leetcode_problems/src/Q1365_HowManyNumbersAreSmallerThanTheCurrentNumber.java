import java.util.Arrays;

public class Q1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums1 = {8,1,2,2,3};
        int[] nums2 = {6,5,4,8};
        int[] nums3 = {7,7,7,7};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int j;
        int count=0;

        for(int i=0;i<length;i++){
            j=0;

            while(j < length){
                if(nums[j] < nums[i]){
                    count++;
                }

                j++;
            }

            result[i] = count;
            count = 0;
        }
        return result;
    }
}
