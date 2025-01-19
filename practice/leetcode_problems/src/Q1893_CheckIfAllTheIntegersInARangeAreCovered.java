import java.util.HashSet;
import java.util.Set;

public class Q1893_CheckIfAllTheIntegersInARangeAreCovered {
    static private Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        int[][] ranges1 = {{1,2},{3,4},{5,6}};
        int left1 = 2;
        int right1 = 5;

        int[][] ranges2 = {{1,10},{10,20}};
        int left2 = 21;
        int right2 = 21;

        int[][] ranges3 = {{1,50}};
        int left3 = 1;
        int right3 = 50;

        System.out.println(isCovered(ranges1,left1,right1));
        System.out.println(isCovered(ranges2,left2,right2));
        System.out.println(isCovered(ranges3,left3,right3));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        boolean result = true;

        for(int i=0;i<ranges.length;i++){
            populateHashSet(ranges[i]);
        }

        for(int i=left ; i<=right;i++){
            if(!set.contains(i)){
                result = false;
                break;
            }
        }
        return result;
    }

    private static void populateHashSet(int[] range){
       for(int i=range[0];i<=range[1];i++)
            set.add(i);
    }
}