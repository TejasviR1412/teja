public class Q268_MissingNumber {
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums1));
        System.out.println(missingNumber(nums2));
        System.out.println(missingNumber(nums3));
    }

    public static int missingNumber(int[] nums) {
        int i =0;
        int correctIndex;

        /**
         * apply cyclic sort
         */
        while (i < nums.length){
            correctIndex = nums[i];

            /**
             * Swap for all elements except the one that is equal to nums.length
             */
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap (nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        /**
         * iterate through the sorted array and find the missing element
         */
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index)
                return index;
        }

        return nums.length;
    }

    private static void swap(int[] arr , int i , int j){
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}