package chapter7_exercise;

import java.util.*;

public class SortCharactersInAStringQuestion34 {
	public static void main(String[] args) {
		String string;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		string = inputScanner.next();
		
		string = sort(string);
		System.out.printf("The sorted string is %s\n", string);
		
		inputScanner.close();
	}

	public static String sort(String s) {
		char[] charString = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			charString[i] = s.charAt(i);

		Arrays.parallelSort(charString);

		String sortString = new String(charString);

		return sortString;
	}

}
