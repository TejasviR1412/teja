import java.util.Arrays;

public class Q1732_FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain1 = {-5,1,5,0,-7};
        int[] gain2 = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain1));
        System.out.println(largestAltitude(gain2));
    }

    public static int largestAltitude(int[] gain) {
        int highestAltitude = Math.max(0,gain[0]);
        int sum;
        int j;
        //int[] altitudes = new int[gain.length+1];
       // altitudes[0] = 0;
      //  altitudes[1] = gain[0];

        for(int i=1;i<= gain.length;i++){
            j= 0;
            sum = 0;
            while(j < i){
                sum += gain[j];
                j++;
            }
          //  altitudes[i] = sum;
            highestAltitude = Math.max(sum , highestAltitude);
        }

       // System.out.println(Arrays.toString(altitudes));
        return highestAltitude;

    }
}