package unidue.de;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OKTOBER(31),
    NOVEMBER(30),
    DEZEMBER(31);

    private final int days;

    Month(int i) {
        this.days = i;
    }

    public int getDays() {
        return days;
    }

    public static Month fromMonthNumber(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return JANUARY;
            case 2:
                return FEBRUARY;
            case 3:
                return MARCH;
            case 4:
                return APRIL;
            case 5:
                return MAY;
            case 6:
                return JUNE;
            case 7:
                return JULY;
            case 8:
                return AUGUST;
            case 9:
                return SEPTEMBER;
            case 10:
                return OKTOBER;
            case 11:
                return NOVEMBER;
            case 12:
                return DEZEMBER;
            default:
                throw new IllegalArgumentException("Invalid month number!");
        }
    }
}
