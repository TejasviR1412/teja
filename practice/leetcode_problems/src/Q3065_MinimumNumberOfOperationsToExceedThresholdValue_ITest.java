import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3065_MinimumNumberOfOperationsToExceedThresholdValue_ITest {
    private Q3065_MinimumNumberOfOperationsToExceedThresholdValue_I q3065;

    @Before
    public void setup(){
        q3065 = new Q3065_MinimumNumberOfOperationsToExceedThresholdValue_I();
    }

    @Test
    public void validate_minOperations_case1(){
        int[] nums = {2,11,10,1,3};
        int k = 10;

        int actual = q3065.minOperations(nums,k);

        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_minOperations_case2(){
        int[] nums = {1,1,2,4,9};
        int k = 1;

        int actual = q3065.minOperations(nums,k);

        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_minOperations_case3(){
        int[] nums = {1,1,2,4,9};
        int k = 10;

        int actual = q3065.minOperations(nums,k);

        int expected = 5;

        assertEquals(expected,actual);
    }
}