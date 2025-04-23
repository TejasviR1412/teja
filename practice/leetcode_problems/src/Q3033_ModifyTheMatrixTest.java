import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3033_ModifyTheMatrixTest {
    private Q3033_ModifyTheMatrix q3033;

    @Before
    public void setup(){
        q3033 = new Q3033_ModifyTheMatrix();
    }

    @Test
    public void validate_modifiedMatrix_case1(){
        int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};

        int[][] actual = q3033.modifiedMatrix(matrix);

        int[][] expected = {{1,2,9},{4,8,6},{7,8,9}};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_modifiedMatrix_case2(){
        int[][] matrix = {{3,-1},{5,2}};

        int[][] actual = q3033.modifiedMatrix(matrix);

        int[][] expected = {{3,2},{5,2}};

        assertArrayEquals(expected,actual);
    }
}