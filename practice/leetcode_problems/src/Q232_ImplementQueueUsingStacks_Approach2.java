import java.util.Stack;

public class Q232_ImplementQueueUsingStacks_Approach2 {
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;
    private int front;

    public Q232_ImplementQueueUsingStacks_Approach2() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if(stack1.empty())
            front = x;

        stack1.push(x);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

    public int peek() {
        if(!stack2.isEmpty())
            return stack2.peek();

        return front;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        Q232_ImplementQueueUsingStacks_Approach2 q232 = new Q232_ImplementQueueUsingStacks_Approach2();
        q232.push(1);
        q232.push(2);
        System.out.println(q232.peek());
        System.out.println(q232.pop());
        System.out.println(q232.empty());
    }
}