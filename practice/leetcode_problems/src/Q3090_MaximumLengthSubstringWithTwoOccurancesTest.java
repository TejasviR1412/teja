import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q3090_MaximumLengthSubstringWithTwoOccurancesTest {
    private Q3090_MaximumLengthSubstringWithTwoOccurances q3090;

    @Before
    public void setup(){
        q3090 = new Q3090_MaximumLengthSubstringWithTwoOccurances();
    }

    @Test
    public void validate_maximumLengthSubstring_case1(){
        String s = "bcbbbcba";

        int actual = q3090.maximumLengthSubstring(s);

        int expected = 4;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maximumLengthSubstring_case2(){
        String s = "aaaa";

        int actual = q3090.maximumLengthSubstring(s);

        int expected = 2;

        assertEquals(expected,actual);
    }
}