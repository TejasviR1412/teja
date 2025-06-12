public class Q3512_MinimumOperationsToMakeArraySumDivisibleByK {
    public int minOperations(int[] nums, int k) {
        int arraySum = 0;

        for(int num : nums){
            arraySum += num;
        }

        return (arraySum % k);
    }
}