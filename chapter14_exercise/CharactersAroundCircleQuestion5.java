package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CharactersAroundCircleQuestion5 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the circle
		Pane pane = new Pane();

		String string = new String("WELCOMETOJAVA");
		double radius = Math.toRadians(360 / string.length()), currRadius = 0;

		for (int i = 0; i < string.length(); i++) {
			Label label = new Label("" + string.charAt(i));
			label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 60));
			label.setLayoutX(500 + 300 * Math.cos(currRadius));
			label.setLayoutY(400 + 300 * Math.sin(currRadius));
			label.setRotate(90 + Math.toDegrees(currRadius));
			pane.getChildren().add(label);
			currRadius += radius;
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 1000, 800);
		primaryStage.setTitle("Exercise14_05"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}