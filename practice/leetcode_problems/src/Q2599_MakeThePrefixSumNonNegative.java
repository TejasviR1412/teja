import java.util.PriorityQueue;

public class Q2599_MakeThePrefixSumNonNegative {
    public static void main(String[] args) {
        int[] nums1 = {2,3,-5,4};
        int[] nums2 = {3,-5,-2,6};

        System.out.println(makePrefSumNonNegative(nums1));
        System.out.println(makePrefSumNonNegative(nums2));
    }

    public static int makePrefSumNonNegative(int[] nums) {
        int numberOfOperations = 0;
        long prefixSum = 0;

        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();

        for(int num : nums){
            if(num < 0){
                integerPriorityQueue.offer(num);
            }

            prefixSum += num;

            if(prefixSum < 0){
                prefixSum -= integerPriorityQueue.poll();
                numberOfOperations++;
            }
        }

        return numberOfOperations;
    }
}
