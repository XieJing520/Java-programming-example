package chapter7_exercise;

import java.util.*;

public class ChineseZodiacQuestion33 {
	public static void main(String[] args) {
		String[] chineseZodiac = { "monkey", "rooster", "dog", "pig",
				"rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = inputScanner.nextInt();

		System.out.printf("%s\n", chineseZodiac[year % 12]);
		inputScanner.close();
	}
}
