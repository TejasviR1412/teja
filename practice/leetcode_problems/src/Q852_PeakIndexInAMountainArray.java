public class Q852_PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0};
        int[] arr2 = {0,2,1,0};
        int[] arr3 = {0,5,10,5,2};

        System.out.println(peakIndexInMountainArray(arr1));
        System.out.println(peakIndexInMountainArray(arr2));
        System.out.println(peakIndexInMountainArray(arr3));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start < end){
            mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return end;
    }
}