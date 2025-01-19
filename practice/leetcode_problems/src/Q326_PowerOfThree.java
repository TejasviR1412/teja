public class Q326_PowerOfThree {
    public static void main(String[] args) {
        int n1 = -27;
        int n2 = 0;
        int n3 = -1;

        System.out.println(isPowerOfThree(n1));
        System.out.println(isPowerOfThree(n2));
        System.out.println(isPowerOfThree(n3));
    }

    public static boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;

        if(n == 1)
           return true;

       return n%3 == 0?isPowerOfThree(n/3):false;
    }
}
