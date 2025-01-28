import java.util.HashMap;
import java.util.Map;

public class Q1056_ConfusingNumber {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 9;
        int n3 = 89;
        int n4 = 11;

        System.out.println(confusingNumber_usingStringAndStringBuilder(n1));
        System.out.println(confusingNumber_usingStringAndStringBuilder(n2));
        System.out.println(confusingNumber_usingStringAndStringBuilder(n3));
        System.out.println(confusingNumber_usingStringAndStringBuilder(n4));
        System.out.println("*******************");
        System.out.println(confusingNumber_usingRemainderMethod(n1));
        System.out.println(confusingNumber_usingRemainderMethod(n2));
        System.out.println(confusingNumber_usingRemainderMethod(n3));
        System.out.println(confusingNumber_usingRemainderMethod(n4));
    }

    public static boolean confusingNumber_usingStringAndStringBuilder(int n) {
        Map<Character,Character> invertMap = new HashMap<>(){{
            put('0','0');
            put('1','1');
            put('6','9');
            put('8','8');
            put('9','6');
        }};

        StringBuilder sb = new StringBuilder();

        for(char digit : String.valueOf(n).toCharArray()){
            if(!invertMap.containsKey(digit)){
                return false;
            }

            sb.append(invertMap.get(digit));
        }

        sb.reverse();

        return Integer.parseInt(sb.toString()) != n;
    }

    public static boolean confusingNumber_usingRemainderMethod(int n) {
        Map<Integer,Integer> invertMap = new HashMap<>(){{
            put(0,0);
            put(1,1);
            put(6,9);
            put(8,8);
            put(9,6);
        }};

        int temp = n;
        int rotatedNumber = 0;

        while(temp >0){
            if(!invertMap.containsKey(temp%10)){
                return false;
            }

            rotatedNumber = rotatedNumber*10 + invertMap.get(temp%10);
            temp /=10;
        }

        return rotatedNumber!=n;
    }
}