import java.util.Stack;

public class Q456_132Pattern {
    public static boolean find132pattern_TLE(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[k] && nums[k]<nums[j]){
                        count++;
                    }

                }
            }
        }

        return !(count == 0);
    }

    public static boolean find132pattern(int[] nums) {
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();

        int second = Integer.MIN_VALUE;

        for(int i=n-1;i>-1;i--){
            if(nums[i] < second)
                return true;

            while (!stack.isEmpty() && nums[i] > stack.peek()){
                second = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {3,1,4,2};
        int[] nums3 = {-1,3,2,0};

        System.out.println(find132pattern_TLE(nums1));
        System.out.println(find132pattern_TLE(nums2));
        System.out.println(find132pattern_TLE(nums3));

        System.out.println("*******************************");

        System.out.println(find132pattern(nums1));
        System.out.println(find132pattern(nums2));
        System.out.println(find132pattern(nums3));
    }
}
