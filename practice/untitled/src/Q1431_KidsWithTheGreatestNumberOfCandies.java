import java.util.ArrayList;
import java.util.List;

public class Q1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies1 = {2,3,5,1,3};
        int extraCandies1 = 3;

        int[] candies2 = {4,2,1,1,2};
        int extraCandies2 = 1;

        System.out.println(kidsWithCandies(candies1,extraCandies1));
        System.out.println(kidsWithCandies(candies2,extraCandies2));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // find the max candies in the candies array
        for(int candy : candies){
            maxCandies = Math.max(maxCandies,candy);
        }

        //populate result
        for(int candy : candies){
            result.add(candy+extraCandies >= maxCandies);
        }

        return result;
    }
}
