package ImplementingDataStructures.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class CommonHeapApplication_UsingMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);

        System.out.println("Max Heap:" + maxHeap.toString());

        System.out.println("Top element:" + maxHeap.peek());

        int pollNum = maxHeap.poll();
        System.out.println("Poll number:" + pollNum);

        System.out.println("maxHeap: " + maxHeap.toString());

        System.out.println("Max heap size:" + maxHeap.size());
    }
}