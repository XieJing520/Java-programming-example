package chapter2_exercise;

import java.util.*;


public class CalculateCylinderVolumeQuestion2 {
	public static void main(String[] args) {
		double RadiusCylinder,LengthCylinder,AreaCylinder,VolumeCylinder;
		
		System.out.print("Enter the radius and length of a cylinder : ");
		Scanner R_L_input = new Scanner(System.in);
		
		RadiusCylinder = R_L_input.nextDouble();
		LengthCylinder = R_L_input.nextDouble();
		
		AreaCylinder = RadiusCylinder * RadiusCylinder * Math.PI;
		VolumeCylinder = AreaCylinder * LengthCylinder;
		
		System.out.println("The area is " + AreaCylinder);
		System.out.println("The volume is " + VolumeCylinder);
		
		R_L_input.close();
		//System.out.println("\nFinished");
	}
}
