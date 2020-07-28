package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ColorAndFontQuestion4 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the label
		Pane pane = new Pane();

		// Create five labels and set its properties
		for (int i = 0; i < 5; i++) {
			Label label = new Label("Java");
			label.setRotate(90);
			label.setTextFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
			label.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 50));
			// label.setBounds(i * 200 + 20,20,50,50);
			label.setLayoutX(i * 100 + 20);
			label.setLayoutY(pane.getHeight() / 2 + 50);
			pane.getChildren().add(label);
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 200);
		primaryStage.setTitle("Exercise14_04"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}