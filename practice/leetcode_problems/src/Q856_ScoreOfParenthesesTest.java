import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q856_ScoreOfParenthesesTest {
    private Q856_ScoreOfParentheses q865;

    @Before
    public void setup(){
        q865 = new Q856_ScoreOfParentheses();
    }

    @Test
    public void validate_scoreOfParentheses_UsingStack_case1(){
        String s = "()";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_UsingStack_case2(){
        String s = "(())";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_UsingStack_case3(){
        String s = "()()";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_UsingStack_case4(){
        String s = "(()(()))";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_WithoutStack_case1(){
        String s = "()";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_WithoutStack_case2(){
        String s = "(())";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_WithoutStack_case3(){
        String s = "()()";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void validate_scoreOfParentheses_WithoutStack_case4(){
        String s = "(()(()))";

        int actual = q865.scoreOfParentheses_UsingStack(s);

        int expected = 6;

        assertEquals(expected, actual);
    }
}