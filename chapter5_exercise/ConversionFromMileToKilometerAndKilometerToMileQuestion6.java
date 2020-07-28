package chapter5_exercise;

public class ConversionFromMileToKilometerAndKilometerToMileQuestion6 {
	public static void main(String[] args) {
		System.out.printf("%s%20s%20s%15s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        int i, j;
        for(i = 1, j = 20;i <= 10 && j <= 65;i++, j += 5)
        {
            System.out.printf("%-3d%17.3f%17d%24.3f\n", i, i * 1.609, j, j * 0.6215);
        }
	}
}
