package chapter3_exercise;

import java.util.*;


public class FindFutureDateQuestion5 {
	public static void main(String[] args) {
		int today, numberOfDays, futureDay;
		
		System.out.print("Enter today's day: ");
		Scanner input = new Scanner(System.in);
		today = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");
		numberOfDays = input.nextInt();
		futureDay = (today + numberOfDays) % 7;

		
		switch(today)
		{
			case 0:
				System.out.print("Today is Sunday and the future day is ");
				break;
			case 1:
				System.out.print("Today is Monday and the future day is ");
				break;
			case 2:
				System.out.print("Today is Tuesday and the future day is ");
				break;
			case 3:
				System.out.print("Today is Wednesday and the future day is ");
				break;
			case 4:
				System.out.print("Today is Thursday and the future day is ");
				break;
			case 5:
				System.out.print("Today is Friday and the future day is ");
				break;
			case 6:
				System.out.print("Today is Saturday and the future day is ");
				break;
		}
		
		
		switch(futureDay)
		{
			case 0:
				System.out.print("Sunday");
				break;
			case 1:
				System.out.print("Monday");
				break;
			case 2:
				System.out.print("Tuesday");
				break;
			case 3:
				System.out.print("Wednesday");
				break;
			case 4:
				System.out.print("Thursday");
				break;
			case 5:
				System.out.print("Friday");
				break;
			case 6:
				System.out.print("Saturday");
				break;
		}

		input.close();
	}
}
