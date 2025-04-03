import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Q54_SpiralMatrixTest {
    private Q54_SpiralMatrix q54;

    @Before
    public void setup(){
        q54 = new Q54_SpiralMatrix();
    }

    @Test
    public void validate_spiralOrder_case1(){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> actual = q54.spiralOrder(mat);

        List<Integer> expected = Arrays.asList(1,2,3,6,9,8,7,4,5);

        assertIterableEquals(expected,actual);
    }

    @Test
    public void validate_spiralOrder_case2(){
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> actual = q54.spiralOrder(mat);

        List<Integer> expected = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);

        assertIterableEquals(expected,actual);
    }
}