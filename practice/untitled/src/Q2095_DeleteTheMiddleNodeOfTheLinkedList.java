public class Q2095_DeleteTheMiddleNodeOfTheLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(7);
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(6);
        sl1.display(sl1.head);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(1);
        sl2.insert(2);
        sl2.insert(3);
        sl2.insert(4);
        sl2.display(sl2.head);

        Q2095_DeleteTheMiddleNodeOfTheLinkedList q2095 = new Q2095_DeleteTheMiddleNodeOfTheLinkedList();
        SinglyLinkedList.ListNode node1 = q2095.deleteMiddle(sl1.head);
        sl1.display(sl1.head);

        SinglyLinkedList.ListNode node2 = q2095.deleteMiddle(sl2.head);
        sl2.display(sl2.head);
    }

    public SinglyLinkedList.ListNode deleteMiddle(SinglyLinkedList.ListNode head) {
        SinglyLinkedList.ListNode nodeBeforeSlow = head;
        SinglyLinkedList.ListNode slow = head;
        SinglyLinkedList.ListNode fast = head;

        if(head.next == null)
            return null;

        if(head.next.next==null){
            head.next = null;
            return head;
        }

        while(fast!= null && fast.next!=null){
            nodeBeforeSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        nodeBeforeSlow.next = slow.next;

        return head;
    }
}
