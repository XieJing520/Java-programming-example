package chapter4_exercise;

import java.util.*;


public class ConvertLetterGradeToNumberQuestion14 {
	public static void main(String[] args) {
		
		String letterGrade;
		
		System.out.print("Enter a letter grade: ");
		Scanner input = new Scanner(System.in);
		letterGrade = input.next();
		
		if(letterGrade.length() != 1)
			System.exit(1);
		else
		{
			if("ABCDF".indexOf(letterGrade) != -1)
			{
				if("F".equals(letterGrade)) 
					System.out.println("The numeric value for grade F is 0");
				else
					System.out.println("The numeric value for grade " + letterGrade + " is "
										+ Math.abs('E' - letterGrade.charAt(0)));
				
			}
			else
				System.out.println(letterGrade + " is an invalid grade");
		}
		
		input.close();
	}
}
