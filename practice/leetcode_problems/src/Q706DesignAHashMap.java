/**
 * There are two main issues that we should tackle,
 * in order to design an efficient hashmap data structure:
 * 1). hash function design and
 * 2). collision handling.
 *
 * 1). hash function design: the purpose of hash function is to map a key value to an address in the storage space,
 * similarly to the system that we assign a postcode to each mail address.
 * As one can image, for a good hash function, it should map different keys evenly across the storage space,
 * so that we don't end up with the case that the majority of the keys are concentrated in a few spaces.
 *
 * 2). collision handling: essentially the hash function reduces the vast key space into a limited address space.
 * As a result, there could be the case where two different keys are mapped to the same address, which is what we call 'collision'.
 * Since the collision is inevitable, it is important that we have a strategy to handle the collision.
 *
 * As one of the most intuitive implementations, we could adopt the modulo operator as the hash function, since the key value is of integer type.
 * In addition, in order to minimize the potential collisions, it is advisable to use a prime number as the base of modulo, e.g. 2069.
 *
 * We organize the storage space as an array where each element is indexed with the output value of the hash function.
 *
 * In case of collision, where two different keys are mapped to the same address, we use a bucket to hold all the values.
 * The bucket is a container that hold all the values that are assigned by the hash function.
 * We could use either a LinkedList or an Array to implement the bucket data structure.
 *
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q706DesignAHashMap {
    private int keyRange;
    private List<Bucket> hashTable;

    public Q706DesignAHashMap() {
        this.keyRange = 2069;
        this.hashTable = new ArrayList<>();
        for(int i=0;i<keyRange;i++){
            this.hashTable.add(new Bucket());
        }
    }

    protected int hashKey(int key){
        return (key % this.keyRange);
    }

    public void put(int key, int value) {
        int hash = hashKey(key);
        this.hashTable.get(hash).update(key,value);
    }

    public int get(int key) {
        int hash = hashKey(key);
        return this.hashTable.get(hash).get(key);
    }

    public void remove(int key) {
        int hash = hashKey(key);
        this.hashTable.get(hash).remove(key);
    }

    /*for holding the key-value pair*/
    private class Pair<U,V>{
        public U first;
        public V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    private class Bucket{
        private List<Pair<Integer,Integer>> buckets;

        public Bucket() {
            this.buckets = new LinkedList<Pair<Integer,Integer>>();
        }

        public Integer get(int key){
            for(Pair<Integer,Integer> pair : this.buckets){
                if(pair.first.equals(key))
                    return pair.second;
            }

            return -1;
        }

        public void update(Integer key , Integer value){
            boolean found = false;

            for(Pair<Integer,Integer> pairs : this.buckets){
                if(pairs.first.equals(key)){
                    pairs.second = value;
                    found = true;
                }
            }

            if(!found){
                this.buckets.add(new Pair<Integer,Integer>(key,value));
            }
        }

        public void remove(Integer key){
            for(Pair<Integer,Integer> pair : this.buckets){
                if(pair.first.equals(key)) {
                    this.buckets.remove(pair);
                    break;
                }
            }
        }
    }
}
