package chapter8_exercise;

import java.util.*;

public class NineHeadsAndTailsQuestion11 {
	public static void main(String[] args) {
		int num, coinStringLength;
		char[][] coin = new char[3][3];
		String coinString;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 511: ");
		num = inputScanner.nextInt();
		coinString = Integer.toBinaryString(num);
		coinStringLength = coinString.length();

		if (num < 0 || num > 511)
			System.exit(1);

		for (int i = 0; i < 9 - coinStringLength; i++)
			coinString = "0" + coinString;

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (coinString.charAt(row * 3 + col) == '1')
					coin[row][col] = 'T';
				else
					coin[row][col] = 'H';
			}
		}

		displayHeadsAndTails(coin);

		inputScanner.close();
	}

	public static void displayHeadsAndTails(char[][] coin) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++)
				System.out.printf("%c ", coin[row][col]);
			System.out.println();
		}
	}
}
