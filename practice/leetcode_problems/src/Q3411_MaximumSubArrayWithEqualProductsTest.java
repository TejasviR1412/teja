import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q3411_MaximumSubArrayWithEqualProductsTest {
    private Q3411_MaximumSubArrayWithEqualProducts q3411;

    @Before
    public void setup(){
        q3411 = new Q3411_MaximumSubArrayWithEqualProducts();
    }

    @Test
    public void validate_maxLength_case1(){
        int[] nums = {1,2,1,2,1,1,1};

        int actual = q3411.maxLength(nums);

        int expected = 5;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maxLength_case2(){
        int[] nums = {2,3,4,5,6};

        int actual = q3411.maxLength(nums);

        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maxLength_case3(){
        int[] nums = {1,2,3,1,4,5,1};

        int actual = q3411.maxLength(nums);

        int expected = 5;

        assertEquals(expected,actual);
    }
}