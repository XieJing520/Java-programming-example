package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessLargeDatasetQuestion25 {
	public static void main(String[] args) throws FileNotFoundException {

		File salary = new File("C:\\Users\\Administrator\\Desktop\\Salary.txt");

		Scanner salaryScanner = new Scanner(salary);

		double[][] totalSalary = new double[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				totalSalary[i][j] = 0;
			}
		}

		for (int i = 0; i < 1000; i++) {

			salaryScanner.next();
			salaryScanner.next();

			String rank = salaryScanner.next();
			if (rank.equals("assistant")) {
				totalSalary[0][0]++;
				totalSalary[0][1] += salaryScanner.nextDouble();
			} else if (rank.equals("associate")) {
				totalSalary[1][0]++;
				totalSalary[1][1] += salaryScanner.nextDouble();
			} else if (rank.equals("full")) {
				totalSalary[2][0]++;
				totalSalary[2][1] += salaryScanner.nextDouble();
			}

		}

		System.out.println("total salary for assistant:" + totalSalary[0][1]);
		System.out.println("total salary for associate:" + totalSalary[1][1]);
		System.out.println("total salary for full:" + totalSalary[2][1]);
		System.out.printf("average salary for assistant:%.2f\n", (totalSalary[0][1] / totalSalary[0][0]));
		System.out.printf("average salary for associate:%.2f\n", (totalSalary[1][1] / totalSalary[1][0]));
		System.out.printf("average salary for full:%.2f\n", (totalSalary[2][1] / totalSalary[2][0]));

		salaryScanner.close();

	}
}
