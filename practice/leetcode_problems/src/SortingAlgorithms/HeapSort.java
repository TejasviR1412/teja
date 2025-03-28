package SortingAlgorithms;

import java.util.Arrays;

public class HeapSort {
    public void heapSort(int[] arr) {
        // Mutates elements in lst by utilizing the heap data structure
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            // swap last element with first element
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            // note that we reduce the heap size by 1 every iteration
            maxHeapify(arr, i, 0);
        }
    }

    private void maxHeapify(int[] arr , int heapSize , int index){
        //assuming the index starts from 0
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] nums = {7,3,2,5,6,10,9,8,1};
        System.out.println("Before sorting:" + Arrays.toString(nums));
        heapSort.heapSort(nums);
        System.out.println("After sorting:" + Arrays.toString(nums));
    }
}
