import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * A Monotonically Increasing Stack is a stack where elements
 * are placed in increasing order from the bottom to the top.
 *
 * Steps:
 * 1. Initialize an empty stack.
 * 2. Iterate through the elements and for each element:
 *      2.1. while stack is not empty AND top of stack is more than the current element
 *              pop element from the stack
 *      2.2. push the current element onto the stack
 * 3. At the end of the iteration,
 * the stack will contain the monotonic increasing order of elements
 */
public class MonotonicIncreasingStack {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};

        System.out.println(Arrays.toString(monotonicIncreasing(nums)));
    }

    public static int[] monotonicIncreasing(int[] nums){
        Deque<Integer> stack = new ArrayDeque<>();

        for(int num: nums){
            while(!stack.isEmpty() && stack.peekLast() > num){
                stack.pollLast();
            }

            stack.offerLast(num);
        }

        int[] result = new int[stack.size()];
        int index = stack.size() - 1;

        while(!stack.isEmpty()){
            result[index--] = stack.pollLast();
        }

        return result;
    }
}
