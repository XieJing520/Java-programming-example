package chapter5_exercise;

import java.util.*;


public class FindTheHighestScoreQuestion8 {
	public static void main(String[] args) {
		int numberOfStudent;
		double highestScore = 0,tempScore;
		String studentName = "",tempName;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number of the students:");
		numberOfStudent = inputScanner.nextInt();
		
		if(numberOfStudent > 0)
		{
			for(int i = 1;i <= numberOfStudent;i++)
			{
				System.out.print("Enter the student's name: ");
				tempName = inputScanner.next();
				System.out.print("Enter the student's score: ");
				tempScore = inputScanner.nextDouble();
				
				if(tempScore > highestScore)
				{
					studentName = tempName;
					highestScore = tempScore;
				}
			}
			System.out.println("The name of the student with the highest score is " + studentName);
		}
		else
			System.out.println("The number of the students is less than or equals to 0\n"
								+ "Invalid input");
		
		inputScanner.close();
	}
}
