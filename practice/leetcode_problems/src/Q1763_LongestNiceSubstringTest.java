import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q1763_LongestNiceSubstringTest {
    private Q1763_LongestNiceSubstring q1763;

    @Before
    public void setup(){
        q1763 = new Q1763_LongestNiceSubstring();
    }

    @Test
    public void validate_long_nice_substring_case1(){
        String actual = q1763.longestNiceSubstring("YazaAay");

        String expected = "aAa";

        assertEquals(expected, actual);
    }

    @Test
    public void validate_long_nice_substring_case2(){
        String actual = q1763.longestNiceSubstring("Bb");

        String expected = "Bb";

        assertEquals(expected, actual);
    }

    @Test
    public void validate_long_nice_substring_case3(){
        String actual = q1763.longestNiceSubstring("c");

        String expected = "";

        assertEquals(expected, actual);
    }
}