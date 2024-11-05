package Two_Pointer_Techinque;

import java.util.HashMap;
import java.util.Map;

/*
Complexity Analysis

Time Complexity:

For the add(number) function: O(1),
since it takes a constant time to update an entry in hashtable.

For the find(value) function: O(N),
where N is the total number of unique numbers.
In the worst case, we would iterate through the entire table.

Space Complexity: O(N),
where N is the total number of unique numbers that we will see
during the usage of the data structure.
 */
public class Q170_Design_TwoSum_DataStructure_Approach2_UsingHashTable {
    private HashMap<Integer , Integer> hashMap;

    public Q170_Design_TwoSum_DataStructure_Approach2_UsingHashTable() {
        this.hashMap = new HashMap<>();
    }

    public void add(int number) {
        hashMap.put(number , hashMap.getOrDefault(number,0)+1);
    }

    public boolean find(int value) {
        for(Map.Entry<Integer,Integer> entry : this.hashMap.entrySet()){
            int complement = value - entry.getKey();

            if(complement != entry.getKey()){
                if(this.hashMap.containsKey(complement))
                    return true;
            }else{
                if(entry.getValue() > 1)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Q170_Design_TwoSum_DataStructure_Approach2_UsingHashTable q = new Q170_Design_TwoSum_DataStructure_Approach2_UsingHashTable();
        q.add(1);
        q.add(3);
        q.add(5);
        System.out.println(q.find(4));
        System.out.println(q.find(7));
    }
}