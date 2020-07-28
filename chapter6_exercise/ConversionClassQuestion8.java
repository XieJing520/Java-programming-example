package chapter6_exercise;

public class ConversionClassQuestion8 {
	public static void main(String[] args) {
		
		printTableHead();
		for(double c = 40,f = 120;c >= 31 && f >= 30;c -= 1,f -= 10)
			System.out.printf("%.1f\t\t%.1f\t\t\t%.1f\t\t%.2f\n", c, Conversion.celsiusToFahrenheit(c),
					f, Conversion.fahrenheitToCelsius(f));
	}
	public static void printTableHead() {
		System.out.println("Celsius\t\tFahrenheit\t\tFahrenheit\tCelsius");
		System.out.println("-----------------------------------------------------------------");
	}
	
}


class Conversion{
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}