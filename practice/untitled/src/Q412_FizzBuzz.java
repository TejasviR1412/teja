import java.util.ArrayList;
import java.util.List;

public class Q412_FizzBuzz {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        int n3 = 15;

        System.out.println(fizzBuzz(n1));
        System.out.println(fizzBuzz(n2));
        System.out.println(fizzBuzz(n3));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5!=0){
                result.add("Fizz");
            }else if(i%5 == 0 && i%3!=0){
                result.add("Buzz");
            }else if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }else{
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}
