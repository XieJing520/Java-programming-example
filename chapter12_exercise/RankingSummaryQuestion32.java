package chapter12_exercise;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class RankingSummaryQuestion32 {
	public static void main(String[] args) throws IOException {

		String urlString = "http://liveexample.pearsoncmg.com/data/babynamesranking";

		for (int year = 2010; year >= 2001; year--) {
			URL babyNameUrl = new URL(urlString + year + ".txt");
			Scanner urlScanner = new Scanner(babyNameUrl.openStream());

			System.out.println("--------------" + year + "--------------");
			for (int i = 1; i <= 5; i++) {
				urlScanner.nextInt();
				String boyName = urlScanner.next();
				urlScanner.nextInt();
				String girlName = urlScanner.next();
				urlScanner.nextInt();
				System.out.println("Rank" + i + ":" + girlName + " " + boyName);
			}

			urlScanner.close();
		}

	}
}
