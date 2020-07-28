package chapter6_exercise;

public class DisplayPatternsQuestion6 {
	public static void main(String[] args) {
		displayPattern(3);
		displayPattern(4);
		displayPattern(5);
		displayPattern(6);
	}
	public static void displayPattern(int n) {
		for(int line = 1;line <= n;line++)
		{	
			// Display the spaces
			for(int i = 1;i <= 2 * (n - line);i++)
				System.out.print(" ");
			
			for(int i = line;i >= 1;i--)
				System.out.printf("%d ",i);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
