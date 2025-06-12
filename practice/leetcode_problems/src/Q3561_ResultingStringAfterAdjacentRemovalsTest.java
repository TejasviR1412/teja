import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3561_ResultingStringAfterAdjacentRemovalsTest {
    private Q3561_ResultingStringAfterAdjacentRemovals q3561;

    @Before
    public void setup(){
        q3561 = new Q3561_ResultingStringAfterAdjacentRemovals();
    }

    @Test
    public void validate_resultingString_case1(){
        String s = "abc";

        String actual = q3561.resultingString(s);

        String expected = "c";

        assertEquals(expected,actual);
    }

    @Test
    public void validate_resultingString_case2(){
        String s = "adcb";

        String actual = q3561.resultingString(s);

        String expected = "";

        assertEquals(expected,actual);
    }

    @Test
    public void validate_resultingString_case3(){
        String s = "zadb";

        String actual = q3561.resultingString(s);

        String expected = "db";

        assertEquals(expected,actual);
    }
}