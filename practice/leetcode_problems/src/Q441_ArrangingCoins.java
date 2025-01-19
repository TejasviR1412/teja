public class Q441_ArrangingCoins {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;
        int n3 = 10;

       // System.out.println(arrangeCoins(n1));
       // System.out.println(arrangeCoins(n2));
        System.out.println(arrangeCoins(n3));
    }

    public static int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        long mid;
        long noOfRows;

        while(left <= right){
            mid = left + (right - left)/2;
            noOfRows = mid * (mid + 1)/2;

            if(noOfRows == n)
                return (int) mid;
            else if(noOfRows > n){
                right = mid - 1;
            }else
                left = mid + 1;
        }

        return (int) right;
    }
}
