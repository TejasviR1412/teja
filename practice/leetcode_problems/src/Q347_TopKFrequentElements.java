import java.util.*;

public class Q347_TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;

        int[] nums2 = {1};
        int k2 = 1;

        int[] nums3 = {1,1,2,3};
        int k3 = 2;

        int[] nums4 = {1,1,2,2,3};
        int k4 = 2;

        int[] nums5 = {1,1,2,2,3,3};
        int k5 = 2;

        System.out.println(Arrays.toString(topKFrequent(nums1,k1)));
        System.out.println(Arrays.toString(topKFrequent(nums2,k2)));
        System.out.println(Arrays.toString(topKFrequent(nums3,k3)));
        System.out.println(Arrays.toString(topKFrequent(nums4,k4)));
        System.out.println(Arrays.toString(topKFrequent(nums5,k5)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyCount = new HashMap<>();

        //put the elements along with the frequency
        //O(N)
        for(int num : nums){
            frequencyCount.put(num , frequencyCount.getOrDefault(num,0)+1);
        }

        //initialize the PQ with the less frequent element
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(frequencyCount::get));

        //O(N logN)
        for(int num : frequencyCount.keySet()){
            pq.add(num);

            if(pq.size() > k)
                pq.poll();
        }

        int[] result = new int[k];

        //O(k log k)
        for(int i=k-1;i>=0;i--){
            result[i] = pq.poll();
        }
        return result;
    }
}
