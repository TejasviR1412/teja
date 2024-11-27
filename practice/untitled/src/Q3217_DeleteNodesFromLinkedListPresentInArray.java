import java.util.HashSet;
import java.util.Set;

public class Q3217_DeleteNodesFromLinkedListPresentInArray {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(1);
        sl1.display(sl1.head);

        int[] nums1 = {3};

        Q3217_DeleteNodesFromLinkedListPresentInArray q3217 = new Q3217_DeleteNodesFromLinkedListPresentInArray();
        SinglyLinkedList.ListNode node = q3217.modifiedList(nums1,sl1.head);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode modifiedList(int[] nums, SinglyLinkedList.ListNode head) {
        Set<Integer> integerSet = new HashSet<>();

        for(int a: nums){
            integerSet.add(a);
        }

        /**
         * Case1 : When the value for head is to be deleted
         */
        while(head != null && integerSet.contains(head.val)){
            head = head.next;
        }

        /**
         * if the list is empty
         * return null
         */
        if(head == null)
            return head;

        /**
         * iterate through the remaining list to remove the elements
         */
        SinglyLinkedList.ListNode currrent = head;

        while(currrent.next!=null){
            if(integerSet.contains(currrent.next.val)){
                currrent.next = currrent.next.next;
            }else{
                currrent = currrent.next;
            }
        }

        return head;
    }
}
