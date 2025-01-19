public class Q61_RotateList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(5);
        sl1.display(sl1.head);

        Q61_RotateList q61RotateList = new Q61_RotateList();
        SinglyLinkedList.ListNode node = q61RotateList.rotateRight(sl1.head,2);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode rotateRight(SinglyLinkedList.ListNode head, int k) {
        if(k<=0 || head == null || head.next == null)
            return head;

        /**
         * Step 1: find the last node of the linked list
         */
        SinglyLinkedList.ListNode tail = head;
        int length = 1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        /**
         * Step 2: Point the next of the tail to the original head
         */
        tail.next = head;

        /**
         * Step 3: Get the number of rotations
         * Example : 2->0->1 , k=4
         *
         * a. rotation 1: 1->2->0
         * b. rotation 2: 0->1->2
         * c. rotation 3 : 2->0->1
         * d. rotation 4: 1->2->0
         *
         * the 4th rotation repeats and is same as the first one
         * hence no of rotations can be calculated as mentioned below
         */
        int noOfRotations = k % length;

        /**
         * Step 4: Iterate till (length - noOfRotations) and reach
         * the node before the new head .
         * 4.1 : Make the next of that node as the head
         * 4.2 : make the next of the node as null
         * 4.3 : return the head
         */
        SinglyLinkedList.ListNode newNode = head;
        for(int i=1;i<(length-noOfRotations);i++){
            newNode = newNode.next;
        }

        head = newNode.next;
        newNode.next = null;

        return head;
    }
}
