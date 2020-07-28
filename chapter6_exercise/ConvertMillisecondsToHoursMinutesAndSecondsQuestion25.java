package chapter6_exercise;

import java.util.*;

public class ConvertMillisecondsToHoursMinutesAndSecondsQuestion25 {
	public static void main(String[] args) {
		long millis;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("enter a long integer for milliseconds: ");
		millis = inputScanner.nextLong();
		
		System.out.printf("The time is %s", convertMillis(millis));
		
		inputScanner.close();
	}
	public static String convertMillis(long millis) {
		String timeString = "";
		
		long totalSeconds = millis / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		timeString = String.valueOf(totalHours) + ":" + String.valueOf(currentMinute)
						+ ":" + String.valueOf(currentSecond);
		
		return timeString;
	}
}
