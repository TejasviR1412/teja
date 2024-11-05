package Two_Pointer_Techinque;

import java.util.HashMap;

public class Q01_TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] nums3 = {3,3};
        int target3 = 6;

        int[] output1 = twoSum(nums1,target1);
        for(int a : output1){
            System.out.print(a + " ");
        }

        int[] output2 = twoSum(nums2,target2);
        for(int a : output2){
            System.out.print(a + " ");
        }

        int[] output3 = twoSum(nums3,target3);
        for(int a : output3){
            System.out.print(a + " ");
        }
    }

    /*Brute Force
    * Time Complexity : O(N^2)
    * Space Complexity : O(1)
    * */
    public static int[] twoSum_1(int[] nums, int target) {
        for(int i=0 ; i< nums.length -1; i++){
            for(int j = i+1 ; j< nums.length ; j++){
                if(nums[i] + nums[j] == target)
                    return new int[] {i , j};
            }
        }
        return new int[] {};
    }

    /*Using HashMap
    * Time Complexity : O(N)
    * Space Complexity : O(N)
    * */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int difference;

        for(int i=0 ; i< nums.length;i++){
            difference = target - nums[i];

            if(hashMap.containsKey(difference))
                return new int[]{hashMap.get(difference) , i};

            hashMap.put(nums[i],i);
        }

        return new int[] {};
    }
}