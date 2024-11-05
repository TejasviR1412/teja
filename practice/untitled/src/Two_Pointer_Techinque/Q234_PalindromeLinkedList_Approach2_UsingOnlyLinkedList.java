package Two_Pointer_Techinque;

public class Q234_PalindromeLinkedList_Approach2_UsingOnlyLinkedList {
    private class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;
    private ListNode tail;

    private ListNode findLastNode(){
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        return temp;
    }

    private void insert(int val){
        ListNode node = new ListNode(val);

        if(head == null){
            head = node;
            tail=node;
        }

        tail = findLastNode();

        tail.next = node;
        tail = node;
        node.next = null;
    }

    private void display(){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print("End");
    }

    private ListNode getMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = previous;
            previous = present;
            present = next;

            if(next != null){
                next = next.next;
            }
        }

        return previous;
    }

    public boolean isPalindrome(ListNode head) {
        /*
            Step1 - Get the middle element
         */
        ListNode middleElement = getMiddleNode(head);

        /*
            Step2 - Reverse the LL from the middle to the end
         */
        ListNode reversedHead = reverse(middleElement);

        ListNode reversedSecondHead = reversedHead;

        /*
            Compare
         */
        while(head!= null && reversedHead!= null){
            if(head.val != reversedHead.val)
                break;

            head = head.next;
            reversedHead = reversedHead.next;
        }

        /*
            restore the LL to its original structure
         */
        reverse(reversedSecondHead);

        return head == null || reversedHead == null;
    }

    public static void main(String[] args) {
        Q234_PalindromeLinkedList_Approach2_UsingOnlyLinkedList ll = new Q234_PalindromeLinkedList_Approach2_UsingOnlyLinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(1);
        ll.display();
        System.out.println();
        System.out.println(ll.isPalindrome(ll.head));
    }
}
