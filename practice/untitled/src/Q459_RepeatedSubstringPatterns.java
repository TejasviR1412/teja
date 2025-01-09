public class Q459_RepeatedSubstringPatterns {
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "aba";
        String s3 = "abcabcabcabc";

        System.out.println(repeatedSubstringPattern(s1));
        System.out.println(repeatedSubstringPattern(s2));
        System.out.println(repeatedSubstringPattern(s3));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int stringLength = s.length();

        for(int i=1;i<=stringLength/2;i++){
            if(stringLength % i ==0){
                StringBuilder pattern  = new StringBuilder();

                for(int j=0; j< stringLength/i;j++){
                    pattern.append(s, 0, i);
                }

                if (s.contentEquals(pattern)) {
                    return true;
                }
            }
        }
        return false;
    }
}
