package chapter3_exercise;

import java.util.*;


public class HeadsOrTailsQuestion14 {
	public static void main(String[] args) {
		final int coin = (int)(Math.random() * 2);
		int userGuess;
		
		System.out.print("Enter a guess,0 for head,1 for tail:");
		Scanner input = new Scanner(System.in);
		userGuess = input.nextInt();
		
		
		if(userGuess != 0 && userGuess != 1)
		{
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		else if(coin == userGuess)
			System.out.println("You are correct!");
		else if(coin != userGuess)
			System.out.println("Your are wrong!");
		
		input.close();
	}
}
