/**
 * Question from Cracking the coding interview
 */
public class Q237_DeleteNodeInALinkedList {
    public void deleteNode(SinglyLinkedList.ListNode node) {
        SinglyLinkedList.ListNode next = node.next;

        node.val = next.val;
        node.next = next.next;
    }
}