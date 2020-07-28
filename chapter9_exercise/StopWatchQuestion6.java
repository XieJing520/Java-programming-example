package chapter9_exercise;

import java.security.SecureRandom;

public class StopWatchQuestion6 {
	public static void main(String[] args) {

		double[] list = new double[100000];
		genrateRandomNumber(list);

		StopWatch stopWatch = new StopWatch();
		selectionSort(list);
		stopWatch.end();

		System.out.println("The elapsed time is " + stopWatch.getElapsedTime() + "ms");

	}

	public static void genrateRandomNumber(double[] list) {
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < list.length; i++)
			list[i] = random.nextInt();
	}

	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}

class StopWatch {
	private long startTime;
	private long endTime;

	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void end() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return (this.endTime - this.startTime);
	}
}
