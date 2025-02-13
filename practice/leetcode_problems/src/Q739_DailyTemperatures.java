import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q739_DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures1 = {73,74,75,71,69,72,76,73};

        int[] temperatures2 = {30,40,50,60};

        int[] temperatures3 = {30,60,90};

        System.out.println(Arrays.toString(dailyTemperatures_Approach1(temperatures1)));
        System.out.println(Arrays.toString(dailyTemperatures_Approach1(temperatures2)));
        System.out.println(Arrays.toString(dailyTemperatures_Approach1(temperatures3)));
        System.out.println("***************************************************************");
        System.out.println(Arrays.toString(dailyTemperatures_Approach2(temperatures1)));
        System.out.println(Arrays.toString(dailyTemperatures_Approach2(temperatures2)));
        System.out.println(Arrays.toString(dailyTemperatures_Approach2(temperatures3)));
    }


    /**
     * Brute force approach - will lead to TLE Error due to the following constraints
     * 1 <= temperatures.length <= 10^5
     *
     * Time complexity : O(N^2)
     * Space complexity : O(1)
     */
    public static int[] dailyTemperatures_Approach1(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i=0;i<temperatures.length-1;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Using a stack
     * Time Complexity : O(N)
     * Space Complexity : O(N)
     */
    public static int[] dailyTemperatures_Approach2(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int currentTemp, previousDay;
        Deque<Integer> tempDeque = new ArrayDeque<>();

        for(int i=0;i<temperatures.length;i++){
            currentTemp = temperatures[i];

            while(!tempDeque.isEmpty() && temperatures[tempDeque.peek()] < currentTemp){
                previousDay = tempDeque.pop();
                result[previousDay] = i - previousDay;
            }

            tempDeque.push(i);
        }

        return result;
    }
}