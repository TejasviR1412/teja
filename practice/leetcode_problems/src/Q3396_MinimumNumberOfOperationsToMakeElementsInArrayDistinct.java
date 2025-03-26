import java.util.HashSet;
import java.util.Set;

public class Q3396_MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,2,3,3,5,7};
        int[] nums2 = {4,5,6,4,4};
        int[] nums3 = {6,7,8,9};
        int[] nums4 = {4,5,6,4,4};

        System.out.println(minimumOperations(nums1));
        System.out.println(minimumOperations(nums2));
        System.out.println(minimumOperations(nums3));
        System.out.println(minimumOperations(nums4));
    }

    public static int minimumOperations(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int index = -1;

        for(int i=nums.length-1;i>=0;i--){
            if(hashSet.contains(nums[i])){
                index = i;
                break;
            }

            hashSet.add(nums[i]);
        }

        if(index == -1)
            return 0;

        return ((index+1)%3 == 0) ? (index+1)/3 : ((index+1)/3) + 1;
    }
}
