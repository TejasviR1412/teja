import java.util.HashMap;
import java.util.Map;

public class Q13_RomanToInteger {
    static Map<String , Integer> mapping = new HashMap<>();

    static {
        mapping.put("M",1000);
        mapping.put("D",500);
        mapping.put("C",100);
        mapping.put("L",50);
        mapping.put("X",10);
        mapping.put("V",5);
        mapping.put("I",1);
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
        System.out.println("****************");
        System.out.println(romanToInt_SwitchCase(s1));
        System.out.println(romanToInt_SwitchCase(s2));
        System.out.println(romanToInt_SwitchCase(s3));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        int currentValue , nextValue;
        String currentSymbol,nextSymbol;

        while(i < s.length()){
            currentSymbol = s.substring(i,i+1);
            currentValue = mapping.get(currentSymbol);
            nextValue = 0;

            if(i+1<s.length()){
                nextSymbol = s.substring(i+1,i+2);
                nextValue = mapping.get(nextSymbol);
            }

            if(currentValue < nextValue){
                sum += (nextValue - currentValue);
                i +=2;
            }else{
                sum += currentValue;
                i +=1;
            }
        }

        return sum;
    }

    public static int romanToInt_SwitchCase(String s) {
        int sum = 0;
        int previous = 0;
        int intValue = 0;

        for(int i=s.length()-1;i>=0;i--){
            intValue = 0;

            switch (s.charAt(i)){
                case 'M' -> intValue = 1000;
                case 'D' -> intValue = 500;
                case 'C' -> intValue = 100;
                case 'L' -> intValue = 50;
                case 'X' -> intValue = 10;
                case 'V' -> intValue = 5;
                case 'I' -> intValue = 1;
            }

            if(4 * intValue < previous){
                sum -= intValue;
            }else{
                sum += intValue;
            }

            previous = intValue;
        }

        return sum;
    }
}