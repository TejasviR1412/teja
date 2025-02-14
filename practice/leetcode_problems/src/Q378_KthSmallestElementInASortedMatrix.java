import java.util.Comparator;
import java.util.PriorityQueue;

public class Q378_KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,5,9},{10,11,13},{12,13,15}};
        int k1 = 8;

        int[][] matrix2 = {{-5}};
        int k2 = 1;

        Q378_KthSmallestElementInASortedMatrix q378 = new Q378_KthSmallestElementInASortedMatrix();
        System.out.println(q378.kthSmallest(matrix1,k1));
        System.out.println(q378.kthSmallest(matrix2,k2));
    }

    public int kthSmallest(int[][] matrix, int k) {
        int length = matrix.length;

        PriorityQueue<MyHeapNode> minHeap = new PriorityQueue<>(Math.min(length,k),new MyHeapComparator());

        for(int row=0;row<Math.min(length,k);row++){
            minHeap.offer(new MyHeapNode(matrix[row][0],row,0));
        }

        MyHeapNode element = minHeap.peek();

        while (k-- >0){
            element = minHeap.poll();
            int row = element.getRow() , column = element.getColumn();

            if(column < length - 1){
                minHeap.offer(new MyHeapNode(matrix[row][column+1],row,column+1));
            }
        }

        return element.getValue();
    }
}

class MyHeapNode{
    int row;
    int column;
    int value;

    public MyHeapNode(int value, int row , int column){
        this.value = value;
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public int getValue() {
        return this.value;
    }
}

class MyHeapComparator implements Comparator<MyHeapNode>{

    @Override
    public int compare(MyHeapNode o1, MyHeapNode o2) {
        return o1.value - o2.value;
    }
}
