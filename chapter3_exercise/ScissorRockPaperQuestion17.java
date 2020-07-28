package chapter3_exercise;

import java.util.*;


public class ScissorRockPaperQuestion17 {
	public static void main(String[] args) {
		// Generate the computer's guess
		final int userGuess,computerGuess = (int)(Math.random()*3);
		
		// Prompt the user to enter a guess
		System.out.print("scissor(0),rock(1),paper(2): ");
		Scanner input = new Scanner(System.in);
		userGuess = input.nextInt();
		
		// Check user's guess and Display the result
		if(computerGuess == 0)	// The situation that computer guess is a scissor
		{
			if(userGuess == 0)
			{
				System.out.print("The computer is scissor.");
				System.out.print("You are scissor too.");
				System.out.print("It is a draw");
			}
			else if(userGuess == 1)
			{
				System.out.print("The computer is scissor.");
				System.out.print("You are rock.");
				System.out.print("You won");
			}
			else if(userGuess == 2)
			{
				System.out.print("The computer is scissor.");
				System.out.print("You are paper.");
				System.out.print("You lost");
			}
		}
		else if(computerGuess == 1) // The situation that computer guess is a rock
		{
			if(userGuess == 0)
			{
				System.out.print("The computer is rock.");
				System.out.print("You are scissor.");
				System.out.print("You lost");
			}
			else if(userGuess == 1)
			{
				System.out.print("The computer is rock.");
				System.out.print("You are rock too.");
				System.out.print("It is a draw");
			}
			else if(userGuess == 2)
			{
				System.out.print("The computer is rock.");
				System.out.print("You are paper.");
				System.out.print("You won");
			}
		}
		else //The situation that computer guess is a paper
		{
			if(userGuess == 0)
			{
				System.out.print("The computer is paper.");
				System.out.print("You are scissor.");
				System.out.print("You won");
			}
			else if(userGuess == 1)
			{
				System.out.print("The computer is paper.");
				System.out.print("You are rock.");
				System.out.print("You lost");
			}
			else if(userGuess == 2)
			{
				System.out.print("The computer is paper.");
				System.out.print("You are paper too.");
				System.out.print("It is a draw");
			}
		}
		
		// Display invalid situation
		if(userGuess > 2 || userGuess < 0)
		{
			System.out.println("Error:Invalid Guess");
			System.exit(1);
		}
		
		input.close();
	}
}
