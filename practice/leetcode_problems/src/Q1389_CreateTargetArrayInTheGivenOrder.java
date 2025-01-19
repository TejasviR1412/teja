import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1389_CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums1 = {0,1,2,3,4};
        int[] index1 = {0,1,2,2,};

        int[] nums2 = {1,2,3,4,0};
        int[] index2 = {0,1,2,3,0};

        int[] nums3 = {1};
        int[] index3 = {0};

        System.out.println(Arrays.toString(createTargetArray(nums1,index1)));
        System.out.println(Arrays.toString(createTargetArray(nums2,index2)));
        System.out.println(Arrays.toString(createTargetArray(nums3,index3)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }

        int[] target = new int[list.size()];

        for(int i=0;i<target.length;i++){
            target[i] = list.get(i);
        }

        return target;
    }
}