package chapter4_exercise;

import java.util.*;


public class FindUnicodeQuestion9 {
	public static void main(String[] args) {
		char char1;
		int unicodeOfChar1;
		String string1;
		
		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		string1 = input.next();
		
		char1 = string1.charAt(0);
		unicodeOfChar1 = (int)char1;
		
		System.out.printf("The Unicode for the characte %c is %d", char1, unicodeOfChar1);
		
		input.close();
	}
}
