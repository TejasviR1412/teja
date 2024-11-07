package Two_Pointer_Techinque;

public class Q876_MiddleElementOfALinkedList {
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

    public ListNode middleNode(ListNode head) {
        if(head == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Q876_MiddleElementOfALinkedList ll = new Q876_MiddleElementOfALinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.display();
        System.out.println();
        ListNode node = ll.middleNode(ll.head);
        System.out.println(node.val);
    }
}
