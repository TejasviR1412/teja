public class Q3407_SubstringMatchingPattern {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String p1 = "ee*e";

        String s2 = "car";
        String p2 = "c*v";

        System.out.println(hasMatch(s1,p1));
        System.out.println(hasMatch(s2,p2));
    }

    public static boolean hasMatch(String s, String p) {
        if(p.equals("*"))
            return true;

        String[] parts = p.split("\\*");

        if(s.indexOf(parts[0]) == -1)
            return false;

        String suffix = parts.length>1?parts[1]:"";

        int suffixIndex = s.indexOf(suffix,s.indexOf(parts[0])+parts[0].length());

        return suffixIndex!=-1;
    }
}