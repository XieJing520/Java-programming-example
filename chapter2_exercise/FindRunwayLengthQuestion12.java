package chapter2_exercise;

import java.util.*;

public class FindRunwayLengthQuestion12 {
	public static void main(String[] args) {
		double RunwayLength,AirplaneAcceleration,AirplaneSpeed;
		
		System.out.print("Enter speed and acceleration:");
		Scanner AirSpeedAccelInput = new Scanner(System.in);
		
		
		AirplaneSpeed = AirSpeedAccelInput.nextDouble();
		AirplaneAcceleration = AirSpeedAccelInput.nextDouble();
		
		RunwayLength = Math.pow(AirplaneSpeed, 2) / (2 * AirplaneAcceleration);
		System.out.println("The minimum runway length for this airplane is "
							+ RunwayLength);
		
		AirSpeedAccelInput.close();
		
	}
}
