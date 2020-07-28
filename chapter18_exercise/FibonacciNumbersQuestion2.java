package chapter18_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumbersQuestion2 {
	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(0L);
		list.add(1L);

		Scanner input = new Scanner(System.in);
		System.out.print("n:");
		int n = input.nextInt();
		for (int i = 3; i <= n; i++) {
			list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
		}
		System.out.println(list.get(n - 1));

		input.close();
	}
}
