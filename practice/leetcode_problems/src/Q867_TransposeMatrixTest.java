import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q867_TransposeMatrixTest {
    private Q867_TransposeMatrix q867;

    @Before
    public void setup(){
        q867 = new Q867_TransposeMatrix();
    }

    @Test
    public void validate_transpose_case1(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] actual = q867.transpose(matrix);

        int[][] expected = {{1,4,7},{2,5,8},{3,6,9}};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_transpose_case2(){
        int[][] matrix = {{1,2,3},{4,5,6}};

        int[][] actual = q867.transpose(matrix);

        int[][] expected = {{1,4},{2,5},{3,6}};

        assertArrayEquals(expected,actual);
    }
}