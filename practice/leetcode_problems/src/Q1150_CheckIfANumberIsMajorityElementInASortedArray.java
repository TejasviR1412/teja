public class Q1150_CheckIfANumberIsMajorityElementInASortedArray {
    public boolean isMajorityElement_Approach1(int[] nums, int target) {
        //obtain the first index of the target element
        int firstIndex = getLowerIndex(nums,target);

        //obtain the last index of the target element
        int lastIndex = getUpperIndex(nums,target);

        return lastIndex - firstIndex > nums.length /2;

    }

    private int getLowerIndex(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        int index = nums.length;
        int middle;

        while (start <= end){
            middle = start + (end - start) / 2;

            if(nums[middle] >= target){
                end = middle - 1;
                index = middle;
            }else{
                start = middle + 1;
            }
        }

        return index;
    }

    private int getUpperIndex(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        int index = nums.length;
        int middle;

        while (start <= end){
            middle = start + (end - start) / 2;

            if(nums[middle] > target){
                end = middle - 1;
                index = middle;
            }else{
                start = middle + 1;
            }
        }

        return index;
    }

    public boolean isMajorityElement_Approach2(int[] nums, int target) {
        int firstIndex = getLowerIndex(nums,target);

        return firstIndex + nums.length / 2 < nums.length && nums[firstIndex + nums.length / 2] == target;
    }
}