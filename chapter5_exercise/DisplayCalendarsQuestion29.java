package chapter5_exercise;

import java.util.Scanner;

public class DisplayCalendarsQuestion29 {
	public static void main(String[] args) {
		
		int year,firstDay,totalDay = 0,febDays = 28;
	
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		year = inputScanner.nextInt();

		System.out.print("Enter the first day of the year: ");
		firstDay = inputScanner.nextInt();
		
		
		for(int month = 1;month <= 12;month++)
		{
			if(month == 1)
			{
				System.out.printf("\t\t%10s%5d\n","January",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= firstDay;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 31;
			}
			else if(month == 2)
			{
				System.out.printf("\t\t%10s%5d\n","February",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					febDays = 29;
				for(int i = 1;i <= febDays;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += febDays;
			}
			else if(month == 3)
			{
				System.out.printf("\t\t%10s%5d\n","March",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 31;
			}
			else if(month == 4)
			{
				System.out.printf("\t\t%10s%5d\n","April",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 30;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 30;
			}
			else if(month == 5)
			{
				System.out.printf("\t\t%10s%5d\n","May",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 31;
			}
			else if(month == 6)
			{
				System.out.printf("\t\t%10s%5d\n","June",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 30;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 30;
			}
			else if(month == 7)
			{
				System.out.printf("\t\t%10s%5d\n","July",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 31;
			}
			else if(month == 8)
			{
				System.out.printf("\t\t%10s%5d\n","August ",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 31;
			}
			else if(month == 9)
			{
				System.out.printf("\t\t%10s%5d\n","September",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 30;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 30;
			}
			else if(month == 10)
			{
				System.out.printf("\t\t%10s%5d\n","October",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 31;
			}
			else if(month == 11)
			{
				System.out.printf("\t\t%10s%5d\n","November",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 30;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
				totalDay += 30;
			}
			else if(month == 12)
			{
				System.out.printf("\t\t%10s%5d\n","December",year);
				System.out.println("---------------------------------------------------");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				for(int i = 1;i <= 31;i++)
				{
					if(i == 1)
						for(int tab = 1;tab <= (firstDay + totalDay) % 7;tab++)
							System.out.print("\t");
					System.out.printf("%3d\t",i);
					if((i + firstDay + totalDay) % 7 == 0)
						System.out.print("\n");
				}
				System.out.print("\n");
			}
		}
		
		inputScanner.close();
	}
}
