package testspractice;

import static testspractice.MathUtils.isDivisibleBy;

public class DateUtils {
	
	private static final int JULIAN_CALANDER_START = 1582;

	public static boolean isLeapYear(int year) {
		if (isPreJulianYear(year)) return false;
		if (isDivisibleBy(400, year)) return true;
		if (isDivisibleBy(100, year)) return false;
		return isDivisibleBy(4, year);
	}
	
	public static boolean isPreJulianYear(int year) {
        return year < JULIAN_CALANDER_START;
    }
}
