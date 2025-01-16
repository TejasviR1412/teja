import java.util.Arrays;

public class Q14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;

        while(i<strs[0].length() && i<strs[strs.length - 1].length()){
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
                i++;
            else
                break;
        }

        return strs[0].substring(0,i);
    }
}