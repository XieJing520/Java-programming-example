package chapter4_exercise;

import java.util.*;


public class JudgeVowelOrConsonantQuestion13 {
	public static void main(String[] args) {
		String letterString;
		char letter;
	
		System.out.print("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		letterString = input.next();
		
		if(letterString.length() != 1)
			System.exit(1);
		
		letter = letterString.charAt(0);
		
		if(Character.isLetter(letter))
		{
			letter = Character.toUpperCase(letter);
			if("AEOUI".indexOf(letter) != -1)
				System.out.println(letterString + " is a vowel");
			else
				System.out.println(letterString + " is a consonant");
		}
		else
			System.out.println(letter + " is an invalid input");
			
		input.close();
	}
}