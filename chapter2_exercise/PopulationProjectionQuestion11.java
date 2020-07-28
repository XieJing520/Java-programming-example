package chapter2_exercise;

import java.util.*;


public class PopulationProjectionQuestion11 {
	public static void main(String[] args) {
		final double BORN_NUMBER = 1.0 / 7; 		// Births per second
		final double DEAD_NUMBER = 1.0 / 13;		// Deaths per second
		final double IMMIGRANT_NUMBER = 1.0 / 45;	// Number of immigrants per second
		final int SECONDS_IN_A_YEAR = 365 * 24 * 60 * 60; // Seconds in a year
		int year;
		
		System.out.print("Enter the number of years:");
		Scanner YearInput = new Scanner(System.in);
		year = YearInput.nextInt();
		
		
		int SecondsInTheYear = SECONDS_IN_A_YEAR * year;
		
		int PopulationNumberNow = 312_032_486;
		int YearPopulation =(int)(PopulationNumberNow + SecondsInTheYear * BORN_NUMBER
										- SecondsInTheYear * DEAD_NUMBER
										+ SecondsInTheYear * IMMIGRANT_NUMBER);
		
		System.out.println("The population in " + year + " years is "+ YearPopulation);
		
		YearInput.close();
	}
}
