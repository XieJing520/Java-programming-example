package chapter4_exercise;

import java.util.*;


public class ProcessStringQuestion20 {
	public static void main(String[] args) {
		String string;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		string = input.nextLine();
		
		if(string.length() == 0)
			System.exit(1);
		
		System.out.println("Its length is " + string.length());
		System.out.println("Its first character is " + string.charAt(0));
		
		input.close();
	}
}
