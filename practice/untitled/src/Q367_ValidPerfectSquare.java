public class Q367_ValidPerfectSquare {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;

        System.out.println(isPerfectSquare(num1));
        System.out.println(isPerfectSquare(num2));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        long mid;

        while(start <= end){
            mid = start + (end - start)/2;

            if(mid * mid == num)
                return true;
            else if(mid * mid > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}