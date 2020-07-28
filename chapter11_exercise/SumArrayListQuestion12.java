package chapter11_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayListQuestion12 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter five numbers:");
		for (int i = 0; i < 5; i++) {
			list.add(inputScanner.nextDouble());
		}

		System.out.printf("The sum of list is %.2f", sum(list));

		inputScanner.close();
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;

		for (Double e : list) {
			sum += e;
		}
		return sum;
	}
}
