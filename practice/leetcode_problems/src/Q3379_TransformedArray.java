import java.util.Arrays;

public class Q3379_TransformedArray {
    public static int[] constructTransformedArray(int[] nums) {
        int array_length = nums.length;

        int[] result = new int[array_length];

        for(int i=0;i<array_length;i++){
            if(nums[i] >0){
                result[i] = nums[(i+nums[i]) % array_length];
            }else if(nums[i] < 0){
                int targetIndex = (i + nums[i]) % array_length;

                if(targetIndex < 0)
                    targetIndex += array_length;

                result[i] = nums[targetIndex];
            }else{
                result[i] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums_1 = {3,-2,1,1};

        int[] nums_2 = {-1,4,-1};

        int[] nums_3 = {-10,-10,-4};

        System.out.println(Arrays.toString(constructTransformedArray(nums_1)));
        System.out.println(Arrays.toString(constructTransformedArray(nums_2)));
        System.out.println(Arrays.toString(constructTransformedArray(nums_3)));
    }
}
