package chapter3_exercise;

import java.util.Scanner;

public class WindChillTemperatureQuestion20 {
	public static void main(String[] args){
		double OutDoorTemperature,WindSpeed,WindChillIndex;
		
		System.out.print("Enter the temperature in Fahrenheit"
							+ " between -58 and 41 : ");
		Scanner TemperInput = new Scanner(System.in);
		OutDoorTemperature = TemperInput.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour : ");
		Scanner WindSpeedInput = new Scanner(System.in);
		WindSpeed = WindSpeedInput.nextDouble();
		
		if((OutDoorTemperature > -58 && OutDoorTemperature < 41) && WindSpeed >= 2)
		{
			WindChillIndex = 35.74 + 0.6215 * OutDoorTemperature
							- 35.75 * Math.pow(WindSpeed,0.16)
							+ 0.4275 * OutDoorTemperature
							* Math.pow(WindSpeed,0.16);
			System.out.println("The wind chill index is " + WindChillIndex);
		}
		else
			System.out.println("The temperature and/or wind speed is invalid.");

		TemperInput.close();
		WindSpeedInput.close();
	}
}
