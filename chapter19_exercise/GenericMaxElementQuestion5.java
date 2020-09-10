package chapter19_exercise;

public class GenericMaxElementQuestion5 {

	public static void main(String[] args) {

		Double[] testList1 = new Double[3];
		Integer[] testList2 = new Integer[3];

		for (int i = 0; i < 3; i++) {
			testList1[i] = new Double((i + 1) * 1.0);
			testList2[i] = new Integer(i + 1);
		}

		System.out.println(max(testList1));
		System.out.println(max(testList2));
	}

	public static <E extends Comparable<E>> E max(E[] list) {

		if (list == null) {
			return null;
		} else {
			E maxElement = list[0];

			for (int i = 0; i < list.length; i++) {
				if (list[i].compareTo(maxElement) > 0) {
					maxElement = list[i];
				}
			}

			return maxElement;
		}

	}

}
