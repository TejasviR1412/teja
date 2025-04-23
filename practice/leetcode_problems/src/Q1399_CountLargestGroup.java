import java.util.HashMap;
import java.util.Map;

public class Q1399_CountLargestGroup {
    public int countLargestGroup(int n) {
        int count = 0;
        int maxGroupSize = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        int sumOfDigits;

        for(int i=1;i<=n;i++){
            sumOfDigits = calculateSumOfDigits(i);
            map.put(sumOfDigits,map.getOrDefault(sumOfDigits,0)+1);
            maxGroupSize = Math.max(maxGroupSize,map.get(sumOfDigits));
        }

        for (int num : map.values()){
            if(num == maxGroupSize)
                count++;
        }

        return count;
    }

    private int calculateSumOfDigits(int n){
        int sum = 0;

        while (n != 0){
            sum += n%10;
            n /=10;
        }

        return sum;
    }
}