public class Q24_SwapNodesInPairs_UsingRecursiveApproach {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.display(sl1.head);

        Q24_SwapNodesInPairs_UsingRecursiveApproach q24 = new Q24_SwapNodesInPairs_UsingRecursiveApproach();
        SinglyLinkedList.ListNode node = q24.swapPairs(sl1.head);
        sl1.display(sl1.head);
    }

    public SinglyLinkedList.ListNode swapPairs(SinglyLinkedList.ListNode head) {
        if(head == null || head.next ==null)
            return head;

        SinglyLinkedList.ListNode firstNode = head;
        SinglyLinkedList.ListNode secondNode = head.next;

        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }
}
