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
}
