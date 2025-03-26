import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q1876_SubstringsOfSizeThreeWithDistinctCharactersTest {
    private Q1876_SubstringsOfSizeThreeWithDistinctCharacters q1876;

    @Before
    public void setup(){
        q1876 = new Q1876_SubstringsOfSizeThreeWithDistinctCharacters();
    }

    @Test
    public void validate_countGoodSubstrings_case1(){
        String s = "xyzzaz";

        int actual = q1876.countGoodSubstrings(s);

        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_countGoodSubstrings_case2(){
        String s = "aababcabc";

        int actual = q1876.countGoodSubstrings(s);

        int expected = 4;

        assertEquals(expected,actual);
    }

    @After
    public void cleanup(){
        q1876 = null;
    }
}