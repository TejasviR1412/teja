import java.util.HashMap;
import java.util.Map;

public class Q3158_FindTheXOROfNumbersWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 2)
                result ^= num;
        }

        return result;
    }
}