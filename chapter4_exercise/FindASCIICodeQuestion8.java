package chapter4_exercise;

import java.util.*;


public class FindASCIICodeQuestion8 {
	public static void main(String[] args) {
		
		int decimal, binary;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		decimal = input.nextInt();
		if(decimal >= 0 && decimal <= 127)
		{
			binary = (byte)decimal;
			System.out.printf("The chararter for ASCII code %d is %c", decimal, binary);
		}
		else
			System.out.println("Invalid Input");

		input.close();
	}
}
