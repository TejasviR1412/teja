import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q189_RotateArrayTest {
    private Q189_RotateArray q189;

    @Before
    public void setup(){
        q189 = new Q189_RotateArray();
    }

    @Test
    public void validate_rotate_BruteForceApproach_case1(){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        q189.rotate_BruteForceApproach(nums,k);

        int[] expected = {5,6,7,1,2,3,4};

        assertArrayEquals(nums, expected);
    }

    @Test
    public void validate_rotate_usingReverse_case1(){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        q189.rotate_usingReverse(nums,k);

        int[] expected = {5,6,7,1,2,3,4};

        assertArrayEquals(nums, expected);
    }

    @Test
    public void validate_rotate_BruteForceApproach_case2(){
        int[] nums = {-1,-100,3,99};
        int k = 2;

        q189.rotate_BruteForceApproach(nums,k);

        int[] expected = {3,99,-1,-100};

        assertArrayEquals(nums, expected);
    }

    @Test
    public void validate_rotate_usingReverse_case2(){
        int[] nums = {-1,-100,3,99};
        int k = 2;

        q189.rotate_usingReverse(nums,k);

        int[] expected = {3,99,-1,-100};

        assertArrayEquals(nums, expected);
    }
}