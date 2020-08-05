package chapter12_exercise;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class BabyNamePopularityRankingQuestion31 {
	public static void main(String[] args) throws IOException {

		int year;
		String gender, name;

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the year:");
		year = inputScanner.nextInt();
		System.out.print("Enter the gender:");
		gender = inputScanner.next();
		System.out.print("Enter the name:");
		name = inputScanner.next();

		inputScanner.close();

		String urlString = "http://liveexample.pearsoncmg.com/data/babynamesranking";
		URL babyNameUrl = new URL(urlString + year + ".txt");

		Scanner urlScanner = new Scanner(babyNameUrl.openStream());

		boolean isFound = false;
		while (urlScanner.hasNext()) {

			int rank = urlScanner.nextInt();
			String boyName = urlScanner.next();
			urlScanner.nextInt();
			String girlName = urlScanner.next();
			urlScanner.nextInt();

			if (gender.equals("M") && boyName.equals(name) || gender.equals("F") && girlName.equals(name)) {
				System.out.println(name + " is ranked #" + rank + " in vear " + year);
				isFound = true;
			}
		}

		if (!isFound) {
			System.out.println("The name " + name + " is not ranked in vear " + year);
		}

		urlScanner.close();

	}
}
