public class Q1064_FixedPoint {
    public static void main(String[] args) {
        int[] arr1 = {-10,-5,0,3,7};
        int[] arr2 = {0,2,5,8,17};
        int[] arr3 = {-10,-5,3,4,7,9};

        System.out.println(fixedPoint(arr1));
        System.out.println(fixedPoint(arr2));
        System.out.println(fixedPoint(arr3));
    }

    public static int fixedPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int smallestCorrectIndex = -1 ;

        while(start <= end){
            mid = start + (end - start)/2;

            if(arr[mid] == mid){
                smallestCorrectIndex = mid;
                end = mid -1 ;
            }else if(arr[mid] > mid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return smallestCorrectIndex;
    }
}
