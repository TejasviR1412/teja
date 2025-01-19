import java.util.Arrays;

public class Q1588_SumOfAllOddLengthSubArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,3};
        int[] arr2 = {1,2};
        int[] arr3 = {10,11,12};

        System.out.println(sumOddLengthSubarrays(arr1));
        System.out.println(sumOddLengthSubarrays(arr2));
        System.out.println(sumOddLengthSubarrays(arr3));
    }

    private static int calculatePrefixSumValue(int[] prefixSum , int left , int right){
        return prefixSum[right+1] - prefixSum[left];
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int contribution = ((i + 1) * (arr.length - i) + 1) / 2;
            sum += contribution * arr[i];
        }

        return sum;
    }
}
