package chapter5_exercise;

import java.util.Scanner;

public class ReverseAStringQuestion46 {
	public static void main(String[] args) {
		String string;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		string = inputScanner.nextLine();
		
		System.out.print("The reversed string is ");
		for(int strIndex = string.length()-1;strIndex >= 0;strIndex--)
			System.out.printf("%c",string.charAt(strIndex));
	
		inputScanner.close();
	}
}

