package chapter3_exercise;

import java.util.*;


public class LotteryQuestion15 {
	public static void main(String[] args) {
		int guess, guessDigit1, guessDigit2, guessDigit3;
		final int lotteryDigit1, lotteryDigit2, lotteryDigit3;
		// Generate a lottery number
		final int lottery = (int)(Math.random() * 1000);
		
		// Prompt the user to enter a guess
		System.out.print("Enter your lottery pick (three digits): ");
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		
		// Get digits from guess
		guessDigit1 = guess / 100;
		guessDigit2 = guess % 100 / 10;
		guessDigit3 = guess % 10;
		
		// Get digits from lottery
		lotteryDigit1 = lottery / 100;
		lotteryDigit2 = lottery % 100 / 10;
		lotteryDigit3 = lottery % 10;
		
		// Check the guess
		if(lottery == guess)
			System.out.println("Exact match:you win $10000");		
		else if((lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2)
			||(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3)
			||(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1)
			||(lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2)
			||(lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1))
		{
			System.out.println("Match all digits:you win $3000");
		}
		else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3
			||lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3
			||lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)
		{
			System.out.println("Match one digit:you win $1000");
		}
		else
		{
			System.out.println("Sorry,no match");
		}
		
		input.close();
	}
}