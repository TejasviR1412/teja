package Two_Pointer_Techinque;

public class Q141_LinkedListCycle {
    private class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;
    private ListNode tail;

    private ListNode findLastNode(){
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        return temp;
    }

    private void insert(int val){
        ListNode node = new ListNode(val);

        if(head == null){
            head = node;
            tail=node;
        }

        tail = findLastNode();

        tail.next = node;
        tail = node;
        node.next = null;
    }

    private void display(){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print("End");
    }

    private void createCycle(int index){
        ListNode temp = head;

        for(int i= 0; i<index;i++){
            temp = temp.next;
        }

        tail.next = temp;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Q141_LinkedListCycle ll = new Q141_LinkedListCycle();
        ll.insert(3);
        ll.insert(2);
        ll.insert(0);
        ll.insert(-4);
        ll.display();
        ll.createCycle(1);
        System.out.println(ll.hasCycle(ll.head));
    }
}
