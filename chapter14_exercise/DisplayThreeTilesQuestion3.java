package chapter14_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.util.*;

public class DisplayThreeTilesQuestion3 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the image views
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(10);

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 52; i++)
			list.add(i);
		Collections.shuffle(list);

		for (int i = 0; i < 3; i++) {
			ImageView imageView = new ImageView("card/" + list.get(i) + ".png");
			imageView.setFitWidth(300);
			imageView.setFitHeight(550);
			pane.getChildren().add(imageView);
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setTitle("Exercise14_03"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
