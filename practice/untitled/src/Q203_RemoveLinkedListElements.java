public class Q203_RemoveLinkedListElements {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

  //  private ListNode head;

    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = new ListNode(-1);
        previous.next = head;

        ListNode currentNode = previous;

        while(currentNode.next != null){
            if(currentNode.next.val == val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }

        return previous.next;
    }

    public ListNode removeElements_UsingRecursion(ListNode head, int val) {
        if(head == null)
            return null;

        head.next = removeElements_UsingRecursion(head.next,val);

        if(head.val == val)
            return head.next;
        else return head;
    }

}
