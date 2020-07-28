package chapter11_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElementInArrayListQuestion4 {
	public static void main(String[] args) {
		ArrayList<Integer> testArrayList = null;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter nums:");
		while (true) {
			int num = inputScanner.nextInt();
			if (num == 0)
				break;
			if (testArrayList == null)
				testArrayList = new ArrayList<Integer>();
			testArrayList.add(num);
		}

		System.out.printf("The largest number is %d\n", max(testArrayList));

		inputScanner.close();
	}

	public static Integer max(ArrayList<Integer> list) {
		Integer max = null;
		if (list == null || list.size() == 0)
			return max;
		else {
			int tempMax = list.get(0);
			for (Integer e : list)
				if (e > tempMax)
					tempMax = e;
			return tempMax;
		}
	}
}
