import java.util.Arrays;

public class Q1385_FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d1 = 2;

        int[] arr3 = {1,4,2,3};
        int[] arr4 = {-4,-3,6,10,20,30};
        int d2 = 3;

        int[] arr5 = {2,1,100,3};
        int[] arr6 = {-5,-2,10,-3,7};
        int d3 = 6;

        System.out.println(findTheDistanceValue(arr1,arr2,d1));
        System.out.println(findTheDistanceValue(arr3,arr4,d2));
        System.out.println(findTheDistanceValue(arr5,arr6,d3));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);

        for(int a : arr1){
            if(!binarySearch(a-d,a+d,arr2.length,arr2)){
                count++;
            }
        }
        return count;
    }

    private static boolean binarySearch(int r1, int r2 , int n , int[] arr){
        int left = 0;
        int right = n-1;
        int mid;

        while(left <= right){
            mid = left + (right - left)/2;

            if(arr[mid]>=r1 && arr[mid]<=r2)
                return true;
            else if(arr[mid] < r1)
                left = mid + 1;
            else
                right = mid -1;
        }
        return false;
    }
}
