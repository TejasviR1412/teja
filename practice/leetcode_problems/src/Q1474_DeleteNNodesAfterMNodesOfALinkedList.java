public class Q1474_DeleteNNodesAfterMNodesOfALinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.insert(6);
        sl1.insert(7);
        sl1.insert(8);
        sl1.insert(9);
        sl1.insert(10);
        sl1.insert(11);
        sl1.insert(12);
        sl1.insert(13);
        sl1.display(sl1.head);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(1);
        sl2.insert(2);
        sl2.insert(3);
        sl2.insert(4);
        sl2.insert(5);
        sl2.insert(6);
        sl2.insert(7);
        sl2.insert(8);
        sl2.insert(9);
        sl2.insert(10);
        sl2.insert(11);
        sl2.display(sl2.head);

        Q1474_DeleteNNodesAfterMNodesOfALinkedList q1474 = new Q1474_DeleteNNodesAfterMNodesOfALinkedList();
        SinglyLinkedList.ListNode node1 = q1474.deleteNodes(sl1.head,2,3);
        sl1.display(sl1.head);

        SinglyLinkedList.ListNode node2 = q1474.deleteNodes(sl2.head,1,3);
        sl2.display(sl2.head);
    }

    public SinglyLinkedList.ListNode deleteNodes(SinglyLinkedList.ListNode head, int m, int n) {
        if(head == null)
            return head;

        SinglyLinkedList.ListNode currentNode = head;
        SinglyLinkedList.ListNode lastNode = head;

        int mCount;
        int nCount;

        while(currentNode != null){
            /**
             * The counts have to be reinitialised for traversals in each loop
             */
            mCount = m;
            nCount = n;

            /**
             * Traverse m nodes
             */
            while(currentNode != null && mCount!=0){
                lastNode = currentNode;
                currentNode = currentNode.next;
                mCount--;
            }

            /**
             * Skip n nodes
             */

            while(currentNode!=null && nCount!=0){
                currentNode = currentNode.next;
                nCount--;
            }

            lastNode.next = currentNode;
        }
        return head;
    }
}