package chapter9_exercise;

public class TheFanClassQuestion8 {
	public static void main(String[] args) {
		
		Fan fan1,fan2;
		fan1 = new Fan();
		fan2 = new Fan();
		
		fan1.setOn(true);
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		System.out.println(fan1.toString());
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
		
	}
}

class Fan {
	private final int SLOW = 1;
	@SuppressWarnings("unused")
	private final int MEDIUM = 2;
	private final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
		
	}
	
	public void setSpeed(int speed) {
		if(this.on && (SLOW <= speed && speed <= FAST))
			this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean getOn() {
		return this.on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String toString() {
		if(getOn())
			return "Speed:"+getSpeed()+" Color:"+getColor()+" Radius:"+getRadius();
		else
			return "fan is off"+" Color:"+getColor()+" Radius:"+getRadius();
	}
}