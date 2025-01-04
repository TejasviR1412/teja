package Learning;

public class PrefixSum {
    public static void main(String[] args) {
        int[] array = {10,7,22,2,13,15,6};
        int[] result = buildPrefixSum(array);

        System.out.println(calculatePrefixSum(result,1,4));
    }

    public static int[] buildPrefixSum(int[] originalArray){
        int[] prefixSumArray = new int[originalArray.length+1];

        for(int i=1;i<prefixSumArray.length;i++){
            prefixSumArray[i] = prefixSumArray[i-1] + originalArray[i-1];
        }

        return prefixSumArray;
    }

    public static int calculatePrefixSum(int[] prefixSum , int startIndex , int endIndex){
        return prefixSum[endIndex+1] - prefixSum[startIndex];
    }
}