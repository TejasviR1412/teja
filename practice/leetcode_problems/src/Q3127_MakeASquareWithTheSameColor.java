public class Q3127_MakeASquareWithTheSameColor {
    public boolean canMakeSquare(char[][] grid) {
        int count;

        for(int row=0;row<2;row++){
            for(int column=0;column<2;column++){
                count = 0;

                if(grid[row][column] != grid[row+1][column])
                    count++;

                if(grid[row][column] != grid[row][column+1])
                    count++;

                if(grid[row][column] != grid[row+1][column+1])
                    count++;

                if(count<=1 || count==3)
                    return true;
            }
        }

        return false;
    }
}