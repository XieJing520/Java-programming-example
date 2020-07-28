package chapter6_exercise;

import java.util.*;

public class CountTheLettersInAStringQuestion20 {
	public static void main(String[] args) {
		String string;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		string = inputScanner.nextLine();
		
		System.out.printf("The number of letters in the string is %d", countLetters(string));
		
		inputScanner.close();
	}
	public static int countLetters(String s)
	{
		int numberOfLetters = 0;
		for(int i = 0;i < s.length();i++)
			if(Character.isLetter(s.charAt(i)))
				numberOfLetters++;
		return numberOfLetters;
	}
	
}
