package chapter2_exercise;

import java.util.*;


public class CalculateEnergyQuestion10 {
	public static void main(String[] args) {
		double Joule,WaterKilo,InitTemp,FinalTemp;
		
		System.out.print("Enter the amount of water in kilograms : ");
		Scanner WaterInput = new Scanner(System.in);
		WaterKilo = WaterInput.nextDouble();
		
		System.out.print("Enter the initial temperature : ");
		Scanner InitTempInput = new Scanner(System.in);
		InitTemp = InitTempInput.nextDouble();
		
		System.out.print("Enter the final temperature : ");
		Scanner FinalTempInput = new Scanner(System.in);
		FinalTemp = FinalTempInput.nextDouble();
		
		
		Joule = WaterKilo * (FinalTemp - InitTemp) * 4184;
		
		System.out.println("The energy needed is " + Joule);
		
		WaterInput.close();
		InitTempInput.close();
		FinalTempInput.close();
	}
}
