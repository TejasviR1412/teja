import java.util.LinkedList;

public class Q143_ReorderList {
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

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(1);
        sl2.insert(2);
        sl2.insert(3);
        sl2.insert(4);
        sl2.display(sl2.head);

        Q143_ReorderList q143 = new Q143_ReorderList();
        q143.reorderList(sl1.head);
        q143.reorderList(sl2.head);
    }

    /**
     * Since the Linked List has to be reordered in the following way: L0 → L1 → … → Ln - 1 → Ln,
     * 1. split the Linked List node in the middle.
     * 2. from the middle node to the end , reverse the linked list.
     * 3. make a second head pointing to the middle node and first head pointing to the original head
     * 4. swap nodes iterating between first head and the second head
     *
     */
    public void reorderList(SinglyLinkedList.ListNode head) {
        if(head==null || head.next==null)
            return;

        /**
         * Get the middle node of the linked list
         */
        SinglyLinkedList.ListNode middleNode = getMiddleNode(head);

        /**
         * Reverse from the middle node onwards
         */
        SinglyLinkedList.ListNode reverseNode = reverse(middleNode);

        /**
         * Place holders for 1st and 2nd heads
         */
        SinglyLinkedList.ListNode head_first = head;
        SinglyLinkedList.ListNode head_second = reverseNode;
        SinglyLinkedList.ListNode temp;

        /**
         * Swap nodes iterating between first head and the second head
         */
        while (head_first!= null && head_second != null){
            temp = head_first.next;
            head_first.next = head_second;
            head_first = temp;

            temp = head_second.next;
            head_second.next = head_first;
            head_second = temp;
        }

        if(head_first != null)
            head_first.next = null;

    }

    private SinglyLinkedList.ListNode getMiddleNode(SinglyLinkedList.ListNode head){
        if(head == null)
            return head;

        SinglyLinkedList.ListNode slow = head;
        SinglyLinkedList.ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private SinglyLinkedList.ListNode reverse(SinglyLinkedList.ListNode head){
        if(head == null)
            return head;

        SinglyLinkedList.ListNode previous = null;
        SinglyLinkedList.ListNode present = head;
        SinglyLinkedList.ListNode next = present.next;

        while(present!=null){
            present.next = previous;
            previous = present;
            present = next;

            if(next!=null)
                next = next.next;
        }

        return previous;
    }
}
