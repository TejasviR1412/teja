import java.util.*;

public class Q1337_TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int[][] nums1 = {{1,1,0,0,0},
                         {1,1,1,1,0},
                         {1,0,0,0,0},
                         {1,1,0,0,0},
                         {1,1,1,1,1}};
        int k1 = 3;

        int[][] nums2 = {{1,0,0,0},
                         {1,1,1,1},
                         {1,0,0,0},
                         {1,0,0,0}};
        int k2 = 2;

        System.out.println(Arrays.toString(kWeakestRows(nums1,k1)));
        System.out.println(Arrays.toString(kWeakestRows(nums2,k2)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int strength;
        int[] entry;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
           if(a[0] == b[0])
               return b[1] - a[1];
           else
               return b[0] - a[0];
        });

        for(int i=0;i<m;i++){
            strength = binarySearch(mat[i]);
            entry = new int[]{strength,i};

            pq.add(entry);

            if(pq.size() > k)
                pq.poll();
        }

        int[] indices = new int[k];

        for(int i=k-1;i>=0;i--){
            int[] pair = pq.poll();
            indices[i] = pair[1];
        }

        return indices;
    }

    private static int binarySearch(int[] row){
        int left = 0;
        int right = row.length;
        int mid;

        while(left < right){
            mid = left + (right-left)/2;

            if(row[mid] == 1){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        return left;
    }
}
