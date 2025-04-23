import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3386_ButtonWithLongestPushTimeTest {
    private Q3386_ButtonWithLongestPushTime q3386;

    @Before
    public void setup(){
        q3386 = new Q3386_ButtonWithLongestPushTime();
    }

    @Test
    public void validate_buttonWithLongestTime_case1(){
        int[][] events = {{1,2},{2,5},{3,9},{1,15}};

        int actual = q3386.buttonWithLongestTime(events);

        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_buttonWithLongestTime_case2(){
        int[][] events = {{10,5},{1,7}};

        int actual = q3386.buttonWithLongestTime(events);

        int expected = 10;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_buttonWithLongestTime_case3(){
        int[][] events = {{9,4},{19,5},{2,8},{3,11},{2,15}};

        int actual = q3386.buttonWithLongestTime(events);

        int expected = 2;

        assertEquals(expected,actual);
    }
}