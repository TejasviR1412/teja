import java.util.Collections;
import java.util.PriorityQueue;

public class Q295_FindTheMedianFromTheDataStream {
    private final PriorityQueue<Integer> maxHeap;
    private final PriorityQueue<Integer> minHeap;

    public Q295_FindTheMedianFromTheDataStream() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(maxHeap.isEmpty() || num< maxHeap.peek()){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }


        if(maxHeap.size()<minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }else if(maxHeap.size() > minHeap.size()+1)
            minHeap.offer(maxHeap.poll());
    }

    public double findMedian() {
        if(minHeap.size() == maxHeap.size())
            return (minHeap.peek() + maxHeap.peek())/2.0;
        else return maxHeap.peek();
    }

    public static void main(String[] args) {
        Q295_FindTheMedianFromTheDataStream medianFinder = new Q295_FindTheMedianFromTheDataStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }
}