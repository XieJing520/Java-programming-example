package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class DisplayGridQuestion16 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyGrid(), 400, 400);
		primaryStage.setTitle("Exercise14_15"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class MyGrid extends Pane {
	private void paint() {
		Line leftVerticalLine, rightVerticalLine, topHorizontal, bottomHorizontal;
		leftVerticalLine = new Line(getWidth() / 3, 0, getWidth() / 3, getHeight());
		rightVerticalLine = new Line(getWidth() * 2 / 3, 0, getWidth() * 2 / 3, getHeight());
		topHorizontal = new Line(0, getHeight() / 3, getWidth(), getHeight() / 3);
		bottomHorizontal = new Line(0, getHeight() * 2 / 3, getWidth(), getHeight() * 2 / 3);

		leftVerticalLine.setStrokeWidth(10);
		rightVerticalLine.setStrokeWidth(10);
		topHorizontal.setStrokeWidth(10);
		bottomHorizontal.setStrokeWidth(10);

		leftVerticalLine.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		rightVerticalLine.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		topHorizontal.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		bottomHorizontal.setStroke(Color.color(Math.random(), Math.random(), Math.random()));

		getChildren().clear();
		getChildren().addAll(leftVerticalLine, rightVerticalLine, topHorizontal, bottomHorizontal);
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}