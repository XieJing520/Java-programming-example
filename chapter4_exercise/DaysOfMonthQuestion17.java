package chapter4_exercise;

import java.util.*;

public class DaysOfMonthQuestion17 {
	public static void main(String[] args) {
		int year;
		String month;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year:");
		year = input.nextInt();

		System.out.print("Enter a month:");
		month = input.next();

		if ("Jan".equals(month))
			System.out.println("Jan" + " " + year + " has 31 days");
		else if ("Feb".equals(month))
		{
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				System.out.println("Feb" + " " + year + " has 29 days");
			else
				System.out.println("Feb" + " " + year + " has 28 days");
		} else if ("Mar".equals(month))
			System.out.println("Mar" + " " + year + " has 31 days");
		else if ("Apr".equals(month))
			System.out.println("Apr" + " " + year + " has 30 days");
		else if ("May".equals(month))
			System.out.println("May" + " " + year + " has 31 days");
		else if ("Jun".equals(month))
			System.out.println("Jun" + " " + year + " has 30 days");
		else if ("Jul".equals(month))
			System.out.println("Jul" + " " + year + " has 31 days");
		else if ("Aug".equals(month))
			System.out.println("Aug" + " " + year + " has 31 days");
		else if ("Sep".equals(month))
			System.out.println("Sep" + " " + year + " has 30 days");
		else if ("Oct".equals(month))
			System.out.println("Oct" + " " + year + " has 31 days");
		else if ("Nov".equals(month))
			System.out.println("Nov" + " " + year + " has 30 days");
		else if ("Dec".equals(month))
			System.out.println("Dec" + " " + year + " has 31 days");
		else
			System.out.println(month + " is not a correct month name");

		input.close();
	}
}
