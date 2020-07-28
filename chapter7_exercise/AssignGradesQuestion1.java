package chapter7_exercise;

import java.util.*;

public class AssignGradesQuestion1 {
	public static void main(String[] args) {
		int numberOfStudent;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		numberOfStudent = inputScanner.nextInt();
		
		if(numberOfStudent <= 0)
		{
			System.out.println("Invalid input");
			System.exit(1);
		}
		else
		{
			int maxScore = 0;
			int[] studentScore = new int[numberOfStudent];
			
			System.out.printf("Enter %d score: ", numberOfStudent);
			for(int i = 0;i < studentScore.length;i++)
			{
				studentScore[i] = inputScanner.nextInt();
				if(studentScore[i] > maxScore)
					maxScore = studentScore[i];
			}
			for(int i = 0;i < studentScore.length;i++)
			{
				if(studentScore[i] >= maxScore - 10)
					System.out.printf("Student %d score is %d and grade is A\n", i, studentScore[i]);
				else if(studentScore[i] >= maxScore - 20)
					System.out.printf("Student %d score is %d and grade is B\n", i, studentScore[i]);
				else if(studentScore[i] >= maxScore - 30)
					System.out.printf("Student %d score is %d and grade is C\n", i, studentScore[i]);
				else if(studentScore[i] >= maxScore - 40)
					System.out.printf("Student %d score is %d and grade is D\n", i, studentScore[i]);
				else
					System.out.printf("Student %d score is %d and grade is F\n", i, studentScore[i]);
			}	
		}
		
		inputScanner.close();
	}
}