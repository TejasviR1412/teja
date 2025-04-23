import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q1399_CountLargestGroupTest {
    private Q1399_CountLargestGroup q1399;

    @Before
    public void setup(){
        q1399 = new Q1399_CountLargestGroup();
    }

    @Test
    public void validate_countLargestGroup_case1(){
        int n = 13;

        int actual = q1399.countLargestGroup(n);

        int expected = 4;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_countLargestGroup_case2(){
        int n = 2;

        int actual = q1399.countLargestGroup(n);

        int expected = 2;

        assertEquals(expected,actual);
    }
}