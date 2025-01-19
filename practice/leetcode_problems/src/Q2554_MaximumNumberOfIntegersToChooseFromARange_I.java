import java.util.Arrays;
import java.util.HashSet;

public class Q2554_MaximumNumberOfIntegersToChooseFromARange_I {
    public static void main(String[] args) {
        int[] banned1 = {1,6,5};
        int n1 = 5;
        int maxSum1 = 6;

        int[] banned2 = {1,2,3,4,5,6,7};
        int n2 = 8;
        int maxSum2 = 1;

        int[] banned3 = {11};
        int n3 = 7;
        int maxSum3 = 50;

        System.out.println(maxCount_UsingBinarySearch(banned1,n1,maxSum1));
        System.out.println(maxCount_UsingBinarySearch(banned2,n2,maxSum2));
        System.out.println(maxCount_UsingBinarySearch(banned3,n3,maxSum3));
        System.out.println("*********************************************");
        System.out.println(maxCount_UsingHashSet(banned1,n1,maxSum1));
        System.out.println(maxCount_UsingHashSet(banned2,n2,maxSum2));
        System.out.println(maxCount_UsingHashSet(banned3,n3,maxSum3));
    }

    public static int maxCount_UsingBinarySearch(int[] banned, int n, int maxSum) {
        int count = 0;

        Arrays.sort(banned);

        for(int i=1; i<=n ; i++){

            if(binarySearch(banned , i))
                continue;

            maxSum -= i;

            if(maxSum <0)
                break;

            count++;
        }
        return count;
    }

    private static boolean binarySearch(int[] array , int num){
        int left = 0;
        int right = array.length-1;
        int mid;

        while(left <= right){
            mid = left + (right - left)/2;

            if(array[mid] == num)
                return true;

            if(array[mid] > num){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }

        return false;
    }

    public static int maxCount_UsingHashSet(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : banned)
            set.add(num);

        int total = 0 ;
        int count =0;

        for(int i=1 ;i<=n ; i++){
            if(!set.contains(i)){
                total += i;

                if(total <= maxSum)
                    count++;
                else
                    break;
            }
        }

        return count;
    }
}