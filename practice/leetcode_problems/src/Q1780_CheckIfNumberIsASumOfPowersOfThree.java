public class Q1780_CheckIfNumberIsASumOfPowersOfThree {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 91;
        int n3 = 21;

        System.out.println(checkPowersOfThree(n1));
        System.out.println(checkPowersOfThree(n2));
        System.out.println(checkPowersOfThree(n3));
    }

    public static boolean checkPowersOfThree(int n) {
        while(n > 0){
            /*
            If n % 3 == 2, we would have to use the current power twice, so return false
             */
            if(n % 3 == 2)
                return false;

            n /= 3;
        }

        return true;
    }
}