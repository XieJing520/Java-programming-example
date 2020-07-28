package chapter10_exercise;

public class FinancialTheTaxClassQuestion8 {
	public static void main(String[] args) {

		Tax[] testTax = new Tax[4];

		for (int i = 0; i < 4; i++) {
			testTax[i] = new Tax();
			testTax[i].setFilingStatus(i);
			for (int j = 50000; j <= 60000; j += 1000) {
				if (i == 0) {
					System.out.println("SINGLE_FILER");
				} else if (i == 1) {
					System.out.println("MARRIED_JOINTLY_OR_QUALIFYING_WIDOW");
				} else if (i == 2) {
					System.out.println("MARRIED_SEPARATELY");
				} else {
					System.out.println("HEAD_OF_HOUSEHOLD");
				}

				testTax[i].setTaxableIncome(j);
				System.out.println("    " + testTax[i].getTax());
			}
		}
	}
}

class Tax {

	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	private int filingStatus;
	private int[][] brackets = new int[4][6];
	private double[] rates = new double[5];
	private double taxableIncome;

	public Tax() {

		brackets[0][0] = 0;
		brackets[0][1] = 27050;
		brackets[0][2] = 65550;
		brackets[0][3] = 136750;
		brackets[0][4] = 297350;
		brackets[0][5] = 297350;

		brackets[1][0] = 0;
		brackets[1][1] = 45200;
		brackets[1][2] = 109250;
		brackets[1][3] = 166500;
		brackets[1][4] = 297350;
		brackets[1][5] = 297350;

		brackets[2][0] = 0;
		brackets[2][1] = 22600;
		brackets[2][2] = 54625;
		brackets[2][3] = 83250;
		brackets[2][4] = 148675;
		brackets[2][5] = 148675;

		brackets[3][0] = 0;
		brackets[3][1] = 36250;
		brackets[3][2] = 93650;
		brackets[3][3] = 151650;
		brackets[3][4] = 297350;
		brackets[3][5] = 297350;

		rates[0] = 0.15;
		rates[1] = 0.275;
		rates[2] = 0.305;
		rates[3] = 0.355;
		rates[4] = 0.391;

		this.filingStatus = 0;
		this.taxableIncome = 0;
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.taxableIncome = taxableIncome;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				this.brackets[i][j] = brackets[i][j];
			}
		}

		for (int i = 0; i < 5; i++) {
			this.rates[i] = rates[i];
		}
	}

	public double getTax() {
		double tax = 0;

		int rateIndex = 0;
		for (int i = 1; i < 6; i++) {
			if (this.taxableIncome <= brackets[this.filingStatus][i]) {
				rateIndex = i;
				break;
			}
		}

		if (this.taxableIncome > brackets[this.filingStatus][5]) {
			rateIndex = 4;
		}

		for (int i = 1; i < rateIndex; i++) {
			tax += (brackets[this.filingStatus][i] - brackets[this.filingStatus][i - 1]) * rates[i - 1];
		}

		tax += (this.taxableIncome - brackets[this.filingStatus][rateIndex - 1]) * rates[rateIndex - 1];
		return tax;
	}

	public int getFilingStatus() {
		return this.filingStatus;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public int[][] getBrackets() {
		return this.brackets;
	}

	public void setBrackets(int[][] brackets) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				brackets[i][j] = brackets[i][j];
			}
		}
	}

	public double[] getRates() {
		return this.rates;
	}

	public void setRates(double[] rates) {
		for (int i = 0; i < 5; i++) {
			this.rates[i] = rates[i];
		}
	}

	public double getTaxableIncome() {
		return this.taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
}