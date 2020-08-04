package chapter12_exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWriteDataQuestion15 {
	public static void main(String[] args) throws IOException {

		File numFile = new File("C:\\Users\\Administrator\\Desktop\\Exercise12_15.txt");

		if (!numFile.exists()) {
			numFile.createNewFile();
		}

		PrintWriter numFileWriter = new PrintWriter(numFile);

		for (int i = 0; i < 100; i++) {
			numFileWriter.print((int) (Math.random() * 100) + " ");
		}

		numFileWriter.close();

		Scanner numFileScanner = new Scanner(numFile);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			list.add(numFileScanner.nextInt());
		}

		list.sort(null);

		for (int i = 0; i < 100; i++) {
			System.out.println(list.get(i));
		}

		numFileScanner.close();

	}
}
