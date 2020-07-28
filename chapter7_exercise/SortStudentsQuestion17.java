package chapter7_exercise;

import java.util.*;

public class SortStudentsQuestion17 {
	public static void main(String[] args) {
		int numberOfStudent;
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the number of the students: ");
		numberOfStudent = inputScanner.nextInt();

		String[] studentsName = new String[numberOfStudent];
		double[] studentsScore = new double[numberOfStudent];

		for (int i = 0; i < numberOfStudent; i++) {
			System.out.printf("Enter the student%d's name: ", i + 1);
			studentsName[i] = inputScanner.next();

			System.out.printf("Enter the student%d's score: ", i + 1);
			studentsScore[i] = inputScanner.nextDouble();
		}

		selectionSort(studentsName, studentsScore);
		displayNameAndScore(studentsName, studentsScore);

		inputScanner.close();
	}

	public static void selectionSort(String[] studName, double[] studScore) {
		for (int i = 0; i < studScore.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			String currentName = studName[i].charAt(0) + studName[i].substring(1);
			double currentMax = studScore[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < studScore.length; j++) {
				if (currentMax < studScore[j]) {
					currentMax = studScore[j];
					currentName = studName[j].charAt(0) + studName[j].substring(1);
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				studScore[currentMinIndex] = studScore[i];
				studScore[i] = currentMax;

				studName[currentMinIndex] = studName[i].charAt(0) + studName[i].substring(1);
				studName[i] = currentName.charAt(0) + currentName.substring(1);
			}
		}
	}

	public static void displayNameAndScore(String[] studName, double[] studScore) {
		System.out.println("Name\t\tScore");
		for (int i = 0; i < studScore.length; i++)
			System.out.printf("%s\t\t%f\n", studName[i], studScore[i]);
	}
}
