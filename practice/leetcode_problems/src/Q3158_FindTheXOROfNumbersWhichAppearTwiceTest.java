import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3158_FindTheXOROfNumbersWhichAppearTwiceTest {
    private Q3158_FindTheXOROfNumbersWhichAppearTwice q3158;

    @Before
    public void setup(){
        q3158 = new Q3158_FindTheXOROfNumbersWhichAppearTwice();
    }

    @Test
    public void validate_duplicateNumbersXOR_case1(){
        int[] nums = {1,2,1,3};

        int actual = q3158.duplicateNumbersXOR(nums);

        int expected = 1;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_duplicateNumbersXOR_case2(){
        int[] nums = {1,2,3};

        int actual = q3158.duplicateNumbersXOR(nums);

        int expected = 0;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_duplicateNumbersXOR_case3(){
        int[] nums = {1,2,1,2};

        int actual = q3158.duplicateNumbersXOR(nums);

        int expected = 3;

        assertEquals(expected , actual);
    }
}