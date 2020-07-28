package chapter7_exercise;

import java.util.Scanner;

public class ConsecutiveFourEqualNumbersQuestion30 {
	public static void main(String[] args) {
		int numberOfValue;
		int[] values;

		System.out.print("Enter the number of value: ");
		Scanner inputScanner = new Scanner(System.in);
		numberOfValue = inputScanner.nextInt();
		values = new int[numberOfValue];

		System.out.print("Enter the values: ");
		for (int i = 0; i < numberOfValue; i++)
			values[i] = inputScanner.nextInt();

		if (isConsecutiveFour(values))
			System.out.println("The list has consecutive fours");
		else
			System.out.println("The list has no consecutive fours");

		inputScanner.close();
	}

	public static boolean isConsecutiveFour(int[] values) {
		int consecutiveFourCount = 1;

		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 1; j <= 3; j++)
				if (values[i] == values[i + j])
					consecutiveFourCount++;
			if (consecutiveFourCount == 4)
				return true;
		}
		return false;
	}
}
