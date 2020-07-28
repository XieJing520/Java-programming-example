package chapter8_exercise;

public class ComputeTheWeeklyHoursForEachEmployeeQuestion4 {
	public static void main(String[] args) {
		int[][] workTime = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		int[][] totalWorkTime = new int[workTime.length][2];

		// Calculate the total of Working Time
		for (int i = 0; i < workTime.length; i++) {
			int timeSum = 0;
			for (int j = 0; j < workTime[i].length; j++) {
				timeSum += workTime[i][j];
			}
			totalWorkTime[i][0] = i;
			totalWorkTime[i][1] = timeSum;
		}
		sort(totalWorkTime);

		for (int i = 0; i < totalWorkTime.length; i++) {
			System.out.println("Employee " + totalWorkTime[i][0] + "'s working time is " + totalWorkTime[i][1]);
		}
	}

	public static void sort(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j][1] > array[minIndex][1]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int tempIndex = array[i][0];
				int tempValue = array[i][1];

				array[i][0] = array[minIndex][0];
				array[i][1] = array[minIndex][1];

				array[minIndex][0] = tempIndex;
				array[minIndex][1] = tempValue;
			}
		}
	}
}
