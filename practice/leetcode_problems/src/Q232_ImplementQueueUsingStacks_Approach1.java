import java.util.Stack;

public class Q232_ImplementQueueUsingStacks_Approach1 {
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;
    private int front;

    public Q232_ImplementQueueUsingStacks_Approach1() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /*
    Time Complexity : O(n)
    Space Complexity : O(n)

    1. A queue is FIFO (first-in-first-out) but a stack is LIFO (last-in-first-out).
    2. This means the newest element must be pushed to the bottom of the stack
    3. To do so we first transfer all s1 elements to auxiliary stack s2.
    4. Then the newly arrived element is pushed on top of s2 and all its elements are popped and pushed to s1.
     */
    public void push(int x) {
        if(stack1.empty()){
            front = x; // to maintain the first element in the queue
        }

        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }

        stack2.push(x);

        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        int topElement;

        topElement = stack1.pop(); // removes the topmost element

        if(!stack1.empty()){
            front = stack1.peek(); // since the topmost element is removed here, front value will get updated
        }

        return topElement;
    }

    public int peek() {
        return front;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        Q232_ImplementQueueUsingStacks_Approach1 q232 = new Q232_ImplementQueueUsingStacks_Approach1();
        q232.push(1);
        q232.push(2);
        System.out.println(q232.peek());
        System.out.println(q232.pop());
        System.out.println(q232.empty());
    }
}