package chapter3_exercise;


public class RandomPointQuestion16 {
	public static void main(String[] args) {
		int randomX,randomY,directionX,directionY;
		
		randomX = (int)(Math.random()*50);
		randomY = (int)(Math.random()*100);
		
		directionX = (int)(Math.random()*2);
		directionY = (int)(Math.random()*2);
		
		if(directionX == 0)
			randomX *= -1;
		if(directionY == 0)
			randomY *= -1;
		
		System.out.println("The random point is (" + randomX + "," + randomY + ")");
	}
}
