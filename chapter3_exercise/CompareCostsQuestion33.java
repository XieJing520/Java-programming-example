package chapter3_exercise;

import java.util.*;


public class  CompareCostsQuestion33 {
	public static void main(String[] args) {
		double weightPackage1,pricePackage1;
		double weightPackage2,pricePackage2;
		
		System.out.print("Enter weight and price for package 1: ");
		Scanner input = new Scanner(System.in);
		weightPackage1 = input.nextDouble();
		pricePackage1 = input.nextDouble();
		
		
		System.out.print("Enter weight and price for package 2: ");
		weightPackage2 = input.nextDouble();
		pricePackage2 = input.nextDouble();
		
		
		if(pricePackage1 / weightPackage1 < pricePackage2 / weightPackage2)
			System.out.println("Package 1 has a better price.");
		else if(pricePackage1 / weightPackage1 > pricePackage2 / weightPackage2)
			System.out.println("Package 2 has a better price.");
		else
			System.out.println("Two packages have the same price.");
		
		input.close();
	}
}
