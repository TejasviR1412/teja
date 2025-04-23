public class Q3038_MaximumNumberOfOperationsWithTheSameScore_I {
    public int maxOperations(int[] nums) {
        int score = nums[0] + nums[1];
        int count = 1;
        int current_score;

        if(nums.length == 2)
            return 1;

        for(int i=2;i<=nums.length-2;i+=2){
            current_score = nums[i] + nums[i+1];

            if(current_score != score)
                break;
            else count++;
        }

        return count;
    }
}