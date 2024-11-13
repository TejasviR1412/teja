public class Q2903_FindIndicesWithIndexAndDifferenceValue_I {
    public static void main(String[] args) {
        int[] nums1 = {5,1,4,1};
        int indexDifference1 = 2;
        int valueDifference1 = 4;

        int[] nums2 = {2,1};
        int indexDifference2 = 0;
        int valueDifference2 = 0;

        int[] nums3 = {1,2,3};
        int indexDifference3 = 2;
        int valueDifference3 = 4;

        int[] output1 = findIndices(nums1,indexDifference1,valueDifference1);
        for(int a : output1)
            System.out.print(a + " ");

        System.out.println();

        int[] output2 = findIndices(nums2,indexDifference2,valueDifference2);
        for(int a: output2)
            System.out.print(a + " ");

        System.out.println();

        int[] output3 = findIndices(nums3,indexDifference3,valueDifference3);
        for(int a: output3)
            System.out.print(a + " ");
    }

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        for(int i= 0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(Math.abs(i-j)>= indexDifference && Math.abs(nums[i] - nums[j])>= valueDifference){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
