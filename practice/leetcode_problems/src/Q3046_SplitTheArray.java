import java.util.HashMap;
import java.util.Map;

public class Q3046_SplitTheArray {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer , Integer> hashMap = new HashMap<>();
        int maxFrequency = 0;

        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
            maxFrequency = Math.max(maxFrequency, hashMap.get(num));

            if(maxFrequency > 2)
                return false;
        }

        return true;
    }
}