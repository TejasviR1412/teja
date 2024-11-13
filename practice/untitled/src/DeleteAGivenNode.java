/**
 * Question : Implement an algorithm to delete a node in the middle (i.e any node but the first and
 * the last node, not necessarily the middle node) in a linked list ,
 * given access to only that node
 * Example : Input : a->b->c->d->e->f (delete d)
 * the method should not return anything, just delete the given element
 */
public class DeleteAGivenNode {
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

        DeleteAGivenNode d = new DeleteAGivenNode();
        d.deleteNode(sl1.head);
        sl1.display(sl1.head);
    }

    public void deleteNode(SinglyLinkedList.ListNode node){
        /*
        if the node is the last node or if the node is null return
         */
        if(node == null || node.next == null)
            return;

        SinglyLinkedList.ListNode next = node.next;

        node.val = next.val;
        node.next = next.next;
    }
}