package chapter4_exercise;

import java.util.*;


public class  SortThreeCitiesQuestion24 {
	public static void main(String[] args) {
		String city1,city2,city3;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		city1 = inputScanner.nextLine();
		System.out.print("Enter the second city: ");
		city2 = inputScanner.nextLine();
		System.out.print("Enter the third city: ");
		city3 = inputScanner.nextLine();
		
		if(city1.compareTo(city2) > 0) // city1 > city2
		{
			if(city2.compareTo(city3) > 0) // city2 > city3
				System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
			else //city2 < city3
			{
				if(city1.compareTo(city3) > 0) // city1 > city3
					System.out.println("The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
				else // city1 < city3
					System.out.println("The three cities in alphabetical order are " + city2 + " " + city1 +  " " + city3);
			}
		}
		else // city1 < city2
		{
			if(city1.compareTo(city3) > 0) // city1 > city3
				System.out.println("The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
			else //city1 < city3
			{
				if(city2.compareTo(city3) > 0) // city2 > city3
					System.out.println("The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2);
				else // city2 < city3
					System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
			}
		}
		
		inputScanner.close();
	}
}
