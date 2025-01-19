public class DoublyLinkedList {
    static class Node {
        public int val;
        public Node prev;
        public Node next;

        public Node(int val){
            this.val = val;
        }
    }

    Node head;

    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            head.prev = null;
            head.next = null;
        }

        Node currentLastNode = findLastNode(head);

        currentLastNode.next = node;
        node.prev = currentLastNode;
        node.next = null;
    }

    private Node findLastNode(Node head){
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        return temp;
    }

    public void display(Node head){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("END\n");
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insert(1);
        dl.insert(2);
        dl.insert(3);
        dl.display(dl.head);
    }
}
