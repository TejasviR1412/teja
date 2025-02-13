package CodeWars;

public class SumArrays {
    public static void main(String[] args) {
        double[] numbers1 = {1, 5.2, 4, 0, -1};
        double[] numbers2 = {};
        double[] numbers3 = {-2.398};

        System.out.println(sum(numbers1));
        System.out.println(sum(numbers2));
        System.out.println(sum(numbers3));
    }

    public static double sum(double[] numbers) {
        if(numbers.length ==0)
            return 0;

        double sum = 0;

        for(double number : numbers){
            sum += number;
        }

        return sum;
    }
}
