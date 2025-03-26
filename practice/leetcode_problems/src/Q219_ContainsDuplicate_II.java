import java.util.HashSet;
import java.util.Set;

public class Q219_ContainsDuplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> integerSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(integerSet.contains(nums[i]))
                return true;

            integerSet.add(nums[i]);

            if(integerSet.size() > k){
                integerSet.remove(nums[i-k]);
            }
        }
        return false;
    }
}