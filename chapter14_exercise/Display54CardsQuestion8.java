package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.util.*;

public class Display54CardsQuestion8 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the image views
		Pane pane = new Pane();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 54; i++)
			list.add(i);
		Collections.shuffle(list);

		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 9; col++) {
				ImageView imageView = new ImageView("card/" + list.get(row * 9 + col) + ".png");
				imageView.setLayoutX(col * 100);
				imageView.setLayoutY(row * 100);
				pane.getChildren().add(imageView);
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 900, 600);
		primaryStage.setTitle("Exercise14_08"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
