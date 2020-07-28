package chapter14_exercise;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RandomPointsOnACircleQuestion25 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle circle = new Circle(150, 150, 120, null);
		circle.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		circle.setStrokeWidth(5);

		Polygon polygon = new Polygon();
		ObservableList<Double> list = polygon.getPoints();

		for (int i = 1; i <= 5; i++) {
			double alpha = -Math.toRadians(Math.random() * 72 + 72 * (i - 1));
			list.add(150 + 120 * Math.cos(alpha));
			list.add(150 + 120 * Math.sin(alpha));
		}

		polygon.setFill(null);
		polygon.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		polygon.setStrokeWidth(5);

		pane.getChildren().addAll(circle, polygon);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_25"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
