public class Q21_MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(2);
        sl1.insert(4);
        sl1.display(sl1.head);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(1);
        sl2.insert(3);
        sl2.insert(4);
        sl2.display(sl2.head);

        Q21_MergeTwoSortedLinkedList q21 = new Q21_MergeTwoSortedLinkedList();

        SinglyLinkedList.ListNode output = q21.mergeTwoLists(sl1.head,sl2.head);
        sl2.display(output);

    }

    public SinglyLinkedList.ListNode mergeTwoLists(SinglyLinkedList.ListNode list1, SinglyLinkedList.ListNode list2) {
        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        SinglyLinkedList.ListNode mergedList;

        if(list1.val < list2.val){
            mergedList = list1;
            mergedList.next = mergeTwoLists(list1.next,list2);
        }else{
            mergedList=list2;
            mergedList.next = mergeTwoLists(list1,list2.next);
        }

        return mergedList;
    }
}
