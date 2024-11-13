public class SinglyLinkedList {
    static class ListNode {
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

    ListNode head;
   // ListNode tail;

    private ListNode findNode(ListNode head){
        ListNode temp = head;

        while(temp.next!= null){
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int val){
        ListNode node = new ListNode(val);

        if(head == null){
            head = node;
            return;
        }

        /*find the last node in the LL*/
        ListNode previous = findNode(head);

        previous.next = node;
        node.next = null;
    }

    public void display(ListNode head){
        ListNode node = head;

        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }

        System.out.print("End\n");
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insert(1);
        sl.insert(2);
        sl.insert(3);
        sl.display(sl.head);
    }
}