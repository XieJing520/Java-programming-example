package chapter6_exercise;

public class ConversionClass2Question9 {
	public static void main(String[] args) {
		printTableHead();
		for(double f = 1,m = 20;f <= 10;f ++,m += 5)
			System.out.printf("%.1f\t\t%.3f\t\t%.1f\t\t%.3f\n", f, Conversion2.footToMeter(f),
					m, Conversion2.meterToFoot(m));

	}
	public static void printTableHead() {
		System.out.println("Feet\t\tMeters\t\tMeters\t\tFeet");
		System.out.println("------------------------------------------------------");
	}
}
class Conversion2{
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
}