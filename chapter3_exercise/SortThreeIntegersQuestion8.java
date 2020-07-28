package chapter3_exercise;

import java.util.*;


public class SortThreeIntegersQuestion8 {
	public static void main(String[] args) {
		int integer1, integer2, integer3;
		
		System.out.print("Enter the first integer number: ");
		Scanner input = new Scanner(System.in);
		integer1 = input.nextInt();
		
		System.out.print("Enter the second integer number: ");
		integer2 = input.nextInt();
		
		System.out.print("Enter the third integer number: ");
		integer3 = input.nextInt();
		
		if(integer1 < integer2)
		{
			if(integer1 < integer3)
			{
				System.out.print(integer1 + " ");
				if(integer2 < integer3)
					System.out.print(integer2 + " " + integer3);
				else
					System.out.print(integer3 + " " + integer2);
			}
			else
				System.out.print(integer3 + " " + integer1 + " " + integer2);
		}
		else
		{
			if(integer2 < integer3)
			{
				System.out.print(integer2 + " ");
				if(integer1 < integer3)
					System.out.print(integer1 + " " + integer3);
				else
					System.out.print(integer3 + " " + integer1);
			}
			else
				System.out.print(integer3 + " " + integer2 + " " + integer1);
		}

		input.close();
	}
}
