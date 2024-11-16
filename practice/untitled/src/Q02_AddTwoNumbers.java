public class Q02_AddTwoNumbers {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(2);
        sl1.insert(4);
        sl1.insert(3);
        sl1.display(sl1.head);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(5);
        sl2.insert(6);
        sl2.insert(4);
        sl2.display(sl2.head);
    }

    public SinglyLinkedList.ListNode addTwoNumbers(SinglyLinkedList.ListNode l1, SinglyLinkedList.ListNode l2) {
        SinglyLinkedList.ListNode dummyHead = new SinglyLinkedList.ListNode(0);
        SinglyLinkedList.ListNode current = dummyHead;
        int carry = 0;
        int x,y,sum;

        while(l1!=null || l2!=null || carry!=0){
            x = (l1!=null)?l1.val:0;
            y = (l2!=null)?l2.val:0;

            sum = carry + x + y;
            carry = sum/10;
            current.next = new SinglyLinkedList.ListNode(sum%10);
            current = current.next;

            if(l1!=null)
                l1 = l1.next;

            if(l2!=null)
                l2=l2.next;
        }

        return dummyHead.next;
    }
}
