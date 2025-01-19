public class Q24_SwapNodesInPairs_UsingIterativeApproach {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.display(sl1.head);

        Q24_SwapNodesInPairs_UsingIterativeApproach q24 = new Q24_SwapNodesInPairs_UsingIterativeApproach();
        SinglyLinkedList.ListNode node = q24.swapPairs(sl1.head);
        sl1.display(sl1.head);
    }

    public SinglyLinkedList.ListNode swapPairs(SinglyLinkedList.ListNode head) {
        // Dummy node acts as the prevNode for the head node
        // of the list and hence stores pointer to the head node.
        SinglyLinkedList.ListNode dummy = new SinglyLinkedList.ListNode(-1);
        dummy.next = head;

        SinglyLinkedList.ListNode previousNode = dummy;
        SinglyLinkedList.ListNode firstNode, secondNode;

        while((head!=null) && (head.next!=null)){
            // Nodes to be swapped
            firstNode = head;
            secondNode = head.next;

            //Swapping
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Reinitializing the head and prevNode for next swap
            previousNode = firstNode;
            head = firstNode.next; //jump
        }

        return dummy.next;
    }
}
