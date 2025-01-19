public class Q3294_ConvertDoublyLinkedListToArray_II {
    public static void main(String[] args) {
        DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.insert(1);
        dl1.insert(2);
        dl1.insert(3);
        dl1.insert(4);
        dl1.insert(5);
        dl1.display(dl1.head);

        Q3294_ConvertDoublyLinkedListToArray_II q3294 =
                new Q3294_ConvertDoublyLinkedListToArray_II();



    }

    public int[] toArray(DoublyLinkedList.Node node) {
        if(node == null)
            return new int[] {};

        DoublyLinkedList.Node headNode = findHeadNode(node);
        DoublyLinkedList.Node temp = headNode;
        int length = 0;

        while(temp!= null){
            length++;
            temp = temp.next;
        }

        int[] array = new int[length];

        for(int i=0;i<length && headNode!=null;i++){
            array[i] = headNode.val;
            headNode = headNode.next;
        }

        return array;
    }

    /*
    * Function to find the head node
    * */
    private DoublyLinkedList.Node findHeadNode(DoublyLinkedList.Node node){
        if(node.prev == null)
            return node;

        while(node.prev!=null){
            node = node.prev;
        }

        return node;
    }
}
