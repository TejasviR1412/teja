import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3074_AppleRedistributionIntoBoxesTest {
    private Q3074_AppleRedistributionIntoBoxes q3074;

    @Before
    public void setup(){
        q3074 = new Q3074_AppleRedistributionIntoBoxes();
    }

    @Test
    public void validate_minimumBoxes_case1(){
        int[] apple = {1,3,2};

        int[] capacity = {4,3,1,5,2};

        int actual = q3074.minimumBoxes(apple,capacity);

        int expected = 2;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_minimumBoxes_case2(){
        int[] apple = {5,5,5};

        int[] capacity = {2,4,2,7};

        int actual = q3074.minimumBoxes(apple,capacity);

        int expected = 4;

        assertEquals(expected,actual);
    }
}