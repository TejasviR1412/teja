package Two_Pointer_Techinque;

import java.util.Arrays;

public class Q1099_TwoSumLessThanK {
    public static void main(String[] args) {
        int[] nums1 = {34,23,1,24,75,33,54,8};
        int k1 = 60;

        int[] nums2 = {10,20,30};
        int k2 = 15;

        System.out.println(twoSumLessThanK(nums1,k1));
        System.out.println(twoSumLessThanK(nums2,k2));
    }

    public static int twoSumLessThanK(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;

        int answer = -1;
        int sum;

        Arrays.sort(nums);

        while(left < right){
            sum = nums[left] + nums[right];

            if(sum < k){
                answer = Math.max(answer,sum);
                left++;
            }else{
                right--;
            }
        }
        return answer;
    }
}