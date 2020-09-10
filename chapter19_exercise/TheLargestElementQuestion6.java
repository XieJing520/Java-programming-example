package chapter19_exercise;

public class TheLargestElementQuestion6 {

	public static void main(String[] args) {

		Double[][] testList1 = new Double[2][2];
		Integer[][] testList2 = new Integer[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				testList1[i][j] = new Double((i + 1) + (j + 1));
				testList2[i][j] = new Integer((i + 1) + (j + 1));
			}
		}

		System.out.println(max(testList1));
		System.out.println(max(testList2));

	}

	public static <E extends Comparable<E>> E max(E[][] list) {

		if (list == null) {
			return null;
		} else {
			E maxElement = list[0][0];
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < list[i].length; j++) {
					if (list[i][j].compareTo(maxElement) > 0) {
						maxElement = list[i][j];
					}
				}
			}
			return maxElement;
		}
	}

}
