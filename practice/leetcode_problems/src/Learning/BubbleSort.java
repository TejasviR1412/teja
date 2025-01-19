package Learning;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int[] arr){
        boolean swapped;

        for(int i=0;i<arr.length;i++){
            swapped = false;
            //for each step, max item will come at the last index
            for(int j=1;j<arr.length-i;j++){

                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

                //if you did not swap for a particular value of i,
                // that means the array is sorted.
                // hence return
                if(!swapped)
                    break;
            }
        }
    }
}