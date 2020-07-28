package chapter5_exercise;

public class DisplayFourPatternsQuestion18 {
	public static void main(String[] args) {

		// Display the first pattern
		for(int line = 1;line <= 6;line++)
		{
			for(int i = 1;i <= line;i++)
				System.out.printf("%d ",i);
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// Display the second pattern
		for(int line = 6;line >= 1;line--)
		{
			for(int i = 1;i <= line;i++)
				System.out.printf("%d ",i);
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// Display the third pattern
		for(int line = 1;line <= 6;line++)
		{	
			// Display the spaces
			for(int i = 1;i <= 2 * (6 - line);i++)
				System.out.print(" ");
			
			for(int i = line;i >= 1;i--)
				System.out.printf("%d ",i);
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// Display the fourth pattern
		for(int line = 6;line >= 1;line--)
		{
			for(int i = 1;i <= 2 *(6-line);i++)
				System.out.print(" ");
			for(int i = 1;i <= line;i++)
				System.out.printf("%d ",i);
			System.out.print("\n");
		}
	}
}
