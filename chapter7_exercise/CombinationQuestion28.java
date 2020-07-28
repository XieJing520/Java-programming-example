package chapter7_exercise;

import java.util.*;

public class CombinationQuestion28 {
	public static void main(String[] args) {
		int[] numbers = new int[10];

		System.out.print("Enter 10 numbers:");
		Scanner inputScanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++)
			numbers[i] = inputScanner.nextInt();

		for (int i = 0; i < 10; i++)
			for (int j = i + 1; j < 10; j++)
				System.out.printf("(%d, %d)\n", numbers[i], numbers[j]);

		inputScanner.close();
	}
}
