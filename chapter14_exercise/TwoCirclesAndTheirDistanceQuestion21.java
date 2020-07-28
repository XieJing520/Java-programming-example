package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoCirclesAndTheirDistanceQuestion21 extends Application {

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

		Circle circle1 = new Circle(Circle1X, Circle1Y, 15, Color.BLACK);
		Circle circle2 = new Circle(Circle2X, Circle2Y, 15, Color.BLACK);
		Line line = new Line(Circle1X, Circle1Y, Circle2X, Circle2Y);
		
		double distance = Math.sqrt(Math.pow((Circle2X - Circle1X), 2) + Math.pow((Circle2Y - Circle1Y), 2));
		double midX = (Circle1X + Circle2X) / 2;
		double midY = (Circle1Y + Circle2Y) / 2;

		Text text = new Text(midX, midY, "" + distance);

		pane.getChildren().addAll(circle1, circle2, line, text);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_21"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
