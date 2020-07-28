package chapter6_exercise;

public class DisplayCharsQuestion12 {
	public static void main(String[] args) {
		printChars('1', 'z', 13);
	}
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		
		for(int i = 0;ch1 <= ch2;ch1++)
		{
			System.out.printf("%c",ch1);
			i++;
			if(i % numberPerLine == 0)
				System.out.print("\n");
		}
	}
}
