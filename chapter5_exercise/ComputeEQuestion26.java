package chapter5_exercise;

public class ComputeEQuestion26 {
	public static void main(String[] args) {
		double e, item;
		e = item = 1;
		
		for(int i = 1;i <= 100000;i++)
		{
			item /= i;
			e += item;
			if(i % 10000 == 0)
				System.out.println("The E value for i = " + i + " is " + e);
		}
	}
}
