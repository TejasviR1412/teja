import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Q3289_TheTwoSneakyNumbersOfDigitville {
    public static void main(String[] args) {
        int[] nums1 = {0,1,1,0};
        int[] nums2 = {0,3,2,1,3,2};
        int[] nums3 = {7,1,5,4,3,4,6,0,9,5,8,2};

        System.out.println(Arrays.toString(getSneakyNumbers_WithExtraSpace(nums1)));
        System.out.println(Arrays.toString(getSneakyNumbers_WithExtraSpace(nums2)));
        System.out.println(Arrays.toString(getSneakyNumbers_WithExtraSpace(nums3)));
        System.out.println("************************");
        System.out.println(Arrays.toString(getSneakyNumbers_WithExtraSpace_UsingBitSetClass(nums1)));
        System.out.println(Arrays.toString(getSneakyNumbers_WithExtraSpace_UsingBitSetClass(nums2)));
        System.out.println(Arrays.toString(getSneakyNumbers_WithExtraSpace_UsingBitSetClass(nums3)));
    }

    public static int[] getSneakyNumbers_WithExtraSpace(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        Set<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            if(hashSet.contains(num)){
                result[count++] = num;
                hashSet.remove(num);
            }

            hashSet.add(num);
        }
        return result;
    }

    public static int[] getSneakyNumbers_WithExtraSpace_UsingBitSetClass(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        BitSet bitSet = new BitSet(nums.length-2);

        for(int num : nums){
            if(bitSet.get(num)){
                result[count++] = num;
                if(count == 2)
                    break;
            }else bitSet.set(num);
        }
        return result;
    }
}