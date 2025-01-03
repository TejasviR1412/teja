public class Q1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts1 = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        int[][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(accounts1));
        System.out.println(maximumWealth(accounts2));
        System.out.println(maximumWealth(accounts3));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxCustomerWealth = Integer.MIN_VALUE;

        for(int[] customerData : accounts){
            maxCustomerWealth = Math.max(maxCustomerWealth,calculateCustomerWealth(customerData));
        }

        return maxCustomerWealth;
    }

    private static int calculateCustomerWealth(int[] account){
        int wealth = 0;

        for(int amount : account){
            wealth += amount;
        }

        return wealth;
    }
}
