public class Q83_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.display(sl1.head);

        Q83_RemoveDuplicatesFromSortedList q83 = new Q83_RemoveDuplicatesFromSortedList();
        SinglyLinkedList.ListNode node = q83.deleteDuplicates(sl1.head);
        sl1.display(sl1.head);
    }

    public SinglyLinkedList.ListNode deleteDuplicates(SinglyLinkedList.ListNode head) {
        if(head == null)
            return null;

        SinglyLinkedList.ListNode node = head;

        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }

        return head;
    }
}
