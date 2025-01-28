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

    public void pop() {
        while(queue1.size()>1){
            top = queue1.remove();
            queue2.add(top);
        }

        queue1.remove();
        Queue<Integer> temp = queue1;
        queue1= queue2;
        queue2 = temp;

    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}