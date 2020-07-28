package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayACheckerBoardQuestion6 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the circle
		Pane pane = new Pane();

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				Rectangle rectangle = new Rectangle(row * 125, col * 125, 125, 125);
				rectangle.setFill((row % 2 == 0) ? ((col % 2 == 0) ? Color.WHITE : Color.BLACK)
						: ((col % 2 == 0) ? Color.BLACK : Color.WHITE));
				pane.getChildren().addAll(rectangle);
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 1000, 1000);
		primaryStage.setTitle("Exercise14_06"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}