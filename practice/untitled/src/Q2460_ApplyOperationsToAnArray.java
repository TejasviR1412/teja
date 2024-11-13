public class Q2460_ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] nums1 = {312,312,436,892,0,0,
                528,0,686,516,0,0,0,0,0,445,445,445,445,445,445,
                984,984,984,0,0,0,0,
                168,0,0,647,41,203,203,241,241,
                0,628,628,0,875,875,0,0,0,803,803,54,54,
                852,0,0,0,958,195,590,300,126,0,0,523,523};

        int[] nums2 = {0,1};

        int[] output1 =  applyOperations(nums1);
        for(int a : output1)
            System.out.print(a + " ");

        System.out.println();

        int[] output2 =  applyOperations(nums2);
        for(int a : output2)
            System.out.print(a + " ");

    }

    public static int[] applyOperations(int[] nums) {
        for(int i = 0 ; i< nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        swap(nums);

        return nums;
    }

    private static void swap(int[] nums){
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[count++] = nums[i];
        }

        while (count< nums.length){
            nums[count++] = 0;
        }
    }
}