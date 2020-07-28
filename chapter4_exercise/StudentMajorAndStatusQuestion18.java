package chapter4_exercise;

import java.util.*;


public class StudentMajorAndStatusQuestion18 {
	public static void main(String[] args) {
		String studentInfo;
		char studentMajor, studentStatus;
		
		System.out.print("Enter two characters:");
		Scanner input = new Scanner(System.in);
		studentInfo = input.next();
		
		if(studentInfo.length() != 2)
			System.exit(1);
		
		studentMajor = studentInfo.charAt(0);
		studentStatus = studentInfo.charAt(1);
		
		if('M' == studentMajor)
		{
			if('1' == studentStatus)
				System.out.println("Mathematics Freshman");
			else if ('2' == studentStatus) {
				System.out.println("Mathematics Sophomore");
			}
			else if ('3' == studentStatus) {
				System.out.println("Mathematics Junior");
			}
			else if ('4' == studentStatus) {
				System.out.println("Mathematics Senior");
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else if('C' == studentMajor)
		{
			if('1' == studentStatus)
				System.out.println("Computer Science Freshman");
			else if ('2' == studentStatus) {
				System.out.println("Computer Science Sophomore");
			}
			else if ('3' == studentStatus) {
				System.out.println("Computer Science Junior");
			}
			else if ('4' == studentStatus) {
				System.out.println("Computer Science Senior");
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else if('I' == studentMajor)
		{
			if('1' == studentStatus)
				System.out.println("Information Management Freshman");
			else if ('2' == studentStatus) {
				System.out.println("Information Management Sophomore");
			}
			else if ('3' == studentStatus) {
				System.out.println("Information Management Junior");
			}
			else if ('4' == studentStatus) {
				System.out.println("Information Management Senior");
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else
			System.out.println("Invalid input");

		input.close();
	}
}