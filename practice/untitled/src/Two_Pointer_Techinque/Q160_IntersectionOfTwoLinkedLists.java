package Two_Pointer_Techinque;

import java.util.HashSet;
import java.util.Set;

public class Q160_IntersectionOfTwoLinkedLists {
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

    public static void main(String[] args) {
        Q160_IntersectionOfTwoLinkedLists l1 = new Q160_IntersectionOfTwoLinkedLists();
        l1.insert(4);
        l1.insert(1);
        l1.insert(8);
        l1.insert(4);
        l1.insert(5);
        l1.display();
        System.out.println();
    }

    /* Brute Force Approach
    * Time Complexity = O(N*M)
    * Space Complexity = O(1)
    * */
    public ListNode getIntersectionNode_Approach1(ListNode headA, ListNode headB) {
        ListNode listNodeB;
        while(headA!=null){
            listNodeB = headB;
            while(listNodeB != null){
                if(headA == listNodeB)
                    return headA;

                listNodeB = listNodeB.next;
            }
            headA = headA.next;
        }

        return  null;
    }

    /* Better Approach
    * Time Complexity = O(N+M)
    * Space Complexity = O(1)
    * */
    public ListNode getIntersectionNode_Approach2(ListNode headA, ListNode headB) {
        Set<ListNode> listNodeSet = new HashSet<>();

        ListNode listNodeB = headB;

        while(listNodeB != null){
            listNodeSet.add(listNodeB);
            listNodeB = listNodeB.next;
        }

        while(headA!= null){
            if(listNodeSet.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }
}