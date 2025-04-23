import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3502_MinimumCostToReachEveryPositionTest {
    private Q3502_MinimumCostToReachEveryPosition q3502;

    @Before
    public void setup(){
        q3502 = new Q3502_MinimumCostToReachEveryPosition();
    }

    @Test
    public void validate_minCosts_case1(){
        int[] cost = {5,3,4,1,3,2};

        int[] actual = q3502.minCosts(cost);

        int[] expected = {5,3,3,1,1,1};

        assertArrayEquals(expected , actual);
    }

    @Test
    public void validate_minCosts_case2(){
        int[] cost = {1,2,4,6,7};

        int[] actual = q3502.minCosts(cost);

        int[] expected = {1,1,1,1,1};

        assertArrayEquals(expected , actual);
    }
}