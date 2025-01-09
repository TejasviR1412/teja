import java.util.Arrays;

public class Q1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        String boxes1 = "110";
        String boxes2 = "001011";

        System.out.println(Arrays.toString(minOperations(boxes1)));
        System.out.println(Arrays.toString(minOperations(boxes2)));
    }

    public static int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];

        for(int currentBox = 0; currentBox<answer.length;currentBox++){
            if(boxes.charAt(currentBox) == '1'){
                for(int newPosition=0; newPosition<answer.length;newPosition++){
                    answer[newPosition] += Math.abs(newPosition - currentBox);
                }
            }
        }
        return answer;
    }
}