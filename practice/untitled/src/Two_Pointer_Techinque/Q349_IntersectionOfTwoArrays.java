package Two_Pointer_Techinque;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        int[] output1 = intersection(nums1,nums2);
        for(int a : output1){
            System.out.print(a + " ");
        }

        int[] output2 = intersection(nums3,nums4);
        for(int a : output2){
            System.out.print(a + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersectingElements = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int a : nums1){
            set.add(a);
        }

        for(int b : nums2){
            if(set.contains(b)){
                intersectingElements.add(b);
                set.remove(b);
            }
        }

        return intersectingElements.stream().mapToInt(i -> i).toArray();
    }
}
