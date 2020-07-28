package chapter3_exercise;

public class RandomMonthQuestion4 {
	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 12) + 1;

		switch(randomNumber)
		{
			case 1:
				System.out.println("random number " + randomNumber
									+ " is for January");
				break;
			case 2:
				System.out.println("random number " + randomNumber
									+ " is for February");
				break;
			case 3:
				System.out.println("random number " + randomNumber
									+ " is for March");
				break;
			case 4:
				System.out.println("random number " + randomNumber
									+ " is for April");
				break;
			case 5:
				System.out.println("random number " + randomNumber
									+ " is for May");
				break;
			case 6:
				System.out.println("random number " + randomNumber
									+ " is for June");
				break;
			case 7:
				System.out.println("random number " + randomNumber
									+ " is for July");
				break;
			case 8:
				System.out.println("random number " + randomNumber
									+ " is for August");
				break;
			case 9:
				System.out.println("random number " + randomNumber
									+ " is for September");
				break;
			case 10:
				System.out.println("random number " + randomNumber
									+ " is for October");
				break;
			case 11:
				System.out.println("random number " + randomNumber
									+ " is for November");
				break;
			case 12:
				System.out.println("random number " + randomNumber
									+ " is for December");
				break;
		}
	}
}
