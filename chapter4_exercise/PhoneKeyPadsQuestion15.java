package chapter4_exercise;

import java.util.*;


public class PhoneKeyPadsQuestion15 {
	public static void main(String[] args) {
		String letter;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		letter = input.nextLine();
		
		if(letter.length() != 1)
			System.exit(1);
		
		
		if(Character.isLetter(letter.charAt(0)))
		{
			if("abcABC".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 2");
			else if("defDEF".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 3");
			else if("ghiGHI".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 4");
			else if("jklJKL".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 5");
			else if("mnoMNO".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 6");
			else if("pqrsPQRS".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 7");
			else if("tuvTUV".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 8");
			else if("wxyzWXYZ".contains(""+letter.charAt(0)))
				System.out.println("The corresponding number is 9");
		}
		else
			System.out.println(letter + " is an invalid input");

		input.close();
	}
}
