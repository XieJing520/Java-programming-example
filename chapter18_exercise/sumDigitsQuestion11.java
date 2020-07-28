package chapter18_exercise;

import java.util.Scanner;

public class sumDigitsQuestion11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer number:");
		int n = input.nextInt();

		System.out.println(sumDigits(n));

		input.close();

	}

	public static int sumDigits(long n) {
		if (n < 10)
			return (int) n;
		else
			return (int) (n % 10) + sumDigits(n / 10);
	}
}
