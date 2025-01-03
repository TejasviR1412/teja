import java.util.Arrays;
import java.util.Stack;

public class Q1475_FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] prices1 = {8,4,6,2,3};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {10,1,1,6};

        System.out.println(Arrays.toString(finalPrices(prices1)));
        System.out.println(Arrays.toString(finalPrices(prices2)));
        System.out.println(Arrays.toString(finalPrices(prices3)));
    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = prices.clone();

        for(int i=0; i<prices.length;i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                result[stack.pop()] -= prices[i];
            }

            stack.add(i);
        }

        return result;
    }

    public static int[] finalPrices_WithoutStack(int[] prices) {
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }

        return prices;
    }
}