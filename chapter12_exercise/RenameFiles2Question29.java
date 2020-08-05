package chapter12_exercise;

import java.io.File;

public class RenameFiles2Question29 {
	public static void main(String[] args) {

		String pathname = "C:\\Users\\Administrator\\Desktop\\共产主义";
		File directoryFile = new File(pathname);

		for (String e : directoryFile.list()) {

			String newNameString = e.substring(0, e.indexOf('_') + 1);
			String secondNumString = e.substring(e.indexOf('_') + 1, e.indexOf('.'));
			boolean isModify = false;

			if (Integer.valueOf(secondNumString) < 10) {
				newNameString = newNameString + "0" + secondNumString + ".txt";
				isModify = true;
			}

			if (isModify) {
				File file = new File(pathname + "\\" + e);
				file.renameTo(new File(pathname + "\\" + newNameString));
			}
		}

	}
}
