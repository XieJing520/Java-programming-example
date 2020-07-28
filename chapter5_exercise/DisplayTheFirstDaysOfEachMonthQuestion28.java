package chapter5_exercise;

import java.util.*;

public class DisplayTheFirstDaysOfEachMonthQuestion28 {
	public static void main(String[] args) {
		int year, theFirstDay, totalDay = 0;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the year: ");
		year = inputScanner.nextInt();

		System.out.print("Enter the first day of the year: ");
		theFirstDay = inputScanner.nextInt();

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				System.out.print("January 1, " + year + " is ");
				break;
			case 2:
				totalDay += 31;
				System.out.print("February 1, " + year + " is ");
				break;
			case 3:
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					totalDay += 29;
				else
					totalDay += 28;
				System.out.print("March 1," + year + " is ");
				break;
			case 4:
				totalDay += 31;
				System.out.print("April 1," + year + " is ");
				break;
			case 5:
				totalDay += 30;
				System.out.print("May 1, " + year + " is ");
				break;
			case 6:
				totalDay += 31;
				System.out.print("June 1, " + year + " is ");
				break;
			case 7:
				totalDay += 30;
				System.out.print("July 1, " + year + " is ");
				break;
			case 8:
				totalDay += 31;
				System.out.print("August 1, " + year + " is ");
				break;
			case 9:
				totalDay += 31;
				System.out.print("September 1, " + year + " is ");
				break;
			case 10:
				totalDay += 30;
				System.out.print("October 1, " + year + " is ");
				break;
			case 11:
				totalDay += 31;
				System.out.print("November 1, " + year + " is ");
				break;
			case 12:
				totalDay += 30;
				System.out.print("December 1, " + year + " is ");
			}

			int futureDay = (theFirstDay + totalDay) % 7;

			switch (futureDay) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
		}

		inputScanner.close();
	}
}
