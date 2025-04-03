import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q485_MaxConsecutiveOnesTest {
    private Q485_MaxConsecutiveOnes q485;

    @Before
    public void setup(){
        q485 = new Q485_MaxConsecutiveOnes();
    }

    @Test
    public void validate_findMaxConsecutiveOnes_case1(){
        int[] nums = {1,1,0,1,1,1};

        int actual = q485.findMaxConsecutiveOnes(nums);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_findMaxConsecutiveOnes_case2(){
        int[] nums = {1,0,1,1,0,1};

        int actual = q485.findMaxConsecutiveOnes(nums);

        int expected = 2;

        assertEquals(expected, actual);
    }
}