package chapter14_exercise;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TwoRectanglesQuestion23 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Scanner input = new Scanner(System.in);
		double r1X, r1Y, r2X, r2Y, r1W, r1H, r2W, r2H;

		r1X = input.nextDouble();
		r1Y = input.nextDouble();
		r1W = input.nextDouble();
		r1H = input.nextDouble();

		r2X = input.nextDouble();
		r2Y = input.nextDouble();
		r2W = input.nextDouble();
		r2H = input.nextDouble();

		input.close();

		Rectangle r1 = new Rectangle(r1X - r1W / 2.0, r1Y - r1H / 2.0, r1W, r1H);
		Rectangle r2 = new Rectangle(r2X - r2W / 2.0, r2Y - r2H / 2.0, r2W, r2H);
		Text locationText;

		Rectangle maxRectangle, minRectangle;

		r1.setFill(null);
		r2.setFill(null);
		r1.setStroke(Color.BLACK);
		r1.setStroke(Color.BLACK);

		maxRectangle = r1W * r1H >= r2W * r2H ? r1 : r2;
		minRectangle = r1W * r1H < r2W * r2H ? r1 : r2;

		double[] dots = new double[8];
		dots[0] = minRectangle.getX();
		dots[1] = minRectangle.getY();
		dots[2] = minRectangle.getX() + minRectangle.getWidth();
		dots[3] = minRectangle.getY();
		dots[4] = minRectangle.getX();
		dots[5] = minRectangle.getY() + minRectangle.getHeight();
		dots[6] = minRectangle.getX() + minRectangle.getWidth();
		dots[7] = minRectangle.getY() + minRectangle.getHeight();

		int numOfDotIn = howManyDotsInRectangle(maxRectangle, dots);

		if (numOfDotIn == 0)
			locationText = new Text(20, 280, "The rectangles do not overlap");
		else if (numOfDotIn == 1)
			locationText = new Text(20, 280, "The rectangles overlap");
		else
			locationText = new Text(20, 280, "One rectangle is contained in another");

		pane.getChildren().addAll(r1, r2, locationText);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_23"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static boolean isDotInRectangle(Rectangle r, double... dots) {
		if ((r.getX() <= dots[0]) && (dots[0] <= r.getX() + r.getWidth()))
			if ((r.getY() <= dots[1]) && (dots[1] <= r.getY() + r.getHeight()))
				return true;
		return false;
	}

	public static int howManyDotsInRectangle(Rectangle r, double... dots) {
		int dotInCount = 0;
		for (int i = 0; i <= dots.length - 2; i += 2)
			if (isDotInRectangle(r, dots[i], dots[i + 1]))
				dotInCount++;
		return dotInCount;
	}

}
