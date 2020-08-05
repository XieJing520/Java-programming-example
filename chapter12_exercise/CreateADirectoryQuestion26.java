package chapter12_exercise;

import java.io.File;
import java.util.Scanner;

public class CreateADirectoryQuestion26 {
	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a directory name:");

		File directory = new File(inputScanner.nextLine());

		boolean isCreated;
		
		isCreated = directory.mkdirs();
		
		if(isCreated) {
			System.out.println("Directory created successfully");
		}else {
			System.out.println("Directory already exists");
		}

		inputScanner.close();
	}
}
