package Two_Pointer_Techinque;

public class Q2367_NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums1 = {0,1,4,6,7,10};
        int diff1 = 3;

        int[] nums2 = {4,5,6,7,8,9};
        int diff2 = 2;

        System.out.println(arithmeticTriplets(nums1,diff1));
        System.out.println(arithmeticTriplets(nums2,diff2));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int countNumberOfArithmeticTriplets = 0;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[j] - nums[i]==diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            countNumberOfArithmeticTriplets++;
                        }
                    }
                }
            }
        }
        return countNumberOfArithmeticTriplets;
    }
}