import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q1652_DefuseTheBombTest {
    private Q1652_DefuseTheBomb q1652;

    @Before
    public void setup(){
        q1652 = new Q1652_DefuseTheBomb();
    }

    @Test
    public void validate_BruteForce_case1(){
        int[] code = {5,7,1,4};
        int k = 3;

        int[] actual = q1652.decrypt_BruteForceApproach(code,k);

        int[] expected = {12,10,16,13};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_BruteForce_case2(){
        int[] code = {1,2,3,4};
        int k = 0;

        int[] actual = q1652.decrypt_BruteForceApproach(code,k);

        int[] expected = {0,0,0,0};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_BruteForce_case3(){
        int[] code = {2,4,9,3};
        int k = -2;

        int[] actual = q1652.decrypt_BruteForceApproach(code,k);

        int[] expected = {12,5,6,13};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_SlidingWindow_case1(){
        int[] code = {5,7,1,4};
        int k = 3;

        int[] actual = q1652.decrypt_SlidingWindowApproach(code,k);

        int[] expected = {12,10,16,13};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_SlidingWindow_case2(){
        int[] code = {1,2,3,4};
        int k = 0;

        int[] actual = q1652.decrypt_SlidingWindowApproach(code,k);

        int[] expected = {0,0,0,0};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_SlidingWindow_case3(){
        int[] code = {2,4,9,3};
        int k = -2;

        int[] actual = q1652.decrypt_SlidingWindowApproach(code,k);

        int[] expected = {12,5,6,13};

        assertArrayEquals(expected,actual);
    }
}