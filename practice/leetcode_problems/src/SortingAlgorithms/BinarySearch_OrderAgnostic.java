package SortingAlgorithms;

public class BinarySearch_OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {90,75,18,12,6,4,3,1};
        int target = 75;

        System.out.println(target + " is present at index " + binarySearch_OrderAgnostic(arr,target));
    }

    public static int binarySearch_OrderAgnostic(int[] arr , int target){
        int middle;
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            middle = left + (right - left)/2;

            if(arr[middle] == target)
                return middle;
            else if(target > middle)
                right = middle - 1;
            else left = middle + 1;
        }

        return -1;
    }
}
