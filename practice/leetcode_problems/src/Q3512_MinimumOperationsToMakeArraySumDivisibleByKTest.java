import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3512_MinimumOperationsToMakeArraySumDivisibleByKTest {
    private Q3512_MinimumOperationsToMakeArraySumDivisibleByK q3512;

    @Before
    public void setup(){
        q3512 = new Q3512_MinimumOperationsToMakeArraySumDivisibleByK();
    }

    @Test
    public void validate_minOperations_case1(){
        int[] nums = {3,9,7};

        int k = 5;

        int actual = q3512.minOperations(nums,k);

        int expected = 4;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_minOperations_case2(){
        int[] nums = {4,1,3};

        int k = 4;

        int actual = q3512.minOperations(nums,k);

        int expected = 0;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_minOperations_case3(){
        int[] nums = {3,2};

        int k = 6;

        int actual = q3512.minOperations(nums,k);

        int expected = 5;

        assertEquals(expected , actual);
    }
}