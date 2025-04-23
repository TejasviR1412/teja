import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3483_Unique3DigitNumbersTest {
    private Q3483_Unique3DigitNumbers q3483;

    @Before
    public void setup(){
        q3483 = new Q3483_Unique3DigitNumbers();
    }

    @Test
    public void validate_totalNumbers_case1(){
        int[] digits = {1,2,3,4};

        int actual = q3483.totalNumbers(digits);

        int expected = 12;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_totalNumbers_case2(){
        int[] digits = {0,2,2};

        int actual = q3483.totalNumbers(digits);

        int expected = 2;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_totalNumbers_case3(){
        int[] digits = {6,6,6};

        int actual = q3483.totalNumbers(digits);

        int expected = 1;

        assertEquals(expected , actual);
    }
}