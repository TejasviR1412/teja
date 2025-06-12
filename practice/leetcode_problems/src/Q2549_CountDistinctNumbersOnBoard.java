public class Q2549_CountDistinctNumbersOnBoard {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        int n3 = 1;

        System.out.println(distinctIntegers(n1));
        System.out.println(distinctIntegers(n2));
        System.out.println(distinctIntegers(n3));
    }

    public static int distinctIntegers(int n) {
        if(n == 1)
            return 1;
        else
            return (n-1);
    }
}