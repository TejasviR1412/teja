import java.util.HashSet;

/**
 * Question : Remove Duplicates from an unsorted list.
 * Example : 1->2->1->4->3->4->1
 * Output should be : 1->2->4->3->1
 */

public class RemoveDuplicatesFromUnsortedLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(1);
        sl1.insert(4);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(1);
        sl1.display(sl1.head);

        RemoveDuplicatesFromUnsortedLinkedList r = new RemoveDuplicatesFromUnsortedLinkedList();
        SinglyLinkedList.ListNode node1 = r.deleteDuplicates_UsingExtraSpace(sl1.head);
        sl1.display(node1);

        SinglyLinkedList.ListNode node2 = r.deleteDuplicates_WithoutUsingExtraSpace(sl1.head);
        sl1.display(node2);
    }

    /**
     * Time Complexity = O(N)
     * Space Complexity = O(N)
     */
    public SinglyLinkedList.ListNode deleteDuplicates_UsingExtraSpace(SinglyLinkedList.ListNode head) {
        SinglyLinkedList.ListNode previous = head;
        SinglyLinkedList.ListNode node = head;
        HashSet<Integer> set = new HashSet<>();

        while(node != null){
            if(set.contains(node.val)){
                previous.next = node.next;
            }else{
                set.add(node.val);
                previous = node;
            }
            node = node.next;
        }

        return head;
    }

    /**
     * Time Complexity = O(N^2)
     * Space Complexity = O(1)
     */
    public SinglyLinkedList.ListNode deleteDuplicates_WithoutUsingExtraSpace(SinglyLinkedList.ListNode head) {
        SinglyLinkedList.ListNode current = head;

        while(current != null){
            SinglyLinkedList.ListNode runner = current;

            while(runner.next != null){
                if(runner.next.val == current.val){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }
}
