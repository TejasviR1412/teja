import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3127_MakeASquareWithTheSameColorTest {
    private Q3127_MakeASquareWithTheSameColor q3127;

    @Before
    public void setup(){
        q3127 = new Q3127_MakeASquareWithTheSameColor();
    }

    @Test
    public void validate_canMakeSquare_case1(){
        char[][] grid = {{'B','W','B'},
                           {'B','W','W'},
                           {'B','W','B'}};

        boolean actual = q3127.canMakeSquare(grid);

        boolean expected = true;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_canMakeSquare_case2(){
        char[][] grid = {{'B','W','B'},
                {'W','B','W'},
                {'B','W','B'}};

        boolean actual = q3127.canMakeSquare(grid);

        boolean expected = false;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_canMakeSquare_case3(){
        char[][] grid = {{'W','W','W'},
                {'B','B','B'},
                {'W','W','W'}};

        boolean actual = q3127.canMakeSquare(grid);

        boolean expected = false;

        assertEquals(expected , actual);
    }
}