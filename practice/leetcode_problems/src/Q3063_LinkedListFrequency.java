import java.util.HashMap;

public class Q3063_LinkedListFrequency {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(3);
        sl1.display(sl1.head);

        Q3063_LinkedListFrequency q3063 = new Q3063_LinkedListFrequency();
        SinglyLinkedList.ListNode node = q3063.frequenciesOfElements(sl1.head);
        sl1.display(node);
    }

    public SinglyLinkedList.ListNode frequenciesOfElements(SinglyLinkedList.ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();

        while(head != null){
            map.put(head.val,map.getOrDefault(head.val,0)+1);
            head = head.next;
        }

        SinglyLinkedList.ListNode currentNode = new SinglyLinkedList.ListNode();
        SinglyLinkedList.ListNode count = currentNode;

        for(int a : map.values()){
            count.next = new SinglyLinkedList.ListNode(a);
            count = count.next;
        }

        return currentNode.next;
    }
}
