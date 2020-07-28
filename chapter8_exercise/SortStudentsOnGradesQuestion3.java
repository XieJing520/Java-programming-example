package chapter8_exercise;


public class SortStudentsOnGradesQuestion3 {
	public static void main(String[] args) {
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
		int[][] score = new int[answers.length][2];

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			score[i][0] = i;
			score[i][1] = correctCount;

		}
		sort(score);

		for (int i = 0; i < score.length; i++) {
			System.out.println("Student " + score[i][0] + "'s correct count is " + score[i][1]);
		}
	}

	public static void sort(int[][] score) {
		for (int i = 0; i < score.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < score.length; j++) {
				if (score[j][1] < score[minIndex][1]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int tempIndex = score[i][0];
				int tempValue = score[i][1];

				score[i][0] = score[minIndex][0];
				score[i][1] = score[minIndex][1];

				score[minIndex][0] = tempIndex;
				score[minIndex][1] = tempValue;
			}
		}

	}
}
