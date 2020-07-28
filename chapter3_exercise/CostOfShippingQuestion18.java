package chapter3_exercise;

import java.util.*;

/*
public class CostOfShippingQuestion18 {
	public static void main(String[] args) {
		double weightOfShip;
		
		// Prompt the user to enter the weight of the package
		System.out.print("Enter the weight of the package(in pounds): ");
		Scanner input = new Scanner(System.in);
		weightOfShip = input.nextDouble();
		
		// Display the cost of shipping and other situation
		if(weightOfShip > 0 && weightOfShip <= 1)
			System.out.println("The cost of shipping is 3.5");
		else if(weightOfShip > 1 && weightOfShip <= 3)
			System.out.println("The cost of shipping is 5.5");
		else if(weightOfShip > 3 && weightOfShip <= 10)
			System.out.println("The cost of shipping is 8.5");
		else if(weightOfShip > 10 && weightOfShip <= 20)
			System.out.println("The cost of shipping is 10.5");
		else if(weightOfShip <= 0)
			System.out.println("Invalid input");
		else if(weightOfShip > 20)
			System.out.println("The package cannot be shipped");
		
		input.close();
	}
}
*/


public class CostOfShippingQuestion18 {
	public static void main(String[] args) {
		double costOfShip = 0,weightOfShip;
		
		// Prompt the user to enter the weight of the package
		System.out.print("Enter the weight of the package(in pounds): ");
		Scanner input = new Scanner(System.in);
		weightOfShip = input.nextDouble();
		
		// Display the cost of shipping and other situation
		if(weightOfShip > 0 && weightOfShip <= 1)
			costOfShip = 3.5;
		else if(weightOfShip > 1 && weightOfShip <= 3)
			costOfShip = 5.5;
		else if(weightOfShip > 3 && weightOfShip <= 10)
			costOfShip = 8.5;
		else if(weightOfShip > 10 && weightOfShip <= 20)
			costOfShip = 10.5;
		else if(weightOfShip <= 0)
			System.out.println("Invalid input");
		else if(weightOfShip > 20)
			System.out.println("The package cannot be shipped");
		
		if(costOfShip != 0)
		{
			System.out.println("The cost of shipping is " + costOfShip);
		}
		
		input.close();
	}
}


