import java.util.HashMap;
import java.util.Map;

public class Q3005_CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int elementsWithMaxFrequency = 0;
        int maxFrequency = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
            maxFrequency = Math.max(maxFrequency , hashMap.get(num));

        }

        for(int value : hashMap.values()){
            if(value == maxFrequency)
                elementsWithMaxFrequency += value;
        }

        return elementsWithMaxFrequency;
    }
}
