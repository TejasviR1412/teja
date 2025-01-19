public class Q686_RepeatedStringMatch {
    public static void main(String[] args) {
        String a1 = "abcd";
        String b1 = "cdabcdab";

        String a2 = "a";
        String b2 = "aa";

        System.out.println(repeatedStringMatch(a1,b1));
        System.out.println(repeatedStringMatch(a2,b2));
    }

    public static int repeatedStringMatch(String a, String b) {
        int count = 1;

        StringBuilder sb = new StringBuilder(a);

        for(;sb.length()<b.length();count++){
            sb.append(a);
        }

        if(sb.indexOf(b) >=0)
            return count;

        if(sb.append(a).indexOf(b) >=0)
            return count+1;

        return -1;
    }
}