import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3046_SplitTheArrayTest {
    private Q3046_SplitTheArray q3046;

    @Before
    public void setup(){
        q3046 = new Q3046_SplitTheArray();
    }

    @Test
    public void validate_isPossibleToSplit_case1(){
        int[] nums = {1,1,2,2,3,4};

        boolean actual = q3046.isPossibleToSplit(nums);

        boolean expected = true;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_isPossibleToSplit_case2(){
        int[] nums = {1,1,1,1};

        boolean actual = q3046.isPossibleToSplit(nums);

        boolean expected = false;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_isPossibleToSplit_case3(){
        int[] nums = {1};

        boolean actual = q3046.isPossibleToSplit(nums);

        boolean expected = true;

        assertEquals(expected , actual);
    }
}