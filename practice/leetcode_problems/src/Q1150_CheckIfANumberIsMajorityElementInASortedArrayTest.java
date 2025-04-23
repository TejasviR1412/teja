import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q1150_CheckIfANumberIsMajorityElementInASortedArrayTest {
    private Q1150_CheckIfANumberIsMajorityElementInASortedArray q1150;

    @Before
    public void setup(){
        q1150 = new Q1150_CheckIfANumberIsMajorityElementInASortedArray();
    }

    @Test
    public void validate_isMajorityElement_Approach1_case1(){
        int[] nums = {2,4,5,5,5,5,5,6,6};
        int target = 5;

        boolean actual = q1150.isMajorityElement_Approach1(nums,target);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_isMajorityElement_Approach1_case2(){
        int[] nums = {10,100,101,101};
        int target = 101;

        boolean actual = q1150.isMajorityElement_Approach1(nums,target);

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_isMajorityElement_Approach2_case1(){
        int[] nums = {2,4,5,5,5,5,5,6,6};
        int target = 5;

        boolean actual = q1150.isMajorityElement_Approach1(nums,target);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_isMajorityElement_Approach2_case2(){
        int[] nums = {10,100,101,101};
        int target = 101;

        boolean actual = q1150.isMajorityElement_Approach1(nums,target);

        boolean expected = false;

        assertEquals(expected, actual);
    }
}