package chapter5_exercise;

import java.util.*;


public class CountVowelsAndConsonantsQuestion49 {
	public static void main(String[] args) {
		String userString;
		int vowelCount,consonantCount;
		vowelCount = consonantCount = 0;
		
		System.out.print("Enter a string: ");
		Scanner inputScanner = new Scanner(System.in);
		userString = inputScanner.nextLine();
		
		for(int strIndex = 0;strIndex < userString.length(); strIndex++)
		{
			if("aeouiAEOUI".contains(""+userString.charAt(strIndex)))
				vowelCount++;
			else if(Character.isLetter(userString.charAt(strIndex)))
				consonantCount++;
		}
		System.out.printf("The number of vowels is %d\n", vowelCount);
		System.out.printf("The number of consonants is %d", consonantCount);
		
		inputScanner.close();
	}
}
