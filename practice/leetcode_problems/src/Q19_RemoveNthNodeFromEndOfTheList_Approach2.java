public class Q19_RemoveNthNodeFromEndOfTheList_Approach2 {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.display(sl1.head);

        Q19_RemoveNthNodeFromEndOfTheList_Approach2 q19 = new  Q19_RemoveNthNodeFromEndOfTheList_Approach2();
        SinglyLinkedList.ListNode node = q19.removeNthFromEnd(sl1.head,5);
        sl1.display(sl1.head);
    }

    public SinglyLinkedList.ListNode removeNthFromEnd(SinglyLinkedList.ListNode head, int n) {
        SinglyLinkedList.ListNode start = new SinglyLinkedList.ListNode(0);
        start.next = head;
        SinglyLinkedList.ListNode slow = start;
        SinglyLinkedList.ListNode fast = start;

        for(int i=1;i<=n+1;i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast=fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}
