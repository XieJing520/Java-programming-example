package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessScoresInATextFileOnTheWebQuestion23 {
	public static void main(String[] args) throws FileNotFoundException {

		File scoreFile = new File("C:\\Users\\Administrator\\Desktop\\testscore.txt");
		Scanner inputScanner = new Scanner(scoreFile);

		int sum, count;
		sum = count = 0;

		while (inputScanner.hasNext()) {
			sum += inputScanner.nextInt();
			count++;
		}

		System.out.println("sum:" + sum);
		System.out.println("average:" + (1.0 * sum / count));

		inputScanner.close();
	}
}
