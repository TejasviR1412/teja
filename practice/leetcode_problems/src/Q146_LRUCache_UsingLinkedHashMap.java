/**
 * using these data structures sort of defeats the purpose of the problem.
 * It is likely that if you are asked this problem in an interview, the interviewer wants to see you implement the first approach.
 * It is not recommended that you use these data structures without asking the interviewer first.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Q146_LRUCache_UsingLinkedHashMap {
    private int capacity;
    private LinkedHashMap<Integer, Integer> dictionary;

    public Q146_LRUCache_UsingLinkedHashMap(int capacity) {
        this.capacity = capacity;
        dictionary = new LinkedHashMap<Integer,Integer>(1, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<Integer, Integer> eldest
            ) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return dictionary.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        dictionary.put(key, value);
    }
}
