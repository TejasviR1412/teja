import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q2349_DesignANumberContainerSystem_Approach2 {
    //map to store number to indices
    private Map<Integer , PriorityQueue<Integer>> numberToIndices;

    //map to store index to number
    private Map<Integer,Integer> indexToNumbers;

    public Q2349_DesignANumberContainerSystem_Approach2() {
        numberToIndices = new HashMap<>();
        indexToNumbers = new HashMap<>();
    }

    public void change(int index, int number) {
        indexToNumbers.put(index,number);

        //add the index to the min heap for this number
        numberToIndices.computeIfAbsent(number,k->new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        int index;
        if(!numberToIndices.containsKey(number))
            return -1;

        PriorityQueue<Integer> minHeap = numberToIndices.get(number);

        while (!minHeap.isEmpty()){
            index = minHeap.peek();
            if(indexToNumbers.get(index) == number)
                return index;

            minHeap.poll();
        }

        return -1;
    }

    public static void main(String[] args) {
        Q2349_DesignANumberContainerSystem_Approach2 q2349 = new Q2349_DesignANumberContainerSystem_Approach2();
        System.out.println(q2349.find(10));
        q2349.change(2,10);
        q2349.change(1,10);
        q2349.change(3,10);
        q2349.change(5,10);
        System.out.println(q2349.find(10));
        q2349.change(1,20);
        System.out.println(q2349.find(10));
    }
}
