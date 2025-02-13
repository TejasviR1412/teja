package ImplementingDataStructures.Heap;

import java.util.PriorityQueue;

public class CommonHeapApplication_UsingMinHeap {
    public static void main(String[] args) {
        /**
         * Constructing a heap
         * Time complexity : O(N)
         * Space complexity : O(N)
         */
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        /**
         * Inserting an element
         * Time complexity : O(log N)
         * Space complexity : O(1)
         */
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);

        System.out.println("Min Heap:" + minHeap.toString());

        /**
         * Getting the top element
         * Time complexity : O(1)
         * Space complexity : O(1)
         */
        int peekNum = minHeap.peek();
        System.out.println("Peek number:" + peekNum);

        /**
         * Deleting the top element
         * Time complexity : O(log N)
         * Space complexity : O(1)
         */
        int pollNum = minHeap.poll();
        System.out.println("Poll number:" + pollNum);

        System.out.println("Peek number:" + minHeap.peek());

        System.out.println("Min Heap:" + minHeap.toString());

        /**
         * Getting the length of the heap
         * Time complexity : O(1)
         * Space complexity : O(1)
         */
        System.out.println("Min Heap size:" + minHeap.size());
    }
}