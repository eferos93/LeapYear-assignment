package dssc.assignment.leapyear;

public class LeapYear {
    public boolean divisibleBy4(int year) {
        return year % 4 == 0;
    }

    public boolean divisibleBy100(int year) {
        return year % 100 == 0;
    }

    public boolean divisibleBy400(int year) {
        return year % 400 == 0;
    }

    public boolean divisibleBy4OrNotBy100(int year) {
        return divisibleBy4(year) || !divisibleBy100(year);
    }

    public boolean test(int year) {
        return divisibleBy4OrNotBy100(year) || divisibleBy400(year);
    }
}
