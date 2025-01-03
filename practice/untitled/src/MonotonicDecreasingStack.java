import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**A Monotonically Decreasing Stack is a stack where
 * elements are placed in decreasing order from the bottom to the top
 *
 * Steps:
 *
 * 1. Start with an empty stack.
 * 2. Iterate through the elements of the input array.
 *      2.1. While stack is not empty AND top of stack is less than the current element
 *              pop element from the stack.
 *      2.2. push the element onto the stack
 * 3. After iterating through all the elements,
 * the stack will contain the elements in monotonic decreasing order.
 *
 */
public class MonotonicDecreasingStack {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println(monotonicDecreasingStack(nums));
    }

    public static List<Integer> monotonicDecreasingStack(int[] nums){
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums){
            while(!stack.isEmpty() && stack.peek() < num){
                stack.pop();
            }

            if(!stack.isEmpty()){
                result.add(stack.peek());
            }else
                result.add(-1);

            stack.push(num);
        }

        return result;
    }
}