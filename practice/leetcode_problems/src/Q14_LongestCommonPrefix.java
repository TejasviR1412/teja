import java.util.Arrays;

public class Q14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix_horizontalScanning(strs1));
        System.out.println(longestCommonPrefix_horizontalScanning(strs2));
        System.out.println("*************************************************");
        System.out.println(longestCommonPrefix_verticalScanning(strs1));
        System.out.println(longestCommonPrefix_verticalScanning(strs2));
    }

    public static String longestCommonPrefix_horizontalScanning(String[] strs) {
        if(strs.length == 0)
            return "";

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static String longestCommonPrefix_verticalScanning(String[] strs) {
        if(strs.length == 0)
            return "";

        char c;

        for(int i=0;i<strs[0].length();i++){
            c = strs[0].charAt(i);

            for(int j=1;j< strs.length;j++){
                if(i == strs[j].length() ||
                  strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }

    public static String longestCommonPrefix_1(String[] strs) {
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