/**
 * There are two key questions that one should address,
 * in order to implement the HashSet data structure,
 * namely hash function and collision handling.
 *
 * hash function: the goal of the hash function is to assign
 * an address to store a given value.
 * Ideally, each unique value should have a unique hash value.
 *
 * collision handling: since the nature of a hash function is to map a value
 * from a space A into a corresponding value in a smaller space B,
 * it could happen that multiple values from space A might
 * be mapped to the same value in space B.
 * This is what we call collision.
 * Therefore, it is indispensable for us to have a strategy
 * to handle the collision.
 *
 * Approach : Using LinkedList
 * The common choice of hash function is the modulo operator, i.e. hash=valuemodbase.
 * Here, the base of modulo operation would determine the number of buckets
 * that we would have at the end in the HashSet.
 *
 * Theoretically, the more buckets we have (hence the larger the space would be),
 * the less likely that we would have collisions.
 * The choice of base is a tradeoff between the space and the collision.
 *
 * In addition, it is generally advisable to use a prime number as the base of modulo,
 * e.g. 769, in order to reduce the potential collisions.
 *
 * As to the design of bucket, again there are several options.
 * One could simply use another Array as bucket to store all the values.
 * However, one drawback with the Array data structure is that
 * it would take O(N) time complexity to remove or insert an element,
 * rather than the desired O(1)
 *
 * Since for any update operation, we would need to scan the entire bucket first to avoid any duplicate,
 * a better choice for the implementation of bucket would be the LinkedList,
 * which has a constant time complexity for the insertion as well as deletion,
 * once we locate the position to update.
 */

import java.util.LinkedList;

public class Q705_DesignAHashSet {
    private Bucket[] buckets;
    private final int keyRange;

    public Q705_DesignAHashSet() {
        this.keyRange = 769; // initialize to prime number to avoid collision
        this.buckets = new Bucket[this.keyRange];
        for(int i=0;i<this.keyRange;++i){
            this.buckets[i] = new Bucket();
        }
    }

    protected int hashKey(int key){
        return (key % this.keyRange);
    }

    public void add(int key) {
        int bucketIndex = this.hashKey(key);
        this.buckets[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this.hashKey(key);
        this.buckets[bucketIndex].delete(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.hashKey(key);
        return this.buckets[bucketIndex].exists(key);
    }

    public static void main(String[] args) {
        Q705_DesignAHashSet q705 = new Q705_DesignAHashSet();
        q705.add(1);
        q705.add(2);
        System.out.println(q705.contains(1));
        System.out.println(q705.contains(3));
        q705.add(2);
        System.out.println(q705.contains(2));
        q705.remove(2);
        System.out.println(q705.contains(2));
    }

    private class Bucket{
        private LinkedList<Integer> container;

        public Bucket() {
            this.container = new LinkedList<Integer>();
        }

        public void insert(Integer key){
            int index = this.container.indexOf(key);
            if(index == -1)
                this.container.addFirst(key);
        }

        public void delete(Integer key){
            this.container.remove(key);
        }

        public boolean exists(Integer key){
            int index = this.container.indexOf(key);
            return (index != -1);
        }
    }
}