package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountScoreQuestion14 {
	public static void main(String[] args) throws FileNotFoundException {

		File scoreFile = new File("C:\\Users\\Administrator\\Desktop\\score.txt");

		Scanner inputScanner = new Scanner(scoreFile);

		int sum = 0, num = 0;

		while (inputScanner.hasNext()) {
			sum += inputScanner.nextInt();
			num++;
		}

		inputScanner.close();

		System.out.println("The sum is " + sum);
		System.out.println("The average is " + (1.0 * sum / num));
	}
}
