package CodeWars;

import java.util.PriorityQueue;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        String s1 = "1234";
        String s2 = "605";
        String s3 = "1405";
        String s4 = "-7";

        System.out.println(stringToNumber(s1));
        System.out.println(stringToNumber(s2));
        System.out.println(stringToNumber(s3));
        System.out.println(stringToNumber(s4));
    }

    public static int stringToNumber(String str) {
        // return Integer.parseInt(str);

        int result = 0;
        String sign= str.charAt(0) == '-' ? "-" : "";

        if(str.length() == 1)
            return Integer.parseInt(str);

        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)))
                continue;

            result = result * 10 + str.charAt(i) - '0';
        }


        return sign.equals("-")?-1*result:result;
    }
}
