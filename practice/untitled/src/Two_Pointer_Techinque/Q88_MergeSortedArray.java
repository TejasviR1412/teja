package Two_Pointer_Techinque;

public class Q88_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,0,0,0};
        int m1 = 3;
        int[] nums2 = {0,1,2};
        int n1 = 3;

        int[] nums3 = {1};
        int m2= 1;
        int[] nums4 = {};
        int n2 = 0;

        merge(nums1,m1,nums2,n1);
        //merge(nums3,m2,nums2,n2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //merge the array nums2 to the end of nums1

        int j=0;
        for(int i= m ; i< m+n ; i++,j++ ){
            nums1[i] = nums2[j];
        }

        for(int a : nums1){
            System.out.print(a + " ");
        }
    }
}