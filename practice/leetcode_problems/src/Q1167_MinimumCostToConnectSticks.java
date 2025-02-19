import java.util.PriorityQueue;

public class Q1167_MinimumCostToConnectSticks {
    public static void main(String[] args) {
        int[] sticks1 = {2,4,3};
        int[] sticks2 = {1,8,3,5};

        System.out.println(connectSticks(sticks1));
        System.out.println(connectSticks(sticks2));
    }

    public static int connectSticks(int[] sticks) {
        int totalCost = 0;
        int stick1, stick2 , cost;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int stick : sticks){
            minHeap.add(stick);
        }

        while(minHeap.size() > 1){
            stick1 = minHeap.poll();
            stick2 = minHeap.poll();

            cost = stick1 + stick2;
            totalCost += cost;

            minHeap.add(cost);
        }

        return totalCost;
    }
}
