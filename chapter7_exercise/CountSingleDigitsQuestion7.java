package chapter7_exercise;

public class CountSingleDigitsQuestion7 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		
		for(int i = 1;i <= 100;i++)
			counts[(int)(Math.random()*10)]++;
		int i = 0;
		for(int e:counts)
		{
			if(e > 1)
				System.out.printf("%d occurs %d times\n", i, e);
			else
				System.out.printf("%d occurs %d time\n", i, e);
			i++;
		}
			
	}
}
