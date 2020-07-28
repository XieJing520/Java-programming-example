package chapter18_exercise;

public class OccurrencesOfASpecifiedCharacterInAArrayQuestion17 {

	public static void main(String[] args) {
		char[] chars = { 'A', 'A', 's', '6', 'C', 'd', 'A' };

		System.out.println(count(chars, 'A'));

	}

	public static int count(char[] chars, char ch) {
		return count(chars, ch, 0);
	}

	public static int count(char[] chars, char ch, int high) {
		if (high == chars.length - 1)
			return chars[high] == ch ? 1 : 0;
		else
			return (chars[high] == ch ? 1 : 0) + count(chars, ch, high + 1);
	}

}
