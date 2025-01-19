public class Q008_StringToInteger_ATOI {
    public static void main(String[] args) {
        String s1 = "42";
        String s2 = " -042";
        String s3 = "1337c0d3";
        String s4 = "0-1";
        String s5 = "words and 987";

        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
        System.out.println(myAtoi(s4));
        System.out.println(myAtoi(s5));
    }

    /**
     * 1. Ignore leading whitespaces.
     * 2. Check if the first character is + or - to determine the sign.
     * 3. Read and convert characters until encountering a non-digit or reaching the end.
     * 4. Clamp the value to the 32-bit signed integer range: [-2^31, 2^31 - 1].
     * 5. Return the computed integer.
     */
    public static int myAtoi(String s) {
        s = s.trim();

        if(s.isEmpty())
            return 0;

        double result = 0;
        boolean isNegative = false;
        int i = 0;

        //check if the 1st character is positive or negative
        if(s.charAt(0) == '-'){
            isNegative = true;
            i++;
        }else if(s.charAt(0) == '+'){
            i++;
        }


        for(;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                result = (result * 10) + (s.charAt(i) - '0');
            }else break;
        }

        if(isNegative)
            result = -result;

        //if the result obtained is above or below the range of int
        if(result > Math.pow(2,31) || result < -Math.pow(2,31)){
            if(isNegative){
                result = -Math.pow(2,31);
            }else{
                result = Math.pow(2,31);
            }
        }

        return (int) result;
    }
}