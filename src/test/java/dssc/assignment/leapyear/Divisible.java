package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Divisible {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000, 2400})
    void isNumberDivisibleBy4(int number) {
        assertTrue(leapYear.divisibleBy4(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2100, 1900})
    void divisibleBy100(int number) {
        assertTrue(leapYear.divisibleBy100(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2400, 1600})
    void divisibleBy400(int number) {
        assertTrue(leapYear.divisibleBy400(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1996, 2004, 2008, 2001})
    void divisibleBy4OrNotBy100(int number) {
        assertTrue(leapYear.divisibleBy4OrNotBy100(number));
    }

    @ParameterizedTest
    @CsvSource({"2001, true", "1900, true", "2000, true", "1996, false", "1995, false"})
    void divisibleBy4OrNotBy100UnlessDivisibleBy400(int number, boolean expected) {
        assertEquals(expected, leapYear.test(number));
    }
}
