package chapter3_exercise;

import java.util.Scanner;

public class CurrentTimeQuestion30 {
	public static void main(String[] args) {
		int ZoneOffset;
		long CurrHours,CurrMinutes,CurrSeconds;
		long CurrentMilliSeconds;
		
		CurrentMilliSeconds = System.currentTimeMillis();
	
		CurrSeconds = CurrentMilliSeconds / 1000 % 60;
		CurrMinutes = CurrentMilliSeconds / 1000 / 60 % 60;
		CurrHours = CurrentMilliSeconds / 1000 / 60 / 60 % 24;
		
		System.out.print("Enter the time zone offset to GMT : ");
		Scanner ZoneOffsetInput = new Scanner(System.in);
		ZoneOffset = ZoneOffsetInput.nextInt();
		
		CurrHours = (CurrHours + ZoneOffset + 24) % 24;
		
		if(CurrHours <= 12)
			System.out.println("The current time is "
					+ CurrHours + ":" + CurrMinutes + ":" + CurrSeconds + " AM");
		else
		{
			CurrHours %= 12;
			System.out.println("The current time is "
					+ CurrHours + ":" + CurrMinutes + ":" + CurrSeconds + " PM");
		}
		
		ZoneOffsetInput.close();
	}
}
