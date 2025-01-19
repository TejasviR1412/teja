import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q888_FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes1 = {1,1};
        int[] bobSizes1 = {2,2};

        int[] aliceSizes2 = {1,2};
        int[] bobSizes2 = {2,3};

        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1,3};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes1,bobSizes1)));
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes2,bobSizes2)));
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes3,bobSizes3)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumOfCandies_Alice = 0;
        int sumOfCandies_Bob = 0;
        int difference;
        int[] output = {};

        for(int alice : aliceSizes){
            sumOfCandies_Alice += alice;
        }

        for(int bob : bobSizes){
            sumOfCandies_Bob += bob;
        }

        difference = (sumOfCandies_Bob - sumOfCandies_Alice) / 2;

        Set<Integer> bobSet = new HashSet<>();

        for(int bob : bobSizes)
            bobSet.add(bob);

        for(int alice : aliceSizes){
            if(bobSet.contains(alice + difference))
               return new int[] {alice , alice + difference};
        }

        return output;
    }
}