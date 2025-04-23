import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3005_CountElementsWithMaximumFrequencyTest {
    private Q3005_CountElementsWithMaximumFrequency q3005;

    @Before
    public void setup(){
        q3005 = new Q3005_CountElementsWithMaximumFrequency();
    }

    @Test
    public void validate_maxFrequencyElements_case1(){
        int[] nums = {1,2,2,3,1,4};

        int actual = q3005.maxFrequencyElements(nums);

        int expected = 4;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_maxFrequencyElements_case2(){
        int[] nums = {1,2,3,4,5};

        int actual = q3005.maxFrequencyElements(nums);

        int expected = 5;

        assertEquals(expected , actual);
    }
}