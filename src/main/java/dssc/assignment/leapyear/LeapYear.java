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

    public boolean test(int year) {
        return divisibleBy4(year) && (!divisibleBy100(year) || divisibleBy400(year));
    }

    public void print(int year) {
        System.out.println(test(year));
    }
}
