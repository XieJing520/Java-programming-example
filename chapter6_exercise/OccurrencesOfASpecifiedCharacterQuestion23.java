package chapter6_exercise;

import java.util.*;

public class OccurrencesOfASpecifiedCharacterQuestion23 {
	public static void main(String[] args) {
		char userChar;
		String string;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		string = inputScanner.nextLine();
		
		System.out.print("Enter a char: ");
		userChar = inputScanner.nextLine().charAt(0);
		
		System.out.printf("The number of occurrences of %c in %s is %d", userChar, string,
							count(string, userChar));
		
		inputScanner.close();
	}
	public static int count(String str, char a)
	{
		int charCount = 0;
		
		for(int i = 0;i < str.length();i++)
			if(str.charAt(i) == a)
				charCount++;
		return charCount;
	}
	
}
