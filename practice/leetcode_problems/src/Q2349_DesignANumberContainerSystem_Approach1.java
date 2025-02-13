import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Q2349_DesignANumberContainerSystem_Approach1 {
    //maps the number to set of indices
    private Map<Integer, TreeSet<Integer>> numberToIndices;

    //maps the index to the number
    private Map<Integer,Integer> indexToNumbers;

    public Q2349_DesignANumberContainerSystem_Approach1() {
        numberToIndices = new HashMap<>();
        indexToNumbers = new HashMap<>();
    }

    public void change(int index, int number) {
        int previousNumber;

        // if the index already has a number,
        // remove it from the old numver's index set
        if(indexToNumbers.containsKey(index)){
            previousNumber = indexToNumbers.get(index);
            numberToIndices.get(previousNumber).remove(index);

            if(numberToIndices.get(previousNumber).isEmpty()){
                numberToIndices.remove(previousNumber);
            }
        }

        indexToNumbers.put(index,number);
        numberToIndices.putIfAbsent(number,new TreeSet<>());
        numberToIndices.get(number).add(index);
    }

    public int find(int number) {
        if(numberToIndices.containsKey(number)){
            return numberToIndices.get(number).first();
        }

        return -1;
    }

    public static void main(String[] args) {
        Q2349_DesignANumberContainerSystem_Approach1 q2349 = new Q2349_DesignANumberContainerSystem_Approach1();
        System.out.println(q2349.find(10));
        q2349.change(2,10);
        q2349.change(1,10);
        q2349.change(3,10);
        q2349.change(5,10);
        System.out.println(q2349.find(10));
        q2349.change(1,20);
        System.out.println(q2349.find(10));
    }
}