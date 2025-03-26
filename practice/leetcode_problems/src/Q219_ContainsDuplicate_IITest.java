import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q219_ContainsDuplicate_IITest {
    private Q219_ContainsDuplicate_II q219;

    @Before
    public void setup(){
        q219 = new Q219_ContainsDuplicate_II();
    }

    @Test
    public void validate_containsNearbyDuplicate_case1(){
        int[] nums = {1,2,3,1};
        int k = 3;

        boolean actual = q219.containsNearbyDuplicate(nums,k);

        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_containsNearbyDuplicate_case2(){
        int[] nums = {1,0,1,1};
        int k = 1;

        boolean actual = q219.containsNearbyDuplicate(nums,k);

        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_containsNearbyDuplicate_case3(){
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        boolean actual = q219.containsNearbyDuplicate(nums,k);

        boolean expected = false;

        assertEquals(expected,actual);
    }
}