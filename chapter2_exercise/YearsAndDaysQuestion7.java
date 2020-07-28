package chapter2_exercise;

import java.util.*;


public class YearsAndDaysQuestion7 {
	public static void main(String[] args) {
		int Minutes,Years,Days;
		
		System.out.print("Enter the number of minutes : ");
		Scanner MinInput = new Scanner(System.in);
		
		Minutes = MinInput.nextInt();
		
		Days = Minutes / 60 / 24 % 365;
		Years = Minutes / 60 / 24 / 365;
		
		
		System.out.println(Minutes + " minutes is approximately "
							+ Years + " years and " + Days + " minutes");
		
		MinInput.close();
	}
}
