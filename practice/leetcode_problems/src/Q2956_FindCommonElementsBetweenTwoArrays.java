import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2956_FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};

        int[] nums3 = {4,3,2,3,1};
        int[] nums4 = {2,2,5,2,3,6};

        int[] nums5 = {3,4,2,3};
        int[] nums6 = {1,5};

        System.out.println(Arrays.toString(findIntersectionValues_UsingSet(nums1,nums2)));
        System.out.println(Arrays.toString(findIntersectionValues_UsingSet(nums3,nums4)));
        System.out.println(Arrays.toString(findIntersectionValues_UsingSet(nums5,nums6)));

        System.out.println("*******************************");

        System.out.println(Arrays.toString(findIntersectionValues_usingArrays(nums1,nums2)));
        System.out.println(Arrays.toString(findIntersectionValues_usingArrays(nums3,nums4)));
        System.out.println(Arrays.toString(findIntersectionValues_usingArrays(nums5,nums6)));
    }

    public static int[] findIntersectionValues_UsingSet(int[] nums1, int[] nums2) {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();
        int count1 = 0;
        int count2 = 0;

        for(int num : nums1)
            hashSet1.add(num);

        for(int num: nums2)
            hashSet2.add(num);

        for(int num : nums1)
            if(hashSet2.contains(num))
                count1++;

        for(int num : nums2)
            if(hashSet1.contains(num))
                count2++;

        return new int[] {count1,count2};
    }

    public static int[] findIntersectionValues_usingArrays(int[] nums1, int[] nums2) {
        boolean[] bool1 = new boolean[101];
        boolean[] bool2 = new boolean[101];
        int count1 = 0;
        int count2 = 0;

        for(int num: nums1)
            bool1[num] = true;

        for(int num: nums2)
            bool2[num] = true;

        for(int num : nums1)
            if(bool2[num])
                count1++;

        for(int num : nums2)
            if(bool1[num])
                count2++;

        return new int[]{count1,count2};
    }
}