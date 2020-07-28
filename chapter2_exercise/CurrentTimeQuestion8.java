package chapter2_exercise;

import java.util.*;


public class CurrentTimeQuestion8 {
	public static void main(String[] args) {
		int ZoneOffset;
		long CurrHours,CurrMinutes,CurrSeconds;
		long CurrentMilliSeconds;
		
		CurrentMilliSeconds = System.currentTimeMillis();
	
		
		CurrSeconds = CurrentMilliSeconds / 1000 % 60;
		CurrMinutes = CurrentMilliSeconds / 1000 / 60 % 60;
		CurrHours = CurrentMilliSeconds / 1000 / 60 / 60 % 24;
		
		//total_seconds = CurrentMilliSeconds / 1000;
		//total_minutes = CurrentMilliSeconds / 1000 / 60 % 60;
		//total_hours = CurrentMilliSeconds / 1000 / 60 / 60 % 24
		
		System.out.print("Enter the time zone offset to GMT : ");
		Scanner ZoneOffsetInput = new Scanner(System.in);
		ZoneOffset = ZoneOffsetInput.nextInt();
		
		
		CurrHours = (CurrHours + ZoneOffset + 24) % 24;
		
		
		System.out.println("The current time is "
							+ CurrHours + ":" + CurrMinutes + ":" + CurrSeconds);
		ZoneOffsetInput.close();
	}
}
