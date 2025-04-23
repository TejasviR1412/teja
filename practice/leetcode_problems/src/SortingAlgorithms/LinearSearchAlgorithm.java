package SortingAlgorithms;

// find 14 in the following array
// 18, 12, 9, 14 , 77 , 50
public class LinearSearchAlgorithm {
    public static int linearSearch(int[] arr , int target){
        if(arr.length == 0)
            return -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14 , 77 , 50};
        int target = 9;

        System.out.println(target + " is present at index " + linearSearch(arr,target));
    }
}