import java.util.Stack;

public class Q155_MinStack_Approach2 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Q155_MinStack_Approach2() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek()))
            minStack.pop();

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Q155_MinStack_Approach2 q155 = new Q155_MinStack_Approach2();
        q155.push(-2);
        q155.push(-0);
        q155.push(-3);
        System.out.println(q155.getMin());
        q155.pop();
        System.out.println(q155.top());
        System.out.println(q155.getMin());
    }
}