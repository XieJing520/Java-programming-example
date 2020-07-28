package chapter14_exercise;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class DisplayASTOPSignQuestion15 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MySign(), 400, 400);
		primaryStage.setTitle("Exercise14_15"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
		launch(args);
	}
}

class MySign extends StackPane {
	private void paint() {
		// Create a polygon and place polygon to pane
		Polygon polygon = new Polygon();
		polygon.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		polygon.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		ObservableList<Double> list = polygon.getPoints();

		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		// Add points to the polygon list
		for (int i = 0; i < 6; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}

		Text stop = new Text(centerX, centerY, "STOP");
		stop.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		stop.setFont(Font.font(0.625 * radius));
		// 100/radius=160

		getChildren().clear();
		getChildren().addAll(polygon, stop);
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