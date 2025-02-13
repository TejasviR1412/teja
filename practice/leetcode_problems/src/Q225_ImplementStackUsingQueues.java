import java.util.LinkedList;
import java.util.Queue;

public class Q225_ImplementStackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;

    public Q225_ImplementStackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
        top = x;
    }

    public int pop() {
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }

        int poppedVal = queue1.poll();
        queue1 = new LinkedList<>(queue2);
        queue2.clear();

        return poppedVal;
    }

    public int top() {
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }


        int poppedVal = queue1.poll();
        queue2.add(poppedVal);

        queue1 = new LinkedList<>(queue2);
        queue2.clear();

        return poppedVal;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        Q225_ImplementStackUsingQueues q225 = new Q225_ImplementStackUsingQueues();
        q225.push(1);
        q225.push(2);
        System.out.println(q225.top());
        q225.pop();
        System.out.println(q225.top());
        System.out.println(q225.empty());
    }
}