package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceTextQuestion16 {
	public static void main(String[] args) throws FileNotFoundException {
		File testFile = new File("C:\\Users\\Administrator\\Desktop\\test.txt");

		Scanner file = new Scanner(testFile);

		ArrayList<String> list = new ArrayList<String>();

		while (file.hasNext()) {
			String string = file.nextLine().replaceAll("TaoTao", "");
			System.out.println(string);
			list.add(string);
		}
		file.close();

		PrintWriter pw = new PrintWriter(testFile);

		for (int i = 0; i < list.size(); i++) {
			pw.println(list.get(i));
		}

		pw.close();

	}
}
