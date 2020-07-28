package chapter2_exercise;

import java.util.*;


public class HexagonAreaQuestion16 {
	public static void main(String[] args) {
		double LengthHexagonSide,AreaHexagon;
		
		System.out.print("Enter the length of the side : ");
		Scanner LenSideInput = new Scanner(System.in);
		LengthHexagonSide = LenSideInput.nextDouble();
		
		AreaHexagon = 3 * Math.pow(3,0.5) / 2 * Math.pow(LengthHexagonSide,2);
		
		System.out.println("The area of the hexagon is " + AreaHexagon);
		
		LenSideInput.close();
	}
}
