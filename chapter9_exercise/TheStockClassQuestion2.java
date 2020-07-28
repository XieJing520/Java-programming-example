package chapter9_exercise;

public class TheStockClassQuestion2 {
	public static void main(String[] args) {

		Stock myStock = new Stock("ORCL", "Oracle Corporation");
		myStock.previousClosingPrice = 34.5;
		myStock.currentPrice = 34.35;
		double changePercent = myStock.getChangePercent();
		System.out.printf("The price-change percentage is %.3f%%\n", changePercent * 100);

	}
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String s, String n) {
		symbol = s;
		name = n;
	}

	public double getChangePercent() {
		return -(previousClosingPrice - currentPrice) / previousClosingPrice;
	}

}