package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayRandom0Or1Question7 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		Pane pane = new Pane();

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				TextField textField = new TextField();
				textField.setText("" + (int) (Math.random() * 2));
				textField.setLayoutX(col * 25);
				textField.setLayoutY(row * 25);
				textField.setMaxSize(25, 25);
				pane.getChildren().add(textField);
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Exercise14_07"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
