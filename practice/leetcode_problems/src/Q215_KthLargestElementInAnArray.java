import java.util.PriorityQueue;

public class Q215_KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;

        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;

        System.out.println(findKthLargest(nums1,k1));
        System.out.println(findKthLargest(nums2,k2));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num: nums){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }
}