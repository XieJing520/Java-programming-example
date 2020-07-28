package chapter1_exercise;


public class AverageSpeedKilometersQuestion12 {
	public static void main(String[] args) {
		final int RUNNING_TIME = 1 * 3600 + 40 * 60 + 35; //the time of running in seconds
		//final int RUNNING_MILES = 24;
		
		double running_kilometers = 24 * 1.6;
		double runner_speed_kilo_hour = running_kilometers / RUNNING_TIME * 3600;
		
		
		System.out.println("The speed of the runner is (kilometers per hour) : "
							+ runner_speed_kilo_hour);
		

		//System.out.println("\nFinished");
	}
}