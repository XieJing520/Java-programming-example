package chapter9_exercise;

import java.util.GregorianCalendar;

public class UseTheGregorianCalendarClassQuestion5 {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();

		System.out.print(calendar.get(GregorianCalendar.YEAR)+":");
		System.out.print(calendar.get(GregorianCalendar.MONTH)+":");
		System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(1234567898765L);
		
		System.out.print(calendar.get(GregorianCalendar.YEAR)+":");
		System.out.print(calendar.get(GregorianCalendar.MONTH)+":");
		System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
