package chapter5_exercise;

import java.util.*;

public class LongestCommonPrefixQuestion51 {
	public static void main(String[] args) {
		int lengthUserString1, lengthUserString2;
		String userString1, userString2, prefixString = "";

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		userString1 = inputScanner.nextLine();
		lengthUserString1 = userString1.length();

		System.out.print("Enter the second string: ");
		userString2 = inputScanner.nextLine();
		lengthUserString2 = userString1.length();

		for (int strIndex = 0; strIndex < (lengthUserString1 > lengthUserString2 ? lengthUserString2
				: lengthUserString1); strIndex++) {
			if (userString1.charAt(strIndex) == userString2.charAt(strIndex)) {
				prefixString += userString1.charAt(strIndex);
				continue;
			}
			break;
		}

		if (prefixString.length() != 0)
			System.out.println("The common prefix is " + prefixString);
		else
			System.out.printf("%s and %s have no common prefix", userString1, userString2);

		inputScanner.close();
	}
}
