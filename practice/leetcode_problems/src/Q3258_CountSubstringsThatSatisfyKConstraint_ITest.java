import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q3258_CountSubstringsThatSatisfyKConstraint_ITest {
    private Q3258_CountSubstringsThatSatisfyKConstraint_I q3258;

    @Before
    public void setup(){
        q3258 = new Q3258_CountSubstringsThatSatisfyKConstraint_I();
    }

    @Test
    public void validate_countKConstraintSubstrings_case1(){
        String s = "10101";
        int k = 1;

        int actual = q3258.countKConstraintSubstrings(s,k);

        int expected = 12;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_countKConstraintSubstrings_case2(){
        String s = "1010101";
        int k = 2;

        int actual = q3258.countKConstraintSubstrings(s,k);

        int expected = 25;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_countKConstraintSubstrings_case3(){
        String s = "11111";
        int k = 1;

        int actual = q3258.countKConstraintSubstrings(s,k);

        int expected = 15;

        assertEquals(expected,actual);
    }

}