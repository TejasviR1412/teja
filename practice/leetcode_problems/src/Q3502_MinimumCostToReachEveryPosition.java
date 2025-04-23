public class Q3502_MinimumCostToReachEveryPosition {
    public int[] minCosts(int[] cost) {
        for(int i=1;i<cost.length;i++){
            cost[i] = Math.min(cost[i-1],cost[i]);
        }

        return cost;
    }
}