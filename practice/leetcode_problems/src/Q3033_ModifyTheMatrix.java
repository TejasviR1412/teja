public class Q3033_ModifyTheMatrix {
    public int[][] modifiedMatrix(int[][] matrix) {
        int maxColumnElement;

        for(int i=0;i< matrix[0].length;i++){
            maxColumnElement = 0;
            for(int j=0;j< matrix.length;j++){
                maxColumnElement = Math.max(maxColumnElement,matrix[j][i]);
            }

            for(int j=0;j< matrix.length;j++){
                if(matrix[j][i] == -1)
                    matrix[j][i] = maxColumnElement;
            }
        }

        return matrix;
    }
}