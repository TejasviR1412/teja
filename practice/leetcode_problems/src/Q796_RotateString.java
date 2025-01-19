public class Q796_RotateString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";

        String s3 = "abcde";
        String s4 = "abced";

        System.out.println(rotateString(s1,s2));
        System.out.println(rotateString(s3,s4));

        System.out.println(rotateString_1(s1,s2));
        System.out.println(rotateString_1(s3,s4));
    }

    public static boolean rotateString(String s, String goal) {
        int stringLength = s.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<stringLength;i++){
            sb.delete(0,1);
            sb.append(s.charAt(i));

            if(goal.equals(sb.toString()))
                return true;
        }
        return false;
    }

    public static boolean rotateString_1(String s, String goal) {
        if(goal.length() != s.length())
            return false;

        return (s+s).contains(goal);
    }
}