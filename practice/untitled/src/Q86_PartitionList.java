public class Q86_PartitionList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(4);
        sl1.insert(3);
        sl1.insert(2);
        sl1.insert(5);
        sl1.insert(2);
        sl1.display(sl1.head);

        Q86_PartitionList q86 = new Q86_PartitionList();
        SinglyLinkedList.ListNode node = q86.partition(sl1.head, 3);
        sl1.display(node);
    }

    /**
     * 1. Create 2 Linked Lists : 1 for elements before x and another for elements >= x.
     * 2. Iterate through the linked list and insert elements into the beforeList or afterList.
     * 3. Once you have reached the end and have completed splitting the list, merge the two
     */
    public SinglyLinkedList.ListNode partition(SinglyLinkedList.ListNode head, int x) {
        SinglyLinkedList.ListNode beforeStart = null;
        SinglyLinkedList.ListNode beforeEnd = null;

        SinglyLinkedList.ListNode afterStart = null;
        SinglyLinkedList.ListNode afterEnd = null;

        SinglyLinkedList.ListNode node = head;
        SinglyLinkedList.ListNode next;

        while(node != null){
            next = node.next;
            node.next = null;

            /*Inserting into before list*/
            if(node.val < x){
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }else{
                /*Inserting into after list*/
                if(afterStart == null){
                    afterStart = node;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }

            node = next;
        }

        if(beforeStart == null)
            return afterStart;

        beforeEnd.next = afterStart;

        return beforeStart;
    }
}