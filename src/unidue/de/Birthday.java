package unidue.de;

public class Birthday {
    private final int year,day;
    private final Month month;

    Birthday(int year, Month month, int day) {
        if (year < 0)
            throw new IllegalArgumentException("year must not be negative");
        if (day < 1)
            throw new IllegalArgumentException("day must not be less than 1");
        if (day > month.getDays())
             throw new IllegalArgumentException("day must not be greater than number of days in month");
        else {

            this.year = year;
            this.month = month;
            this.day = day;
        }
    }


}
