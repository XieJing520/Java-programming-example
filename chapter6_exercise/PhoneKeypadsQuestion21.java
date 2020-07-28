package chapter6_exercise;

import java.util.*;

public class PhoneKeypadsQuestion21 {
	public static void main(String[] args) {
		String string;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		string = inputScanner.nextLine();
		
		for(int i = 0;i < string.length();i++)
		{
			if(Character.isLetter(string.charAt(i)))
			{
				if(Character.isUpperCase(string.charAt(i)))
					System.out.printf("%d", getNumber(string.charAt(i)));
				else {
					System.out.printf("%d", getNumber((char)(string.charAt(i)-32)));
				}
			}
			else
				System.out.printf("%c", string.charAt(i));
		}
		System.out.print("\n");
		
		inputScanner.close();
	}
	public static int getNumber(char uppercaseLetter)
	{
		if("ABC".contains(""+uppercaseLetter))
			return 2;
		else if("DEF".contains(""+uppercaseLetter))
			return 3;
		else if("GHI".contains(""+uppercaseLetter))
			return 4;
		else if("JKL".contains(""+uppercaseLetter))
			return 5;
		else if("MNO".contains(""+uppercaseLetter))
			return 6;
		else if("PQRS".contains(""+uppercaseLetter))
			return 7;
		else if("TUV".contains(""+uppercaseLetter))
			return 8;
		else if("WXYZ".contains(""+uppercaseLetter))
			return 9;
		else
			return 0;
	}
}
