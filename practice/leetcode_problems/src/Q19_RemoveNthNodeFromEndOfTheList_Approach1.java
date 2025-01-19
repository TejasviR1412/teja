public class Q19_RemoveNthNodeFromEndOfTheList_Approach1 {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.display(sl1.head);

        Q19_RemoveNthNodeFromEndOfTheList_Approach1 q19 = new  Q19_RemoveNthNodeFromEndOfTheList_Approach1();
        SinglyLinkedList.ListNode node = q19.removeNthFromEnd(sl1.head,5);
        sl1.display(sl1.head);
    }

    /**
     * Step1 : Get the Linked List Length
     */
    private int getLinkedListLength(SinglyLinkedList.ListNode head){
        int length = 0;

        SinglyLinkedList.ListNode node = head;

        while(node!=null){
            length++;
            node = node.next;
        }

        return length;
    }

    /**
     * Step2 : Find the node before 'n'
     */
    private SinglyLinkedList.ListNode findNode(SinglyLinkedList.ListNode head , int n){
        SinglyLinkedList.ListNode node = head;

        for(int i=0; i<n ;i++){
            node = node.next;
        }

        return node;
    }

    public SinglyLinkedList.ListNode removeNthFromEnd(SinglyLinkedList.ListNode head, int n) {
        if(head == null)
            return head;

        int previous_node_index = getLinkedListLength(head) - n;

        if(previous_node_index == 0){
            head = head.next;
            return head;
        }

        /**
        * Step3 : Change the next node
        * */
        SinglyLinkedList.ListNode node = findNode(head , previous_node_index-1);
        node.next = node.next.next;

        return head;
    }
}
