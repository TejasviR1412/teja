public class Q3010_DivideAnArrayIntoSubArraysWithMinimumCost_I {
    //nums[0] will always be included since First element of the array will always be added in the the resulting sum.
    // Why? Because it will always be part of the one of the subarrays.

    // find the 2 smallest elements from 1 to n and add those to nums[0] for the required output
    public int minimumCost(int[] nums) {
        int first_min_element = Integer.MAX_VALUE;
        int second_min_element = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i] < first_min_element){
                second_min_element = first_min_element;
                first_min_element = nums[i];
            }else if(nums[i] < second_min_element){
                second_min_element = nums[i];
            }
        }

        return nums[0] + first_min_element + second_min_element;
    }
}