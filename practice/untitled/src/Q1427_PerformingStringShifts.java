import java.util.HashMap;
import java.util.Map;

public class Q1427_PerformingStringShifts {
    public static void main(String[] args) {
        String s1 = "abc";
        int[][] shift1 = {{0,1},{1,2}};

        String s2 = "abcdefg";
        int[][] shift2 = {{1,1},{1,1},{0,2},{1,3}};

        String s3 = "abcdefg";
        int[][] shift3 = {{0,1},{0,1},{1,2},{0,3}};

        String s4 = "yisxjwry";
        int[][] shift4 = {{1,4},
                {1,3},
                {1,6},
                {0,6},
                {1,4},
                {0,2},
                {0,1}};

        System.out.println(stringShift(s1,shift1));
        System.out.println(stringShift(s2,shift2));
        System.out.println(stringShift(s3,shift3));
        System.out.println(stringShift(s4,shift4));
    }

    public static String stringShift(String s, int[][] shift) {
        int shiftAmount =0;
        StringBuilder sb = new StringBuilder(s + s + s);

        for (int[] ints : shift) {
            if (ints[0] == 1) {
                shiftAmount += ints[1];
            } else {
                shiftAmount -= ints[1];
            }
        }

        shiftAmount %= s.length();

        return sb.substring(s.length() - shiftAmount, s.length() - shiftAmount + s.length());
    }
}
