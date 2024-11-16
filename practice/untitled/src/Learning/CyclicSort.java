package Learning;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr){
        int i =0;
        int correctIndex;

        while (i < arr.length){
            correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap (arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr , int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}