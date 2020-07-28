package chapter18_exercise;

import java.util.Scanner;

public class PrintCharactersReverselyQuestion9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String s = input.nextLine();

		reverseDisplay(s);

		input.close();

	}

	public static void reverseDisplay(String value) {
		if (value.length() < 2)
			System.out.print(value);
		else {
			System.out.printf("%s", value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}

	}

}
