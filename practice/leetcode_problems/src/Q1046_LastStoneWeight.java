import java.util.Collections;
import java.util.PriorityQueue;

public class Q1046_LastStoneWeight {
    public static void main(String[] args) {
        int[] stones1 = {2,7,4,1,8,1};
        int[] stones2 = {1};
        int[] stones3 = {4,3,4,3};


        System.out.println(lastStoneWeight(stones1));
        System.out.println(lastStoneWeight(stones2));
        System.out.println(lastStoneWeight(stones3));
    }

    public static int lastStoneWeight(int[] stones) {
        int length = stones.length;
        int heavyStone1 , heavyStone2;

        if(length==1)
            return stones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones){
            pq.add(stone);
        }

        while(!pq.isEmpty() && pq.size() != 1){
            heavyStone1 = pq.poll();

            if(pq.isEmpty()){
                return heavyStone1;
            }

            heavyStone2 = pq.poll();

            if(heavyStone1 == heavyStone2) pq.add(0);

            else pq.add(heavyStone1 - heavyStone2);
        }

        return pq.peek();
    }
}
