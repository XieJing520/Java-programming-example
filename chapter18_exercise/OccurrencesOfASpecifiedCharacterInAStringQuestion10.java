package chapter18_exercise;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterInAStringQuestion10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String s = input.nextLine();

		System.out.println(count(s,'a'));

		input.close();

	}
	public static int count(String str, char a) {
		if(str.length() == 1) {
			return str.charAt(0) == a?1:0;
		}
		else {
			return (str.charAt(0) == a?1:0) + count(str.substring(1), a);
		}
		
	}
}
