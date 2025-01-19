import java.util.Arrays;

public class Q3263_ConvertDoublyLinkedListToArray_I {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(3);
        sl1.insert(4);
        sl1.insert(3);
        sl1.insert(2);
        sl1.insert(1);
        sl1.display(sl1.head);

        Q3263_ConvertDoublyLinkedListToArray_I q3263 = new Q3263_ConvertDoublyLinkedListToArray_I();
        System.out.println(Arrays.toString(q3263.toArray(sl1.head)));
    }

    public int[] toArray(SinglyLinkedList.ListNode head) {
        if(head == null)
            return new int[]{};

        SinglyLinkedList.ListNode node = head;
        int length = 0;

        while(node != null){
            length++;
            node = node.next;
        }

        int[] array = new int[length];
        node = head;

        for(int i=0;i<length && node != null;i++){
            array[i] = node.val;
            node = node.next;
        }

        return array;
    }
}