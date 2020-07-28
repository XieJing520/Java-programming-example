package chapter5_exercise;

import java.util.Scanner;

public class ScissorAndRockAndPaperQuestion34 {
	public static void main(String[] args) {
		int userWin,computerWin;
		userWin = computerWin = 0;
		Scanner input = new Scanner(System.in);
		
		
		while(userWin <= 2 && computerWin <= 2)
		{
			int userGuess,computerGuess = (int)(Math.random()*3);
			
			// Prompt the user to enter a guess
			System.out.print("scissor(0),rock(1),paper(2): ");
			userGuess = input.nextInt();
			
			// Check user's guess and Display the result
			if(computerGuess == 0)	// The situation that computer guess is a scissor
			{
				if(userGuess == 0)
				{
					System.out.println("The computer is scissor.");
					System.out.println("You are scissor too.");
					System.out.println("It is a draw");
				}
				else if(userGuess == 1)
				{
					System.out.println("The computer is scissor.");
					System.out.println("You are rock.");
					System.out.println("You won");
					userWin++;
				}
				else if(userGuess == 2)
				{
					System.out.println("The computer is scissor.");
					System.out.println("You are paper.");
					System.out.println("You lost");
					computerWin++;
				}
			}
			else if(computerGuess == 1) // The situation that computer guess is a rock
			{
				if(userGuess == 0)
				{
					System.out.println("The computer is rock.");
					System.out.println("You are scissor.");
					System.out.println("You lost");
					computerWin++;
				}
				else if(userGuess == 1)
				{
					System.out.println("The computer is rock.");
					System.out.println("You are rock too.");
					System.out.println("It is a draw");
				}
				else if(userGuess == 2)
				{
					System.out.println("The computer is rock.");
					System.out.println("You are paper.");
					System.out.println("You won");
					userWin++;
				}
			}
			else //The situation that computer guess is a paper
			{
				if(userGuess == 0)
				{
					System.out.println("The computer is paper.");
					System.out.println("You are scissor.");
					System.out.println("You won");
					userWin++;
				}
				else if(userGuess == 1)
				{
					System.out.println("The computer is paper.");
					System.out.println("You are rock.");
					System.out.println("You lost");
					computerWin++;
				}
				else if(userGuess == 2)
				{
					System.out.println("The computer is paper.");
					System.out.println("You are paper too.");
					System.out.println("It is a draw");
				}
			}
			
			// Display invalid situation
			if(userGuess > 2 || userGuess < 0)
			{
				System.out.println("Error:Invalid Guess");
				System.exit(1);
			}
		}
		System.out.println("The game is over.");
		System.out.printf("You total won %d times\n", userWin);
		System.out.printf("Computer total won %d times\n", computerWin);
		
		input.close();
	}
}
