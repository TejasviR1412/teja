import java.util.Arrays;

public class Q1891_CuttingRibbons {
    public static void main(String[] args) {
        int[] ribbons1 = {9,7,5};
        int k1 = 3;

        int[] ribbons2 = {7,5,9};
        int k2 = 4;

        int[] ribbons3 = {5,7,9};
        int k3 = 22;

        System.out.println(maxLength(ribbons1,k1));
        System.out.println(maxLength(ribbons2,k2));
        System.out.println(maxLength(ribbons3,k3));
    }

    public static int maxLength(int[] ribbons, int k) {
        int left = 0;
        int right = Arrays.stream(ribbons).max().getAsInt();
        int mid;

        while(left < right){
            mid = (left + right + 1) / 2;

            if(isPossible(mid , ribbons , k)){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }

    private static boolean isPossible(int x, int[] ribbons , int k){
        int totalRibbons = 0;

        for(int ribbon : ribbons){
            totalRibbons += ribbon/x;
        }

        if(totalRibbons >= k){
            return true;
        }

        return false;
    }
}