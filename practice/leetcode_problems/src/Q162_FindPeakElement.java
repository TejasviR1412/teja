public class Q162_FindPeakElement {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(nums1));
        System.out.println(findPeakElement(nums2));
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while(start < end){
            mid = start + (end - start)/2;

            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return end;
    }
}