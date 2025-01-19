public class Q69_SquareRootOfX {
    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;

        System.out.println(mySqrt(x1));
        System.out.println(mySqrt(x2));
    }

    public static int mySqrt(int x) {
        long start = 1;
        long end = x;
        long mid;
        int result = 0;

        while(start <= end){
            mid = start + (end - start)/2;

            if(mid * mid > x){
                end = mid - 1;
            }else if(mid * mid < x){
                start = mid + 1;
                result = (int)mid;
            }else{
                return (int)mid;
            }
        }

        return (int)result;
    }
}