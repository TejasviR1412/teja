//https://leetcode.com/problems/diagonal-traverse/solutions/5400228/runtime-beats-98-easily-understand-java-without-boolean-detailed-explanation-with-picture/
public class Q498_DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0)
            return new int[0];

        int x = 0;
        int y = 0;
        int rows = mat.length;
        int columns = mat[0].length;

        int[] result = new int [rows * columns];

        for(int i=0; i< result.length ; i++){
            result[i] = mat[x][y];

            if((x + y)%2 == 0){
                if(y == columns - 1){
                    x++;
                }else if(x == 0){
                    y++;
                }else{
                    x--;
                    y++;
                }
            }else { // (x + y)%2 != 0 --> it is odd
                if(x == rows - 1){
                    y++;
                }else if(y == 0){
                    x++;
                }else{
                    x++;
                    y--;
                }
            }
        }
        return result;
    }
}