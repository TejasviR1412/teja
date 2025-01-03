public class Q167_TwoSum_II_InputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers1 = {2,7,11,15};
        int target1 = 9;

        int[] numbers2 = {2,3,4};
        int target2 = 6;

        int[] numbers3 = {-1,0};
        int target3 = -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left <= right){
            if(numbers[left] + numbers[right] == target)
                return new int[] {left+1,right+1};
            else if(numbers[left] + numbers[right] < target)
                left++;
            else
                right--;
        }

        return new int[]{0,0};
    }
}