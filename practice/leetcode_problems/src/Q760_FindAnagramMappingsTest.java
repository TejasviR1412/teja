import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q760_FindAnagramMappingsTest {
    private Q760_FindAnagramMappings q760;

    @Before
    public void setup(){
        q760 = new Q760_FindAnagramMappings();
    }

    @Test
    public void validate_anagramMappings_case1(){
        int[] nums1 = {12,28,46,32,50};
        int[] nums2 = {50,12,32,46,28};

        int[] actual = q760.anagramMappings(nums1,nums2);

        int[] expected = {1,4,3,2,0};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void validate_anagramMappings_case2(){
        int[] nums1 = {84,46};
        int[] nums2 = {84,46};

        int[] actual = q760.anagramMappings(nums1,nums2);

        int[] expected = {0,1};

        assertArrayEquals(expected,actual);
    }
}