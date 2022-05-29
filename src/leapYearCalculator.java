public class leapYearCalculator {
    public static void main (String[] args) {
        System.out.println(isLeapYear(2300));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999 || year == 1700 || year == 1800 || year == 1900
                || year == 2100 || year == 2200 || year == 2300 || year == 2500 || year == 2600) {
            return false;
        } else if (year == 1600 || year == 2000 || year == 2400) {
            return true;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }

    }
}
