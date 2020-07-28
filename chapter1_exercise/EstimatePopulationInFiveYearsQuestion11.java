package chapter1_exercise;


public class EstimatePopulationInFiveYearsQuestion11 {
	public static void main(String[] args) {
		
		
		final double BORN_NUMBER = 1.0 / 7; 		// Births per second
		final double DEAD_NUMBER = 1.0 / 13;		// Deaths per second
		final double IMMIGRANT_NUMBER = 1.0 / 45;	// Number of immigrants per second
		final int SECONDS_IN_A_YEAR = 365 * 24 * 60 * 60; // Seconds in a year
		
		
		
		int PopulationNumberNow = 312_032_486;
		int FirstYearPopulation =(int)(PopulationNumberNow + SECONDS_IN_A_YEAR * BORN_NUMBER
										- SECONDS_IN_A_YEAR * DEAD_NUMBER
										+ SECONDS_IN_A_YEAR * IMMIGRANT_NUMBER);
		int SecondYearPopulation = (int)(FirstYearPopulation + SECONDS_IN_A_YEAR * BORN_NUMBER
										- SECONDS_IN_A_YEAR * DEAD_NUMBER
										+ SECONDS_IN_A_YEAR * IMMIGRANT_NUMBER);;
		int ThirdYearPopulation = (int)(SecondYearPopulation + SECONDS_IN_A_YEAR * BORN_NUMBER
										- SECONDS_IN_A_YEAR * DEAD_NUMBER
										+ SECONDS_IN_A_YEAR * IMMIGRANT_NUMBER);;
		int FourthYearPopulation = (int)(ThirdYearPopulation + SECONDS_IN_A_YEAR * BORN_NUMBER
										- SECONDS_IN_A_YEAR * DEAD_NUMBER
										+ SECONDS_IN_A_YEAR * IMMIGRANT_NUMBER);;
		int FifthYearPopulation = (int)(FourthYearPopulation + SECONDS_IN_A_YEAR * BORN_NUMBER
										- SECONDS_IN_A_YEAR * DEAD_NUMBER
										+ SECONDS_IN_A_YEAR * IMMIGRANT_NUMBER);;
		
		
		
		System.out.println("The population number of USA in first year : " + FirstYearPopulation);								
		System.out.println("The population number of USA in second year : " + SecondYearPopulation);
		System.out.println("The population number of USA in third year : " + ThirdYearPopulation);
		System.out.println("The population number of USA in fourth year : " + FourthYearPopulation);
		System.out.println("The population number of USA in fifth year : " + FifthYearPopulation);
										

		
		System.out.println("\nFinished");
	}
}