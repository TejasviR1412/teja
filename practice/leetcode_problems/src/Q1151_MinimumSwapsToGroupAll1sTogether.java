import java.util.Arrays;
import java.util.Map;

public class Q1151_MinimumSwapsToGroupAll1sTogether {
    public static void main(String[] args) {
        int[] data1 = {1,0,1,0,1};
        int[] data2 = {0,0,0,1,0};
        int[] data3 = {1,0,1,0,1,0,0,1,1,0,1};

        System.out.println(minSwaps(data1));
        System.out.println(minSwaps(data2));
        System.out.println(minSwaps(data3));
    }

    public static int minSwaps(int[] data) {
        int ones = Arrays.stream(data).sum();
        int countOne = 0;
        int maxOne = 0;
        int left = 0;
        int right = 0;

        while(right < data.length){
            countOne += data[right++];

            if(right - left > ones){
                countOne -= data[left++];
            }

            maxOne = Math.max(maxOne,countOne);
        }

        return ones - maxOne;
    }
}