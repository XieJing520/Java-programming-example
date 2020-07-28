package chapter5_exercise;

public class ConversionFromMileToKilometerQuestion4 {
	public static void main(String[] args) {
		System.out.printf("%s%24s\n","Miles","Kilometers");
        for(int i = 1;i <= 10;i++)
        {
            System.out.printf("%-3d%26.3f\n", i, i * 1.609);
        }
	}
}
