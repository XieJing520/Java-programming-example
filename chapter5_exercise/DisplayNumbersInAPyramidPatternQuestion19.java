package chapter5_exercise;

public class DisplayNumbersInAPyramidPatternQuestion19 {
	public static void main(String[] args) {
		for(int line = 8;line >= 1;line--)
		{
			for(int i = 1;i <= 4 * (line-1);i++)
				System.out.print(" ");
			for(int i = 1;i <= (9 - line);i++)
				System.out.printf("%4d",(int)Math.pow(2, i-1));
			for(int i = (8 - line);i >= 1;i--)
				System.out.printf("%4d",(int)Math.pow(2, i-1));
			System.out.print("\n");
		}
	}
}
