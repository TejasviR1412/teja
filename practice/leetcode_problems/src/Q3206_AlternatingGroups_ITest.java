import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q3206_AlternatingGroups_ITest {
    private Q3206_AlternatingGroups_I q3206;

    @Before
    public void setup(){
        q3206 = new Q3206_AlternatingGroups_I();
    }

    @Test
    public void validate_numberOfAlternatingGroups_case1(){
        int[] colors = {1,1,1};

        int actual = q3206.numberOfAlternatingGroups(colors);

        int expected = 0;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_numberOfAlternatingGroups_case2(){
        int[] colors = {0,1,0,0,1};

        int actual = q3206.numberOfAlternatingGroups(colors);

        int expected = 3;

        assertEquals(expected , actual);
    }
}