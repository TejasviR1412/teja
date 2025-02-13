package CodeWars;

public class ConvertNumberToString {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 999;
        int num3 = -100;

        System.out.println(numberToString(num1));
        System.out.println(numberToString(num2));
        System.out.println(numberToString(num3));
    }

    public static String numberToString(int num) {
        String sign ="";
        StringBuilder sb = new StringBuilder();

        if(num == 0)
            return "0";

        if(num < 0){
            sign = "-";
            num *= -1;
        }

        while(num != 0){
            sb.append(num % 10);
            num = num / 10;
        }
        sb.append(sign);

        return sb.reverse().toString();
    }
}
