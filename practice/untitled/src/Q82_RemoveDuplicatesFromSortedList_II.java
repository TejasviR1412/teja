public class Q82_RemoveDuplicatesFromSortedList_II {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.display(sl1.head);

        Q82_RemoveDuplicatesFromSortedList_II q82 = new Q82_RemoveDuplicatesFromSortedList_II();
        SinglyLinkedList.ListNode node = q82.deleteDuplicates(sl1.head);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode deleteDuplicates(SinglyLinkedList.ListNode head) {
        // Sentinel
        SinglyLinkedList.ListNode sentinel = new SinglyLinkedList.ListNode(0, head);
        SinglyLinkedList.ListNode pred = sentinel;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                // Move till the end of the duplicates sublist
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }

                // Skip all duplicates
                pred.next = head.next;
                // otherwise, move predecessor
            } else {
                pred = pred.next;
            }

            // move forward
            head = head.next;
        }
        return sentinel.next;
    }
}