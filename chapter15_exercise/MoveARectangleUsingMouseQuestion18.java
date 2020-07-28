package chapter15_exercise;

import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MoveARectangleUsingMouseQuestion18 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle(400, 400, 100, 50);

		pane.getChildren().add(rectangle);
		rectangle.setFill(Color.WHITE);
		rectangle.setStroke(Color.BLACK);

		rectangle.setOnMouseDragged(e -> {
			rectangle.setX(e.getX() - 50);
			rectangle.setY(e.getY() - 25);
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_09"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
