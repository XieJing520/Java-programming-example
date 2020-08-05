package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceWordsQuestion27 {
	public static void main(String[] args) throws FileNotFoundException {

		String path = "C:\\Users\\Administrator\\Desktop\\共产主义";
		File directoryFile = new File(path);

		for (String e : directoryFile.list()) {

			ArrayList<String> list = new ArrayList<String>();
			File file = new File(path + "\\" + e);
			Scanner inputScanner = new Scanner(file);

			while (inputScanner.hasNext()) {
				String tempString = inputScanner.nextLine();

				String firstNumString = tempString.substring(tempString.indexOf('e') + 6, tempString.indexOf('_'));
				String secondNumString = tempString.substring(tempString.indexOf('_') + 1);

				String newString = "Exercise";
				boolean hasModify = false;
				if (Integer.valueOf(firstNumString) < 10) {
					newString += "0" + firstNumString + "_";
					hasModify = true;
				}
				if (Integer.valueOf(secondNumString) < 10) {
					newString += "0" + secondNumString;
					hasModify = true;
				}

				if (hasModify) {
					list.add(newString);
				} else {
					list.add(tempString);
				}

			}
			inputScanner.close();

			PrintWriter fileWriter = new PrintWriter(file);

			for (int index = 0; index < list.size(); index++) {
				fileWriter.println(list.get(index));
			}

			fileWriter.close();

		}

	}
}
