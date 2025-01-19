public class Q876_MiddleOfTheLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.insert(6);
        sl1.display(sl1.head);

        Q876_MiddleOfTheLinkedList q876 = new Q876_MiddleOfTheLinkedList();
        SinglyLinkedList.ListNode middleElement = q876.middleNode(sl1.head);
        System.out.println(middleElement.val);
    }

    public SinglyLinkedList.ListNode middleNode(SinglyLinkedList.ListNode head) {
        SinglyLinkedList.ListNode slow = head;
        SinglyLinkedList.ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
