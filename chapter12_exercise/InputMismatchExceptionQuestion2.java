package chapter12_exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionQuestion2 {
	public static void main(String[] args) {

		int number1, number2;
		Scanner input = new Scanner(System.in);

		do {
			try {
				System.out.print("Enter the first number:");
				number1 = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong Input,Enter it again!");
				input.nextLine();
			}
		} while (true);

		do {
			try {
				System.out.print("Enter the second number:");
				number2 = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong Input,Enter it again!");
				input.nextLine();
			}
		} while (true);

		System.out.printf("The sum is %d\n", number1 + number2);

		input.close();
	}
}
