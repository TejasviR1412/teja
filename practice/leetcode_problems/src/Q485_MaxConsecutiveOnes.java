public class Q485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        //variables to keep a track of ones in the array
        int count = 0;
        int count_1 = 0;

        for(int num : nums){
            if(num == 1){
                count++;
            }else{
                count_1 = Math.max(count_1 , count); // keep max count of consecutive 1s
                count = 0; // when 0 is encountered , reset count to 0
            }
        }

        return Math.max(count_1,count);
    }
}