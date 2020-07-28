package chapter10_exercise;

import java.util.GregorianCalendar;

public class TheMyDateClassQuestion14 {
	public static void main(String[] args) {

		MyDate myDate1 = new MyDate();
		MyDate myDate2 = new MyDate(34355555133101L);
		MyDate myDate3 = new MyDate();
		
		myDate3.setDate(561555550000L);
		
		System.out.println(myDate1.getYear() + "/" + myDate1.getMonth() + "/" + myDate1.getDay());
		System.out.println(myDate2.getYear() + "/" + myDate2.getMonth() + "/" + myDate2.getDay());
		System.out.println(myDate3.getYear() + "/" + myDate3.getMonth() + "/" + myDate3.getDay());
	
	}
}

class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public void setDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}

}
