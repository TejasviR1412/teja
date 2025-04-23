public class Q3024_TypeOfTriangle {
    public String triangleType(int[] nums) {
        if(isValidTriangle(nums)){
            if(nums[0] == nums[1] && nums[1] == nums[2])
                return "equilateral";
            else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2])
                return "scalene";
            else return "isosceles";
        }

        return "none";
    }

    private boolean isValidTriangle(int[] nums){
        return nums[0] + nums[1] > nums[2] &&
                nums[1] + nums[2] > nums[0] &&
                nums[0] + nums[2] > nums[1];
    }
}