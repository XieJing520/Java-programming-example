package chapter4_exercise;

import java.util.Scanner;

public class PayRollQuestion23 {
	public static void main(String[] args) {
		String employeeName;
		double hoursWorked,hourlyPayRate,federalTaxRate,stateTaxRate;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		employeeName = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		stateTaxRate = input.nextDouble();
		
		
		System.out.printf("Employee Name: %s\n", employeeName);
		System.out.printf("Hours Worked: %.1f\n", hoursWorked);
		System.out.printf("Pay Rate: %.2f\n", hourlyPayRate);
		System.out.printf("Gross Pay: %.2f\n", hoursWorked * hourlyPayRate);
		System.out.printf("Deductions:\n");
		System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTaxRate * 100, federalTaxRate * hoursWorked * hourlyPayRate);
		System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTaxRate * 100, stateTaxRate * hoursWorked * hourlyPayRate);
		System.out.printf("  Total Deduction: $%.2f\n", federalTaxRate * hoursWorked * hourlyPayRate
													+ stateTaxRate * hoursWorked * hourlyPayRate);
		System.out.printf("Net pay: $%.2f\n", hoursWorked * hourlyPayRate
										- federalTaxRate * hoursWorked * hourlyPayRate
										- stateTaxRate * hoursWorked * hourlyPayRate);
		
		input.close();
	}
}
