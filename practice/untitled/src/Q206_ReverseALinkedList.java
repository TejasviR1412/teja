public class Q206_ReverseALinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.insert(6);
        sl1.insert(7);
        sl1.display(sl1.head);

        Q206_ReverseALinkedList q206 = new Q206_ReverseALinkedList();
        SinglyLinkedList.ListNode node = q206.reverseList(sl1.head);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode reverseList(SinglyLinkedList.ListNode head) {
        if(head == null)
            return head;

        SinglyLinkedList.ListNode previous = null;
        SinglyLinkedList.ListNode present = head;
        SinglyLinkedList.ListNode next = present.next;

        while(present!=null){
            present.next = previous;
            previous = present;
            present = next;

            if(next!= null)
                next = next.next;
        }

        return previous;
    }
}
