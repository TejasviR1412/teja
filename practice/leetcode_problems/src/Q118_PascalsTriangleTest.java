import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Q118_PascalsTriangleTest {
    private Q118_PascalsTriangle q118;

    @Before
    public void setup(){
        q118 = new Q118_PascalsTriangle();
    }

    @Test
    public void validate_generate_case1(){
        int numRows = 5;

        List<List<Integer>> actual = q118.generate(numRows);

        List<List<Integer>> expected = List.of(List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1));

        assertIterableEquals(actual,expected);
    }

    @Test
    public void validate_generate_case2(){
        int numRows = 1;

        List<List<Integer>> actual = q118.generate(numRows);

        List<List<Integer>> expected = List.of(List.of(1));

        assertIterableEquals(actual,expected);
    }
}