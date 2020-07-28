package chapter14_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicTacToeBoardQuestion2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the image views
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);

		Image imageX = new Image("x.gif");
		Image imageO = new Image("o.gif");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				int randomPics = (int) (Math.random() * 3);
				if (0 == randomPics) {
					pane.add(new ImageView(imageX), row, col);
				} else if (1 == randomPics) {
					pane.add(new ImageView(imageO), row, col);
				}
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_02"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
