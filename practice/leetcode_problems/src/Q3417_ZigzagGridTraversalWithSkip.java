import java.util.ArrayList;
import java.util.List;

public class Q3417_ZigzagGridTraversalWithSkip {
    public static void main(String[] args) {
        int[][] grid1 = {{1, 2}, {3, 4}};
        int[][] grid2 = {{2, 1}, {2, 1}, {2, 1}};
        int[][] grid3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(zigzagTraversal(grid1));
        System.out.println(zigzagTraversal(grid2));
        System.out.println(zigzagTraversal(grid3));
    }

    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            /*
            * for even rows, traverse from 0 till the end of the array
            * for odd rows, traverse from the end of the array to the first element
            *
            * if(i+j)%2 == 0 add it to the list
            * */
            if (i % 2 == 0) {
                for (int j = 0; j < grid[i].length; j++) {
                    if ((i + j) % 2 == 0)
                        result.add(grid[i][j]);
                }
            } else {
                for (int j = grid[i].length - 1; j >= 0; j--) {
                    if ((i + j) % 2 == 0)
                        result.add(grid[i][j]);
                }
            }
        }
        return result;
    }
}