import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3184_CountPairsThatFormACompleteDay_ITest {
    private Q3184_CountPairsThatFormACompleteDay_I q3184;

    @Before
    public void setup(){
        q3184 = new Q3184_CountPairsThatFormACompleteDay_I();
    }

    @Test
    public void validate_countCompleteDayPairs_Approach1_case1(){
        int hours[] = {12,12,30,24,24};

        int actual = q3184.countCompleteDayPairs_Approach1(hours);

        int expected = 2;

        assertEquals(expected , actual);
    }

    @Test
    public void validate_countCompleteDayPairs_Approach1_case2(){
        int hours[] = {72,48,24,3};

        int actual = q3184.countCompleteDayPairs_Approach1(hours);

        int expected = 3;

        assertEquals(expected , actual);
    }
}