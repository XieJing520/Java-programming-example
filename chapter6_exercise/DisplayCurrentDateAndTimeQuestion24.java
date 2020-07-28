package chapter6_exercise;

public class DisplayCurrentDateAndTimeQuestion24 {
	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		int totalDays = (int) (totalMilliseconds / 1000 / 60 / 60 / 24);

		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;

		int currentYears = 1970, currentMonths = 1, currentDays;
		while (totalDays >= 365) {
			if (isLeapYear(currentYears))
				totalDays -= 366;
			else
				totalDays -= 365;
			currentYears++;
		}

		while (totalDays >= 28) {
			if (currentMonths == 1 || currentMonths == 3 || currentMonths == 5 || currentMonths == 7
					|| currentMonths == 8 || currentMonths == 10 || currentMonths == 12) {
				totalDays -= 31;
				currentMonths++;
			} else if (currentMonths == 4 || currentMonths == 6 || currentMonths == 9 || currentMonths == 11) {
				totalDays -= 30;
				currentMonths++;
			}

			else if (isLeapYear(currentYears) && currentMonths == 2) {
				totalDays -= 29;
				currentMonths++;
			} else {
				totalDays -= 28;
				currentMonths++;
			}
		}
		if (totalDays == 0)
			currentDays = 1;
		else
			currentDays = totalDays + 1;
		// Display results
		System.out.printf("Current data is %d-%d-%d\n", currentYears, currentMonths, currentDays);
		System.out.printf("Current time is %d:%d:%d\n", currentHour, currentMinute, currentSecond);
	}

	public static boolean isLeapYear(int year) {
		return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
	}
}
