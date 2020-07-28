package chapter3_exercise;

import java.util.*;


public class  TwoCirclesQuestion29 {
	public static void main(String[] args) {
		 double xCoordinateCircle1,yCoordinateCircle1,radiusCircle1;
		 double xCoordinateCircle2,yCoordinateCircle2,radiusCircle2;
		 double distanceFromP1ToP2;
		 
		 System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
		 Scanner input = new Scanner(System.in);
		 xCoordinateCircle1 = input.nextDouble();
		 yCoordinateCircle1 = input.nextDouble();
		 radiusCircle1 = input.nextDouble();
		 
		 System.out.print("Enter circle2's center x-,y-coordinates,and radius: ");
		 xCoordinateCircle2 = input.nextDouble();
		 yCoordinateCircle2 = input.nextDouble();
		 radiusCircle2 = input.nextDouble();
		 
		 distanceFromP1ToP2 = Math.pow((Math.pow(xCoordinateCircle1-xCoordinateCircle2, 2)
				 				+Math.pow(yCoordinateCircle1-yCoordinateCircle2, 2)), 0.5);
		 
		 
		 if(radiusCircle1 + radiusCircle2 >= distanceFromP1ToP2)
		 {
			 if(radiusCircle1 - radiusCircle2 >= distanceFromP1ToP2)
				 System.out.println("circle2 is inside circle1");
			 else
				 System.out.println("circle2 overlaps circle1");
		 }
		 else
			 System.out.println("circle2 does not overlap circle1");
		 
		 input.close();
	}
}
