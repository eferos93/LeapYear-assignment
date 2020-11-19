package dssc.assignment.leapyear;

public class LeapYear {
    public boolean divisibleBy4(int year) {
        return year % 4 == 0;
    }

    public boolean divisibleBy100(int year) {
        return year % 100 == 0;
    }
}
