public class Q147_InsertionSortList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(4);
        sl1.insert(2);
        sl1.insert(1);
        sl1.insert(3);
        sl1.insert(5);
        sl1.insert(7);
        sl1.insert(6);
        sl1.display(sl1.head);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(-1);
        sl2.insert(5);
        sl2.insert(3);
        sl2.insert(4);
        sl2.insert(-4);
        sl2.display(sl2.head);

        Q147_InsertionSortList q147 = new Q147_InsertionSortList();
        SinglyLinkedList.ListNode node1 = q147.insertionSortList(sl1.head);
        sl1.display(node1);

        SinglyLinkedList.ListNode node2 = q147.insertionSortList(sl2.head);
        sl2.display(node2);
    }

    public SinglyLinkedList.ListNode insertionSortList(SinglyLinkedList.ListNode head) {
        SinglyLinkedList.ListNode dummy = new SinglyLinkedList.ListNode();
        SinglyLinkedList.ListNode current = head;
        SinglyLinkedList.ListNode previous;
        SinglyLinkedList.ListNode next;

        while(current != null){
            previous = dummy;

            while(previous.next!=null && previous.next.val<=current.val){
                previous = previous.next;
            }

            next = current.next;

            current.next = previous.next;
            previous.next = current;

            current = next;
        }

        return dummy.next;
    }
}