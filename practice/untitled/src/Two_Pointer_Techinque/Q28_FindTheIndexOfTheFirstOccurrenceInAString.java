package Two_Pointer_Techinque;

public class Q28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack1 = "sadbutnotsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println(strStr(haystack1,needle1));
        System.out.println(strStr(haystack2,needle2));
    }

    public static int strStr_1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int strStr(String haystack, String needle) {
        for(int i=0 , j=needle.length(); j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
