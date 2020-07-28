package chapter11_exercise;

import java.util.ArrayList;

public class ArrayListOfCharacterQuestion18 {
	public static void main(String[] args) {
		String string = "abc";

		ArrayList<Character> chars;
		chars = toCharacterArray(string);
		display(chars);

	}

	public static void display(ArrayList<Character> chars) {
		for (Character e : chars) {
			System.out.printf("%c ", e);
		}
		System.out.println();
	}

	public static ArrayList<Character> toCharacterArray(String s) {
		ArrayList<Character> chars = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++)
			chars.add(s.charAt(i));

		return chars;
	}
}
