package chapter10_exercise;

import java.util.Date;
import java.util.Scanner;

public class ATMMachineQuestion7 {
	public static void main(String[] args) {
		Account[] tenAccounts = new Account[10];
		for (int i = 0; i < tenAccounts.length; i++)
			tenAccounts[i] = new Account(i, 100);

		int id, choice;
		Scanner inputScanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter an id:");
			id = inputScanner.nextInt();

			if (id < 0 || 9 < id) {
				continue;
			}

			while (true) {
				printMain();
				System.out.print("Enter a choice:");
				choice = inputScanner.nextInt();

				if (choice == 1) {
					System.out.printf("The balance is %.1f\n", tenAccounts[id].getBalance());
				} else if (choice == 2) {
					double withdrawAmount;
					System.out.printf("Enter an amount to withdraw:");
					withdrawAmount = inputScanner.nextDouble();
					tenAccounts[id].withDraw(withdrawAmount);
				} else if (choice == 3) {
					double amountDeposit;
					System.out.printf("Enter an amount to deposit:");
					amountDeposit = inputScanner.nextDouble();
					tenAccounts[id].deposit(amountDeposit);
					;
				} else if (choice == 4) {
					break;
				}
			}

		}

	}

	public static void printMain() {
		System.out.println("\nMain menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");

	}

}

class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();

	public Account() {

	}

	public Account(int id, double balance) {

		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 100 / 12;
	}

	public double getMonthlyInterest() {
		return this.balance * getAnnualInterestRate();
	}

	public void withDraw(double draw) {
		if (this.balance >= draw)
			this.balance -= draw;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}

}