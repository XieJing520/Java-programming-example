package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingWordsQuestion19 {
	public static void main(String[] args) throws FileNotFoundException {

		File LincolnTxtFile = new File("C:\\Users\\Administrator\\Desktop\\Lincoln.txt");

		Scanner input = new Scanner(LincolnTxtFile);

		int words = 0;

		while (input.hasNext()) {
			words++;
			input.next();
		}

		input.close();

		System.out.println(words);
	}
}
