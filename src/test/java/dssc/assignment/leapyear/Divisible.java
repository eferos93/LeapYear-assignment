package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Divisible {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000, 2400})
    void isNumberDivisibleBy4(int number) {
        assertTrue(leapYear.testYear(number));
    }
}
