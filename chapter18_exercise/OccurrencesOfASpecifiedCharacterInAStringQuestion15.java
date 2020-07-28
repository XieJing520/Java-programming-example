package chapter18_exercise;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterInAStringQuestion15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String s = input.nextLine();

		System.out.println(count(s,'a'));

		input.close();

	}
	
	public static int count(String str, char a) {
		return count(str, a, 0);
	}
	
	public static int count(String str, char a, int high) {
		if(str.length()-1 == high) {
			return str.charAt(high)==a?1:0;
		}
		else {
			return (str.charAt(high)==a?1:0) + count(str,a,high+1);
		}
	}
	
}
