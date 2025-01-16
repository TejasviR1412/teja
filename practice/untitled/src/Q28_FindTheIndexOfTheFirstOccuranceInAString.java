public class Q28_FindTheIndexOfTheFirstOccuranceInAString {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        String haystack3 = "a";
        String needle3 = "a";

        System.out.println(strStr(haystack1,needle1));
        System.out.println(strStr(haystack2,needle2));
        System.out.println(strStr(haystack3,needle3));
        System.out.println("****************");
        System.out.println(strStr_UsingInBuiltFunction(haystack1,needle1));
        System.out.println(strStr_UsingInBuiltFunction(haystack2,needle2));
        System.out.println(strStr_UsingInBuiltFunction(haystack3,needle3));
    }

    public static int strStr(String haystack, String needle) {
        for(int i=0 ,j= needle.length();j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle))
                return i;
        }
        return -1;
    }

    public static int strStr_UsingInBuiltFunction(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
