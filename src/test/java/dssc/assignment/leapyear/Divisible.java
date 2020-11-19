package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


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
    @ValueSource(ints = {1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964,
            1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020}
            )
    void divisibleBy4OrNotBy100Or400(int number) {
        assertTrue(leapYear.test(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900, 2100, 2001, 2200, 2300})
    void notDivisibleBy4OrNotBy100Or400(int number) {
        assertFalse(leapYear.test(number));
    }
}
