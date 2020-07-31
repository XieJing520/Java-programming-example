package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReformatJavaSourceCodeQuestion12 {
	public static void main(String[] args) throws FileNotFoundException {

		File codeFile = new File("C:\\Users\\Administrator\\Desktop\\CountNumberOfLinesOfCode.java");

		Scanner file = new Scanner(codeFile);

		ArrayList<String> list = new ArrayList<String>();

		while (file.hasNext()) {
			String string = file.nextLine();
			string = string.replace("{", "\n{");
			list.add(string);
		}
		file.close();

		PrintWriter pw = new PrintWriter(codeFile);

		for (int i = 0; i < list.size(); i++) {
			pw.println(list.get(i));
		}

		pw.close();

	}
}
