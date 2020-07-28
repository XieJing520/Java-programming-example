package chapter4_exercise;

public class GenerateVehiclePlateNumbersQuestion25 {
	public static void main(String[] args) {
		
		char char1,char2,char3,char4,char5,char6,char7;
		
		char1 = (char)(65 + (int)(Math.random() * 26));
		char2 = (char)(65 + (int)(Math.random() * 26));
		char3 = (char)(65 + (int)(Math.random() * 26));
		
		char4 = (char)(48 + (int)(Math.random() * 10));
		char5 = (char)(48 + (int)(Math.random() * 10));
		char6 = (char)(48 + (int)(Math.random() * 10));
		char7 = (char)(48 + (int)(Math.random() * 10));
		
		System.out.println("The vehicle plate numbers is " + char1+char2+char3+char4+char5+char6+char7);
	}
}
