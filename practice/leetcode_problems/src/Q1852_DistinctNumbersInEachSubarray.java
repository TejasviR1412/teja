import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1852_DistinctNumbersInEachSubarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,2,1,3};
        int k1 = 3;

        int[] nums2 = {1,1,1,1,2,3,4};
        int k2 = 4;

        System.out.println(Arrays.toString(distinctNumbers(nums1,k1)));
        System.out.println(Arrays.toString(distinctNumbers(nums2,k2)));
    }

    public static int[] distinctNumbers(int[] nums, int k) {
        int size = nums.length;
        int[] answer = new int[size - k + 1];
        int left,right;

        Map<Integer,Integer> frequencyMap = new HashMap<>();

        //find the distinct elements in the first window
        for(int i=0;i<k;i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0)+1);
        }

        answer[0] = frequencyMap.size();


        for(int i=k;i<size;i++){
           left = nums[i-k]; // find the leftmost element
           frequencyMap.put(left,frequencyMap.get(left)-1); // decrease the frequency count
           frequencyMap.remove(left,0); //if count is 0 , remove it from the map

           right = nums[i]; // slide the window and find the next element
           frequencyMap.put(right,frequencyMap.getOrDefault(right,0)+1); //put the element in the map

           answer[i - (k-1)] = frequencyMap.size(); //map size is the number of distinct elements
        }
        return answer;
    }
}
