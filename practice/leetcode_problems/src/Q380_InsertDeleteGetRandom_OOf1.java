import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Q380_InsertDeleteGetRandom_OOf1 {
    private ArrayList<Integer> list;
    private HashMap<Integer,Integer> map;
    Random random;

    public static void main(String[] args) {

    }

    public Q380_InsertDeleteGetRandom_OOf1() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;

        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;

        int index = map.get(val);
        list.set(index , list.get(list.size()-1));
        map.put(list.get(index),index);
        list.remove(list.size()-1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
