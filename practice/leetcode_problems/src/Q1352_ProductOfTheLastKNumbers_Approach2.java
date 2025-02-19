import java.util.ArrayList;
import java.util.List;

public class Q1352_ProductOfTheLastKNumbers_Approach2 {
    private List<Integer> prefixProduct;
    private int size;

    public Q1352_ProductOfTheLastKNumbers_Approach2() {
        this.prefixProduct = new ArrayList<>();
        this.prefixProduct.add(1);

        this.size = 0;
    }

    public void add(int num) {
        if(num == 0){
            this.prefixProduct = new ArrayList<>();
            this.prefixProduct.add(1);

            this.size = 0;
        }else{
            this.prefixProduct.add(this.prefixProduct.get(this.size)*num);
            this.size++;
        }
    }

    public int getProduct(int k) {
        if(k > this.size)
            return 0;

        return (this.prefixProduct.get(this.size)/this.prefixProduct.get(this.size-k));
    }

    public static void main(String[] args) {
        Q1352_ProductOfTheLastKNumbers_Approach2 productOfNumbers = new Q1352_ProductOfTheLastKNumbers_Approach2();
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
