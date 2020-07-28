package chapter5_exercise;

import java.util.*;


public class ProcessStringQuestion48 {
	public static void main(String[] args) {
		String string;
		
		System.out.print("Enter a string: ");
		Scanner inputScanner = new Scanner(System.in);
		string = inputScanner.nextLine();
		
		for(int strIndex = 0;strIndex < string.length();strIndex += 2)
			System.out.printf("%c",string.charAt(strIndex));
		
		inputScanner.close();
	}
}
