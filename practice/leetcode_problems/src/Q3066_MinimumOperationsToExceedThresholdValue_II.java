import java.util.PriorityQueue;

public class Q3066_MinimumOperationsToExceedThresholdValue_II {
    public static void main(String[] args) {
        int[] nums1 = {2,11,10,1,3};
        int k1 = 10;

        int[] nums2 = {1,1,2,4,9};
        int k2 = 20;

        System.out.println(minOperations_Approach1(nums1,k1));
        System.out.println(minOperations_Approach1(nums2,k2));
        System.out.println("*****************************************");
        System.out.println(minOperations_Approach2(nums1,k1));
        System.out.println(minOperations_Approach2(nums2,k2));
    }

    public static int minOperations_Approach1(int[] nums, int k) {
        int numberOfOperations = 0;
        PriorityQueue<Long> integerPriorityQueue = new PriorityQueue<>();

        long first , second;

        for(int num : nums){
            integerPriorityQueue.add((long)num);
        }

        while(!integerPriorityQueue.isEmpty() && integerPriorityQueue.peek() < k){
            first = integerPriorityQueue.poll();

            numberOfOperations++;

            if(integerPriorityQueue.isEmpty())
                break;

            second = integerPriorityQueue.poll();

            integerPriorityQueue.add(first*2 + second );

        }

        return numberOfOperations;
    }

    public static int minOperations_Approach2(int[] nums, int k) {
        int numberOfOperations = 0;
        PriorityQueue<Long> integerPriorityQueue = new PriorityQueue<>();

        long first , second , result;

        for(int num : nums){
            if(num < k)
                integerPriorityQueue.add((long)num);
        }

        while(!integerPriorityQueue.isEmpty()){
            first = integerPriorityQueue.poll();

            numberOfOperations++;

            if(integerPriorityQueue.isEmpty())
                break;

            second = integerPriorityQueue.poll();

            result = first*2 + second;

            if(result < k)
                integerPriorityQueue.add(result);

        }

        return numberOfOperations;
    }
}
