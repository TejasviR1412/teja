public class Q509_FibonacciNumber {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;
        int n4 = 30;

        System.out.println(fib(n1));
        System.out.println(fib(n2));
        System.out.println(fib(n3));
        System.out.println(fib(n4));
    }

    public static int fib(int n) {
        if(n < 2)
            return n;

        return fib(n -2) + fib (n-1);
    }
}
