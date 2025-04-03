import java.math.BigInteger;

public class Q67_AddBinary {
    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";

        String a2 = "1010";
        String b2 = "1011";

        System.out.println(addBinary(a1,b1));
        System.out.println(addBinary(a2,b2));

        System.out.println(addBinary_1(a1,b1));
        System.out.println(addBinary_1(a2,b2));
    }

    public static String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        int n = a.length();
        int m = b.length();
        int j = m-1;

        if(n < m){
            return addBinary(b,a);
        }

        for(int i= n-1;i>-1;i--){
            if(a.charAt(i) == '1')
                ++carry;

            if(j >-1 && b.charAt(j--) == '1')
                ++carry;

            if(carry % 2 == 1){
                answer.append('1');
            }else
                answer.append('0');

            carry /= 2;
        }

        if(carry == 1)
            answer.append('1');

        answer.reverse();
        return answer.toString();
    }

    /*
        Algorithm:
        1. Convert a and b into integers x and y,
            x will be used to keep an answer and y for the carry.

        2.While carry is nonzero: y != 0:
            2.1 Current answer without carry is XOR of x and y: answer = x^y.
            2.2 Current carry is left-shifted AND of x and y: carry = (x & y) << 1.
            2.3 Job is done, prepare the next loop: x = answer, y = carry.

        3. Return x in the binary form.
     */

    public static String addBinary_1(String a, String b) {
        BigInteger x = new BigInteger(a,2);
        BigInteger y = new BigInteger(b,2);
        BigInteger zero = new BigInteger("0",2);

        BigInteger carry , answer;

        while(y.compareTo(zero)!=0){
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }

        return x.toString(2);

    }

    /**
     * Simple way : Use built-in function:
     * Convert a and b into Integers
     * Compute the sum
     * Convert the sum back into binary form
     *
     * Time Complexity : O(n + m)
     */

    /**
     * DRAWBACK :
     * 1. In Java, this approach is limited by the length of the input strings a and b.
     * Once the string is long enough, the result of conversion into integers will not fit into Integer,Long or BigInteger
     *
     * 2.This method has quite low performance in the case of large input numbers.
     */
    public static String addBinary_2(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }
}
