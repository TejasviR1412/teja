import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3142_CheckIfGridSatisfiesConditionsTest {
    Q3142_CheckIfGridSatisfiesConditions q3142;

    @Before
    public void setup(){
        q3142 = new Q3142_CheckIfGridSatisfiesConditions();
    }

    @Test
    public void validate_satisfiesConditions_case1(){
        int[][] grid = {{1,0,2},{1,0,2}};

        boolean actual = q3142.satisfiesConditions(grid);

        boolean expected = true;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_satisfiesConditions_case2(){
        int[][] grid = {{1,1,1},{0,0,0}};

        boolean actual = q3142.satisfiesConditions(grid);

        boolean expected = false;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_satisfiesConditions_case3(){
        int[][] grid = {{1},{2},{3}};

        boolean actual = q3142.satisfiesConditions(grid);

        boolean expected = false;

        assertEquals(expected , actual);
    }
}