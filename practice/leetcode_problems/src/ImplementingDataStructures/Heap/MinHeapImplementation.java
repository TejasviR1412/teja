package ImplementingDataStructures.Heap;

public class MinHeapImplementation {
    //create a complete binary tree using an array
    //using the binary tree construct a heap
    int[] minHeap;

    //records the size of the array
    int heapSize;

    //records the number of elements in the heap
    int realSize = 0;

    public MinHeapImplementation(int heapSize){
        this.heapSize = heapSize;

        minHeap = new int[heapSize+1];

        //to better track the indices in a binary tree,
        //we will not use the 0-th element of the array
        minHeap[0] = 0;
    }

    //method to add element to the min heap
    public void add(int element){
        realSize++;

        if(realSize > heapSize){
            System.out.println("too many elements");
            realSize--;
            return;
        }

        //add the element to the array
        minHeap[realSize] = element;

        //index of the newly added element
        int index = realSize;

        /*
        NOTE:
        If we are using an ARRAY to represent a complete binary tree,
        and we store the root node at INDEX 1 then following holds true:

        1. index of parent node for any child node can be found as (INDEX OF THE CHILD NODE)/2
        2. index of the left child node is (INDEX OF THE PARENT NODE * 2)
        3. index of the right child node is (INDEX OF THE PARENT NODE * 2 + 1)

        Finding the Leaf nodes: All the indices greater than (No of elements in the heap /2)
         */

        //index of the parent node for the newly added element
        int parent = index / 2;

        //if the newly added element is smaller than the parent node,
        //swap its value with the parent node

        while(minHeap[index] < minHeap[parent] && index > 1){
            int temp = minHeap[index];
            minHeap[index] = minHeap[parent];
            minHeap[parent] = temp;

            index = parent;
            parent = index/2;
        }
    }

    //get the top element
    public int peek(){
        return minHeap[1];
    }

    //delete the top element
    public int pop(){
        if(realSize < 0){
            System.out.println("Empty heap");
            return Integer.MAX_VALUE;
        }else{
            //top element is at index 1
            int removeElement = minHeap[1];

            //put the last element in the heap to the top
            minHeap[1] = minHeap[realSize];
            realSize--;

            int index = 1;

            //when the deleted element is not a leaf node
            while(index <= realSize/2){
                int left = index * 2;
                int right = index * 2 + 1;

                //if the deleted element is larger than the left or the right child
                // its value must be swapped with a smaller value
                //of the left and right child

                if(minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]){
                    if(minHeap[left] < minHeap[index]){
                        int temp = minHeap[left];
                        minHeap[left] = minHeap[index];
                        minHeap[index] = temp;
                        index = left;
                    }else{
                    int temp = minHeap[right];
                        minHeap[right] = minHeap[index];
                        minHeap[index] = temp;
                        index = right;
                    }
                }else{
                    break;
                }
            }
            return removeElement;
        }
    }

    //return the number of elements in the heap
    public int size(){
        return realSize;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(realSize == 0){
            System.out.println("Empty heap!");
        }else{

            sb.append('[');
            for(int i=1;i<= realSize;i++){
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(']');
        }
        return sb.toString();
    }
}