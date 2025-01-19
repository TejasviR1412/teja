import java.util.HashMap;
import java.util.Map;

public class Q246_StrobogrammaticNumber {
    public static void main(String[] args) {
        String num1 = "69";
        String num2 = "88";
        String num3 = "962";

        System.out.println(isStrobogrammatic(num1));
        System.out.println(isStrobogrammatic(num2));
        System.out.println(isStrobogrammatic(num3));
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character,Character> strobogrammaticMapping = new HashMap<>();
        strobogrammaticMapping.put('0','0');
        strobogrammaticMapping.put('1','1');
        strobogrammaticMapping.put('6','9');
        strobogrammaticMapping.put('9','6');
        strobogrammaticMapping.put('8','8');

        int left = 0;
        int right = num.length()-1;

        while(left <= right){
            if(!strobogrammaticMapping.containsKey(num.charAt(left)))
                return false;

            if(strobogrammaticMapping.get(num.charAt(left)) != num.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}