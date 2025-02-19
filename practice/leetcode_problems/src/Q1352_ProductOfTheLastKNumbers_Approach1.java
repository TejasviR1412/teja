import java.util.ArrayList;
import java.util.List;

public class Q1352_ProductOfTheLastKNumbers_Approach1 {
    private final List<Integer> listOfIntegers;

    public Q1352_ProductOfTheLastKNumbers_Approach1() {
        listOfIntegers = new ArrayList<>();
    }

    public void add(int num) {
        listOfIntegers.add(num);
    }

    public int getProduct(int k) {
        int product = 1;
        int i = listOfIntegers.size()-1;

        while(k-->0){
            product *= listOfIntegers.get(i);
            i--;
        }
        return product;
    }

    public static void main(String[] args) {
        Q1352_ProductOfTheLastKNumbers_Approach1 productOfNumbers = new Q1352_ProductOfTheLastKNumbers_Approach1();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        System.out.println(productOfNumbers.getProduct(2));
        System.out.println(productOfNumbers.getProduct(3));
        System.out.println(productOfNumbers.getProduct(4));
        productOfNumbers.add(8);
        System.out.println(productOfNumbers.getProduct(2));
    }
}
