import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Q973_KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points1 = {{1,3},{-2,2}};
        int k1 = 1;

        int[][] points2 = {{3,3},{5,-1},{-2,4}};
        int k2 = 2;

        int[][] result1 = kClosest(points1,k1);
        for(int[] r : result1){
            System.out.println(Arrays.toString(r));
        }

        int[][] result2 = kClosest(points2,k2);
        for(int[] r : result2){
            System.out.print(Arrays.toString(r));
            System.out.print(" ");
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);

         for(int i=0;i<points.length;i++){
            int[] distanceToOrigin = {calculateDistance(points[i]),i};

           if(pq.size() < k){
               pq.add(distanceToOrigin);
           }else if(distanceToOrigin[0] < pq.peek()[0]) {
                pq.poll();
                pq.add(distanceToOrigin);
           }
        }

        int[][] result = new int[k][2];

         for(int i=0;i<k;i++){
             int entry = pq.poll()[1];
             result[i] = points[entry];
         }

        return result;
    }

    private static int calculateDistance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}
