import java.util.Arrays;

public class Q1470_ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums1 = {2,5,1,3,4,7};
        int n1 = 3;

        int[] nums2 = {1,2,3,4,4,3,2,1};
        int n2 = 4;

        int[] nums3 = {1,1,2,2};
        int n3 = 2;

        System.out.println(Arrays.toString(shuffle(nums1,n1)));
        System.out.println(Arrays.toString(shuffle(nums2,n2)));
        System.out.println(Arrays.toString(shuffle(nums3,n3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int left;
        int right;

        for(int i=0;i<n;i++){
            left = nums[i];
            right = nums[i+n];

            result[2*i] = left;
            result[2*i+1] = right;
        }

        return result;
    }
}
