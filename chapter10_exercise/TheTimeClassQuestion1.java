package chapter10_exercise;

public class TheTimeClassQuestion1 {
	public static void main(String[] args) {
		Time oldTime = new Time();
		Time newTime = new Time(555550000);

		System.out.printf("oldTime->%d:%d:%d\n", oldTime.getHour(), oldTime.getMinute(), oldTime.getSecond());
		System.out.printf("newTime->%d:%d:%d\n", newTime.getHour(), newTime.getMinute(), newTime.getSecond());

	}
}

class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		setTime(System.currentTimeMillis());
	}

	public Time(long elapseTime) {
		setTime(elapseTime);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setTime(long elapseTime) {
		long totalMilliseconds = elapseTime;
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		this.hour = (int) currentHour;
		this.minute = (int) currentMinute;
		this.second = (int) currentSecond;
	}

}