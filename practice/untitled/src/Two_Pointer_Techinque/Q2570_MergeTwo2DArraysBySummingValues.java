package Two_Pointer_Techinque;

import java.util.*;

public class Q2570_MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        int[][] nums3 = {{2,4},{3,6},{5,5}};
        int[][] nums4 = {{1,3},{4,3}};

        int[][] output1 = mergeArrays(nums1,nums2);
        for(int[] a: output1){
            for(int b: a)
                System.out.print(b + " ");
        }

        System.out.println("*********");

        int[][] output2 = mergeArrays(nums3,nums4);
        for(int[] a: output2){
            for(int b: a)
                System.out.print(b + " ");
        }
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int[] ints : nums2) {
            hashMap.put(ints[0], ints[1]);
        }

        for (int[] ints : nums1) {
            if (hashMap.containsKey(ints[0])) {
                hashMap.replace(ints[0], ints[1] + hashMap.get(ints[0]));
            } else {
                hashMap.put(ints[0], ints[1]);
            }
        }

        int[][] output = new int[hashMap.size()][2];
        int j=0;

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            output[j][0] = entry.getKey();
            output[j][1] = entry.getValue();
            j++;
        }

        java.util.Arrays.sort(output, Comparator.comparingInt(a -> a[0]));

        return output;
    }
}