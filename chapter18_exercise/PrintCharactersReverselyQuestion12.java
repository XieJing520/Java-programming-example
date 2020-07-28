package chapter18_exercise;

import java.util.Scanner;

public class PrintCharactersReverselyQuestion12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String s = input.nextLine();

		reverseDisplay(s,s.length()-1);

		input.close();

	}
	
	public static void reverseDisplay(String value, int high) {
		if(high == 0)
			System.out.print(value.charAt(0));
		else {
			System.out.print(value.charAt(high));
			reverseDisplay(value,high-1);
		}
	}
	
}
