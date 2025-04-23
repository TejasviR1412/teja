import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q3491_PhoneNumberPrefixTest {
    private Q3491_PhoneNumberPrefix q3491;

    @Before
    public void setup(){
        q3491 = new Q3491_PhoneNumberPrefix();
    }

    @Test
    public void validate_phonePrefix_Approach1_case1(){
        String[] numbers = {"1","2","4","3"};

        boolean actual = q3491.phonePrefix_Approach1(numbers);

        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_phonePrefix_Approach1_case2(){
        String[] numbers = {"001","007","15","00153"};

        boolean actual = q3491.phonePrefix_Approach1(numbers);

        boolean expected = false;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_phonePrefix_Approach2_case1(){
        String[] numbers = {"1","2","4","3"};

        boolean actual = q3491.phonePrefix_Approach2(numbers);

        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    public void validate_phonePrefix_Approach2_case2(){
        String[] numbers = {"001","007","15","00153"};

        boolean actual = q3491.phonePrefix_Approach2(numbers);

        boolean expected = false;

        assertEquals(expected,actual);
    }
}