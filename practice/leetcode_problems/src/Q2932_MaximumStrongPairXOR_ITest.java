import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q2932_MaximumStrongPairXOR_ITest {
    private Q2932_MaximumStrongPairXOR_I q2392;

    @Before
    public void setup(){
        q2392 = new Q2932_MaximumStrongPairXOR_I();
    }

    @Test
    public void validate_maximumStrongPairXor_BruteForceApproach_case1(){
        int[] nums = {1,2,3,4,5};

        int actual = q2392.maximumStrongPairXor_BruteForceApproach(nums);

        int expected = 7;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maximumStrongPairXor_BruteForceApproach_case2(){
        int[] nums = {10,100};

        int actual = q2392.maximumStrongPairXor_BruteForceApproach(nums);

        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maximumStrongPairXor_BruteForceApproach_case3(){
        int[] nums = {5,6,25,30};

        int actual = q2392.maximumStrongPairXor_BruteForceApproach(nums);

        int expected = 7;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maximumStrongPairXor_SlidingWindow_case1(){
        int[] nums = {1,2,3,4,5};

        int actual = q2392.maximumStrongPairXor_SlidingWindow(nums);

        int expected = 7;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maximumStrongPairXor_SlidingWindow_case2(){
        int[] nums = {10,100};

        int actual = q2392.maximumStrongPairXor_SlidingWindow(nums);

        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_maximumStrongPairXor_SlidingWindow_case3(){
        int[] nums = {5,6,25,30};

        int actual = q2392.maximumStrongPairXor_SlidingWindow(nums);

        int expected = 7;

        assertEquals(expected,actual);
    }
}