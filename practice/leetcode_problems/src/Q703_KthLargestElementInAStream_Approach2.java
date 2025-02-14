import java.util.PriorityQueue;

public class Q703_KthLargestElementInAStream_Approach2 {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public Q703_KthLargestElementInAStream_Approach2(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k = k;

        for(int num : nums)
            add(num);
    }

    public int add(int val) {
        if(minHeap.size()< k || minHeap.peek()<val){
            minHeap.add(val);

            if(minHeap.size() > k){
                minHeap.remove();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        Q703_KthLargestElementInAStream_Approach2 q703 = new Q703_KthLargestElementInAStream_Approach2(3, new int[]{4,5,8,2});
        System.out.println(q703.add(3));
        System.out.println(q703.add(5));
        System.out.println(q703.add(10));
        System.out.println(q703.add(9));
        System.out.println(q703.add(4));
    }
}
