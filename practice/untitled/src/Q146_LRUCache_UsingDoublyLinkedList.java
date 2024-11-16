import java.util.HashMap;
import java.util.Map;

public class Q146_LRUCache_UsingDoublyLinkedList {
    /**
     * Intuition
     * We need a way to store data in an ordered manner
     * such that elements can be removed from any position in constant time.

     * A linked list is a great candidate for this task.
     * Removing from arbitrary positions is one of the few things
     * that a linked list does better than an array.

     * Let's say you have a linked list A -> B -> C -> D -> E.
     * We can remove the C from the list by performing B.next = D.
     * As C is no longer reachable, it is effectively "removed" from the list.
     * If you were to traverse from the head (A), you would visit nodes A, B, D, E.
     * This operation is done in constant time, no matter how large the list is.

     * To remove C from the list, we needed a reference to the node before it B,
     * so that we could change B.next.
     * In general, if we want to remove a node from the list,
     * we need a pointer to the node before it.
     * Because of this, we shall use a doubly linked list.
     * That way, when we want to remove a node, we have a prev pointer to reference
     * the node before it.
     */
    private class ListNode{
        int key;
        int val;
        ListNode next;
        ListNode previous;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     *As each node represents an element in the data structure,
     * we can also store the key-value pair in each node.

     * Let's think about how we can implement the data structure again.
     * We need to achieve the following functionality:

     * 1. Store a key-value pair
     * 2. Update a key-value pair

     * 3.Given a key, determine if it exists in the data structure.
     * If it does, return the value. If it doesn't, return -1.

     * 4. When a new key-value pair is added, create a new linked list node
     * and put it at the back.

     * 5. When an existing key is updated or fetched,
     * find its associated linked list node. Move it to the back.

     * 6. When a new key-value pair is added and the size of the data structure exceeds
     * capacity, remove the linked list node at the front.

     * Tasks 1, 2, and 3 can all easily be achieved using a standard built-in hash map.

     * In tasks 4 and 5, we need to add nodes to the back of the linked list.
     * Because we are aiming for an O(1) time complexity,
     * we must keep a reference to the tail of our linked list.

     * In task 6, we need to remove from the front of the linked list.
     * This means we must also keep a reference to the head.
     */

    /**
     * Edge Cases:

     * What happens if the linked list is empty?
     * Imagine that the linked list is empty and we call put to create a new key-value pair.
     * We create a node for this key-value pair, then we need to set it as both the head and tail
     * (since it's the only node).

     * What if capacity = 1 and we call put again with a new key?
     * You can imagine the headache that might ensue -
     * we need to delete the only existing node,
     * which means we are deleting both the head and tail.
     * Then we need to add the new node, but since the linked list is empty again,
     * we will be setting the new node as the head and tail again.

     * The cleanest way to handle the empty list case is by using sentinel nodes.

     * We will have our head and tail attributes both set to dummy nodes.
     * The "real" head will be head.next
     * and the "real" tail will be tail.prev.
     * These dummy nodes sit just "outside" of our linked list.
     * What is the purpose? We never want head or tail to be null.
     */

    private ListNode head;
    private ListNode tail;
    private int capacity;
    private Map<Integer, ListNode> dictionary;

    public Q146_LRUCache_UsingDoublyLinkedList(int capacity) {
        this.capacity = capacity;
        dictionary = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.previous = head;
    }

    /**
     *
     * @param node
     *
     * We need to add a node to the end of the LinkedList
     * whenever we add a new key or update an existing one.
     * Below helper method will do that
     */
    public void add(ListNode node){
        ListNode previousEnd = tail.previous;
        previousEnd.next = node;
        node.previous = previousEnd;
        node.next = tail;
        tail.previous = node;
    }

    /**
     *
     * @param node
     *
     * We need to perform removals when we update/fetch an existing key,
     * or when the data structure exceeds capacity
     * Below helper method will do that
     */
    public void remove(ListNode node){
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    public int get(int key) {
        if(!dictionary.containsKey(key)){
            return -1;
        }

        ListNode node = dictionary.get(key);
        remove(node); // remove that node
        add(node); // add it to the end of the List

        return node.val;
    }

    public void put(int key, int value) {
        if(dictionary.containsKey(key)){
            ListNode oldNode = dictionary.get(key);
            remove(oldNode);
        }

        ListNode node = new ListNode(key,value);
        dictionary.put(key,node);
        add(node);

        if(dictionary.size() > capacity){
            ListNode nodeToDelete = head.next;
            remove(nodeToDelete);
            dictionary.remove(nodeToDelete.key);
        }
    }
}
