public class Q541_ReverseString_II {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        int k1 = 2;

        String s2 = "abcd";
        int k2 = 2;

        System.out.println(reverseStr(s1,k1));
        System.out.println(reverseStr(s2,k2));
    }

    public static String reverseStr(String s, int k) {
        char[] c = s.toCharArray();

        for(int start = 0 ; start < s.length() ;start += 2*k){
            int i = start;
            int j = Math.min(start+k-1 , s.length()-1);

            while(i < j){
                char temp = c[i];
                c[i++] = c[j];
                c[j--] = temp;
            }
       }

        return new String(c);
    }
}
