package chapter5_exercise;

public class ConversionFromKilogramToPoundAndPoundToKilogramQuestion5 {
	public static void main(String[] args) {
		System.out.printf("%s%15s%15s%21s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        int i, j;
        for(i = 1, j = 20;i <= 199 && j <= 515;i += 2, j += 5)
        {
            System.out.printf("%-3d%21.1f%15d%21.2f\n", i, i * 2.2, j, j * 0.4545);
        }
	}
}
