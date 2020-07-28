package chapter18_exercise;

public class FindTheNumberOfUpperLetterQuestion16 {

	public static void main(String[] args) {
		char[] chars = { 'B', 'i', 'A', 'J', 'b', 'a', 'z', '4', '2', 'K' };

		System.out.println(count(chars));

	}

	public static int count(char[] chars) {
		return count(chars, 0);
	}

	public static int count(char[] chars, int high) {
		if (high == chars.length - 1)
			return isUpperLetter(chars[high]);
		else
			return isUpperLetter(chars[high]) + count(chars, high + 1);
	}

	public static int isUpperLetter(char c) {
		return ('A' <= c && c <= 'Z') ? 1 : 0;
	}
}
