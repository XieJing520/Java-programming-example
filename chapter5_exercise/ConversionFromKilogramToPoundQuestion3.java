package chapter5_exercise;

public class ConversionFromKilogramToPoundQuestion3 {
	public static void main(String[] args) {
		
		System.out.printf("%s%20s\n","Kilograms","Pounds");
        for(int i = 1;i <= 199;i += 2)
        {
            System.out.printf("%-3d%26.1f\n", i, i * 2.2);
        }
	}
}
