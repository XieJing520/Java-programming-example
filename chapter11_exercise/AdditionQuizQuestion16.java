package chapter11_exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class AdditionQuizQuestion16 {
	public static void main(String[] args) {
		ArrayList<Integer> answersList = new ArrayList<Integer>();

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		answersList.add(answer);
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			if (answersList.contains(answer))
				System.out.printf("You already entered %d\n", answer);
			answersList.add(answer);
		}

		System.out.println("You got it!");

		input.close();
	}
}
