package chapter13_exercise;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.security.SecureRandom;

public class SortArrayListQuestion3 {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		SecureRandom random = new SecureRandom();

		System.out.print("The list before sorting:");
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
			System.out.print(list.get(i) + " ");
		}

		list.add(new BigDecimal("43143241234732894712934712847214812347129348712347912"));
		sort(list);

		System.out.print("\nThe list after sorting:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size(); i++) {
			Number numberPoint = null;
			int minIndex = i;
			for (int j = i; j < list.size(); j++) {

				if ((new BigDecimal(list.get(j).toString()))
						.compareTo(new BigDecimal(list.get(minIndex).toString())) == -1) {
					minIndex = j;
				}
			}

			numberPoint = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, numberPoint);
		}

	}
}
