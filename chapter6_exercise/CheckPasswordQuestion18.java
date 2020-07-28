package chapter6_exercise;

import java.util.*;

public class CheckPasswordQuestion18 {
	public static void main(String[] args) {
		String password;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a password: ");
		password = inputScanner.nextLine();
		
		if(checkPassword(password))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		
		inputScanner.close();
	}
	public static boolean checkPassword(String password)
	{
		if(checkPasswordLength(password) && checkPasswordNumber(password)
				&& checkPasswordDigits(password))
			return true;
		else
			return false;
	}
	public static boolean checkPasswordLength(String password)
	{
		if(password.length() >= 8)
			return true;
		else
			return false;
	}
	public static boolean checkPasswordNumber(String password)
	{
		int number = 0;
		for(int i = 0;i < password.length();i++)
			if(Character.isDigit(password.charAt(i)))
				number++;
		if(number >= 2)
			return true;
		else
			return false;
	}
	public static boolean checkPasswordDigits(String password)
	{
		for(int i = 0;i < password.length()-1;i++)
			if(!Character.isLetterOrDigit(password.charAt(i)))
				return false;
		return true;
	}
}
