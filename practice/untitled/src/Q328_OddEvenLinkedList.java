public class Q328_OddEvenLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.display(sl1.head);

        Q328_OddEvenLinkedList q328 = new Q328_OddEvenLinkedList();
        SinglyLinkedList.ListNode node = q328.oddEvenList(sl1.head);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode oddEvenList(SinglyLinkedList.ListNode head) {
        if(head == null)
            return null;

        SinglyLinkedList.ListNode odd = head;
        SinglyLinkedList.ListNode even = head.next;
        SinglyLinkedList.ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
