package chapter18_exercise;

import java.util.*;

public class PrintDigitsReverselyQuestion8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer number:");
		int n = input.nextInt();

		reverseDisplay(n);
		
		input.close();

	}

	public static void reverseDisplay(int value) {
		if (value < 10)
			System.out.print(value);
		else {
			System.out.printf("%d", value % 10);
			reverseDisplay(value / 10);
		}

	}

}
