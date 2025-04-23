import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3131_FindTheIntegerAddedToArray_ITest {
    private Q3131_FindTheIntegerAddedToArray_I q3131;

    @Before
    public void setup(){
        q3131 = new Q3131_FindTheIntegerAddedToArray_I();
    }

    @Test
    public void validate_addedInteger_Approach2_case1(){
        int[] nums1 = {2,6,4};
        int[] nums2 = {9,7,5};

        int actual = q3131.addedInteger_Approach2(nums1,nums2);

        int expected = 3;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_addedInteger_Approach2_case2(){
        int[] nums1 = {10};
        int[] nums2 = {5};

        int actual = q3131.addedInteger_Approach2(nums1,nums2);

        int expected = -5;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_addedInteger_Approach2_case3(){
        int[] nums1 = {1,1,1,1};
        int[] nums2 = {1,1,1,1};

        int actual = q3131.addedInteger_Approach2(nums1,nums2);

        int expected = 0;

        assertEquals(expected , actual);
    }
}