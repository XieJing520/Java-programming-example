package chapter11_exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class PerfectSquareQuestion17 {
	public static void main(String[] args) {
		int m, n;
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter an integer m: ");
		m = inputScanner.nextInt();
		n = SmallestN(factorOccursOddList(factorsList(m)));

		System.out.printf("The smallest number n for m * n to be a perfect square is %d\n", n);
		System.out.printf("m * n is %d\n", m * n);

		inputScanner.close();
	}

	public static int SmallestN(ArrayList<Integer> list) {
		int n = 1;
		for (Integer e : list) {
			n *= e;
		}
		return n;
	}

	public static ArrayList<Integer> factorsList(int num) {
		ArrayList<Integer> factorsList = new ArrayList<Integer>();
		int factor = 2;
		while (num != 1) {
			if (num % factor == 0) {
				factorsList.add(factor);
				num /= factor;
			} else
				factor++;
		}
		return factorsList;
	}

	public static ArrayList<Integer> factorOccursOddList(ArrayList<Integer> factorsList) {

		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int i = 0; i < factorsList.size(); i++) {
			int occurCount = 0;
			for (int j = 0; j < factorsList.size(); j++) {
				if (factorsList.get(j) == factorsList.get(i))
					occurCount++;
			}
			if (occurCount % 2 == 1 && !factors.contains(factorsList.get(i)))
				factors.add(factorsList.get(i));
		}

		return factors;
	}
}
