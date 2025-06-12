import java.util.HashMap;
import java.util.Map;

public class Q760_FindAnagramMappings {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        int[] mapping = new int[nums1.length];

        for(int i=0;i< nums2.length;i++){
            hashMap.put(nums2[i],i);
        }

        for(int i=0;i<mapping.length;i++){
            mapping[i] = hashMap.get(nums1[i]);
        }

        return mapping;
    }
}