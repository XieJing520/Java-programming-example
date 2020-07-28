package chapter4_exercise;

import java.util.*;


public class CheckSubstringQuestion22 {
	public static void main(String[] args) {
		String string1,string2;
		
		System.out.print("Enter string s1: ");
		Scanner input = new Scanner(System.in);
		string1 = input.nextLine();

		System.out.print("Enter string s2: ");
		string2 = input.nextLine();
		
		System.out.println(string1.contains(string2)
							?string2 + " is a substring of " + string1
							:string2 + " is not a substring of " + string1);

		input.close();
	}
}
