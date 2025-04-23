public class Q3000_MaximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDiagonal = 0;

        for(int[] dimension : dimensions){
            double currentDiagonal = Math.sqrt(Math.pow(dimension[0],2) + Math.pow(dimension[1],2));
            int currentArea = dimension[0] * dimension[1];

            if(maxDiagonal < currentDiagonal){
                maxDiagonal = currentDiagonal;
                maxArea = currentArea;
            }else if(currentDiagonal == maxDiagonal){
                maxArea = Math.max(maxArea,currentArea);
            }
        }

        return maxArea;
    }
}