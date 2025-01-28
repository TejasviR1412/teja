public class Q1134_ArmstrongNumber {
    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 153;
        int n3 = 2;

        System.out.println(isArmstrong(n1));
        System.out.println(isArmstrong(n2));
        System.out.println(isArmstrong(n3));
    }

    public static boolean isArmstrong(int n) {
        int digits = 0;
        int sum = 0;
        int temp = n;

        //get the number of digits to find the power
        // example : for 153 , digits will be 3
        // for 2 , digits will be one
        // for 33 , digits will be 2
        while(temp > 0){
            temp = temp /10;
            digits++;
        }

        temp = n;

        while(temp != 0){
            sum += (int) Math.pow((temp%10),digits);
            temp = temp/10;
        }

        return sum == n;
    }
}
