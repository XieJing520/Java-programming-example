package chapter2_exercise;

import java.util.*;


public class CostDriveQuestion23 {
	public static void main(String[] args) {
		double DriveDistance,MilePerGallon,PricePerGallon,CostDrive;
		Scanner Input;
		
		System.out.print("Enter the driving distance:");
		Input = new Scanner(System.in);
		DriveDistance = Input.nextDouble();
		
		System.out.print("Enter miles per gallon:");
		MilePerGallon = Input.nextDouble();

		
		System.out.print("Enter price per gallon:");
		PricePerGallon = Input.nextDouble();

		
		CostDrive = DriveDistance / MilePerGallon * PricePerGallon;
		System.out.println("The cost of driving is $" + CostDrive);

		Input.close();
	}
}
