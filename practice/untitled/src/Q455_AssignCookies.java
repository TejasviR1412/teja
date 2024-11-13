import java.util.Arrays;
import java.util.HashSet;

public class Q455_AssignCookies {
    public static void main(String[] args) {
        int[] g1 = {1,2,3};
        int[] s1 = {1,1};

        int[] g2 = {1,2};
        int[] s2 = {1,2,3};

        System.out.println(findContentChildren(g1,s1));
        System.out.println(findContentChildren(g2,s2));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int noOfContentChildren = 0;

        int cookieIndex = 0;

        while(cookieIndex < s.length && noOfContentChildren < g.length){
            if(s[cookieIndex] >= g[noOfContentChildren]){
                noOfContentChildren++;
            }
            cookieIndex++;
        }
        return noOfContentChildren;
    }
}