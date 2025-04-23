import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3024_TypeOfTriangleTest {
    private Q3024_TypeOfTriangle q3024;

    @Before
    public void setup(){
        q3024 = new Q3024_TypeOfTriangle();
    }

    @Test
    public void validate_triangleType_case1(){
        int[] nums = {3,3,3};

        String actual = q3024.triangleType(nums);

        String expected = "equilateral";

        assertEquals(expected,actual);
    }

    @Test
    public void validate_triangleType_case2(){
        int[] nums = {3,4,5};

        String actual = q3024.triangleType(nums);

        String expected = "scalene";

        assertEquals(expected,actual);
    }

    @Test
    public void validate_triangleType_case3(){
        int[] nums = {3,4,3};

        String actual = q3024.triangleType(nums);

        String expected = "isosceles";

        assertEquals(expected,actual);
    }

    @Test
    public void validate_triangleType_case4(){
        int[] nums = {-3,-3,-3};

        String actual = q3024.triangleType(nums);

        String expected = "none";

        assertEquals(expected,actual);
    }

    @Test
    public void validate_triangleType_case5(){
        int[] nums = {8,4,2};

        String actual = q3024.triangleType(nums);

        String expected = "none";

        assertEquals(expected,actual);
    }
}