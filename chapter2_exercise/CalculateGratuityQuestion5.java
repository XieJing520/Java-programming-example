package chapter2_exercise;

import java.util.*;


public class CalculateGratuityQuestion5 {
	public static void main(String[] args) {
		int subtotal,gratuity_rate;
		double gratuity,cost_total;
		
		
		System.out.print("Enter the subtotal and a gratuity rate:");
		Scanner input = new Scanner(System.in);
		
		subtotal = input.nextInt();
		gratuity_rate = input.nextInt();
		
		gratuity = 0.01 * subtotal * gratuity_rate;
		cost_total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity
							+ " and total is $" + cost_total);
		
		input.close();
		//System.out.println("\nFinished");
	}
}
