import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3079_FindTheSumOfEncryptedIntegersTest {
    private Q3079_FindTheSumOfEncryptedIntegers q3079;

    @Before
    public void setup(){
        q3079 = new Q3079_FindTheSumOfEncryptedIntegers();
    }

    @Test
    public void validate_sumOfEncryptedInt_case1(){
        int[] nums = {1,2,3};

        int actual = q3079.sumOfEncryptedInt(nums);

        int expected = 6;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_sumOfEncryptedInt_case2(){
        int[] nums = {10,21,31};

        int actual = q3079.sumOfEncryptedInt(nums);

        int expected = 66;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_sumOfEncryptedInt_case3(){
        int[] nums = {109};

        int actual = q3079.sumOfEncryptedInt(nums);

        int expected = 999;

        assertEquals(expected , actual);
    }
}