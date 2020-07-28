package chapter3_exercise;

import java.util.*;


public class TwoRectanglesQuestion28 {
	public static void main(String[] args) {
		double r1XCoordinates, r1YCoordinates, r1Width, r1Height;
		double r2XCoordinates, r2YCoordinates, r2Width, r2Height;
		
		double r1LeftTopPointX, r1LeftTopPointY;
		double r1LeftBottomPointX, r1LeftBottomPointY;
		double r1RightTopPointX, r1RightTopPointY;
		double r1RightBottomPointX,r1RightBottomPointY;

		double r2LeftTopPointX, r2LeftTopPointY;
		double r2LeftBottomPointX, r2LeftBottomPointY;
		double r2RightTopPointX, r2RightTopPointY;
		double r2RightBottomPointX, r2RightBottomPointY;
		
		
		System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		Scanner input = new Scanner(System.in);
		r1XCoordinates = input.nextDouble();
		r1YCoordinates = input.nextDouble();
		r1Width = input.nextDouble();
		r1Height = input.nextDouble();
		
		r1LeftTopPointX = r1XCoordinates - r1Width / 2;
		r1LeftTopPointY = r1YCoordinates + r1Height / 2;
		
		r1LeftBottomPointX = r1XCoordinates - r1Width / 2;
		r1LeftBottomPointY = r1YCoordinates - r1Height / 2;
		
		r1RightTopPointX = r1XCoordinates + r1Width / 2;
		r1RightTopPointY = r1YCoordinates + r1Height / 2;
		
		r1RightBottomPointX = r1XCoordinates + r1Width / 2;
		r1RightBottomPointY = r1YCoordinates - r1Height / 2;
		

		System.out.print("Enter r2's center x-,y-coordinates,width,and height: ");
		r2XCoordinates = input.nextDouble();
		r2YCoordinates = input.nextDouble();
		r2Width = input.nextDouble();
		r2Height = input.nextDouble();
		
		r2LeftTopPointX = r2XCoordinates - r2Width / 2;
		r2LeftTopPointY = r2YCoordinates + r2Height / 2;
		
		r2LeftBottomPointX = r2XCoordinates - r2Width / 2;
		r2LeftBottomPointY = r2YCoordinates - r2Height / 2;
		
		r2RightTopPointX = r2XCoordinates + r2Width / 2;
		r2RightTopPointY = r2YCoordinates + r2Height / 2;
		
		r2RightBottomPointX = r2XCoordinates + r2Width / 2;
		r2RightBottomPointY = r2YCoordinates - r2Height / 2;
		
		
		
		if(r1Width * r1Height >= r2Width * r2Height)
		{
			if( (r2LeftTopPointX >= r1LeftTopPointX && r2LeftTopPointX <= r1RightTopPointX
					&& r2LeftTopPointY >= r1LeftBottomPointY && r2LeftTopPointY <= r1RightTopPointY)
					
				&& (r2LeftBottomPointX >= r1LeftTopPointX && r2LeftBottomPointX <= r1RightTopPointX
					&& r2LeftBottomPointY >= r1LeftBottomPointY && r2LeftBottomPointY <= r1RightTopPointY)
				
				&& (r2RightTopPointX >= r1LeftTopPointX && r2RightTopPointX <= r1RightTopPointX
					&& r2RightTopPointY >= r1LeftBottomPointY && r2RightTopPointY <= r1RightTopPointY)
				
				&& (r2RightBottomPointX >= r1LeftTopPointX && r2RightBottomPointX <= r1RightTopPointX
					&& r2RightBottomPointY >= r1LeftBottomPointY && r2RightBottomPointY <= r1RightTopPointY) )
			{
				System.out.println("r2 is inside r1");
			}
			else if((r2LeftTopPointX >= r1LeftTopPointX && r2LeftTopPointX <= r1RightTopPointX
					&& r2LeftTopPointY >= r1LeftBottomPointY && r2LeftTopPointY <= r1RightTopPointY)
					
				|| (r2LeftBottomPointX >= r1LeftTopPointX && r2LeftBottomPointX <= r1RightTopPointX
					&& r2LeftBottomPointY >= r1LeftBottomPointY && r2LeftBottomPointY <= r1RightTopPointY)
				
				|| (r2RightTopPointX >= r1LeftTopPointX && r2RightTopPointX <= r1RightTopPointX
					&& r2RightTopPointY >= r1LeftBottomPointY && r2RightTopPointY <= r1RightTopPointY)
				
				|| (r2RightBottomPointX >= r1LeftTopPointX && r2RightBottomPointX <= r1RightTopPointX
					&& r2RightBottomPointY >= r1LeftBottomPointY && r2RightBottomPointY <= r1RightTopPointY))
			{
				System.out.println("r2 overlaps r1");
			}
			else
			{
				System.out.println("r2 does not overlap r1");
			}
		}
		else
		{
			if((r1LeftTopPointX >= r2LeftTopPointX && r1LeftTopPointX <= r2RightTopPointX
					&& r1LeftTopPointY >= r2LeftBottomPointY && r1LeftTopPointY <= r2RightTopPointY)
				&& (r1LeftBottomPointX >= r2LeftTopPointX && r1LeftBottomPointX <= r2RightTopPointX
					&& r1LeftBottomPointY >= r2LeftBottomPointY && r1LeftBottomPointY <= r2RightTopPointY)
				&& (r1RightTopPointX >= r2LeftTopPointX && r1RightTopPointX <= r2RightTopPointX
					&& r1RightTopPointY >= r2LeftBottomPointY && r1RightTopPointY <= r2RightTopPointY)
				&& (r1RightBottomPointX >= r2LeftTopPointX && r1RightBottomPointX <= r2RightTopPointX
					&& r1RightBottomPointY >= r2LeftBottomPointY && r1RightBottomPointY <= r2RightTopPointY))
			{
				System.out.println("r1 is inside r2");
			}
			else if((r1LeftTopPointX >= r2LeftTopPointX && r1LeftTopPointX <= r2RightTopPointX
					&& r1LeftTopPointY >= r2LeftBottomPointY && r1LeftTopPointY <= r2RightTopPointY)
				|| (r1LeftBottomPointX >= r2LeftTopPointX && r1LeftBottomPointX <= r2RightTopPointX
					&& r1LeftBottomPointY >= r2LeftBottomPointY && r1LeftBottomPointY <= r2RightTopPointY)
				|| (r1RightTopPointX >= r2LeftTopPointX && r1RightTopPointX <= r2RightTopPointX
					&& r1RightTopPointY >= r2LeftBottomPointY && r1RightTopPointY <= r2RightTopPointY)
				|| (r1RightBottomPointX >= r2LeftTopPointX && r1RightBottomPointX <= r2RightTopPointX
					&& r1RightBottomPointY >= r2LeftBottomPointY && r1RightBottomPointY <= r2RightTopPointY))
			{
				System.out.println("r1 overlaps r2");
			}
			else
			{
				System.out.println("r1 does not overlap r2");
			}
		}
		
		input.close();
	}
}
