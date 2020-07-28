package chapter6_exercise;

public class NumberOfDaysInAYearQuestion16 {
	public static void main(String[] args) {
		
		for(int i = 2000;i <= 2020;i++)
			System.out.printf("There are %d days in %d\n",numberOfDaysInAyear(i),i);
	}
	public static int numberOfDaysInAyear(int year)
	{
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return 366;
		return 365;
	}
}
