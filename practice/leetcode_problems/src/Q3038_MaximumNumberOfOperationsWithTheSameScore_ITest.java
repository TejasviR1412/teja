import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3038_MaximumNumberOfOperationsWithTheSameScore_ITest {
    private Q3038_MaximumNumberOfOperationsWithTheSameScore_I q3038;

    @Before
    public void setup(){
        q3038 = new Q3038_MaximumNumberOfOperationsWithTheSameScore_I();
    }

    @Test
    public void validate_maxOperations_case1(){
        int[] nums = {3,2,1,4,5};

        int actual = q3038.maxOperations(nums);

        int expected = 2;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_maxOperations_case2(){
        int[] nums = {1,5,3,3,4,1,3,2,2,3};

        int actual = q3038.maxOperations(nums);

        int expected = 2;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_maxOperations_case3(){
        int[] nums = {5,3};

        int actual = q3038.maxOperations(nums);

        int expected = 1;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_maxOperations_case4(){
        int[] nums = {1,5,3,3,4,2,3,3,3,3};

        int actual = q3038.maxOperations(nums);

        int expected = 5;

        assertEquals(expected , actual);
    }
}