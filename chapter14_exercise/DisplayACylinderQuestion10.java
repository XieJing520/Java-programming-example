package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class DisplayACylinderQuestion10 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyEllipse(), 300, 300);
		primaryStage.setTitle("Exercise14_10"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class MyEllipse extends Pane {
	private void paint() {
		getChildren().clear();

		Ellipse eTop = new Ellipse(getWidth() / 2, getHeight() / 4, getWidth() / 4, getHeight() / 8);
		eTop.setFill(Color.WHITE);
		eTop.setStroke(Color.BLACK);

		Line leftLine = new Line(getWidth() / 2 - getWidth() / 4, getHeight() / 4, getWidth() / 2 - getWidth() / 4,
				getHeight() * 3 / 4);
		Line rightLine = new Line(getWidth() / 2 + getWidth() / 4, getHeight() / 4, getWidth() / 2 + getWidth() / 4,
				getHeight() * 3 / 4);
		leftLine.setStroke(Color.BLACK);
		rightLine.setStroke(Color.BLACK);

		Arc arcAbove = new Arc(getWidth() / 2, getHeight() * 3 / 4, getWidth() / 4, getHeight() / 8, 0, 180);
		arcAbove.setType(ArcType.OPEN);
		arcAbove.setStroke(Color.BLACK);
		arcAbove.setFill(Color.WHITE);
		arcAbove.getStrokeDashArray().addAll(6.0, 21.0);

		Arc arcBottom = new Arc(getWidth() / 2, getHeight() * 3 / 4, getWidth() / 4, getHeight() / 8, 0, -180);
		arcBottom.setType(ArcType.OPEN);
		arcBottom.setStroke(Color.BLACK);
		arcBottom.setFill(Color.WHITE);

		getChildren().addAll(eTop, leftLine, rightLine, arcAbove, arcBottom);
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