import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q498_DiagonalTraverseTest {
    private Q498_DiagonalTraverse q498;

    @Before
    public void setup(){
        q498 = new Q498_DiagonalTraverse();
    }

    @Test
    public void validate_findDiagonalOrder_case1(){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int[] actual = q498.findDiagonalOrder(mat);

        int[] expected = {1,2,4,7,5,3,6,8,9};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_findDiagonalOrder_case2(){
        int[][] mat = {{1,2},{3,4}};

        int[] actual = q498.findDiagonalOrder(mat);

        int[] expected = {1,2,3,4};

        assertArrayEquals(expected,actual);
    }
}