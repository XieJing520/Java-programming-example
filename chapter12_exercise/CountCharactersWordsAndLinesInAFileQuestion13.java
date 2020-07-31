package chapter12_exercise;

import java.io.File;
import java.util.*;

public class CountCharactersWordsAndLinesInAFileQuestion13 {
	public static void main(String[] args) throws Exception {

		File txtFile = new File("C:\\Users\\Administrator\\Desktop\\word.txt");

		Scanner input = new Scanner(txtFile);

		int chars, words, lines;

		chars = words = lines = 0;

		while (input.hasNext()) {
			String string = input.nextLine();

			String[] strings = string.split("[,.! \n]");

			for (int i = 0; i < strings.length; i++) {
				words++;
				chars += strings[i].length();
			}

			lines++;

		}

		System.out.println("chars:" + chars);
		System.out.println("words:" + words);
		System.out.println("lines:" + lines);

		input.close();

	}
}
