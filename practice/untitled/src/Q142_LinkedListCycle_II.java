public class Q142_LinkedListCycle_II {
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

    public SinglyLinkedList.ListNode detectCycle(SinglyLinkedList.ListNode head) {
        SinglyLinkedList.ListNode slow = head;
        SinglyLinkedList.ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            //these is a cycle present
            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}
