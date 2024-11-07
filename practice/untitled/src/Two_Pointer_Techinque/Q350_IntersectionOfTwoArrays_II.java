package Two_Pointer_Techinque;

import java.util.*;

public class Q350_IntersectionOfTwoArrays_II {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        int[] output1 = intersect(nums1,nums2);
        for(int a : output1){
            System.out.print(a + " ");
        }

        System.out.println();

        int[] output2 = intersect(nums3,nums4);
        for(int a : output2){
            System.out.print(a + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
           return intersect(nums2,nums1);
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int n : nums1){
            hashMap.put(n , hashMap.getOrDefault(n,0)+1);
        }

        int k =0;

        for(int n: nums2){
            int count = hashMap.getOrDefault(n,0);

            if(count > 0){
                nums1[k++] = n;
                hashMap.put(n,count-1);
            }
        }

        return Arrays.copyOfRange(nums1,0,k);
    }
}