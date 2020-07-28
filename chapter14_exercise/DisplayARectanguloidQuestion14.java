package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class DisplayARectanguloidQuestion14 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyRect(), 300, 300);
		primaryStage.setTitle("Exercise14_14"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class MyRect extends Pane {
	private void paint() {
		getChildren().clear();

		Rectangle backRect = new Rectangle(getWidth() / 8, getHeight() / 8, getWidth() * 3 / 4, getHeight() / 2);
		Rectangle frontRect = new Rectangle(getWidth() / 16, getHeight() * 3 / 8, getWidth() * 3 / 4, getHeight() / 2);

		Line leftTopLine = new Line(getWidth() / 8, getHeight() / 8, getWidth() / 16, getHeight() * 3 / 8);
		Line leftBottomLine = new Line(getWidth() / 8, getHeight() * 5 / 8, getWidth() / 16, getHeight() * 7 / 8);
		Line rightTopLine = new Line(getWidth() * 7 / 8, getHeight() / 8, getWidth() * 13 / 16, getHeight() * 3 / 8);
		Line rightBottomLine = new Line(getWidth() * 7 / 8, getHeight() * 5 / 8, getWidth() * 13 / 16,
				getHeight() * 7 / 8);

		backRect.setStroke(Color.BLACK);
		frontRect.setStroke(Color.BLACK);
		backRect.setFill(null);
		frontRect.setFill(null);

		getChildren().addAll(backRect, frontRect, leftTopLine, leftBottomLine, rightTopLine, rightBottomLine);
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