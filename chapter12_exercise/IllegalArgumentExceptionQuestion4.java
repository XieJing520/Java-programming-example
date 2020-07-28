package chapter12_exercise;

public class IllegalArgumentExceptionQuestion4 {
	public static void main(String[] args) {
		Loan loan = new Loan(1,1,100);
		loan.setLoanAmount(0);
	}
}

class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
			throws IllegalArgumentException{
		
		if(annualInterestRate <= 0.0 || numberOfYears <= 0 || loanAmount <= 0) {
			throw new IllegalArgumentException("something is wrong");
		}
		
		
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate)
			throws IllegalArgumentException {
		if(annualInterestRate <= 0.0) {
			throw new IllegalArgumentException("something is wrong");
		}
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears)
			throws IllegalArgumentException{
		if(numberOfYears <= 0) {
			throw new IllegalArgumentException("something is wrong");
		}
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) 
			throws IllegalArgumentException{
		if(loanAmount <= 0) {
			throw new IllegalArgumentException("something is wrong");
		}
		this.loanAmount = loanAmount;
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}