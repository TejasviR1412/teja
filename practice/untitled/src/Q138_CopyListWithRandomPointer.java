import java.util.HashMap;

public class Q138_CopyListWithRandomPointer {
    private class Node{
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }

    }

    /**
     * create a hashmap to hold old nodes as keys
     * and new nodes as it's values
     */
    HashMap<Node,Node> visitedHashMap = new HashMap<>();

    public Node copyRandomList(Node head) {
        if(head == null)
            return null;

        /**
         * if we have already processed the current node then we
         * return the cloned version of the node
         */
        if(this.visitedHashMap.containsKey(head))
            return this.visitedHashMap.get(head);

        /**
         * create a new node with the same value as the old node
         * i.e make a clone of the ndoe
         */
        Node node = new Node(head.val);

        /**
         * save this node in the hashmap.
         * this is needed since there might be loops during traversal
         * due to the randomness of the random pointers and this will
         * help us avoid them
         */
        this.visitedHashMap.put(head,node);

        /**
         * recursively copy the remaining linked list starting once from the
         * next pointer and then from the random pointer.
         * we will have 2 recursive calls.
         * finally, update the next and random pointers for the new node created.
         */
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);
        return node;
    }
}
