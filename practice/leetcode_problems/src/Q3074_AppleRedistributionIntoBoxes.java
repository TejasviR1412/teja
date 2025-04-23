import java.util.Arrays;

public class Q3074_AppleRedistributionIntoBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalNoOfApples = 0;
        int numberOfBoxes = 0;

        for(int apples : apple)
            totalNoOfApples += apples;

        Arrays.sort(capacity);

        for(int i=capacity.length-1;i>=0;i--){
            numberOfBoxes++;
            totalNoOfApples -= capacity[i];

            if(totalNoOfApples <=0)
                break;
        }

        return numberOfBoxes;
    }
}