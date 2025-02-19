import java.util.PriorityQueue;

public class Q1642_FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int[] heights1= {4,2,7,6,9,14,12};
        int bricks1 = 5;
        int ladder1 = 1;

        int[] heights2= {4,12,2,7,3,18,20,3,19};
        int bricks2 = 10;
        int ladder2 = 2;

        int[] heights3= {14,3,19,3};
        int bricks3 = 17;
        int ladder3 = 0;

        System.out.println(furthestBuilding(heights1,bricks1,ladder1));
        System.out.println(furthestBuilding(heights2,bricks2,ladder2));
        System.out.println(furthestBuilding(heights3,bricks3,ladder3));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        //min heap PQ using a comparator
        PriorityQueue<Integer> ladderAllocation = new PriorityQueue<>((a,b)-> a-b);
        int climb;

        for(int i=0;i<heights.length-1;i++){
           climb = heights[i+1] - heights[i];

           //no need to use bricks or ladders when going down
           if(climb<=0)
               continue;

           //allocate a ladder to this climb.
           ladderAllocation.add(climb);

           // we still have ladders remaining
           if(ladderAllocation.size()<=ladders)
               continue;

           bricks -= ladderAllocation.remove();

           if(bricks<0)
               return i;
        }

        return heights.length-1;
    }
}