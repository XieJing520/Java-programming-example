package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectTwoCirclesQuestion22 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		double Circle1X, Circle1Y, Circle2X, Circle2Y;
		Circle1X = Math.random() * 300;
		Circle1Y = Math.random() * 300;
		Circle2X = Math.random() * 300;
		Circle2Y = Math.random() * 300;

		Circle circle1 = new Circle(Circle1X, Circle1Y, 15, Color.WHITE);
		Circle circle2 = new Circle(Circle2X, Circle2Y, 15, Color.WHITE);
		circle1.setStroke(Color.BLACK);
		circle2.setStroke(Color.BLACK);

		Text circle1Text = new Text(Circle1X, Circle1Y, "1");
		Text circle2Text = new Text(Circle2X, Circle2Y, "2");

		double alpha = Math.atan((Circle2Y - Circle1Y) / (Circle2X - Circle1X));

		double circle1PointX, circle1PointY, circle2PointX, circle2PointY;

		if (Circle1X >= Circle2X) {
			circle1PointX = Circle1X - 15 * Math.cos(alpha);
			circle1PointY = Circle1Y - 15 * Math.sin(alpha);
			circle2PointX = Circle2X + 15 * Math.cos(alpha);
			circle2PointY = Circle2Y + 15 * Math.sin(alpha);
		} else {
			circle1PointX = Circle1X + 15 * Math.cos(alpha);
			circle1PointY = Circle1Y + 15 * Math.sin(alpha);
			circle2PointX = Circle2X - 15 * Math.cos(alpha);
			circle2PointY = Circle2Y - 15 * Math.sin(alpha);
		}

		Line line = new Line(circle1PointX, circle1PointY, circle2PointX, circle2PointY);

		pane.getChildren().addAll(circle1, circle2, circle1Text, circle2Text, line);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_22"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
