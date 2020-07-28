package chapter9_exercise;

import java.util.Date;

public class TheAccountClassQuestion7 {
	public static void main(String[] args) {

		Account myAccount = new Account(1122, 20000);

		Account.setAnnualInterestRate(4.5);

		myAccount.withDraw(2500);
		myAccount.deposit(3000);

		System.out.println("The balance of the account is " + myAccount.getBalance());
		System.out.println("The monthly interest of the account is " + myAccount.getMonthlyInterest());
		System.out.println("The created date is " + myAccount.getDateCreated());

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