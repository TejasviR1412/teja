import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2379_MinimumRecolorsToGetKConsecutiveBlackBlocksTest {
    private Q2379_MinimumRecolorsToGetKConsecutiveBlackBlocks q2379;

    @Before
    public void setup(){
        q2379 = new Q2379_MinimumRecolorsToGetKConsecutiveBlackBlocks();
    }

    @Test
    public void validate_minimumRecolors_case1(){
        String blocks = "WBBWWBBWBW";
        int k = 7;

        int actual = q2379.minimumRecolors(blocks,k);

        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_minimumRecolors_case2(){
        String blocks = "WBWBBBW";
        int k = 2;

        int actual = q2379.minimumRecolors(blocks,k);

        int expected = 0;

        assertEquals(expected,actual);
    }
}