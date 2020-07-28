package chapter5_exercise;

import java.util.*;

public class CountPostiveAndNegativeQuestion1 {
	public static void main(String[] args) {
		int numberOfPositive, numberOfNegative, total, temp;
		double sum, average;
		Scanner input = new Scanner(System.in);

		numberOfNegative = numberOfPositive = total = (int) (sum = 0);
		System.out.print("Enter an integer, the input ends if it is 0: ");

		while ((temp = input.nextInt()) != 0) {
			if (temp > 0)
				numberOfPositive++;
			if (temp < 0)
				numberOfNegative++;
			total++;
			sum += temp;
		}

		if (total == 0)
			System.out.println("No numbers are entered except 0");
		else {
			average = sum / total;
			System.out.printf("The number of positives is %d\n", numberOfPositive);
			System.out.printf("The number of negatives is %d\n", numberOfNegative);
			System.out.printf("The total is %.1f\n", sum);
			System.out.printf("The average is %.2f\n", average);
		}

		input.close();
	}
}
