public class Q92_ReverseLinkedList_II {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.display(sl1.head);

        Q92_ReverseLinkedList_II q92 = new Q92_ReverseLinkedList_II();
        SinglyLinkedList.ListNode node = q92.reverseBetween(sl1.head,2,4);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode reverseBetween(SinglyLinkedList.ListNode head, int left, int right) {
        if(left == right || head == null)
            return head;

        /**
         * Skip the first left-1 nodes
         */
        SinglyLinkedList.ListNode current = head;
        SinglyLinkedList.ListNode previous = null;

        for(int i=0;current!=null && i<(left-1);i++){
            previous = current;
            current = current.next;
        }

        SinglyLinkedList.ListNode last = previous;
        SinglyLinkedList.ListNode newEnd = current;

        // reverse the nodes between left and right
        SinglyLinkedList.ListNode next = current.next;

        for(int i=0;current!=null & i<(right-left)+1;i++){
            current.next = previous;
            previous = current;
            current = next;

            if(next != null)
                next = next.next;
        }

        if(last!=null)
            last.next=previous;
        else
            head=previous;

        newEnd.next = current;

        return head;
    }
}