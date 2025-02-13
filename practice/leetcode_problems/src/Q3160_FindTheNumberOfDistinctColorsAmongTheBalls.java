import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q3160_FindTheNumberOfDistinctColorsAmongTheBalls {
    public static void main(String[] args) {
        int limit1 = 4;
        int[][] queries1 = {{1,4},{2,5},{1,3},{3,4}};

        int limit2 = 4;
        int[][] queries2 = {{0,1},{1,2},{2,2,},{3,4},{4,5}};

        System.out.println(Arrays.toString(queryResults_Approach1(limit1,queries1)));
        System.out.println(Arrays.toString(queryResults_Approach1(limit2,queries2)));
        System.out.println("********************");
        System.out.println(Arrays.toString(queryResults_Approach2(limit1,queries1)));
        System.out.println(Arrays.toString(queryResults_Approach2(limit2,queries2)));

    }

    public static int[] queryResults_Approach1(int limit, int[][] queries) {
        int length = queries.length;
        int[] result = new int[length];
        int[] ballArray = new int[limit + 1];
        Map<Integer,Integer> colorMap = new HashMap<>();

        int ball, color , previousColor;

        for(int i=0;i<length;i++){
            ball = queries[i][0];
            color = queries[i][1];

            //check if the ball has been already colored
            if(ballArray[ball] !=0){
                previousColor = ballArray[ball];
                colorMap.put(previousColor,colorMap.get(previousColor)-1);

                if(colorMap.get(previousColor) == 0){
                    colorMap.remove(previousColor);
                }
            }

            ballArray[ball] = color;
            colorMap.put(color,colorMap.getOrDefault(color,0)+1);
            result[i] = colorMap.size();
        }
        return result;
    }

    public static int[] queryResults_Approach2(int limit, int[][] queries) {
        int length = queries.length;
        int[] result = new int[length];

        Map<Integer,Integer> colorMap = new HashMap<>();
        Map<Integer,Integer> ballMap = new HashMap<>();

        int ball , color , previousColor;

        for(int i=0;i<length;i++){
            ball = queries[i][0];
            color = queries[i][1];

            if(ballMap.containsKey(ball)){
                previousColor = ballMap.get(ball);
                colorMap.put(previousColor,colorMap.get(previousColor)-1);

                if(colorMap.get(previousColor) ==0){
                    colorMap.remove(previousColor);
                }
            }

            ballMap.put(ball,color);
            colorMap.put(color,colorMap.getOrDefault(color,0)+1);

            result[i] = colorMap.size();
        }
        return result;
    }
}