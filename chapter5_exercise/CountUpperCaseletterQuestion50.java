package chapter5_exercise;

import java.util.*;


public class CountUpperCaseletterQuestion50 {
	public static void main(String[] args) {
		String userString;
		int upperLetterCount = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		userString = inputScanner.nextLine();
		
		for(int strIndex = 0;strIndex < userString.length();strIndex++)
			if(userString.charAt(strIndex) >= 65 && userString.charAt(strIndex) <= 90)
				upperLetterCount++;
		System.out.printf("The number of uppercase letters is %d", upperLetterCount);
		
		inputScanner.close();
	}
}
