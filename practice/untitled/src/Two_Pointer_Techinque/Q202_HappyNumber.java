package Two_Pointer_Techinque;

public class Q202_HappyNumber {
    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 2;

        System.out.println(isHappy(n1));
        System.out.println(isHappy(n2));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = getSquareOfSumOfDigits(slow);
            fast = getSquareOfSumOfDigits(getSquareOfSumOfDigits(fast));
        }while(slow != fast);

        if(slow == 1)
            return true;

        return false;
    }

    private static int getSquareOfSumOfDigits(int n){
        int sum = 0;

        while(n!=0){
            sum += Math.pow((n%10) , 2);
            n /= 10;
        }

        return sum;
    }
}
