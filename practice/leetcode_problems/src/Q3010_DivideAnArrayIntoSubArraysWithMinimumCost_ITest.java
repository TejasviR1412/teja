import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3010_DivideAnArrayIntoSubArraysWithMinimumCost_ITest {
    private Q3010_DivideAnArrayIntoSubArraysWithMinimumCost_I q3010;

    @Before
    public void setup(){
        q3010 = new Q3010_DivideAnArrayIntoSubArraysWithMinimumCost_I();
    }

    @Test
    public void validate_minimumCost_case1(){
        int[] nums = {1,2,3,12};

        int actual = q3010.minimumCost(nums);

        int expected = 6;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_minimumCost_case2(){
        int[] nums = {5,4,3};

        int actual = q3010.minimumCost(nums);

        int expected = 12;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_minimumCost_case3(){
        int[] nums = {10,3,1,1};

        int actual = q3010.minimumCost(nums);

        int expected = 12;

        assertEquals(expected,actual);
    }
}