package chapter12_exercise;

import java.io.File;

public class RenameFilesQuestion28 {
	public static void main(String[] args) {

		String pathname = "C:\\Users\\Administrator\\Desktop\\共产主义";
		File directoryFile = new File(pathname);

		for (String e : directoryFile.list()) {

			String newNameString = "Exercise";
			String firstNumString = e.substring(e.indexOf('e') + 6, e.indexOf('_'));
			boolean isModify = false;

			if (Integer.valueOf(firstNumString) < 10) {
				newNameString = newNameString + "0" + firstNumString + e.substring(e.indexOf('_'));
				isModify = true;
			}

			if (isModify) {
				File file = new File(pathname + "\\" + e);
				file.renameTo(new File(pathname + "\\" + newNameString));
			}
		}

	}
}
