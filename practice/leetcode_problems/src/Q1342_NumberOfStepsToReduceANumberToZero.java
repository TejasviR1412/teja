public class Q1342_NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 8;
        int num3 = 123;

        System.out.println(numberOfSteps(num1));
        System.out.println(numberOfSteps(num2));
        System.out.println(numberOfSteps(num3));
    }

    public static int numberOfSteps(int num) {
        int count = 0;

        while(num != 0){
            if(num %2 == 0)
                num /= 2;
            else
                num -=1;

            count++;
        }
        return count;
    }
}
