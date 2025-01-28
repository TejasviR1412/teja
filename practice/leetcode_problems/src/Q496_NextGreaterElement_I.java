import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q496_NextGreaterElement_I {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};

        int[] nums5 = {1,3,5,2,4};
        int[] nums6 = {6,5,4,3,2,1,7};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreaterElement(nums3,nums4)));
        System.out.println(Arrays.toString(nextGreaterElement(nums5,nums6)));
        System.out.println("************");
        System.out.println(Arrays.toString(nextGreaterElement_UsingStack(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreaterElement_UsingStack(nums3,nums4)));
        System.out.println(Arrays.toString(nextGreaterElement_UsingStack(nums5,nums6)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int[] result = new int[nums1Length];
        int number;
        int indexInNums2;
        Arrays.fill(result, -1);

        for(int i=0;i< nums1Length;i++){
            number = nums1[i];
            indexInNums2 = findIndex(number,nums2);

            if(indexInNums2 == -1)
                result[i] = -1;
            else{
                for(int j=indexInNums2+1;j<nums2.length;j++){
                    if(nums2[indexInNums2] < nums2[j]){
                        result[i] = nums2[j];
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static int findIndex(int number , int[] nums){
        for(int i=0;i<nums.length;i++){
            if(number == nums[i])
                return i;
        }

        return -1;
    }

    public static int[] nextGreaterElement_UsingStack(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int nextGreatestElement;

        int[] result = new int[nums1Length];

        Map<Integer,Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        /*
        1. Traverse nums2 from right to left while maintaining a decreasing stack.
        2. For each element in nums2, pop elements from the stack that are smaller.
        The next greater element is the top of the stack after popping.
        3. Use a HashMap to store the next greater element for each element in nums2
         */
        for(int i= nums2Length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            nextGreatestElement = stack.isEmpty()?-1:stack.peek();

            hashMap.put(nums2[i],nextGreatestElement);
            stack.push(nums2[i]);
        }

        /*
        for each element in nums1, look up the next greater element from the map
         */
        for(int i=0;i<nums1Length;i++){
            result[i] = hashMap.get(nums1[i]);
        }

        return result;
    }
}
