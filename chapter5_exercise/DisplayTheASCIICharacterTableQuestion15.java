package chapter5_exercise;

public class DisplayTheASCIICharacterTableQuestion15 {
	public static void main(String[] args) {
		for(char c = 33;c <= 126;)
		{
			System.out.printf("%c ",c++);
			if(c % 10 == 3)
				System.out.print("\n");
		}
	}
}
