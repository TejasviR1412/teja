import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q1100_FindKLengthSubstringsWithNoRepeatedCharactersTest {
    private Q1100_FindKLengthSubstringsWithNoRepeatedCharacters q1100;

    @Before
    public void setup(){
        q1100 = new Q1100_FindKLengthSubstringsWithNoRepeatedCharacters();
    }

    @Test
    public void validate_numKLenSubstrNoRepeats_case1(){
        String s = "havefunonleetcode";
        int k = 5;

        int actual = q1100.numKLenSubstrNoRepeats(s,k);

        int expected = 6;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_numKLenSubstrNoRepeats_case2(){
        String s = "home";
        int k = 5;

        int actual = q1100.numKLenSubstrNoRepeats(s,k);

        int expected = 0;

        assertEquals(expected,actual);
    }
}