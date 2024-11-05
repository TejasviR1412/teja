package Two_Pointer_Techinque;

public class Q349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        int[] output1 = intersection(nums1,nums2);
        for(int a : output1){
            System.out.print(a + " ");
        }

        int[] output2 = intersection(nums3,nums4);
        for(int a : output2){
            System.out.print(a + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        
        return new int[] {};
    }
}
