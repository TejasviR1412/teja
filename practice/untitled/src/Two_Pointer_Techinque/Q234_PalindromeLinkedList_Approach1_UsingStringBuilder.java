package Two_Pointer_Techinque;

public class Q234_PalindromeLinkedList_Approach1_UsingStringBuilder {
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

    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();

        ListNode temp = head;

        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }

        return isPalindrome(sb.toString());
    }

    private boolean isPalindrome(String n){
        int left = 0;
        int right = n.length()-1;

        while(left < right){
            if(n.charAt(left)!= n.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Q234_PalindromeLinkedList_Approach1_UsingStringBuilder ll = new Q234_PalindromeLinkedList_Approach1_UsingStringBuilder();
        ll.insert(1);
        ll.insert(2);
        ll.insert(4);
        ll.insert(1);
        ll.display();
        ll.isPalindrome(ll.head);
        System.out.println(ll.isPalindrome(ll.head));
    }
}
