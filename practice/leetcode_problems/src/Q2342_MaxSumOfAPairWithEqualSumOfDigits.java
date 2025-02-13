import java.util.PriorityQueue;

/*
Constraints:
1. 1 <= nums.length <= 10^5
2. 1 <= nums[i] <= 10^9
 */
public class Q2342_MaxSumOfAPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        int[] nums1 = {18,43,36,13,7};
        int[] nums2 = {10,12,19,14};

        System.out.println(maximumSum(nums1));
        System.out.println(maximumSum(nums2));
    }

    public static int maximumSum(int[] nums) {
        PriorityQueue<Integer>[] digitSumGroup = new PriorityQueue[82];
        int sum,firstElement,secondElement;

        for(int i=0;i<82;i++){
            digitSumGroup[i] = new PriorityQueue<>();
        }

        int maxPair = -1;

        for(int number : nums){
           sum = calculateSumOfDigits(number);
           digitSumGroup[sum].add(number);

           if(digitSumGroup[sum].size() > 2){
               digitSumGroup[sum].poll();
           }
        }

        for(PriorityQueue<Integer> minHeap : digitSumGroup){
            if(minHeap.size() == 2){
                firstElement = minHeap.poll();
                secondElement = minHeap.poll();
                maxPair = Math.max(maxPair,firstElement+secondElement);
            }
        }
        return maxPair;
    }

    private static int calculateSumOfDigits(int num){
        int sum = 0;

        while(num !=0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}