import java.util.HashMap;
import java.util.Map;

public class Q169_MajorityElement {
    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        int[] nums2 = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;

        Map<Integer , Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a , map.getOrDefault(a,0)+1);
        }

        System.out.println(map);

        return count;
    }
}