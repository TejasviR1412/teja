package ImplementingDataStructures.Heap;

public class MaxHeapImplementation {
    int[] maxHeap;

    //maintains the array size
    int heapSize;

    //maintains the number of elements in the max heap
    int realSize = 0;

    public MaxHeapImplementation(int heapSize){
        this.heapSize = heapSize;
        maxHeap = new int[heapSize + 1];

        maxHeap[0]=0;
    }

    public void add(int element){
        realSize++;

        if(realSize > heapSize){
            System.out.println("too many elemeents in the heap");
            realSize--;
            return;
        }

        maxHeap[realSize] = element;

        //index of the newly added element
        int index =  realSize;

        //index of the parent element for the newly added element
        int parent = index / 2;

        while(maxHeap[index] > maxHeap[parent] && index > 1){
            int temp = maxHeap[index];
            maxHeap[index] = maxHeap[parent];
            maxHeap[parent] = temp;

            index = parent;
            parent = index / 2;
        }
    }

    //get the top element
    public int peek(){
        return maxHeap[1];
    }

    //delete the top element
    public int pop(){
        if(realSize<1){
            System.out.println("no elements to delete");
            return Integer.MIN_VALUE;
        }else{
            int removeElement = maxHeap[1];

            //put the last element in the heap to the top
            maxHeap[1] = maxHeap[realSize];
            realSize--;

            int index = 1;

            while(index <= realSize/2){
                int left = index * 2;
                int right = index * 2 + 1;

                if(maxHeap[index] < maxHeap[left] || maxHeap[index]<maxHeap[right]){
                    if(maxHeap[left] > maxHeap[index]){
                        int temp = maxHeap[left];
                        maxHeap[left] = maxHeap[index];
                        maxHeap[index] = temp;
                        index = left;
                    }else{
                        int temp = maxHeap[right];
                        maxHeap[right] = maxHeap[index];
                        maxHeap[index] = temp;
                        index = right;
                    }
                }else{
                    break;
                }
            }
            return removeElement;
        }
    }

    //get the size of the heap
    public int size(){
        return realSize;
    }

    public String toString(){
        if(realSize == 0){
            return "no elements!";
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for(int i=1;i<=realSize;i++){
                sb.append(maxHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(']');
            return sb.toString();
        }
    }
}