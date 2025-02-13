import java.util.Map;
import java.util.Stack;

/**
 * IMPORTANT : implement a solution with O(1) time complexity for each function.
 */
public class Q155_MinStack_Approach1 {
    private Stack<int[]> stack;

    public Q155_MinStack_Approach1() {
        stack = new Stack<>();
    }

    public void push(int val) {
        int currentMinValue;

        if(stack.isEmpty()){
            stack.push(new int[]{val,val});
            return;
        }

        currentMinValue = stack.peek()[1];
        stack.push(new int[] {val , Math.min(val,currentMinValue)});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        Q155_MinStack_Approach1 q155 = new Q155_MinStack_Approach1();
        q155.push(-2);
        q155.push(-0);
        q155.push(-3);
        System.out.println(q155.getMin());
        q155.pop();
        System.out.println(q155.top());
        System.out.println(q155.getMin());
    }
}